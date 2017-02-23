grammar C;


@header{
package Driver;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;
}

@parser::members{

public class Variable{
	public String varName;
	public String type;
};

public enum DataType {
    CHAR, INT, LONG,LONG_LONG,FLOAT,uint8_t,uint16_t,uint64_t
}
public int sizeOfList[] ={1,2,4,8,4,1,2,8};

public TokenStreamRewriter tokens;
public String codeString="\n\t__asm(  \" mov.w  r1, %0\\n\":\"=r\"(mycomp__basePointerCurrent));\n\tif(mycomp__stackTracker < mycomp__basePointerCurrent)\n{\n mycomp__stackTracker=mycomp__basePointerCurrent;\n}\n\t";//\n\tint bp=0;\n \tasm(  "mov.w  r4, %0\n":"=r"(bp));

public HashMap<String,Integer> map =new HashMap();
public HashMap<String,Integer> dataTypeSizes =new HashMap();

public int itrStartIndex=-1;
public int ifStartIndex=-1;
public int statementStartIndex=-1;
public Boolean global=false;
public Boolean declarationFlag=false;
public Boolean iterationFlag=false;
public Boolean ifFlag=false;
public Boolean compoundStatFlag=false;
public String currFunctionName="";
public Boolean isInFunction=false;
public Boolean structDecFlag=false;
public Boolean boolTypeSpecFlag=false;
public Boolean initFlag=false;
public Boolean typedefFlag =false; 
public int no_of_call_added=0;
public Boolean funcDeclaration=false;

public String rootFunction = "";
public HashMap<String,String> funcMap =new HashMap();
public HashMap<String,LinkedList<String>> treeFuncMap =new HashMap();
public HashMap<String,LinkedList<String>> FuncToVarMap =new HashMap();
public HashMap<Integer,ArrayList<Integer>> BitwiseFuncToVarMap =new HashMap();
public Boolean rootFuncIndicator = false;
public int countOfFunction=0;



public String saveVariableFunction = "mycomp__myinterface__updateBackupList" ;
public String ignoreFunctionList = "updateFRAMWithBackupList,myFunc,sendRamImage,saveRam,updateBackupList,updateBackupListFRAM,saveRegisters,debugVals,bootCheckUpdate,verifyCheckpoint,myFuncCaller,saveRamCaller,updateBackupListFRAMCaller,updateBackupListFRAM,myFuncCaller,addToBackupList,updateBackupListFRAMCaller,debugValsCaller,bootCheckUpdateCaller,verifyCheckpointCaller,spMagic,dram,spMagicCaller,dumpRamCaller,dumpRAM,sendAddrMsg,sendDone,"+
									"data__makeOutput,SCK__set,SCK__clr,mycomp___8bitRead,_8bitRead,mycomp___8bitWrite,mycomp__write,mycomp___8bitRead1,mycomp___read1,mycomp___read";//+//Israr code 

ArrayList<String> notInlineFunctions= new ArrayList();
ArrayList<Variable> global_pointers= new ArrayList();
ArrayList <Variable> global_variables = new ArrayList();
static ArrayList<String> functions = new ArrayList();
public String [] list=ignoreFunctionList.split(",");
 
private void fillDataTypeSizes(){
	
	dataTypeSizes.put("uint8_t",1);
	dataTypeSizes.put("uint16_t",2);
	dataTypeSizes.put("uint32_t",4);
	dataTypeSizes.put("bool",1);
	dataTypeSizes.put("char",1);
	dataTypeSizes.put("int",4);
	dataTypeSizes.put("mcu_power_t",1);
	dataTypeSizes.put("stm25p_volume_info_t",2);
	dataTypeSizes.put("VirtualizeTimerC__0__Timer_t",12);
	dataTypeSizes.put("msp430adc12_channel_config_t",4);
	dataTypeSizes.put("TransformCounterC__0__upper_count_type",2);
	dataTypeSizes.put("Msp430RefVoltGeneratorP__state_t",4);
	dataTypeSizes.put("TransformAlarmC__1__to_size_type",4);
	dataTypeSizes.put("AMQueueImplP__0__queue_entry_t",8);
	dataTypeSizes.put("SerialP__rx_buf_t",5);
	dataTypeSizes.put("SerialP__ack_queue_t",8);
	dataTypeSizes.put("SerialDispatcherP__0__recv_state_t",1);
	dataTypeSizes.put("SerialDispatcherP__0__send_state_t",4);
	dataTypeSizes.put("Stm25pSectorP__stm25p_power_state_t",4);
	dataTypeSizes.put("Stm25pSectorP__stm25p_sector_state_t",4);
	dataTypeSizes.put("Stm25pBlockP__stm25p_block_state_t",24);
	dataTypeSizes.put("HdlcTranslateC__HdlcState",1);
	dataTypeSizes.put("message_t",52);
	
	dataTypeSizes.put("error_t",1);
	dataTypeSizes.put("stm25p_addr_t",4);
	dataTypeSizes.put("stm25p_len_t",4);
	dataTypeSizes.put("stm25p_volume_info_t",2);
	
}
private Integer getDatatypeSize(String dataType){
	Integer size;
	size=dataTypeSizes.get(dataType);
	if(size == null){
		size=2;
	}
	
	return size;
	
}
private Boolean VariableDeclaration(String declString){
	if(declString!="" && !declString.contains("inline") && !declString.contains("union") && !declString.contains("struct") && !declString.contains("typedef") && !declString.contains("enum")){
		return true;			
	}
	else
		return false;
}

private Boolean globalVariableExists(Variable var){
		for(Variable globvar : global_variables){
				if(globvar.varName.equals(var.varName)){
					return true;
				}
		}
		return false;	
}
private Boolean globalPointerExists(Variable var){
		for(Variable globvar : global_pointers){
				if(globvar.varName.equals(var.varName)){
					return true;
				}
		}
		return false;	
}

private Boolean checkIfNotInline(String funcName){
		for(String var : notInlineFunctions){
			if(var.equals(funcName)){
				return true;
			}
		}
		return false;
}

private Variable checkIfGlobalPointer(String varName){
		Variable res=null;
		for(Variable var : global_pointers){
			if(var.varName.equals(varName)||var.varName.substring(1,var.varName.length()).equals(varName)){// removing * 
				res=var;
				return res;
			}
		}
		return res;
}

private Variable checkIfGlobalVariable(String variableName){
		Variable res=null;
		variableName = variableName.trim();
		for(Variable var : global_variables){
			String global_varName=var.varName.trim();
			if(global_varName.equals(variableName) || global_varName.equals(variableName.split("\\[")[0])){
				String funcName[]= currFunctionName.split("__");
				if(isInFunction && !ignoreFunctionList.contains(funcName[funcName.length-1]))
				{
					res=var;
					return res;	
				}
			}
		}
		return res;
}

private void printAllVariables(){
	for(Variable var : global_variables){
		System.out.println(var.type+", "+var.varName);
	}
	System.out.println("Global Pointers Size = "+global_pointers.size());
	for(Variable var : global_pointers){
		System.out.println(var.type+", "+var.varName);
	}
} 
}

start
@init{
	fillDataTypeSizes();	
}
	:
	( 
	{isInFunction=true;} 
	fd=functionDefinition
	|
	{global=true;} 
	dec=declaration // contains var declaraTion 
	| structDeclaration // contains enum and structs
	| externalDeclaration
	| bi=blockItem
	| hed=header
	)+ 
	; 
header
	: '#' WS* 'define' (.)*? 
	;	

primaryExpression returns [String str]
    :   Identifier {$str=$Identifier.text;}
    |   Constant
    |   StringLiteral+
    |   '(' expr=expression ')'{$str=$expr.str;}
    |   genericSelection
    |   '__extension__'? '(' compoundStatement[null] ')' // Blocks (GCC extension)
    |   '__builtin_va_arg' '(' unaryExpression ',' typeName ')'
    |   '__builtin_offsetof' '(' typeName ',' unaryExpression ')'
    ;

genericSelection
    :   '_Generic' '(' assignmentExpression ',' genericAssocList ')'
    ;

genericAssocList
    :   genericAssociation
    |   genericAssocList ',' genericAssociation
    ;

genericAssociation
    :   typeName ':' assignmentExpression
    |   'default' ':' assignmentExpression
    ;

postfixExpression returns [String str]
    :   primaryExpression {$str=$primaryExpression.str;}
    | 
     pe=postfixExpression 
     '[' exp=expression ']'     
    
    | peF=postfixExpression '(' expF=argumentExpressionList? rparen=')'
      {	
      	if(checkIfNotInline($peF.str)){
      		int semiColonIndex =((PostfixExpressionContext)_localctx).rparen.getTokenIndex()+1; 
      		if(_input.get(semiColonIndex).getText().equals(";")){
      			int insertIndex =((PostfixExpressionContext)_localctx).rparen.getTokenIndex()+2;
      		}      		
      	}
      }
    |   postfixExpression '.' Identifier
    |   postfixExpression '->' Identifier
    |	expr=postfixExpression '++'
    {
    	$str=$expr.str;
    	String var =$str;
		Variable global_var = null;
   		if(var!=null)
			global_var = checkIfGlobalPointer(var.toString());

		if(global_var != null){
	    	
	    	if(!iterationFlag){
				no_of_call_added++;	
			}
			else
			{
				if(map.get(var)==null || !map.get(var).equals(itrStartIndex)){
					map.put(var,itrStartIndex);
				}
			}
		}
    } 
    | expr2=postfixExpression '--'
    {
    	$str=$expr2.str;
    	String var =$str;
		Variable global_var = null;
   		if(var!=null)
			global_var = checkIfGlobalPointer(var.toString());
			
		if(global_var != null){
	    	if(!iterationFlag)
	    	{
				no_of_call_added++;	
			}	
	    	else
			{
				if(map.get(var)==null || !map.get(var).equals(itrStartIndex)){
					map.put(var,itrStartIndex);
					no_of_call_added++;	
				}
			}
		}
    }
    |   '(' typeName ')' '{' initializerList '}'
    |   '(' typeName ')' '{' initializerList ',' '}'
    |   '__extension__' '(' typeName ')' '{' initializerList '}'
    |   '__extension__' '(' typeName ')' '{' initializerList ',' '}'
    ;

argumentExpressionList returns [String str]
    :   a=assignmentExpression{$str=$a.str;}
    |   argumentExpressionList ',' assignmentExpression
    ;

unaryExpression returns [String str]
    :   expr=postfixExpression{$str=$expr.str;}
    |   '++' unexp=unaryExpression {
    	$str=$unexp.str;
    	String var =$str;
    	Variable global_var = null;
   		if(var!=null)
			global_var = checkIfGlobalPointer(var.toString());
			
		if(global_var != null){
	    	if(!iterationFlag){
				no_of_call_added++;	
		   	}
			else
			{
				if(map.get(var)==null || !map.get(var).equals(itrStartIndex)){
					map.put(var,itrStartIndex);
					no_of_call_added++;	
		   		}
			}
		}
    }
    |   '--' unexp2=unaryExpression
    {
	   	$str=$unexp2.str;
	   	String var =$str;
	   	Variable global_var = null;
   		if(var!=null)
			global_var = checkIfGlobalPointer(var.toString());
			
    	if(global_var != null){
		   	if(!iterationFlag){
				no_of_call_added++;	
		   	}
			else
			{
				if(map.get(var)==null || !map.get(var).equals(itrStartIndex)){
					map.put(var,itrStartIndex);
					no_of_call_added++;
				}
			}
		}
    }
    |   unaryOperator cExpr=castExpression{$str=$cExpr.str;}
    |   'sizeof' unaryExpression
    |   'sizeof' '(' typeName ')'
    |   '_Alignof' '(' typeName ')'
    |   '&&' Identifier // GCC extension address of label
    ;

unaryOperator
    :   '&' | '*' | '+' | '-' | '~' | '!'
    ;

castExpression returns [String str]
    :   expr=unaryExpression{$str=$expr.str;}
    |   '(' typeName ')' castExpression
    |   '__extension__' '(' typeName ')' castExpression
    ;

multiplicativeExpression returns [String str]
    :   expr=castExpression{$str=$expr.str;}
    |   multiplicativeExpression '*' castExpression
    |   multiplicativeExpression '/' castExpression
    |   multiplicativeExpression '%' castExpression
    ;

additiveExpression returns [String str]
    :   expr=multiplicativeExpression{$str=$expr.str;}
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;
shiftExpression returns [String str]
    :   e3=additiveExpression{$str=$e3.str;}
    |   e1=shiftExpression '<<' additiveExpression {$str=$e1.str;}
    |   e2=shiftExpression '>>' additiveExpression {$str=$e2.str;}
    ;

relationalExpression returns [String str]
    :   e1=shiftExpression{$str=$e1.str;}
    |   e2=relationalExpression '<' shiftExpression {$str=$e2.str;}
    |   e3=relationalExpression '>' shiftExpression {$str=$e3.str;}
    |   e4=relationalExpression '<=' shiftExpression{$str=$e4.str;}
    |   e5=relationalExpression '>=' shiftExpression{$str=$e5.str;}
    ;

equalityExpression returns [String str]
    :   expr=relationalExpression{$str=$expr.str;}
    |   equalityExpression '==' relationalExpression
    |   equalityExpression '!=' relationalExpression
    ;

andExpression returns [String str]
    :   expr=equalityExpression{$str=$expr.str;} 
    |   andExpression '&' equalityExpression
    ;

exclusiveOrExpression returns [String str]
    :   expr=andExpression {$str= $expr.str;}
    |   exclusiveOrExpression '^' andExpression
    ;

inclusiveOrExpression returns [String str]
    :   expr=exclusiveOrExpression{$str=$expr.str;} 
    |   inclusiveOrExpression '|' exclusiveOrExpression
    ;

logicalAndExpression returns [String str]
    :   expr=inclusiveOrExpression {$str=$expr.str;}
    |   logicalAndExpression '&&' inclusiveOrExpression
    ;

logicalOrExpression returns [String str]
    :   expr=logicalAndExpression {$str=$expr.str;}
    |   logicalOrExpression '||' logicalAndExpression
    ;


conditionalExpression returns [String str]
    :   expr=logicalOrExpression ('?' expression ':' conditionalExpression)? {$str=$expr.str;}
    ;

assignmentExpression returns [String str]
@after{
	//postFixCaseIndex=-1;
}
    :   cond=conditionalExpression {
    	$str=$cond.str;
    	String var=$cond.str;
    	if(var!=null){
    			if(var.contains("->")){// it can also be global variable which is a pointer
					var=var.split("->")[0];
				}
   				//check if points to global variable
   				Variable global_var = null;
   				if(var!=null)
					global_var = checkIfGlobalPointer(var.trim());
		
				if(global_var !=null){
					tokens.insertBefore(((AssignmentExpressionContext)_localctx).cond.start.getTokenIndex(),saveVariableFunction+"((void *)&"+var+","+getDatatypeSize(global_var.type)+");\n");
					no_of_call_added++;
				}				
		}
    }
    |   leftOp=unaryExpression opr=assignmentOperator rightOp=assignmentExpression{
    	String var=(((AssignmentExpressionContext)_localctx).leftOp!=null?_input.getText(((AssignmentExpressionContext)_localctx).leftOp.start,((AssignmentExpressionContext)_localctx).leftOp.stop):null);
		Variable global_var = null;
		if(var!=null)
			global_var = checkIfGlobalVariable(var.trim());
			
		if(global_var != null ){
			if(!iterationFlag){
				no_of_call_added++;
			}			
			else{
				if(map.get(var)==null || !map.get(var).equals(itrStartIndex)){
					map.put(var,itrStartIndex);
					no_of_call_added++;
				}
			}
		}
		else{
				//check if points to global variable
				if(var.contains("->")){
					var=var.split("->")[0];
				}
				global_var = checkIfGlobalPointer(var.trim()); 
				if(var !=null && global_var != null ){
					no_of_call_added++;	
				}
		}
   };
   
assignmentOperator
    :   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
    ;
    

expression returns [String str]
    :   expr=assignmentExpression {$str=$expr.str;}
    |   expr1=expression ',' expr2=assignmentExpression{$str=$expr1.str+","+$expr2.str;}
    ;

constantExpression
    :   conditionalExpression
    ;

declaration 
@init{
	if(global)
		declarationFlag=true;
}
@after{
	declarationFlag=false;
	boolTypeSpecFlag=false;
	structDecFlag=false;
	funcDeclaration=false;
	global=false;
	initFlag =false;
}
    :   specifier=declarationSpecifiers var=initDeclaratorList? semi=';' 
    {
    		if(($specifier.text!= null)&&functions.contains($specifier.text)){
    		rootFunction=rootFunction+" "+$specifier.text;
    	}
    	if(global && funcDeclaration && ((DeclarationContext)_localctx).var != null){
    			String specifierText= $specifier.text;
    			String functionName= $var.str;
    			currFunctionName=functionName;
	    	    functions.add(currFunctionName);
	    	
    	
    			countOfFunction++;
    			if(!typedefFlag && !specifierText.contains("inline") && !notInlineFunctions.contains(functionName)){
    				notInlineFunctions.add(functionName);
		    }
    	}
    	if(initFlag && !global){
    		String varType=$specifier.str;
    		String initString=$var.text;
    		String []splits=initString.split("=");
    		String lhOp=splits[0];
    		String rhOp=splits[1];
    		rhOp=rhOp.split("\\[")[0];//extract the variable name if its an array
    		rhOp=rhOp.trim();
    		String rhVarName=rhOp.substring(1,rhOp.length());

    		Variable var= new Variable();
	    	var.varName=lhOp.trim();
	    	var.type=varType;
    		Variable global_var = checkIfGlobalVariable(rhVarName);
			if(!globalPointerExists(var) &&  global_var != null && rhOp.charAt(0)=='&'){
	    		global_pointers.add(var);	
			}
    	}
    	if(declarationFlag)
    	{
    		// save all global variables.
    		Variable new_var = new Variable();
    		String shortRes="";
    		String decl="";
    		String regex="\\([A-Z|a-z]*\\)";
    		
    		if(((DeclarationContext)_localctx).var != null){
    			if($var.res == 2 || $var.res == 3){
    			shortRes=$specifier.str+"-"+$var.str;
    			decl = $specifier.text+"-"+$var.text;
    			}
    		}
    		else{    			
    			decl = $specifier.text;
    			shortRes=$specifier.text;
    		}

    		if(decl!="" && !decl.contains("inline") && !decl.contains("union") && !decl.contains("struct") && !decl.contains("typedef") && !decl.contains("enum")){
    			
    			String type = $specifier.text;
    			if(((DeclarationContext)_localctx).var != null){
    			String varName = $var.text;
    			varName=varName.replace("'/*'(.)* '*/'","");
    			String [] var_splits = varName.split("=");
    			new_var.varName=var_splits[0].split("\\[")[0].split(" ",1)[0];
    				
    			if(new_var.varName.contains("*")){
 		   			new_var.varName=new_var.varName.replace(" ","");    			
    			}
    			else{
    				new_var.varName=var_splits[0].split("\\[")[0].split(" ")[0];
    			}
    			String [] type_splits=type.split(" ");
	    		new_var.type=type_splits[type_splits.length-1];
    			}
    			else{
    			String [] type_splits=type.split("\\s+");
	    		new_var.type=type_splits[0];
	    		new_var.varName=type_splits[1].replace("'/*'(.)* '*/'","");	
    			}	    		
	    		if( new_var.type.equalsIgnoreCase("bool")&& !funcDeclaration){
	    			tokens.replace(((DeclarationContext)_localctx).specifier.start.getTokenIndex(),"int");
	    		}
	    		if (!globalVariableExists(new_var)){
	    			global_variables.add(new_var);
	    		}
	    	}
    	}
    }	   
    |   staticAssertDeclaration
    ;

declarationSpecifiers returns [String str]
    :   (spec=declarationSpecifier {
    	$str=$spec.text;
    })+
    ;

declarationSpecifiers2
    :   declarationSpecifier+
    ;

declarationSpecifier
    :   storageClassSpecifier 
    |   typeSpecifier
    |   typeQualifier
    |   functionSpecifier
    |   alignmentSpecifier
    ;

initDeclaratorList returns [String str, int res]
    :   var=initDeclarator{ $str=$var.str;$res=$var.res;}
    |   initDeclaratorList ',' initDeclarator
    ;
    

initDeclarator returns [String str, int res]
    :   dec=declarator {$str=$dec.str;$res=$dec.res;}
    |   leftOp=declarator '=' init=initializer{
    	initFlag=true;
    	$res=2;// initialization
    	$str=$leftOp.text;
    }
    ;
    
storageClassSpecifier
    :   'typedef' { typedefFlag=true;}
    |   'extern'
    |   'static'
    |   '_Thread_local'
    |   'auto'
    |   'register'
    ;

typeSpecifier
    :   ('void'
    |   'char'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    |   'signed'
    |   'unsigned'
    |   '_Bool'
    |   '_Complex'
    |   '__m128'
    |   '__m128d'
    |   '__m128i')
    |   '__extension__' '(' ('__m128' | '__m128d' | '__m128i') ')'
    |   atomicTypeSpecifier
    |   structOrUnionSpecifier
    |   enumSpecifier
    |   typ=typedefName 
    	{
    		if(!isInFunction  && structDecFlag && $typ.text.equals("bool")){ // if bool appears in struct decl, replace it with int.
    			tokens.replace(((TypeSpecifierContext)_localctx).typ.start.getTokenIndex(),"int");
    			boolTypeSpecFlag=true;			
    		}
    	}
    |   '__typeof__' '(' constantExpression ')' // GCC extension
    ;

structOrUnionSpecifier
    :   structOrUnion Identifier? '{' structDeclarationList? '}'
    {
    	structDecFlag = false;
    }
    |   structOrUnion Identifier
    ;
    
    

structOrUnion
    :   'struct' {structDecFlag=true;}
    |   'union'
    ;

structDeclarationList
    :   structDeclaration
    |   structDeclarationList structDeclaration
    ;

structDeclaration
@after{
	boolTypeSpecFlag=false;
}

    :   specifierQualifierList structDeclaratorList? ';'
    |   staticAssertDeclaration
    ;

specifierQualifierList
    :   typeSpecifier specifierQualifierList?
    |   typeQualifier specifierQualifierList?
    ;

structDeclaratorList
    :   structDeclarator
    |   structDeclaratorList ',' structDeclarator
    ;

structDeclarator
    :   declarator
    |   declarator? colon=':' constexp=constantExpression{
    	
    	if(boolTypeSpecFlag){
    		String val=$constexp.text;
    		int varSize=Integer.parseInt(val);
    		if(varSize == 1){
    			int start=((StructDeclaratorContext)_localctx).colon.getTokenIndex();
				int end=((StructDeclaratorContext)_localctx).constexp.start.getTokenIndex();
				tokens.delete(start, end);
    		}
    	}
    }
    ;

enumSpecifier
    :   'enum' Identifier? '{' enumeratorList '}'
    |   'enum' Identifier? '{' enumeratorList ',' '}'
    |   'enum' Identifier
    ;

enumeratorList
    :   enumerator
    |   enumeratorList ',' enumerator
    ;

enumerator
    :   enumerationConstant
    |   enumerationConstant '=' constantExpression
    ;

enumerationConstant
    :   Identifier
    ;

atomicTypeSpecifier
    :   '_Atomic' '(' typeName ')'
    ;

typeQualifier
    :   'const'
    |   'restrict'
    |   'volatile'
    |   '_Atomic'
    ;

functionSpecifier
    :   ('inline' 
    |   '_Noreturn'
    |   '__inline__' // GCC extension
    |   '__stdcall')
    |   gccAttributeSpecifier
    |   '__declspec' '(' Identifier ')'
    ;

alignmentSpecifier
    :   '_Alignas' '(' typeName ')'
    |   '_Alignas' '(' constantExpression ')'
    ;

declarator returns [String str, int res]  
    :   pointer? funcName=directDeclarator gccDeclaratorExtension* {$str=$funcName.str; $res=$funcName.res; 
    }
    ;

directDeclarator returns [String str, int res]
    :   Identifier {$str=$Identifier.text; $res=3;}
    |   lp='(' declarator ')' {
    		$str=$declarator.str;
    	}// function call
    |   d1=directDeclarator '[' d2=typeQualifierList? d3=assignmentExpression? ']' {
    	$str=$d1.str;$res=3;
    }
    |   directDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'{$res=3;}
    |   directDeclarator '[' typeQualifierList 'static' assignmentExpression ']'{$res=3;}
    |   directDeclarator '[' typeQualifierList? '*' ']'{$res=3;}
    |   dir1=directDeclarator '(' parameterTypeList ')' {
    	$str=$dir1.str;
    	$res=1;
    	
    	if(isInFunction){
	    	currFunctionName=$dir1.str;
	    	functions.add(currFunctionName);
	    	}
    	if(!isInFunction)
    		funcDeclaration=true;
    }
    |   dir2=directDeclarator '(' identifierList? ')'{
    	
    	if(isInFunction){
	    	currFunctionName=$dir2.str;
	    	functions.add(currFunctionName);
	    	
    	}
    	if(!isInFunction)
    		funcDeclaration=true;
    	$str=$dir2.str;
    	$res=1;
    }
    ;

gccDeclaratorExtension
    :   '__asm' '(' StringLiteral+ ')'
    |   gccAttributeSpecifier
    ;

gccAttributeSpecifier
    :   ('__attribute__'|'__attribute' )'(' '(' gccAttributeList ')' ')'
    ;

gccAttributeList
    :   gccAttribute (',' gccAttribute)*
    |   // empty
    ;

gccAttribute
    :   ~(',' | '(' | ')') // relaxed def for "identifier or reserved word"
        ('(' argumentExpressionList? ')')?
    |   Identifier //Change
    ;

nestedParenthesesBlock
    :   (   ~('(' | ')')
        |   '(' nestedParenthesesBlock ')'
        )*
    ;

pointer
    :   '*' typeQualifierList?
    |   '*' typeQualifierList? pointer
    |   '^' typeQualifierList? // Blocks language extension
    |   '^' typeQualifierList? pointer // Blocks language extension
    ;

typeQualifierList
    :   typeQualifier
    |   typeQualifierList typeQualifier
    ;

parameterTypeList
    :   parameterList
    |   parameterList ',' '...'
    ;

parameterList
    :   parameterDeclaration
    |   parameterList ',' parameterDeclaration
    ;

parameterDeclaration
    :   declarationSpecifiers declarator
    |   declarationSpecifiers2 abstractDeclarator?
    ;

identifierList
    :   Identifier
    |   identifierList ',' Identifier
    ;

typeName
    :   specifierQualifierList abstractDeclarator?
    ;

abstractDeclarator
    :   pointer
    |   pointer? directAbstractDeclarator gccDeclaratorExtension*
    ;

directAbstractDeclarator
    :   '(' abstractDeclarator ')' gccDeclaratorExtension*
    |   '[' typeQualifierList? assignmentExpression? ']'
    |   '[' 'static' typeQualifierList? assignmentExpression ']'
    |   '[' typeQualifierList 'static' assignmentExpression ']'
    |   '[' '*' ']'
    |   '(' parameterTypeList? ')' gccDeclaratorExtension*
    |   directAbstractDeclarator '[' typeQualifierList? assignmentExpression? ']'
    |   directAbstractDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'
    |   directAbstractDeclarator '[' typeQualifierList 'static' assignmentExpression ']'
    |   directAbstractDeclarator '[' '*' ']'
    |   directAbstractDeclarator '(' parameterTypeList? ')' gccDeclaratorExtension*
    ;

typedefName
    :   id=Identifier
    ;

initializer returns [String str]
    :   assignExpr = assignmentExpression {$str=$assignExpr.str;}
    |   '{' initializerList '}'
    |   '{' initializerList ',' '}'
    ;

initializerList
    :   designation? initializer
    |   initializerList ',' designation? initializer
    ;

designation
    :   designatorList '='
    ;

designatorList
    :   designator
    |   designatorList designator
    ;

designator
    :   '[' constantExpression ']'
    |   '.' Identifier
    ;

staticAssertDeclaration
    :   '_Static_assert' '(' constantExpression ',' StringLiteral+ ')' ';'
    ;

statement[String counter]
@after{
	//inlineFlag =false;
	
}
    :   labeledStatement
    |
    {
    	compoundStatFlag=true;
    }  
     compoundStatement [$counter]
     {
     	compoundStatFlag=false;
     }
     
    |
       expstat=expressionStatement
     {	
    	if((ifFlag || iterationFlag) && !compoundStatFlag){
    		tokens.insertBefore(((StatementContext)_localctx).expstat.start.getTokenIndex(),"{\n");
			tokens.insertAfter(((StatementContext)_localctx).expstat.stop.getTokenIndex(),"\n}\n");
    	}	
    }
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement
    |   ('__asm' | '__asm__') ('volatile' | '__volatile__')? '(' (logicalOrExpression (',' logicalOrExpression)*)? (':' (logicalOrExpression (',' logicalOrExpression)*)?)* ')' ';'
    ;

labeledStatement
    :   Identifier ':' statement [null]
    |   'case' constantExpression ':' statement[null]
    |   'default' ':' statement[null]
    ;

compoundStatement[String counter]
    :   rightParen='{' blockItemList? '}'
   
    ;

blockItemList
    :   blockItem
    |   blockItemList blockItem
    ;

blockItem
@init{
		statementStartIndex=((BlockItemContext)_localctx).start.getTokenIndex();
}
@after{
	statementStartIndex=-1;
	typedefFlag=false;
}
    :   declaration
    {
    	structDecFlag=false;
    	funcDeclaration=false;
    }
    |   statement[null]
    ;

expressionStatement returns [String str]
    :   ex=expression? ';'//{$str=$ex.str;}
    ;

selectionStatement
@init{
		ifStartIndex=((SelectionStatementContext)_localctx).start.getTokenIndex();
}
@after{
		ifStartIndex=-1;
}    :   
    { 	ifFlag=true;  }
    'if' '(' expression ')' statement[null] ('else' statement[null])?
    { 	ifFlag=false; }
    |   'switch' '(' expression ')' statement[null]
    ;
iterationStatement
@init{
		iterationFlag=true;
		itrStartIndex=((IterationStatementContext)_localctx).start.getTokenIndex();
}
@after{
		iterationFlag=false;
		itrStartIndex=-1;
}
    :   startLabel='while' '(' c1=expression ')' statement[null] 
    |   startLabel='do' statement[null]  'while' '(' c2 = expression ')' ';' 
    |	startLabel='for' '(' e1=expression? ';' e2=expression? ';' c3 = expression? ')' statement[null]
    |   startLabel='for' '(' declaration  expression? ';' c4=expression? ')' statement[null]
    ;


jumpStatement
    :   'goto' Identifier ';'
    |   'continue' ';'
    |   'break' ';'
    |   ret='return' expression? semi=';'
    |   'goto' unaryExpression ';' // GCC extension
    ;

compilationUnit
    :   translationUnit? EOF
    ;

translationUnit
    :   externalDeclaration
    |   translationUnit externalDeclaration
    ;

externalDeclaration
    :   functionDefinition
    |   declaration
    |   ';' // stray ;
    ;

functionDefinition 
@init{
	isInFunction=true;
	//System.out.printnln(functionDefinition.text);
}

@after{
	//System.out.println("Current Function after definition: "+ currFunctionName+" Root Function after definition"+rootFunction);
	funcMap.put(currFunctionName, rootFunction);
	rootFunction = "";
	currFunctionName="";
	isInFunction=false;
}
    :   (gccAttributeSpecifier)* spec=declarationSpecifiers? dec=declarator declarationList? compStat=compoundStatement[null]{
    	String specifier=$spec.text;
    	//System.out.println("spec "+$spec.str);
    	//System.out.println("dec "+$dec.str);
    	currFunctionName = $dec.str;
    	//System.out.println("compStat "+$compStat.text);
    		if(!typedefFlag && !specifier.contains("inline") && !notInlineFunctions.contains($dec.str)){
    			notInlineFunctions.add($dec.str);
    			
    }
    typedefFlag=false;
    }
    ;

declarationList
    :   declaration
    |   declarationList declaration
    ;
    

Auto : 'auto';
Break : 'break';
Case : 'case';
Char : 'char';
Const : 'const';
Continue : 'continue';
Default : 'default';
Do : 'do';
Double : 'double';
Else : 'else';
Enum : 'enum';
Extern : 'extern';
Float : 'float';
For : 'for';
Goto : 'goto';
If : 'if';
Inline : 'inline';
Int : 'int';
Long : 'long';
Register : 'register';
Restrict : 'restrict';
Return : 'return';
Short : 'short';
Signed : 'signed';
Sizeof : 'sizeof';
Static : 'static';
Struct : 'struct';
Switch : 'switch';
Typedef : 'typedef';
Union : 'union';
Unsigned : 'unsigned';
Void : 'void';
Volatile : 'volatile';
While : 'while';

Alignas : '_Alignas';
Alignof : '_Alignof';
Atomic : '_Atomic';
Bool : '_Bool';
Complex : '_Complex';
Generic : '_Generic';
Imaginary : '_Imaginary';
Noreturn : '_Noreturn';
StaticAssert : '_Static_assert';
ThreadLocal : '_Thread_local';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';
// '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
StarAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';
LeftShiftAssign : '<<=';
RightShiftAssign : '>>=';
AndAssign : '&=';
XorAssign : '^=';
OrAssign : '|=';

Equal : '==';
NotEqual : '!=';

Arrow : '->';
Dot : '.';
Ellipsis : '...';

Identifier
    :   IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;

fragment
IdentifierNondigit
    :   Nondigit
    |   UniversalCharacterName
    //|   // other implementation-defined characters...
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
UniversalCharacterName
    :   '\\u' HexQuad
    |   '\\U' HexQuad HexQuad
    ;

fragment
HexQuad
    :   HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit
    ;

Constant
    :   IntegerConstant
    |   FloatingConstant
    //|   EnumerationConstant
    |   CharacterConstant
    ;

fragment
IntegerConstant
    :   DecimalConstant IntegerSuffix?
    |   OctalConstant IntegerSuffix?
    |   HexadecimalConstant IntegerSuffix?
    |	BinaryConstant
    ;

fragment
BinaryConstant
	:	'0' [bB] [0-1]+
	;

fragment
DecimalConstant
    :   NonzeroDigit Digit*
    ;

fragment
OctalConstant
    :   '0' OctalDigit*
    ;

fragment
HexadecimalConstant
    :   HexadecimalPrefix HexadecimalDigit+
    ;

fragment
HexadecimalPrefix
    :   '0' [xX]
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
HexadecimalDigit
    :   [0-9a-fA-F]
    ;

fragment
IntegerSuffix
    :   UnsignedSuffix LongSuffix?
    |   UnsignedSuffix LongLongSuffix
    |   LongSuffix UnsignedSuffix?
    |   LongLongSuffix UnsignedSuffix?
    ;

fragment
UnsignedSuffix
    :   [uU]
    ;

fragment
LongSuffix
    :   [lL]
    ;

fragment
LongLongSuffix
    :   'll' | 'LL'
    ;

fragment
FloatingConstant
    :   DecimalFloatingConstant
    |   HexadecimalFloatingConstant
    ;

fragment
DecimalFloatingConstant
    :   FractionalConstant ExponentPart? FloatingSuffix?
    |   DigitSequence ExponentPart FloatingSuffix?
    ;

fragment
HexadecimalFloatingConstant
    :   HexadecimalPrefix HexadecimalFractionalConstant BinaryExponentPart FloatingSuffix?
    |   HexadecimalPrefix HexadecimalDigitSequence BinaryExponentPart FloatingSuffix?
    ;

fragment
FractionalConstant
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;

fragment
ExponentPart
    :   'e' Sign? DigitSequence
    |   'E' Sign? DigitSequence
    ;

fragment
Sign
    :   '+' | '-'
    ;

fragment
DigitSequence
    :   Digit+
    ;

fragment
HexadecimalFractionalConstant
    :   HexadecimalDigitSequence? '.' HexadecimalDigitSequence
    |   HexadecimalDigitSequence '.'
    ;

fragment
BinaryExponentPart
    :   'p' Sign? DigitSequence
    |   'P' Sign? DigitSequence
    ;

fragment
HexadecimalDigitSequence
    :   HexadecimalDigit+
    ;

fragment
FloatingSuffix
    :   'f' | 'l' | 'F' | 'L'
    ;

fragment
CharacterConstant
    :   '\'' CCharSequence '\''
    |   'L\'' CCharSequence '\''
    |   'u\'' CCharSequence '\''
    |   'U\'' CCharSequence '\''
    ;

fragment
CCharSequence
    :   CChar+
    ;

fragment
CChar
    :   ~['\\\r\n]
    |   EscapeSequence
    ;

fragment
EscapeSequence
    :   SimpleEscapeSequence
    |   OctalEscapeSequence
    |   HexadecimalEscapeSequence
    |   UniversalCharacterName
    ;

fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;

fragment
OctalEscapeSequence
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' OctalDigit OctalDigit OctalDigit
    ;

fragment
HexadecimalEscapeSequence
    :   '\\x' HexadecimalDigit+
    ;

StringLiteral
    :   EncodingPrefix? '"' SCharSequence? '"'
    ;

fragment
EncodingPrefix
    :   'u8'
    |   'u'
    |   'U'
    |   'L'
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    ;

LineDirective
    :   '#' Whitespace? DecimalConstant Whitespace? StringLiteral ~[\r\n]*
        -> skip
    ;
/* Ignore these lines from code */
//IgnoreASM    :'__asm ("mov.w  r1, %0\n" : "=r"(arr[1]));'(.)*'__asm ("mov.w  r0, %0\n" : "=r"(arr[0]));' 
 //		-> channel(HIDDEN)
   // ;

PragmaDirective
    :   '#' Whitespace? 'pragma' Whitespace ~[\r\n]*
        -> skip
    ;

Whitespace
    :   [ \t]+
        -> channel(HIDDEN)
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> channel(HIDDEN)
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> channel(HIDDEN)
    ;

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') ->channel(HIDDEN)
    ;


LINE_COMMAND
    : 
    ( '#' WS* ('line'|[0-9]+) ~('\n'|'\r')* '\r'? '\n' 
     |'#' WS* ([0-9]+) '"'(.)*?'"' ~('\n'|'\r')* '\r'? '\n'
    ) -> skip
    ;