// Generated from C.g4 by ANTLR 4.6

package Driver;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		Auto=18, Break=19, Case=20, Char=21, Const=22, Continue=23, Default=24, 
		Do=25, Double=26, Else=27, Enum=28, Extern=29, Float=30, For=31, Goto=32, 
		If=33, Inline=34, Int=35, Long=36, Register=37, Restrict=38, Return=39, 
		Short=40, Signed=41, Sizeof=42, Static=43, Struct=44, Switch=45, Typedef=46, 
		Union=47, Unsigned=48, Void=49, Volatile=50, While=51, Alignas=52, Alignof=53, 
		Atomic=54, Bool=55, Complex=56, Generic=57, Imaginary=58, Noreturn=59, 
		StaticAssert=60, ThreadLocal=61, LeftParen=62, RightParen=63, LeftBracket=64, 
		RightBracket=65, LeftBrace=66, RightBrace=67, Less=68, LessEqual=69, Greater=70, 
		GreaterEqual=71, LeftShift=72, RightShift=73, Plus=74, PlusPlus=75, Minus=76, 
		MinusMinus=77, Star=78, Div=79, Mod=80, And=81, Or=82, AndAnd=83, OrOr=84, 
		Caret=85, Not=86, Tilde=87, Question=88, Colon=89, Semi=90, Comma=91, 
		Assign=92, StarAssign=93, DivAssign=94, ModAssign=95, PlusAssign=96, MinusAssign=97, 
		LeftShiftAssign=98, RightShiftAssign=99, AndAssign=100, XorAssign=101, 
		OrAssign=102, Equal=103, NotEqual=104, Arrow=105, Dot=106, Ellipsis=107, 
		Identifier=108, Constant=109, StringLiteral=110, LineDirective=111, PragmaDirective=112, 
		Whitespace=113, Newline=114, BlockComment=115, LineComment=116, WS=117, 
		LINE_COMMAND=118;
	public static final int
		RULE_start = 0, RULE_header = 1, RULE_primaryExpression = 2, RULE_genericSelection = 3, 
		RULE_genericAssocList = 4, RULE_genericAssociation = 5, RULE_postfixExpression = 6, 
		RULE_argumentExpressionList = 7, RULE_unaryExpression = 8, RULE_unaryOperator = 9, 
		RULE_castExpression = 10, RULE_multiplicativeExpression = 11, RULE_additiveExpression = 12, 
		RULE_shiftExpression = 13, RULE_relationalExpression = 14, RULE_equalityExpression = 15, 
		RULE_andExpression = 16, RULE_exclusiveOrExpression = 17, RULE_inclusiveOrExpression = 18, 
		RULE_logicalAndExpression = 19, RULE_logicalOrExpression = 20, RULE_conditionalExpression = 21, 
		RULE_assignmentExpression = 22, RULE_assignmentOperator = 23, RULE_expression = 24, 
		RULE_constantExpression = 25, RULE_declaration = 26, RULE_declarationSpecifiers = 27, 
		RULE_declarationSpecifiers2 = 28, RULE_declarationSpecifier = 29, RULE_initDeclaratorList = 30, 
		RULE_initDeclarator = 31, RULE_storageClassSpecifier = 32, RULE_typeSpecifier = 33, 
		RULE_structOrUnionSpecifier = 34, RULE_structOrUnion = 35, RULE_structDeclarationList = 36, 
		RULE_structDeclaration = 37, RULE_specifierQualifierList = 38, RULE_structDeclaratorList = 39, 
		RULE_structDeclarator = 40, RULE_enumSpecifier = 41, RULE_enumeratorList = 42, 
		RULE_enumerator = 43, RULE_enumerationConstant = 44, RULE_atomicTypeSpecifier = 45, 
		RULE_typeQualifier = 46, RULE_functionSpecifier = 47, RULE_alignmentSpecifier = 48, 
		RULE_declarator = 49, RULE_directDeclarator = 50, RULE_gccDeclaratorExtension = 51, 
		RULE_gccAttributeSpecifier = 52, RULE_gccAttributeList = 53, RULE_gccAttribute = 54, 
		RULE_nestedParenthesesBlock = 55, RULE_pointer = 56, RULE_typeQualifierList = 57, 
		RULE_parameterTypeList = 58, RULE_parameterList = 59, RULE_parameterDeclaration = 60, 
		RULE_identifierList = 61, RULE_typeName = 62, RULE_abstractDeclarator = 63, 
		RULE_directAbstractDeclarator = 64, RULE_typedefName = 65, RULE_initializer = 66, 
		RULE_initializerList = 67, RULE_designation = 68, RULE_designatorList = 69, 
		RULE_designator = 70, RULE_staticAssertDeclaration = 71, RULE_statement = 72, 
		RULE_labeledStatement = 73, RULE_compoundStatement = 74, RULE_blockItemList = 75, 
		RULE_blockItem = 76, RULE_expressionStatement = 77, RULE_selectionStatement = 78, 
		RULE_iterationStatement = 79, RULE_jumpStatement = 80, RULE_compilationUnit = 81, 
		RULE_translationUnit = 82, RULE_externalDeclaration = 83, RULE_functionDefinition = 84, 
		RULE_declarationList = 85;
	public static final String[] ruleNames = {
		"start", "header", "primaryExpression", "genericSelection", "genericAssocList", 
		"genericAssociation", "postfixExpression", "argumentExpressionList", "unaryExpression", 
		"unaryOperator", "castExpression", "multiplicativeExpression", "additiveExpression", 
		"shiftExpression", "relationalExpression", "equalityExpression", "andExpression", 
		"exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
		"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
		"assignmentOperator", "expression", "constantExpression", "declaration", 
		"declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
		"initDeclaratorList", "initDeclarator", "storageClassSpecifier", "typeSpecifier", 
		"structOrUnionSpecifier", "structOrUnion", "structDeclarationList", "structDeclaration", 
		"specifierQualifierList", "structDeclaratorList", "structDeclarator", 
		"enumSpecifier", "enumeratorList", "enumerator", "enumerationConstant", 
		"atomicTypeSpecifier", "typeQualifier", "functionSpecifier", "alignmentSpecifier", 
		"declarator", "directDeclarator", "gccDeclaratorExtension", "gccAttributeSpecifier", 
		"gccAttributeList", "gccAttribute", "nestedParenthesesBlock", "pointer", 
		"typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration", 
		"identifierList", "typeName", "abstractDeclarator", "directAbstractDeclarator", 
		"typedefName", "initializer", "initializerList", "designation", "designatorList", 
		"designator", "staticAssertDeclaration", "statement", "labeledStatement", 
		"compoundStatement", "blockItemList", "blockItem", "expressionStatement", 
		"selectionStatement", "iterationStatement", "jumpStatement", "compilationUnit", 
		"translationUnit", "externalDeclaration", "functionDefinition", "declarationList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'define'", "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
		"'__m128'", "'__m128d'", "'__m128i'", "'__typeof__'", "'__inline__'", 
		"'__stdcall'", "'__declspec'", "'__asm'", "'__attribute__'", "'__attribute'", 
		"'__asm__'", "'__volatile__'", "'auto'", "'break'", "'case'", "'char'", 
		"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
		"'extern'", "'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", 
		"'long'", "'register'", "'restrict'", "'return'", "'short'", "'signed'", 
		"'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", "'union'", 
		"'unsigned'", "'void'", "'volatile'", "'while'", "'_Alignas'", "'_Alignof'", 
		"'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'", 
		"'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", 
		"'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", 
		"'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", 
		"'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", 
		"'.'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "Auto", "Break", "Case", "Char", "Const", 
		"Continue", "Default", "Do", "Double", "Else", "Enum", "Extern", "Float", 
		"For", "Goto", "If", "Inline", "Int", "Long", "Register", "Restrict", 
		"Return", "Short", "Signed", "Sizeof", "Static", "Struct", "Switch", "Typedef", 
		"Union", "Unsigned", "Void", "Volatile", "While", "Alignas", "Alignof", 
		"Atomic", "Bool", "Complex", "Generic", "Imaginary", "Noreturn", "StaticAssert", 
		"ThreadLocal", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
		"LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", 
		"Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", 
		"Question", "Colon", "Semi", "Comma", "Assign", "StarAssign", "DivAssign", 
		"ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", "RightShiftAssign", 
		"AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual", "Arrow", "Dot", 
		"Ellipsis", "Identifier", "Constant", "StringLiteral", "LineDirective", 
		"PragmaDirective", "Whitespace", "Newline", "BlockComment", "LineComment", 
		"WS", "LINE_COMMAND"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



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

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public FunctionDefinitionContext fd;
		public DeclarationContext dec;
		public BlockItemContext bi;
		public HeaderContext hed;
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public List<HeaderContext> header() {
			return getRuleContexts(HeaderContext.class);
		}
		public HeaderContext header(int i) {
			return getRuleContext(HeaderContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);

			fillDataTypeSizes();	

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					isInFunction=true;
					setState(173);
					((StartContext)_localctx).fd = functionDefinition();
					}
					break;
				case 2:
					{
					global=true;
					setState(175);
					((StartContext)_localctx).dec = declaration();
					}
					break;
				case 3:
					{
					setState(176);
					structDeclaration();
					}
					break;
				case 4:
					{
					setState(177);
					externalDeclaration();
					}
					break;
				case 5:
					{
					setState(178);
					((StartContext)_localctx).bi = blockItem();
					}
					break;
				case 6:
					{
					setState(179);
					((StartContext)_localctx).hed = header();
					}
					break;
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (AndAnd - 66)) | (1L << (Caret - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Semi - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (StringLiteral - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(CParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CParser.WS, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(185);
				match(WS);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(T__1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(192);
					matchWildcard();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public String str;
		public Token Identifier;
		public ExpressionContext expr;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(CParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primaryExpression);
		int _la;
		try {
			int _alt;
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				((PrimaryExpressionContext)_localctx).Identifier = match(Identifier);
				((PrimaryExpressionContext)_localctx).str = (((PrimaryExpressionContext)_localctx).Identifier!=null?((PrimaryExpressionContext)_localctx).Identifier.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(Constant);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(201);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(204); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(LeftParen);
				setState(207);
				((PrimaryExpressionContext)_localctx).expr = expression(0);
				setState(208);
				match(RightParen);
				((PrimaryExpressionContext)_localctx).str = ((PrimaryExpressionContext)_localctx).expr.str;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				genericSelection();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(212);
					match(T__2);
					}
				}

				setState(215);
				match(LeftParen);
				setState(216);
				compoundStatement(null);
				setState(217);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(219);
				match(T__3);
				setState(220);
				match(LeftParen);
				setState(221);
				unaryExpression();
				setState(222);
				match(Comma);
				setState(223);
				typeName();
				setState(224);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				match(T__4);
				setState(227);
				match(LeftParen);
				setState(228);
				typeName();
				setState(229);
				match(Comma);
				setState(230);
				unaryExpression();
				setState(231);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericSelectionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGenericSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGenericSelection(this);
		}
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(Generic);
			setState(236);
			match(LeftParen);
			setState(237);
			assignmentExpression();
			setState(238);
			match(Comma);
			setState(239);
			genericAssocList(0);
			setState(240);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericAssocListContext extends ParserRuleContext {
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGenericAssocList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGenericAssocList(this);
		}
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		return genericAssocList(0);
	}

	private GenericAssocListContext genericAssocList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, _parentState);
		GenericAssocListContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_genericAssocList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(243);
			genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GenericAssocListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_genericAssocList);
					setState(245);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(246);
					match(Comma);
					setState(247);
					genericAssociation();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GenericAssociationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGenericAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGenericAssociation(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_genericAssociation);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				typeName();
				setState(254);
				match(Colon);
				setState(255);
				assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(Default);
				setState(258);
				match(Colon);
				setState(259);
				assignmentExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public String str;
		public PostfixExpressionContext pe;
		public PostfixExpressionContext peF;
		public PostfixExpressionContext expr;
		public PostfixExpressionContext expr2;
		public PrimaryExpressionContext primaryExpression;
		public ExpressionContext exp;
		public ArgumentExpressionListContext expF;
		public Token rparen;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(263);
				((PostfixExpressionContext)_localctx).primaryExpression = primaryExpression();
				((PostfixExpressionContext)_localctx).str = ((PostfixExpressionContext)_localctx).primaryExpression.str;
				}
				break;
			case 2:
				{
				setState(266);
				match(LeftParen);
				setState(267);
				typeName();
				setState(268);
				match(RightParen);
				setState(269);
				match(LeftBrace);
				setState(270);
				initializerList(0);
				setState(271);
				match(RightBrace);
				}
				break;
			case 3:
				{
				setState(273);
				match(LeftParen);
				setState(274);
				typeName();
				setState(275);
				match(RightParen);
				setState(276);
				match(LeftBrace);
				setState(277);
				initializerList(0);
				setState(278);
				match(Comma);
				setState(279);
				match(RightBrace);
				}
				break;
			case 4:
				{
				setState(281);
				match(T__2);
				setState(282);
				match(LeftParen);
				setState(283);
				typeName();
				setState(284);
				match(RightParen);
				setState(285);
				match(LeftBrace);
				setState(286);
				initializerList(0);
				setState(287);
				match(RightBrace);
				}
				break;
			case 5:
				{
				setState(289);
				match(T__2);
				setState(290);
				match(LeftParen);
				setState(291);
				typeName();
				setState(292);
				match(RightParen);
				setState(293);
				match(LeftBrace);
				setState(294);
				initializerList(0);
				setState(295);
				match(Comma);
				setState(296);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.pe = _prevctx;
						_localctx.pe = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(300);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(301);
						match(LeftBracket);
						setState(302);
						((PostfixExpressionContext)_localctx).exp = expression(0);
						setState(303);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.peF = _prevctx;
						_localctx.peF = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(305);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(306);
						match(LeftParen);
						setState(308);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
							{
							setState(307);
							((PostfixExpressionContext)_localctx).expF = argumentExpressionList(0);
							}
						}

						setState(310);
						((PostfixExpressionContext)_localctx).rparen = match(RightParen);
							
						                	if(checkIfNotInline(((PostfixExpressionContext)_localctx).peF.str)){
						                		int semiColonIndex =((PostfixExpressionContext)_localctx).rparen.getTokenIndex()+1; 
						                		if(_input.get(semiColonIndex).getText().equals(";")){
						                			int insertIndex =((PostfixExpressionContext)_localctx).rparen.getTokenIndex()+2;
						                		}      		
						                	}
						                
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(312);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(313);
						match(Dot);
						setState(314);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(315);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(316);
						match(Arrow);
						setState(317);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.expr = _prevctx;
						_localctx.expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(318);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(319);
						match(PlusPlus);

						              	((PostfixExpressionContext)_localctx).str = ((PostfixExpressionContext)_localctx).expr.str;
						              	String var =_localctx.str;
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
						break;
					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						_localctx.expr2 = _prevctx;
						_localctx.expr2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(321);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(322);
						match(MinusMinus);

						              	((PostfixExpressionContext)_localctx).str = ((PostfixExpressionContext)_localctx).expr2.str;
						              	String var =_localctx.str;
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
						break;
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public String str;
		public AssignmentExpressionContext a;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitArgumentExpressionList(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(330);
			((ArgumentExpressionListContext)_localctx).a = assignmentExpression();
			((ArgumentExpressionListContext)_localctx).str = ((ArgumentExpressionListContext)_localctx).a.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(333);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(334);
					match(Comma);
					setState(335);
					assignmentExpression();
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public String str;
		public PostfixExpressionContext expr;
		public UnaryExpressionContext unexp;
		public UnaryExpressionContext unexp2;
		public CastExpressionContext cExpr;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryExpression);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				((UnaryExpressionContext)_localctx).expr = postfixExpression(0);
				((UnaryExpressionContext)_localctx).str = ((UnaryExpressionContext)_localctx).expr.str;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(PlusPlus);
				setState(345);
				((UnaryExpressionContext)_localctx).unexp = unaryExpression();

				    	((UnaryExpressionContext)_localctx).str = ((UnaryExpressionContext)_localctx).unexp.str;
				    	String var =_localctx.str;
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
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(MinusMinus);
				setState(349);
				((UnaryExpressionContext)_localctx).unexp2 = unaryExpression();

					   	((UnaryExpressionContext)_localctx).str = ((UnaryExpressionContext)_localctx).unexp2.str;
					   	String var =_localctx.str;
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
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				unaryOperator();
				setState(353);
				((UnaryExpressionContext)_localctx).cExpr = castExpression();
				((UnaryExpressionContext)_localctx).str = ((UnaryExpressionContext)_localctx).cExpr.str;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				match(Sizeof);
				setState(357);
				unaryExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(358);
				match(Sizeof);
				setState(359);
				match(LeftParen);
				setState(360);
				typeName();
				setState(361);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				match(Alignof);
				setState(364);
				match(LeftParen);
				setState(365);
				typeName();
				setState(366);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(368);
				match(AndAnd);
				setState(369);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (Minus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public String str;
		public UnaryExpressionContext expr;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_castExpression);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				((CastExpressionContext)_localctx).expr = unaryExpression();
				((CastExpressionContext)_localctx).str = ((CastExpressionContext)_localctx).expr.str;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(LeftParen);
				setState(378);
				typeName();
				setState(379);
				match(RightParen);
				setState(380);
				castExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				match(T__2);
				setState(383);
				match(LeftParen);
				setState(384);
				typeName();
				setState(385);
				match(RightParen);
				setState(386);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public String str;
		public CastExpressionContext expr;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(391);
			((MultiplicativeExpressionContext)_localctx).expr = castExpression();
			((MultiplicativeExpressionContext)_localctx).str = ((MultiplicativeExpressionContext)_localctx).expr.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(403);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(394);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(395);
						match(Star);
						setState(396);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(397);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(398);
						match(Div);
						setState(399);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(400);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(401);
						match(Mod);
						setState(402);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public String str;
		public MultiplicativeExpressionContext expr;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(409);
			((AdditiveExpressionContext)_localctx).expr = multiplicativeExpression(0);
			((AdditiveExpressionContext)_localctx).str = ((AdditiveExpressionContext)_localctx).expr.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(418);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(412);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(413);
						match(Plus);
						setState(414);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(415);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(416);
						match(Minus);
						setState(417);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public String str;
		public ShiftExpressionContext e1;
		public ShiftExpressionContext e2;
		public AdditiveExpressionContext e3;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(424);
			((ShiftExpressionContext)_localctx).e3 = additiveExpression(0);
			((ShiftExpressionContext)_localctx).str = ((ShiftExpressionContext)_localctx).e3.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(427);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(428);
						match(LeftShift);
						setState(429);
						additiveExpression(0);
						((ShiftExpressionContext)_localctx).str = ((ShiftExpressionContext)_localctx).e1.str;
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.e2 = _prevctx;
						_localctx.e2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(432);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(433);
						match(RightShift);
						setState(434);
						additiveExpression(0);
						((ShiftExpressionContext)_localctx).str = ((ShiftExpressionContext)_localctx).e2.str;
						}
						break;
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public String str;
		public RelationalExpressionContext e2;
		public RelationalExpressionContext e3;
		public RelationalExpressionContext e4;
		public RelationalExpressionContext e5;
		public ShiftExpressionContext e1;
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(443);
			((RelationalExpressionContext)_localctx).e1 = shiftExpression(0);
			((RelationalExpressionContext)_localctx).str = ((RelationalExpressionContext)_localctx).e1.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(466);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.e2 = _prevctx;
						_localctx.e2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(446);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(447);
						match(Less);
						setState(448);
						shiftExpression(0);
						((RelationalExpressionContext)_localctx).str = ((RelationalExpressionContext)_localctx).e2.str;
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.e3 = _prevctx;
						_localctx.e3 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(451);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(452);
						match(Greater);
						setState(453);
						shiftExpression(0);
						((RelationalExpressionContext)_localctx).str = ((RelationalExpressionContext)_localctx).e3.str;
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.e4 = _prevctx;
						_localctx.e4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(456);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(457);
						match(LessEqual);
						setState(458);
						shiftExpression(0);
						((RelationalExpressionContext)_localctx).str = ((RelationalExpressionContext)_localctx).e4.str;
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.e5 = _prevctx;
						_localctx.e5 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(461);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(462);
						match(GreaterEqual);
						setState(463);
						shiftExpression(0);
						((RelationalExpressionContext)_localctx).str = ((RelationalExpressionContext)_localctx).e5.str;
						}
						break;
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public String str;
		public RelationalExpressionContext expr;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(472);
			((EqualityExpressionContext)_localctx).expr = relationalExpression(0);
			((EqualityExpressionContext)_localctx).str = ((EqualityExpressionContext)_localctx).expr.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(481);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(475);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(476);
						match(Equal);
						setState(477);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(478);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(479);
						match(NotEqual);
						setState(480);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public String str;
		public EqualityExpressionContext expr;
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(487);
			((AndExpressionContext)_localctx).expr = equalityExpression(0);
			((AndExpressionContext)_localctx).str = ((AndExpressionContext)_localctx).expr.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(490);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(491);
					match(And);
					setState(492);
					equalityExpression(0);
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public String str;
		public AndExpressionContext expr;
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(499);
			((ExclusiveOrExpressionContext)_localctx).expr = andExpression(0);
			((ExclusiveOrExpressionContext)_localctx).str =  ((ExclusiveOrExpressionContext)_localctx).expr.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(502);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(503);
					match(Caret);
					setState(504);
					andExpression(0);
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public String str;
		public ExclusiveOrExpressionContext expr;
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(511);
			((InclusiveOrExpressionContext)_localctx).expr = exclusiveOrExpression(0);
			((InclusiveOrExpressionContext)_localctx).str = ((InclusiveOrExpressionContext)_localctx).expr.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(514);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(515);
					match(Or);
					setState(516);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public String str;
		public InclusiveOrExpressionContext expr;
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(523);
			((LogicalAndExpressionContext)_localctx).expr = inclusiveOrExpression(0);
			((LogicalAndExpressionContext)_localctx).str = ((LogicalAndExpressionContext)_localctx).expr.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(526);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(527);
					match(AndAnd);
					setState(528);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public String str;
		public LogicalAndExpressionContext expr;
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(535);
			((LogicalOrExpressionContext)_localctx).expr = logicalAndExpression(0);
			((LogicalOrExpressionContext)_localctx).str = ((LogicalOrExpressionContext)_localctx).expr.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(538);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(539);
					match(OrOr);
					setState(540);
					logicalAndExpression(0);
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public String str;
		public LogicalOrExpressionContext expr;
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			((ConditionalExpressionContext)_localctx).expr = logicalOrExpression(0);
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(547);
				match(Question);
				setState(548);
				expression(0);
				setState(549);
				match(Colon);
				setState(550);
				conditionalExpression();
				}
				break;
			}
			((ConditionalExpressionContext)_localctx).str = ((ConditionalExpressionContext)_localctx).expr.str;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public String str;
		public ConditionalExpressionContext cond;
		public UnaryExpressionContext leftOp;
		public AssignmentOperatorContext opr;
		public AssignmentExpressionContext rightOp;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentExpression);
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				((AssignmentExpressionContext)_localctx).cond = conditionalExpression();

				    	((AssignmentExpressionContext)_localctx).str = ((AssignmentExpressionContext)_localctx).cond.str;
				    	String var=((AssignmentExpressionContext)_localctx).cond.str;
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				((AssignmentExpressionContext)_localctx).leftOp = unaryExpression();
				setState(560);
				((AssignmentExpressionContext)_localctx).opr = assignmentOperator();
				setState(561);
				((AssignmentExpressionContext)_localctx).rightOp = assignmentExpression();

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
				   
				}
				break;
			}
			_ctx.stop = _input.LT(-1);

				//postFixCaseIndex=-1;

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (Assign - 92)) | (1L << (StarAssign - 92)) | (1L << (DivAssign - 92)) | (1L << (ModAssign - 92)) | (1L << (PlusAssign - 92)) | (1L << (MinusAssign - 92)) | (1L << (LeftShiftAssign - 92)) | (1L << (RightShiftAssign - 92)) | (1L << (AndAssign - 92)) | (1L << (XorAssign - 92)) | (1L << (OrAssign - 92)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String str;
		public ExpressionContext expr1;
		public AssignmentExpressionContext expr;
		public AssignmentExpressionContext expr2;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(569);
			((ExpressionContext)_localctx).expr = assignmentExpression();
			((ExpressionContext)_localctx).str = ((ExpressionContext)_localctx).expr.str;
			}
			_ctx.stop = _input.LT(-1);
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					_localctx.expr1 = _prevctx;
					_localctx.expr1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(572);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(573);
					match(Comma);
					setState(574);
					((ExpressionContext)_localctx).expr2 = assignmentExpression();
					((ExpressionContext)_localctx).str = ((ExpressionContext)_localctx).expr1.str+","+((ExpressionContext)_localctx).expr2.str;
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext specifier;
		public InitDeclaratorListContext var;
		public Token semi;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declaration);

			if(global)
				declarationFlag=true;

		int _la;
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case T__14:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case ThreadLocal:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				((DeclarationContext)_localctx).specifier = declarationSpecifiers();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)) | (1L << (Identifier - 62)))) != 0)) {
					{
					setState(585);
					((DeclarationContext)_localctx).var = initDeclaratorList(0);
					}
				}

				setState(588);
				((DeclarationContext)_localctx).semi = match(Semi);

				    		if(((((DeclarationContext)_localctx).specifier!=null?_input.getText(((DeclarationContext)_localctx).specifier.start,((DeclarationContext)_localctx).specifier.stop):null)!= null)&&functions.contains((((DeclarationContext)_localctx).specifier!=null?_input.getText(((DeclarationContext)_localctx).specifier.start,((DeclarationContext)_localctx).specifier.stop):null))){
				    		rootFunction=rootFunction+" "+(((DeclarationContext)_localctx).specifier!=null?_input.getText(((DeclarationContext)_localctx).specifier.start,((DeclarationContext)_localctx).specifier.stop):null);
				    	}
				    	if(global && funcDeclaration && ((DeclarationContext)_localctx).var != null){
				    			String specifierText= (((DeclarationContext)_localctx).specifier!=null?_input.getText(((DeclarationContext)_localctx).specifier.start,((DeclarationContext)_localctx).specifier.stop):null);
				    			String functionName= ((DeclarationContext)_localctx).var.str;
				    			currFunctionName=functionName;
					    	    functions.add(currFunctionName);
					    	
				    	
				    			countOfFunction++;
				    			if(!typedefFlag && !specifierText.contains("inline") && !notInlineFunctions.contains(functionName)){
				    				notInlineFunctions.add(functionName);
						    }
				    	}
				    	if(initFlag && !global){
				    		String varType=((DeclarationContext)_localctx).specifier.str;
				    		String initString=(((DeclarationContext)_localctx).var!=null?_input.getText(((DeclarationContext)_localctx).var.start,((DeclarationContext)_localctx).var.stop):null);
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
				    			if(((DeclarationContext)_localctx).var.res == 2 || ((DeclarationContext)_localctx).var.res == 3){
				    			shortRes=((DeclarationContext)_localctx).specifier.str+"-"+((DeclarationContext)_localctx).var.str;
				    			decl = (((DeclarationContext)_localctx).specifier!=null?_input.getText(((DeclarationContext)_localctx).specifier.start,((DeclarationContext)_localctx).specifier.stop):null)+"-"+(((DeclarationContext)_localctx).var!=null?_input.getText(((DeclarationContext)_localctx).var.start,((DeclarationContext)_localctx).var.stop):null);
				    			}
				    		}
				    		else{    			
				    			decl = (((DeclarationContext)_localctx).specifier!=null?_input.getText(((DeclarationContext)_localctx).specifier.start,((DeclarationContext)_localctx).specifier.stop):null);
				    			shortRes=(((DeclarationContext)_localctx).specifier!=null?_input.getText(((DeclarationContext)_localctx).specifier.start,((DeclarationContext)_localctx).specifier.stop):null);
				    		}

				    		if(decl!="" && !decl.contains("inline") && !decl.contains("union") && !decl.contains("struct") && !decl.contains("typedef") && !decl.contains("enum")){
				    			
				    			String type = (((DeclarationContext)_localctx).specifier!=null?_input.getText(((DeclarationContext)_localctx).specifier.start,((DeclarationContext)_localctx).specifier.stop):null);
				    			if(((DeclarationContext)_localctx).var != null){
				    			String varName = (((DeclarationContext)_localctx).var!=null?_input.getText(((DeclarationContext)_localctx).var.start,((DeclarationContext)_localctx).var.stop):null);
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
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				staticAssertDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);

				declarationFlag=false;
				boolTypeSpecFlag=false;
				structDecFlag=false;
				funcDeclaration=false;
				global=false;
				initFlag =false;

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public String str;
		public DeclarationSpecifierContext spec;
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarationSpecifiers(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(594);
					((DeclarationSpecifiersContext)_localctx).spec = declarationSpecifier();

					    	((DeclarationSpecifiersContext)_localctx).str = (((DeclarationSpecifiersContext)_localctx).spec!=null?_input.getText(((DeclarationSpecifiersContext)_localctx).spec.start,((DeclarationSpecifiersContext)_localctx).spec.stop):null);
					    
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(599); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarationSpecifiers2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarationSpecifiers2(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(601);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(604); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarationSpecifier(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declarationSpecifier);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				typeSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(609);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(610);
				alignmentSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public String str;
		public int res;
		public InitDeclaratorContext var;
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInitDeclaratorList(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(614);
			((InitDeclaratorListContext)_localctx).var = initDeclarator();
			 ((InitDeclaratorListContext)_localctx).str = ((InitDeclaratorListContext)_localctx).var.str;((InitDeclaratorListContext)_localctx).res = ((InitDeclaratorListContext)_localctx).var.res;
			}
			_ctx.stop = _input.LT(-1);
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(617);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(618);
					match(Comma);
					setState(619);
					initDeclarator();
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public String str;
		public int res;
		public DeclaratorContext dec;
		public DeclaratorContext leftOp;
		public InitializerContext init;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInitDeclarator(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_initDeclarator);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				((InitDeclaratorContext)_localctx).dec = declarator();
				((InitDeclaratorContext)_localctx).str = ((InitDeclaratorContext)_localctx).dec.str;((InitDeclaratorContext)_localctx).res = ((InitDeclaratorContext)_localctx).dec.res;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				((InitDeclaratorContext)_localctx).leftOp = declarator();
				setState(629);
				match(Assign);
				setState(630);
				((InitDeclaratorContext)_localctx).init = initializer();

				    	initFlag=true;
				    	((InitDeclaratorContext)_localctx).res = 2;// initialization
				    	((InitDeclaratorContext)_localctx).str = (((InitDeclaratorContext)_localctx).leftOp!=null?_input.getText(((InitDeclaratorContext)_localctx).leftOp.start,((InitDeclaratorContext)_localctx).leftOp.stop):null);
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStorageClassSpecifier(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_storageClassSpecifier);
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Typedef:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(Typedef);
				 typedefFlag=true;
				}
				break;
			case Extern:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				match(Extern);
				}
				break;
			case Static:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				match(Static);
				}
				break;
			case ThreadLocal:
				enterOuterAlt(_localctx, 4);
				{
				setState(639);
				match(ThreadLocal);
				}
				break;
			case Auto:
				enterOuterAlt(_localctx, 5);
				{
				setState(640);
				match(Auto);
				}
				break;
			case Register:
				enterOuterAlt(_localctx, 6);
				{
				setState(641);
				match(Register);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypedefNameContext typ;
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeSpecifier);
		int _la;
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Bool) | (1L << Complex))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				match(T__2);
				setState(646);
				match(LeftParen);
				setState(647);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(648);
				match(RightParen);
				}
				break;
			case Atomic:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 4);
				{
				setState(650);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 5);
				{
				setState(651);
				enumSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(652);
				((TypeSpecifierContext)_localctx).typ = typedefName();

				    		if(!isInFunction  && structDecFlag && (((TypeSpecifierContext)_localctx).typ!=null?_input.getText(((TypeSpecifierContext)_localctx).typ.start,((TypeSpecifierContext)_localctx).typ.stop):null).equals("bool")){ // if bool appears in struct decl, replace it with int.
				    			tokens.replace(((TypeSpecifierContext)_localctx).typ.start.getTokenIndex(),"int");
				    			boolTypeSpecFlag=true;			
				    		}
				    	
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(655);
				match(T__8);
				setState(656);
				match(LeftParen);
				setState(657);
				constantExpression();
				setState(658);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructOrUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructOrUnionSpecifier(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				structOrUnion();
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(663);
					match(Identifier);
					}
				}

				setState(666);
				match(LeftBrace);
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << StaticAssert))) != 0) || _la==Identifier) {
					{
					setState(667);
					structDeclarationList(0);
					}
				}

				setState(670);
				match(RightBrace);

				    	structDecFlag = false;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				structOrUnion();
				setState(674);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionContext extends ParserRuleContext {
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructOrUnion(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structOrUnion);
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(Struct);
				structDecFlag=true;
				}
				break;
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				match(Union);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationListContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructDeclarationList(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		return structDeclarationList(0);
	}

	private StructDeclarationListContext structDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, _parentState);
		StructDeclarationListContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(684);
			structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(686);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(687);
					structDeclaration();
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_structDeclaration);
		int _la;
		try {
			setState(700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				specifierQualifierList();
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)) | (1L << (Colon - 62)) | (1L << (Identifier - 62)))) != 0)) {
					{
					setState(694);
					structDeclaratorList(0);
					}
				}

				setState(697);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				staticAssertDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);

				boolTypeSpecFlag=false;

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSpecifierQualifierList(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_specifierQualifierList);
		try {
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				typeSpecifier();
				setState(704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(703);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				typeQualifier();
				setState(708);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(707);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructDeclaratorList(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		return structDeclaratorList(0);
	}

	private StructDeclaratorListContext structDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, _parentState);
		StructDeclaratorListContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(713);
			structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(720);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(715);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(716);
					match(Comma);
					setState(717);
					structDeclarator();
					}
					} 
				}
				setState(722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclaratorContext extends ParserRuleContext {
		public Token colon;
		public ConstantExpressionContext constexp;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStructDeclarator(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structDeclarator);
		int _la;
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)) | (1L << (Identifier - 62)))) != 0)) {
					{
					setState(724);
					declarator();
					}
				}

				setState(727);
				((StructDeclaratorContext)_localctx).colon = match(Colon);
				setState(728);
				((StructDeclaratorContext)_localctx).constexp = constantExpression();

				    	
				    	if(boolTypeSpecFlag){
				    		String val=(((StructDeclaratorContext)_localctx).constexp!=null?_input.getText(((StructDeclaratorContext)_localctx).constexp.start,((StructDeclaratorContext)_localctx).constexp.stop):null);
				    		int varSize=Integer.parseInt(val);
				    		if(varSize == 1){
				    			int start=((StructDeclaratorContext)_localctx).colon.getTokenIndex();
								int end=((StructDeclaratorContext)_localctx).constexp.start.getTokenIndex();
								tokens.delete(start, end);
				    		}
				    	}
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEnumSpecifier(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_enumSpecifier);
		int _la;
		try {
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				match(Enum);
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(734);
					match(Identifier);
					}
				}

				setState(737);
				match(LeftBrace);
				setState(738);
				enumeratorList(0);
				setState(739);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				match(Enum);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(742);
					match(Identifier);
					}
				}

				setState(745);
				match(LeftBrace);
				setState(746);
				enumeratorList(0);
				setState(747);
				match(Comma);
				setState(748);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(750);
				match(Enum);
				setState(751);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorListContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEnumeratorList(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		return enumeratorList(0);
	}

	private EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(755);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(757);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(758);
					match(Comma);
					setState(759);
					enumerator();
					}
					} 
				}
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_enumerator);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				enumerationConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				enumerationConstant();
				setState(767);
				match(Assign);
				setState(768);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEnumerationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEnumerationConstant(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAtomicTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAtomicTypeSpecifier(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(Atomic);
			setState(775);
			match(LeftParen);
			setState(776);
			typeName();
			setState(777);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTypeQualifier(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunctionSpecifier(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionSpecifier);
		int _la;
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				gccAttributeSpecifier();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				match(T__11);
				setState(784);
				match(LeftParen);
				setState(785);
				match(Identifier);
				setState(786);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAlignmentSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAlignmentSpecifier(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_alignmentSpecifier);
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				match(Alignas);
				setState(790);
				match(LeftParen);
				setState(791);
				typeName();
				setState(792);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				match(Alignas);
				setState(795);
				match(LeftParen);
				setState(796);
				constantExpression();
				setState(797);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public String str;
		public int res;
		public DirectDeclaratorContext funcName;
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(801);
				pointer();
				}
			}

			setState(804);
			((DeclaratorContext)_localctx).funcName = directDeclarator(0);
			setState(808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(805);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			((DeclaratorContext)_localctx).str = ((DeclaratorContext)_localctx).funcName.str; ((DeclaratorContext)_localctx).res = ((DeclaratorContext)_localctx).funcName.res; 
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public String str;
		public int res;
		public DirectDeclaratorContext d1;
		public DirectDeclaratorContext dir1;
		public DirectDeclaratorContext dir2;
		public Token Identifier;
		public Token lp;
		public DeclaratorContext declarator;
		public TypeQualifierListContext d2;
		public AssignmentExpressionContext d3;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDirectDeclarator(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(814);
				((DirectDeclaratorContext)_localctx).Identifier = match(Identifier);
				((DirectDeclaratorContext)_localctx).str = (((DirectDeclaratorContext)_localctx).Identifier!=null?((DirectDeclaratorContext)_localctx).Identifier.getText():null); ((DirectDeclaratorContext)_localctx).res = 3;
				}
				break;
			case LeftParen:
				{
				setState(816);
				((DirectDeclaratorContext)_localctx).lp = match(LeftParen);
				setState(817);
				((DirectDeclaratorContext)_localctx).declarator = declarator();
				setState(818);
				match(RightParen);

				    		((DirectDeclaratorContext)_localctx).str = ((DirectDeclaratorContext)_localctx).declarator.str;
				    	
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(874);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						_localctx.d1 = _prevctx;
						_localctx.d1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(823);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(824);
						match(LeftBracket);
						setState(826);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(825);
							((DirectDeclaratorContext)_localctx).d2 = typeQualifierList(0);
							}
						}

						setState(829);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
							{
							setState(828);
							((DirectDeclaratorContext)_localctx).d3 = assignmentExpression();
							}
						}

						setState(831);
						match(RightBracket);

						              	((DirectDeclaratorContext)_localctx).str = ((DirectDeclaratorContext)_localctx).d1.str;((DirectDeclaratorContext)_localctx).res = 3;
						              
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(833);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(834);
						match(LeftBracket);
						setState(835);
						match(Static);
						setState(837);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(836);
							typeQualifierList(0);
							}
						}

						setState(839);
						assignmentExpression();
						setState(840);
						match(RightBracket);
						((DirectDeclaratorContext)_localctx).res = 3;
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(843);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(844);
						match(LeftBracket);
						setState(845);
						typeQualifierList(0);
						setState(846);
						match(Static);
						setState(847);
						assignmentExpression();
						setState(848);
						match(RightBracket);
						((DirectDeclaratorContext)_localctx).res = 3;
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(851);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(852);
						match(LeftBracket);
						setState(854);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(853);
							typeQualifierList(0);
							}
						}

						setState(856);
						match(Star);
						setState(857);
						match(RightBracket);
						((DirectDeclaratorContext)_localctx).res = 3;
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						_localctx.dir1 = _prevctx;
						_localctx.dir1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(859);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(860);
						match(LeftParen);
						setState(861);
						parameterTypeList();
						setState(862);
						match(RightParen);

						              	((DirectDeclaratorContext)_localctx).str = ((DirectDeclaratorContext)_localctx).dir1.str;
						              	((DirectDeclaratorContext)_localctx).res = 1;
						              	
						              	if(isInFunction){
						          	    	currFunctionName=((DirectDeclaratorContext)_localctx).dir1.str;
						          	    	functions.add(currFunctionName);
						          	    	}
						              	if(!isInFunction)
						              		funcDeclaration=true;
						              
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						_localctx.dir2 = _prevctx;
						_localctx.dir2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(865);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(866);
						match(LeftParen);
						setState(868);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(867);
							identifierList(0);
							}
						}

						setState(870);
						match(RightParen);

						              	
						              	if(isInFunction){
						          	    	currFunctionName=((DirectDeclaratorContext)_localctx).dir2.str;
						          	    	functions.add(currFunctionName);
						          	    	
						              	}
						              	if(!isInFunction)
						              		funcDeclaration=true;
						              	((DirectDeclaratorContext)_localctx).str = ((DirectDeclaratorContext)_localctx).dir2.str;
						              	((DirectDeclaratorContext)_localctx).res = 1;
						              
						}
						break;
					}
					} 
				}
				setState(876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGccDeclaratorExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGccDeclaratorExtension(this);
		}
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				match(T__12);
				setState(878);
				match(LeftParen);
				setState(880); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(879);
					match(StringLiteral);
					}
					}
					setState(882); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(884);
				match(RightParen);
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				gccAttributeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGccAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGccAttributeSpecifier(this);
		}
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_gccAttributeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(889);
			match(LeftParen);
			setState(890);
			match(LeftParen);
			setState(891);
			gccAttributeList();
			setState(892);
			match(RightParen);
			setState(893);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeListContext extends ParserRuleContext {
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGccAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGccAttributeList(this);
		}
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_gccAttributeList);
		int _la;
		try {
			setState(904);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case Auto:
			case Break:
			case Case:
			case Char:
			case Const:
			case Continue:
			case Default:
			case Do:
			case Double:
			case Else:
			case Enum:
			case Extern:
			case Float:
			case For:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Struct:
			case Switch:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case While:
			case Alignas:
			case Alignof:
			case Atomic:
			case Bool:
			case Complex:
			case Generic:
			case Imaginary:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftBracket:
			case RightBracket:
			case LeftBrace:
			case RightBrace:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Not:
			case Tilde:
			case Question:
			case Colon:
			case Semi:
			case Assign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
			case Arrow:
			case Dot:
			case Ellipsis:
			case Identifier:
			case Constant:
			case StringLiteral:
			case LineDirective:
			case PragmaDirective:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
			case WS:
			case LINE_COMMAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				gccAttribute();
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(896);
					match(Comma);
					setState(897);
					gccAttribute();
					}
					}
					setState(902);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeContext extends ParserRuleContext {
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterGccAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitGccAttribute(this);
		}
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_gccAttribute);
		int _la;
		try {
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (RightParen - 62)) | (1L << (Comma - 62)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(907);
					match(LeftParen);
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
						{
						setState(908);
						argumentExpressionList(0);
						}
					}

					setState(911);
					match(RightParen);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(914);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterNestedParenthesesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitNestedParenthesesBlock(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftBracket - 64)) | (1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)) | (1L << (WS - 64)) | (1L << (LINE_COMMAND - 64)))) != 0)) {
				{
				setState(922);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Constant:
				case StringLiteral:
				case LineDirective:
				case PragmaDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
				case WS:
				case LINE_COMMAND:
					{
					setState(917);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(918);
					match(LeftParen);
					setState(919);
					nestedParenthesesBlock();
					setState(920);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_pointer);
		int _la;
		try {
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				match(Star);
				setState(929);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(928);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				match(Star);
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(932);
					typeQualifierList(0);
					}
				}

				setState(935);
				pointer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(936);
				match(Caret);
				setState(938);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(937);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(940);
				match(Caret);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(941);
					typeQualifierList(0);
					}
				}

				setState(944);
				pointer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTypeQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTypeQualifierList(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(948);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(954);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(950);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(951);
					typeQualifier();
					}
					} 
				}
				setState(956);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParameterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParameterTypeList(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_parameterTypeList);
		try {
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				parameterList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				parameterList(0);
				setState(959);
				match(Comma);
				setState(960);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(965);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(972);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(967);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(968);
					match(Comma);
					setState(969);
					parameterDeclaration();
					}
					} 
				}
				setState(974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_parameterDeclaration);
		try {
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				declarationSpecifiers();
				setState(976);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				declarationSpecifiers2();
				setState(980);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(979);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(985);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(987);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(988);
					match(Comma);
					setState(989);
					match(Identifier);
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			specifierQualifierList();
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (LeftBracket - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)))) != 0)) {
				{
				setState(996);
				abstractDeclarator();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAbstractDeclarator(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_abstractDeclarator);
		int _la;
		try {
			int _alt;
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(1000);
					pointer();
					}
				}

				setState(1003);
				directAbstractDeclarator(0);
				setState(1007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1004);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1009);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDirectAbstractDeclarator(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1013);
				match(LeftParen);
				setState(1014);
				abstractDeclarator();
				setState(1015);
				match(RightParen);
				setState(1019);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1016);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1021);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1022);
				match(LeftBracket);
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(1023);
					typeQualifierList(0);
					}
				}

				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1026);
					assignmentExpression();
					}
				}

				setState(1029);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(1030);
				match(LeftBracket);
				setState(1031);
				match(Static);
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(1032);
					typeQualifierList(0);
					}
				}

				setState(1035);
				assignmentExpression();
				setState(1036);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(1038);
				match(LeftBracket);
				setState(1039);
				typeQualifierList(0);
				setState(1040);
				match(Static);
				setState(1041);
				assignmentExpression();
				setState(1042);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(1044);
				match(LeftBracket);
				setState(1045);
				match(Star);
				setState(1046);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(1047);
				match(LeftParen);
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
					{
					setState(1048);
					parameterTypeList();
					}
				}

				setState(1051);
				match(RightParen);
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1052);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1057);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1060);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1061);
						match(LeftBracket);
						setState(1063);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1062);
							typeQualifierList(0);
							}
						}

						setState(1066);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
							{
							setState(1065);
							assignmentExpression();
							}
						}

						setState(1068);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1069);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1070);
						match(LeftBracket);
						setState(1071);
						match(Static);
						setState(1073);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1072);
							typeQualifierList(0);
							}
						}

						setState(1075);
						assignmentExpression();
						setState(1076);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1078);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1079);
						match(LeftBracket);
						setState(1080);
						typeQualifierList(0);
						setState(1081);
						match(Static);
						setState(1082);
						assignmentExpression();
						setState(1083);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1085);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1086);
						match(LeftBracket);
						setState(1087);
						match(Star);
						setState(1088);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1089);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1090);
						match(LeftParen);
						setState(1092);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
							{
							setState(1091);
							parameterTypeList();
							}
						}

						setState(1094);
						match(RightParen);
						setState(1098);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1095);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(1100);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(1105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTypedefName(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			((TypedefNameContext)_localctx).id = match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public String str;
		public AssignmentExpressionContext assignExpr;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_initializer);
		try {
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				((InitializerContext)_localctx).assignExpr = assignmentExpression();
				((InitializerContext)_localctx).str = ((InitializerContext)_localctx).assignExpr.str;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				match(LeftBrace);
				setState(1112);
				initializerList(0);
				setState(1113);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1115);
				match(LeftBrace);
				setState(1116);
				initializerList(0);
				setState(1117);
				match(Comma);
				setState(1118);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInitializerList(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(1123);
				designation();
				}
			}

			setState(1126);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(1136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(1128);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1129);
					match(Comma);
					setState(1131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(1130);
						designation();
						}
					}

					setState(1133);
					initializer();
					}
					} 
				}
				setState(1138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDesignation(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			designatorList(0);
			setState(1140);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorListContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDesignatorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDesignatorList(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		return designatorList(0);
	}

	private DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1143);
			designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(1145);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1146);
					designator();
					}
					} 
				}
				setState(1151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_designator);
		try {
			setState(1158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1152);
				match(LeftBracket);
				setState(1153);
				constantExpression();
				setState(1154);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				match(Dot);
				setState(1157);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStaticAssertDeclaration(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(StaticAssert);
			setState(1161);
			match(LeftParen);
			setState(1162);
			constantExpression();
			setState(1163);
			match(Comma);
			setState(1165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1164);
				match(StringLiteral);
				}
				}
				setState(1167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1169);
			match(RightParen);
			setState(1170);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public String counter;
		public ExpressionStatementContext expstat;
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, String counter) {
			super(parent, invokingState);
			this.counter = counter;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(String counter) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), counter);
		enterRule(_localctx, 144, RULE_statement);
		int _la;
		try {
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1172);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				    	compoundStatFlag=true;
				    
				setState(1174);
				compoundStatement(_localctx.counter);

				     	compoundStatFlag=false;
				     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1177);
				((StatementContext)_localctx).expstat = expressionStatement();
					
				    	if((ifFlag || iterationFlag) && !compoundStatFlag){
				    		tokens.insertBefore(((StatementContext)_localctx).expstat.start.getTokenIndex(),"{\n");
							tokens.insertAfter(((StatementContext)_localctx).expstat.stop.getTokenIndex(),"\n}\n");
				    	}	
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1180);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1181);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1182);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1183);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16 || _la==Volatile) {
					{
					setState(1184);
					_la = _input.LA(1);
					if ( !(_la==T__16 || _la==Volatile) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1187);
				match(LeftParen);
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1188);
					logicalOrExpression(0);
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1189);
						match(Comma);
						setState(1190);
						logicalOrExpression(0);
						}
						}
						setState(1195);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1198);
					match(Colon);
					setState(1207);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
						{
						setState(1199);
						logicalOrExpression(0);
						setState(1204);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1200);
							match(Comma);
							setState(1201);
							logicalOrExpression(0);
							}
							}
							setState(1206);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(1213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1214);
				match(RightParen);
				setState(1215);
				match(Semi);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);

				//inlineFlag =false;
				

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_labeledStatement);
		try {
			setState(1229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				match(Identifier);
				setState(1219);
				match(Colon);
				setState(1220);
				statement(null);
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				match(Case);
				setState(1222);
				constantExpression();
				setState(1223);
				match(Colon);
				setState(1224);
				statement(null);
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1226);
				match(Default);
				setState(1227);
				match(Colon);
				setState(1228);
				statement(null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public String counter;
		public Token rightParen;
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState, String counter) {
			super(parent, invokingState);
			this.counter = counter;
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement(String counter) throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState(), counter);
		enterRule(_localctx, 148, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			((CompoundStatementContext)_localctx).rightParen = match(LeftBrace);
			setState(1233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (AndAnd - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Semi - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
				{
				setState(1232);
				blockItemList(0);
				}
			}

			setState(1235);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitBlockItemList(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1238);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(1244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(1240);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1241);
					blockItem();
					}
					} 
				}
				setState(1246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitBlockItem(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_blockItem);

				statementStartIndex=((BlockItemContext)_localctx).start.getTokenIndex();

		try {
			setState(1251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				declaration();

				    	structDecFlag=false;
				    	funcDeclaration=false;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250);
				statement(null);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);

				statementStartIndex=-1;
				typedefFlag=false;

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public String str;
		public ExpressionContext ex;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
				{
				setState(1253);
				((ExpressionStatementContext)_localctx).ex = expression(0);
				}
			}

			setState(1256);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_selectionStatement);

				ifStartIndex=((SelectionStatementContext)_localctx).start.getTokenIndex();

		try {
			setState(1276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				 	ifFlag=true;  
				setState(1259);
				match(If);
				setState(1260);
				match(LeftParen);
				setState(1261);
				expression(0);
				setState(1262);
				match(RightParen);
				setState(1263);
				statement(null);
				setState(1266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1264);
					match(Else);
					setState(1265);
					statement(null);
					}
					break;
				}
				 	ifFlag=false; 
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270);
				match(Switch);
				setState(1271);
				match(LeftParen);
				setState(1272);
				expression(0);
				setState(1273);
				match(RightParen);
				setState(1274);
				statement(null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);

					ifStartIndex=-1;

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public Token startLabel;
		public ExpressionContext c1;
		public ExpressionContext c2;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext c3;
		public ExpressionContext c4;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_iterationStatement);

				iterationFlag=true;
				itrStartIndex=((IterationStatementContext)_localctx).start.getTokenIndex();

		int _la;
		try {
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				((IterationStatementContext)_localctx).startLabel = match(While);
				setState(1279);
				match(LeftParen);
				setState(1280);
				((IterationStatementContext)_localctx).c1 = expression(0);
				setState(1281);
				match(RightParen);
				setState(1282);
				statement(null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				((IterationStatementContext)_localctx).startLabel = match(Do);
				setState(1285);
				statement(null);
				setState(1286);
				match(While);
				setState(1287);
				match(LeftParen);
				setState(1288);
				((IterationStatementContext)_localctx).c2 = expression(0);
				setState(1289);
				match(RightParen);
				setState(1290);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1292);
				((IterationStatementContext)_localctx).startLabel = match(For);
				setState(1293);
				match(LeftParen);
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1294);
					((IterationStatementContext)_localctx).e1 = expression(0);
					}
				}

				setState(1297);
				match(Semi);
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1298);
					((IterationStatementContext)_localctx).e2 = expression(0);
					}
				}

				setState(1301);
				match(Semi);
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1302);
					((IterationStatementContext)_localctx).c3 = expression(0);
					}
				}

				setState(1305);
				match(RightParen);
				setState(1306);
				statement(null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1307);
				((IterationStatementContext)_localctx).startLabel = match(For);
				setState(1308);
				match(LeftParen);
				setState(1309);
				declaration();
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1310);
					expression(0);
					}
				}

				setState(1313);
				match(Semi);
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1314);
					((IterationStatementContext)_localctx).c4 = expression(0);
					}
				}

				setState(1317);
				match(RightParen);
				setState(1318);
				statement(null);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);

					iterationFlag=false;
					itrStartIndex=-1;

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public Token ret;
		public Token semi;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_jumpStatement);
		int _la;
		try {
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				match(Goto);
				setState(1323);
				match(Identifier);
				setState(1324);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1325);
				match(Continue);
				setState(1326);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1327);
				match(Break);
				setState(1328);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1329);
				((JumpStatementContext)_localctx).ret = match(Return);
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1330);
					expression(0);
					}
				}

				setState(1333);
				((JumpStatementContext)_localctx).semi = match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1334);
				match(Goto);
				setState(1335);
				unaryExpression();
				setState(1336);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Star - 78)) | (1L << (Caret - 78)) | (1L << (Semi - 78)) | (1L << (Identifier - 78)))) != 0)) {
				{
				setState(1340);
				translationUnit(0);
				}
			}

			setState(1343);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitTranslationUnit(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1346);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(1348);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1349);
					externalDeclaration();
					}
					} 
				}
				setState(1354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExternalDeclaration(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_externalDeclaration);
		try {
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1355);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1356);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1357);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclarationSpecifiersContext spec;
		public DeclaratorContext dec;
		public CompoundStatementContext compStat;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<GccAttributeSpecifierContext> gccAttributeSpecifier() {
			return getRuleContexts(GccAttributeSpecifierContext.class);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier(int i) {
			return getRuleContext(GccAttributeSpecifierContext.class,i);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_functionDefinition);

			isInFunction=true;
			//System.out.printnln(functionDefinition.text);

		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1360);
					gccAttributeSpecifier();
					}
					} 
				}
				setState(1365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1366);
				((FunctionDefinitionContext)_localctx).spec = declarationSpecifiers();
				}
				break;
			}
			setState(1369);
			((FunctionDefinitionContext)_localctx).dec = declarator();
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1370);
				declarationList(0);
				}
			}

			setState(1373);
			((FunctionDefinitionContext)_localctx).compStat = compoundStatement(null);

			    	String specifier=(((FunctionDefinitionContext)_localctx).spec!=null?_input.getText(((FunctionDefinitionContext)_localctx).spec.start,((FunctionDefinitionContext)_localctx).spec.stop):null);
			    	//System.out.println("spec "+((FunctionDefinitionContext)_localctx).spec.str);
			    	//System.out.println("dec "+((FunctionDefinitionContext)_localctx).dec.str);
			    	currFunctionName = ((FunctionDefinitionContext)_localctx).dec.str;
			    	//System.out.println("compStat "+(((FunctionDefinitionContext)_localctx).compStat!=null?_input.getText(((FunctionDefinitionContext)_localctx).compStat.start,((FunctionDefinitionContext)_localctx).compStat.stop):null));
			    		if(!typedefFlag && !specifier.contains("inline") && !notInlineFunctions.contains(((FunctionDefinitionContext)_localctx).dec.str)){
			    			notInlineFunctions.add(((FunctionDefinitionContext)_localctx).dec.str);
			    			
			    }
			    typedefFlag=false;
			    
			}
			_ctx.stop = _input.LT(-1);

				//System.out.println("Current Function after definition: "+ currFunctionName+" Root Function after definition"+rootFunction);
				funcMap.put(currFunctionName, rootFunction);
				rootFunction = "";
				currFunctionName="";
				isInFunction=false;

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclarationList(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1377);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1379);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1380);
					declaration();
					}
					} 
				}
				setState(1385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);
		case 6:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 7:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 11:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 12:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 13:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 14:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 15:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 16:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 17:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 18:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 19:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 20:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 24:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 30:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 36:
			return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);
		case 39:
			return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);
		case 42:
			return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);
		case 50:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 57:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 59:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 61:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 64:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		case 67:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 69:
			return designatorList_sempred((DesignatorListContext)_localctx, predIndex);
		case 75:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 82:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 85:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean genericAssocList_sempred(GenericAssocListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 6);
		case 32:
			return precpred(_ctx, 5);
		case 33:
			return precpred(_ctx, 4);
		case 34:
			return precpred(_ctx, 3);
		case 35:
			return precpred(_ctx, 2);
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 5);
		case 41:
			return precpred(_ctx, 4);
		case 42:
			return precpred(_ctx, 3);
		case 43:
			return precpred(_ctx, 2);
		case 44:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3x\u056d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\u00b7\n\2\r\2\16"+
		"\2\u00b8\3\3\3\3\7\3\u00bd\n\3\f\3\16\3\u00c0\13\3\3\3\3\3\7\3\u00c4\n"+
		"\3\f\3\16\3\u00c7\13\3\3\4\3\4\3\4\3\4\6\4\u00cd\n\4\r\4\16\4\u00ce\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d8\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ec\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00fb\n\6\f\6\16\6\u00fe\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0107\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u012d\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0137\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0147\n\b\f\b\16\b\u014a\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t\u0153\n\t\f\t\16\t\u0156\13\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0175\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0187\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0196\n\r\f\r\16\r\u0199\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01a5\n\16\f\16\16"+
		"\16\u01a8\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u01b8\n\17\f\17\16\17\u01bb\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01d5\n\20\f\20\16\20\u01d8\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01e4\n\21"+
		"\f\21\16\21\u01e7\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01f0"+
		"\n\22\f\22\16\22\u01f3\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01fc"+
		"\n\23\f\23\16\23\u01ff\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0208"+
		"\n\24\f\24\16\24\u020b\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0214"+
		"\n\25\f\25\16\25\u0217\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0220"+
		"\n\26\f\26\16\26\u0223\13\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u022b"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0237\n\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0244\n\32"+
		"\f\32\16\32\u0247\13\32\3\33\3\33\3\34\3\34\5\34\u024d\n\34\3\34\3\34"+
		"\3\34\3\34\5\34\u0253\n\34\3\35\3\35\3\35\6\35\u0258\n\35\r\35\16\35\u0259"+
		"\3\36\6\36\u025d\n\36\r\36\16\36\u025e\3\37\3\37\3\37\3\37\3\37\5\37\u0266"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \7 \u026f\n \f \16 \u0272\13 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u027c\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0285\n\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0297\n#\3$\3$\5$\u029b"+
		"\n$\3$\3$\5$\u029f\n$\3$\3$\3$\3$\3$\3$\5$\u02a7\n$\3%\3%\3%\5%\u02ac"+
		"\n%\3&\3&\3&\3&\3&\7&\u02b3\n&\f&\16&\u02b6\13&\3\'\3\'\5\'\u02ba\n\'"+
		"\3\'\3\'\3\'\5\'\u02bf\n\'\3(\3(\5(\u02c3\n(\3(\3(\5(\u02c7\n(\5(\u02c9"+
		"\n(\3)\3)\3)\3)\3)\3)\7)\u02d1\n)\f)\16)\u02d4\13)\3*\3*\5*\u02d8\n*\3"+
		"*\3*\3*\3*\5*\u02de\n*\3+\3+\5+\u02e2\n+\3+\3+\3+\3+\3+\3+\5+\u02ea\n"+
		"+\3+\3+\3+\3+\3+\3+\3+\5+\u02f3\n+\3,\3,\3,\3,\3,\3,\7,\u02fb\n,\f,\16"+
		",\u02fe\13,\3-\3-\3-\3-\3-\5-\u0305\n-\3.\3.\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0316\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u0322\n\62\3\63\5\63\u0325\n\63\3\63\3"+
		"\63\7\63\u0329\n\63\f\63\16\63\u032c\13\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u0338\n\64\3\64\3\64\3\64\5\64\u033d\n\64"+
		"\3\64\5\64\u0340\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0348\n\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\5\64\u0359\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u0367\n\64\3\64\3\64\7\64\u036b\n\64\f\64\16\64\u036e"+
		"\13\64\3\65\3\65\3\65\6\65\u0373\n\65\r\65\16\65\u0374\3\65\3\65\5\65"+
		"\u0379\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\7\67\u0385"+
		"\n\67\f\67\16\67\u0388\13\67\3\67\5\67\u038b\n\67\38\38\38\58\u0390\n"+
		"8\38\58\u0393\n8\38\58\u0396\n8\39\39\39\39\39\79\u039d\n9\f9\169\u03a0"+
		"\139\3:\3:\5:\u03a4\n:\3:\3:\5:\u03a8\n:\3:\3:\3:\5:\u03ad\n:\3:\3:\5"+
		":\u03b1\n:\3:\5:\u03b4\n:\3;\3;\3;\3;\3;\7;\u03bb\n;\f;\16;\u03be\13;"+
		"\3<\3<\3<\3<\3<\5<\u03c5\n<\3=\3=\3=\3=\3=\3=\7=\u03cd\n=\f=\16=\u03d0"+
		"\13=\3>\3>\3>\3>\3>\5>\u03d7\n>\5>\u03d9\n>\3?\3?\3?\3?\3?\3?\7?\u03e1"+
		"\n?\f?\16?\u03e4\13?\3@\3@\5@\u03e8\n@\3A\3A\5A\u03ec\nA\3A\3A\7A\u03f0"+
		"\nA\fA\16A\u03f3\13A\5A\u03f5\nA\3B\3B\3B\3B\3B\7B\u03fc\nB\fB\16B\u03ff"+
		"\13B\3B\3B\5B\u0403\nB\3B\5B\u0406\nB\3B\3B\3B\3B\5B\u040c\nB\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u041c\nB\3B\3B\7B\u0420\nB\fB\16"+
		"B\u0423\13B\5B\u0425\nB\3B\3B\3B\5B\u042a\nB\3B\5B\u042d\nB\3B\3B\3B\3"+
		"B\3B\5B\u0434\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5"+
		"B\u0447\nB\3B\3B\7B\u044b\nB\fB\16B\u044e\13B\7B\u0450\nB\fB\16B\u0453"+
		"\13B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0463\nD\3E\3E\5E\u0467"+
		"\nE\3E\3E\3E\3E\3E\5E\u046e\nE\3E\7E\u0471\nE\fE\16E\u0474\13E\3F\3F\3"+
		"F\3G\3G\3G\3G\3G\7G\u047e\nG\fG\16G\u0481\13G\3H\3H\3H\3H\3H\3H\5H\u0489"+
		"\nH\3I\3I\3I\3I\3I\6I\u0490\nI\rI\16I\u0491\3I\3I\3I\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\5J\u04a4\nJ\3J\3J\3J\3J\7J\u04aa\nJ\fJ\16J\u04ad"+
		"\13J\5J\u04af\nJ\3J\3J\3J\3J\7J\u04b5\nJ\fJ\16J\u04b8\13J\5J\u04ba\nJ"+
		"\7J\u04bc\nJ\fJ\16J\u04bf\13J\3J\3J\5J\u04c3\nJ\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\5K\u04d0\nK\3L\3L\5L\u04d4\nL\3L\3L\3M\3M\3M\3M\3M\7M\u04dd"+
		"\nM\fM\16M\u04e0\13M\3N\3N\3N\3N\5N\u04e6\nN\3O\5O\u04e9\nO\3O\3O\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\5P\u04f5\nP\3P\3P\3P\3P\3P\3P\3P\3P\5P\u04ff\nP\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0512\nQ\3Q\3Q\5"+
		"Q\u0516\nQ\3Q\3Q\5Q\u051a\nQ\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0522\nQ\3Q\3Q\5Q\u0526"+
		"\nQ\3Q\3Q\3Q\5Q\u052b\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0536\nR\3R\3R"+
		"\3R\3R\3R\5R\u053d\nR\3S\5S\u0540\nS\3S\3S\3T\3T\3T\3T\3T\7T\u0549\nT"+
		"\fT\16T\u054c\13T\3U\3U\3U\5U\u0551\nU\3V\7V\u0554\nV\fV\16V\u0557\13"+
		"V\3V\5V\u055a\nV\3V\3V\5V\u055e\nV\3V\3V\3V\3W\3W\3W\3W\3W\7W\u0568\n"+
		"W\fW\16W\u056b\13W\3W\3\u00c5\36\n\16\20\30\32\34\36 \"$&(*\62>JPVftx"+
		"|\u0082\u0088\u008c\u0098\u00a6\u00acX\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\2\r\7\2L"+
		"LNNPPSSXY\3\2^h\n\2\b\n\27\27\34\34  %&*+\62\639:\3\2\b\n\6\2\30\30(("+
		"\64\6488\5\2\f\r$$==\3\2\20\21\4\2@A]]\3\2@A\4\2\17\17\22\22\4\2\23\23"+
		"\64\64\u05ec\2\u00b6\3\2\2\2\4\u00ba\3\2\2\2\6\u00eb\3\2\2\2\b\u00ed\3"+
		"\2\2\2\n\u00f4\3\2\2\2\f\u0106\3\2\2\2\16\u012c\3\2\2\2\20\u014b\3\2\2"+
		"\2\22\u0174\3\2\2\2\24\u0176\3\2\2\2\26\u0186\3\2\2\2\30\u0188\3\2\2\2"+
		"\32\u019a\3\2\2\2\34\u01a9\3\2\2\2\36\u01bc\3\2\2\2 \u01d9\3\2\2\2\"\u01e8"+
		"\3\2\2\2$\u01f4\3\2\2\2&\u0200\3\2\2\2(\u020c\3\2\2\2*\u0218\3\2\2\2,"+
		"\u0224\3\2\2\2.\u0236\3\2\2\2\60\u0238\3\2\2\2\62\u023a\3\2\2\2\64\u0248"+
		"\3\2\2\2\66\u0252\3\2\2\28\u0257\3\2\2\2:\u025c\3\2\2\2<\u0265\3\2\2\2"+
		">\u0267\3\2\2\2@\u027b\3\2\2\2B\u0284\3\2\2\2D\u0296\3\2\2\2F\u02a6\3"+
		"\2\2\2H\u02ab\3\2\2\2J\u02ad\3\2\2\2L\u02be\3\2\2\2N\u02c8\3\2\2\2P\u02ca"+
		"\3\2\2\2R\u02dd\3\2\2\2T\u02f2\3\2\2\2V\u02f4\3\2\2\2X\u0304\3\2\2\2Z"+
		"\u0306\3\2\2\2\\\u0308\3\2\2\2^\u030d\3\2\2\2`\u0315\3\2\2\2b\u0321\3"+
		"\2\2\2d\u0324\3\2\2\2f\u0337\3\2\2\2h\u0378\3\2\2\2j\u037a\3\2\2\2l\u038a"+
		"\3\2\2\2n\u0395\3\2\2\2p\u039e\3\2\2\2r\u03b3\3\2\2\2t\u03b5\3\2\2\2v"+
		"\u03c4\3\2\2\2x\u03c6\3\2\2\2z\u03d8\3\2\2\2|\u03da\3\2\2\2~\u03e5\3\2"+
		"\2\2\u0080\u03f4\3\2\2\2\u0082\u0424\3\2\2\2\u0084\u0454\3\2\2\2\u0086"+
		"\u0462\3\2\2\2\u0088\u0464\3\2\2\2\u008a\u0475\3\2\2\2\u008c\u0478\3\2"+
		"\2\2\u008e\u0488\3\2\2\2\u0090\u048a\3\2\2\2\u0092\u04c2\3\2\2\2\u0094"+
		"\u04cf\3\2\2\2\u0096\u04d1\3\2\2\2\u0098\u04d7\3\2\2\2\u009a\u04e5\3\2"+
		"\2\2\u009c\u04e8\3\2\2\2\u009e\u04fe\3\2\2\2\u00a0\u052a\3\2\2\2\u00a2"+
		"\u053c\3\2\2\2\u00a4\u053f\3\2\2\2\u00a6\u0543\3\2\2\2\u00a8\u0550\3\2"+
		"\2\2\u00aa\u0555\3\2\2\2\u00ac\u0562\3\2\2\2\u00ae\u00af\b\2\1\2\u00af"+
		"\u00b7\5\u00aaV\2\u00b0\u00b1\b\2\1\2\u00b1\u00b7\5\66\34\2\u00b2\u00b7"+
		"\5L\'\2\u00b3\u00b7\5\u00a8U\2\u00b4\u00b7\5\u009aN\2\u00b5\u00b7\5\4"+
		"\3\2\u00b6\u00ae\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6"+
		"\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\3\3\2\2\2\u00ba\u00be"+
		"\7\3\2\2\u00bb\u00bd\7w\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c1\u00c5\7\4\2\2\u00c2\u00c4\13\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\5\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ec\b\4\1\2\u00ca\u00ec"+
		"\7o\2\2\u00cb\u00cd\7p\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00ec\3\2\2\2\u00d0\u00d1\7@"+
		"\2\2\u00d1\u00d2\5\62\32\2\u00d2\u00d3\7A\2\2\u00d3\u00d4\b\4\1\2\u00d4"+
		"\u00ec\3\2\2\2\u00d5\u00ec\5\b\5\2\u00d6\u00d8\7\5\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7@\2\2\u00da"+
		"\u00db\5\u0096L\2\u00db\u00dc\7A\2\2\u00dc\u00ec\3\2\2\2\u00dd\u00de\7"+
		"\6\2\2\u00de\u00df\7@\2\2\u00df\u00e0\5\22\n\2\u00e0\u00e1\7]\2\2\u00e1"+
		"\u00e2\5~@\2\u00e2\u00e3\7A\2\2\u00e3\u00ec\3\2\2\2\u00e4\u00e5\7\7\2"+
		"\2\u00e5\u00e6\7@\2\2\u00e6\u00e7\5~@\2\u00e7\u00e8\7]\2\2\u00e8\u00e9"+
		"\5\22\n\2\u00e9\u00ea\7A\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00c8\3\2\2\2\u00eb"+
		"\u00ca\3\2\2\2\u00eb\u00cc\3\2\2\2\u00eb\u00d0\3\2\2\2\u00eb\u00d5\3\2"+
		"\2\2\u00eb\u00d7\3\2\2\2\u00eb\u00dd\3\2\2\2\u00eb\u00e4\3\2\2\2\u00ec"+
		"\7\3\2\2\2\u00ed\u00ee\7;\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0\5.\30\2\u00f0"+
		"\u00f1\7]\2\2\u00f1\u00f2\5\n\6\2\u00f2\u00f3\7A\2\2\u00f3\t\3\2\2\2\u00f4"+
		"\u00f5\b\6\1\2\u00f5\u00f6\5\f\7\2\u00f6\u00fc\3\2\2\2\u00f7\u00f8\f\3"+
		"\2\2\u00f8\u00f9\7]\2\2\u00f9\u00fb\5\f\7\2\u00fa\u00f7\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\13\3\2\2"+
		"\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\5~@\2\u0100\u0101\7[\2\2\u0101\u0102"+
		"\5.\30\2\u0102\u0107\3\2\2\2\u0103\u0104\7\32\2\2\u0104\u0105\7[\2\2\u0105"+
		"\u0107\5.\30\2\u0106\u00ff\3\2\2\2\u0106\u0103\3\2\2\2\u0107\r\3\2\2\2"+
		"\u0108\u0109\b\b\1\2\u0109\u010a\5\6\4\2\u010a\u010b\b\b\1\2\u010b\u012d"+
		"\3\2\2\2\u010c\u010d\7@\2\2\u010d\u010e\5~@\2\u010e\u010f\7A\2\2\u010f"+
		"\u0110\7D\2\2\u0110\u0111\5\u0088E\2\u0111\u0112\7E\2\2\u0112\u012d\3"+
		"\2\2\2\u0113\u0114\7@\2\2\u0114\u0115\5~@\2\u0115\u0116\7A\2\2\u0116\u0117"+
		"\7D\2\2\u0117\u0118\5\u0088E\2\u0118\u0119\7]\2\2\u0119\u011a\7E\2\2\u011a"+
		"\u012d\3\2\2\2\u011b\u011c\7\5\2\2\u011c\u011d\7@\2\2\u011d\u011e\5~@"+
		"\2\u011e\u011f\7A\2\2\u011f\u0120\7D\2\2\u0120\u0121\5\u0088E\2\u0121"+
		"\u0122\7E\2\2\u0122\u012d\3\2\2\2\u0123\u0124\7\5\2\2\u0124\u0125\7@\2"+
		"\2\u0125\u0126\5~@\2\u0126\u0127\7A\2\2\u0127\u0128\7D\2\2\u0128\u0129"+
		"\5\u0088E\2\u0129\u012a\7]\2\2\u012a\u012b\7E\2\2\u012b\u012d\3\2\2\2"+
		"\u012c\u0108\3\2\2\2\u012c\u010c\3\2\2\2\u012c\u0113\3\2\2\2\u012c\u011b"+
		"\3\2\2\2\u012c\u0123\3\2\2\2\u012d\u0148\3\2\2\2\u012e\u012f\f\f\2\2\u012f"+
		"\u0130\7B\2\2\u0130\u0131\5\62\32\2\u0131\u0132\7C\2\2\u0132\u0147\3\2"+
		"\2\2\u0133\u0134\f\13\2\2\u0134\u0136\7@\2\2\u0135\u0137\5\20\t\2\u0136"+
		"\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7A"+
		"\2\2\u0139\u0147\b\b\1\2\u013a\u013b\f\n\2\2\u013b\u013c\7l\2\2\u013c"+
		"\u0147\7n\2\2\u013d\u013e\f\t\2\2\u013e\u013f\7k\2\2\u013f\u0147\7n\2"+
		"\2\u0140\u0141\f\b\2\2\u0141\u0142\7M\2\2\u0142\u0147\b\b\1\2\u0143\u0144"+
		"\f\7\2\2\u0144\u0145\7O\2\2\u0145\u0147\b\b\1\2\u0146\u012e\3\2\2\2\u0146"+
		"\u0133\3\2\2\2\u0146\u013a\3\2\2\2\u0146\u013d\3\2\2\2\u0146\u0140\3\2"+
		"\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\17\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\b\t\1"+
		"\2\u014c\u014d\5.\30\2\u014d\u014e\b\t\1\2\u014e\u0154\3\2\2\2\u014f\u0150"+
		"\f\3\2\2\u0150\u0151\7]\2\2\u0151\u0153\5.\30\2\u0152\u014f\3\2\2\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\21\3\2\2"+
		"\2\u0156\u0154\3\2\2\2\u0157\u0158\5\16\b\2\u0158\u0159\b\n\1\2\u0159"+
		"\u0175\3\2\2\2\u015a\u015b\7M\2\2\u015b\u015c\5\22\n\2\u015c\u015d\b\n"+
		"\1\2\u015d\u0175\3\2\2\2\u015e\u015f\7O\2\2\u015f\u0160\5\22\n\2\u0160"+
		"\u0161\b\n\1\2\u0161\u0175\3\2\2\2\u0162\u0163\5\24\13\2\u0163\u0164\5"+
		"\26\f\2\u0164\u0165\b\n\1\2\u0165\u0175\3\2\2\2\u0166\u0167\7,\2\2\u0167"+
		"\u0175\5\22\n\2\u0168\u0169\7,\2\2\u0169\u016a\7@\2\2\u016a\u016b\5~@"+
		"\2\u016b\u016c\7A\2\2\u016c\u0175\3\2\2\2\u016d\u016e\7\67\2\2\u016e\u016f"+
		"\7@\2\2\u016f\u0170\5~@\2\u0170\u0171\7A\2\2\u0171\u0175\3\2\2\2\u0172"+
		"\u0173\7U\2\2\u0173\u0175\7n\2\2\u0174\u0157\3\2\2\2\u0174\u015a\3\2\2"+
		"\2\u0174\u015e\3\2\2\2\u0174\u0162\3\2\2\2\u0174\u0166\3\2\2\2\u0174\u0168"+
		"\3\2\2\2\u0174\u016d\3\2\2\2\u0174\u0172\3\2\2\2\u0175\23\3\2\2\2\u0176"+
		"\u0177\t\2\2\2\u0177\25\3\2\2\2\u0178\u0179\5\22\n\2\u0179\u017a\b\f\1"+
		"\2\u017a\u0187\3\2\2\2\u017b\u017c\7@\2\2\u017c\u017d\5~@\2\u017d\u017e"+
		"\7A\2\2\u017e\u017f\5\26\f\2\u017f\u0187\3\2\2\2\u0180\u0181\7\5\2\2\u0181"+
		"\u0182\7@\2\2\u0182\u0183\5~@\2\u0183\u0184\7A\2\2\u0184\u0185\5\26\f"+
		"\2\u0185\u0187\3\2\2\2\u0186\u0178\3\2\2\2\u0186\u017b\3\2\2\2\u0186\u0180"+
		"\3\2\2\2\u0187\27\3\2\2\2\u0188\u0189\b\r\1\2\u0189\u018a\5\26\f\2\u018a"+
		"\u018b\b\r\1\2\u018b\u0197\3\2\2\2\u018c\u018d\f\5\2\2\u018d\u018e\7P"+
		"\2\2\u018e\u0196\5\26\f\2\u018f\u0190\f\4\2\2\u0190\u0191\7Q\2\2\u0191"+
		"\u0196\5\26\f\2\u0192\u0193\f\3\2\2\u0193\u0194\7R\2\2\u0194\u0196\5\26"+
		"\f\2\u0195\u018c\3\2\2\2\u0195\u018f\3\2\2\2\u0195\u0192\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\31\3\2\2"+
		"\2\u0199\u0197\3\2\2\2\u019a\u019b\b\16\1\2\u019b\u019c\5\30\r\2\u019c"+
		"\u019d\b\16\1\2\u019d\u01a6\3\2\2\2\u019e\u019f\f\4\2\2\u019f\u01a0\7"+
		"L\2\2\u01a0\u01a5\5\30\r\2\u01a1\u01a2\f\3\2\2\u01a2\u01a3\7N\2\2\u01a3"+
		"\u01a5\5\30\r\2\u01a4\u019e\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a5\u01a8\3"+
		"\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\33\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01aa\b\17\1\2\u01aa\u01ab\5\32\16\2\u01ab\u01ac"+
		"\b\17\1\2\u01ac\u01b9\3\2\2\2\u01ad\u01ae\f\4\2\2\u01ae\u01af\7J\2\2\u01af"+
		"\u01b0\5\32\16\2\u01b0\u01b1\b\17\1\2\u01b1\u01b8\3\2\2\2\u01b2\u01b3"+
		"\f\3\2\2\u01b3\u01b4\7K\2\2\u01b4\u01b5\5\32\16\2\u01b5\u01b6\b\17\1\2"+
		"\u01b6\u01b8\3\2\2\2\u01b7\u01ad\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b8\u01bb"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\35\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01bd\b\20\1\2\u01bd\u01be\5\34\17\2\u01be\u01bf"+
		"\b\20\1\2\u01bf\u01d6\3\2\2\2\u01c0\u01c1\f\6\2\2\u01c1\u01c2\7F\2\2\u01c2"+
		"\u01c3\5\34\17\2\u01c3\u01c4\b\20\1\2\u01c4\u01d5\3\2\2\2\u01c5\u01c6"+
		"\f\5\2\2\u01c6\u01c7\7H\2\2\u01c7\u01c8\5\34\17\2\u01c8\u01c9\b\20\1\2"+
		"\u01c9\u01d5\3\2\2\2\u01ca\u01cb\f\4\2\2\u01cb\u01cc\7G\2\2\u01cc\u01cd"+
		"\5\34\17\2\u01cd\u01ce\b\20\1\2\u01ce\u01d5\3\2\2\2\u01cf\u01d0\f\3\2"+
		"\2\u01d0\u01d1\7I\2\2\u01d1\u01d2\5\34\17\2\u01d2\u01d3\b\20\1\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01c0\3\2\2\2\u01d4\u01c5\3\2\2\2\u01d4\u01ca\3\2"+
		"\2\2\u01d4\u01cf\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\37\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\b\21\1"+
		"\2\u01da\u01db\5\36\20\2\u01db\u01dc\b\21\1\2\u01dc\u01e5\3\2\2\2\u01dd"+
		"\u01de\f\4\2\2\u01de\u01df\7i\2\2\u01df\u01e4\5\36\20\2\u01e0\u01e1\f"+
		"\3\2\2\u01e1\u01e2\7j\2\2\u01e2\u01e4\5\36\20\2\u01e3\u01dd\3\2\2\2\u01e3"+
		"\u01e0\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6!\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\b\22\1\2\u01e9\u01ea"+
		"\5 \21\2\u01ea\u01eb\b\22\1\2\u01eb\u01f1\3\2\2\2\u01ec\u01ed\f\3\2\2"+
		"\u01ed\u01ee\7S\2\2\u01ee\u01f0\5 \21\2\u01ef\u01ec\3\2\2\2\u01f0\u01f3"+
		"\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2#\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4\u01f5\b\23\1\2\u01f5\u01f6\5\"\22\2\u01f6\u01f7\b"+
		"\23\1\2\u01f7\u01fd\3\2\2\2\u01f8\u01f9\f\3\2\2\u01f9\u01fa\7W\2\2\u01fa"+
		"\u01fc\5\"\22\2\u01fb\u01f8\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3"+
		"\2\2\2\u01fd\u01fe\3\2\2\2\u01fe%\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201"+
		"\b\24\1\2\u0201\u0202\5$\23\2\u0202\u0203\b\24\1\2\u0203\u0209\3\2\2\2"+
		"\u0204\u0205\f\3\2\2\u0205\u0206\7T\2\2\u0206\u0208\5$\23\2\u0207\u0204"+
		"\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\'\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\b\25\1\2\u020d\u020e\5&\24"+
		"\2\u020e\u020f\b\25\1\2\u020f\u0215\3\2\2\2\u0210\u0211\f\3\2\2\u0211"+
		"\u0212\7U\2\2\u0212\u0214\5&\24\2\u0213\u0210\3\2\2\2\u0214\u0217\3\2"+
		"\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216)\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0218\u0219\b\26\1\2\u0219\u021a\5(\25\2\u021a\u021b\b\26\1\2"+
		"\u021b\u0221\3\2\2\2\u021c\u021d\f\3\2\2\u021d\u021e\7V\2\2\u021e\u0220"+
		"\5(\25\2\u021f\u021c\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222+\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u022a\5*\26\2"+
		"\u0225\u0226\7Z\2\2\u0226\u0227\5\62\32\2\u0227\u0228\7[\2\2\u0228\u0229"+
		"\5,\27\2\u0229\u022b\3\2\2\2\u022a\u0225\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022d\b\27\1\2\u022d-\3\2\2\2\u022e\u022f\5,\27\2"+
		"\u022f\u0230\b\30\1\2\u0230\u0237\3\2\2\2\u0231\u0232\5\22\n\2\u0232\u0233"+
		"\5\60\31\2\u0233\u0234\5.\30\2\u0234\u0235\b\30\1\2\u0235\u0237\3\2\2"+
		"\2\u0236\u022e\3\2\2\2\u0236\u0231\3\2\2\2\u0237/\3\2\2\2\u0238\u0239"+
		"\t\3\2\2\u0239\61\3\2\2\2\u023a\u023b\b\32\1\2\u023b\u023c\5.\30\2\u023c"+
		"\u023d\b\32\1\2\u023d\u0245\3\2\2\2\u023e\u023f\f\3\2\2\u023f\u0240\7"+
		"]\2\2\u0240\u0241\5.\30\2\u0241\u0242\b\32\1\2\u0242\u0244\3\2\2\2\u0243"+
		"\u023e\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246\63\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\5,\27\2\u0249\65"+
		"\3\2\2\2\u024a\u024c\58\35\2\u024b\u024d\5> \2\u024c\u024b\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7\\\2\2\u024f\u0250\b\34"+
		"\1\2\u0250\u0253\3\2\2\2\u0251\u0253\5\u0090I\2\u0252\u024a\3\2\2\2\u0252"+
		"\u0251\3\2\2\2\u0253\67\3\2\2\2\u0254\u0255\5<\37\2\u0255\u0256\b\35\1"+
		"\2\u0256\u0258\3\2\2\2\u0257\u0254\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025a9\3\2\2\2\u025b\u025d\5<\37\2\u025c"+
		"\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f;\3\2\2\2\u0260\u0266\5B\"\2\u0261\u0266\5D#\2\u0262\u0266\5"+
		"^\60\2\u0263\u0266\5`\61\2\u0264\u0266\5b\62\2\u0265\u0260\3\2\2\2\u0265"+
		"\u0261\3\2\2\2\u0265\u0262\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0264\3\2"+
		"\2\2\u0266=\3\2\2\2\u0267\u0268\b \1\2\u0268\u0269\5@!\2\u0269\u026a\b"+
		" \1\2\u026a\u0270\3\2\2\2\u026b\u026c\f\3\2\2\u026c\u026d\7]\2\2\u026d"+
		"\u026f\5@!\2\u026e\u026b\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2"+
		"\2\u0270\u0271\3\2\2\2\u0271?\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0274"+
		"\5d\63\2\u0274\u0275\b!\1\2\u0275\u027c\3\2\2\2\u0276\u0277\5d\63\2\u0277"+
		"\u0278\7^\2\2\u0278\u0279\5\u0086D\2\u0279\u027a\b!\1\2\u027a\u027c\3"+
		"\2\2\2\u027b\u0273\3\2\2\2\u027b\u0276\3\2\2\2\u027cA\3\2\2\2\u027d\u027e"+
		"\7\60\2\2\u027e\u0285\b\"\1\2\u027f\u0285\7\37\2\2\u0280\u0285\7-\2\2"+
		"\u0281\u0285\7?\2\2\u0282\u0285\7\24\2\2\u0283\u0285\7\'\2\2\u0284\u027d"+
		"\3\2\2\2\u0284\u027f\3\2\2\2\u0284\u0280\3\2\2\2\u0284\u0281\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285C\3\2\2\2\u0286\u0297\t\4\2\2"+
		"\u0287\u0288\7\5\2\2\u0288\u0289\7@\2\2\u0289\u028a\t\5\2\2\u028a\u0297"+
		"\7A\2\2\u028b\u0297\5\\/\2\u028c\u0297\5F$\2\u028d\u0297\5T+\2\u028e\u028f"+
		"\5\u0084C\2\u028f\u0290\b#\1\2\u0290\u0297\3\2\2\2\u0291\u0292\7\13\2"+
		"\2\u0292\u0293\7@\2\2\u0293\u0294\5\64\33\2\u0294\u0295\7A\2\2\u0295\u0297"+
		"\3\2\2\2\u0296\u0286\3\2\2\2\u0296\u0287\3\2\2\2\u0296\u028b\3\2\2\2\u0296"+
		"\u028c\3\2\2\2\u0296\u028d\3\2\2\2\u0296\u028e\3\2\2\2\u0296\u0291\3\2"+
		"\2\2\u0297E\3\2\2\2\u0298\u029a\5H%\2\u0299\u029b\7n\2\2\u029a\u0299\3"+
		"\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\7D\2\2\u029d"+
		"\u029f\5J&\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2"+
		"\2\u02a0\u02a1\7E\2\2\u02a1\u02a2\b$\1\2\u02a2\u02a7\3\2\2\2\u02a3\u02a4"+
		"\5H%\2\u02a4\u02a5\7n\2\2\u02a5\u02a7\3\2\2\2\u02a6\u0298\3\2\2\2\u02a6"+
		"\u02a3\3\2\2\2\u02a7G\3\2\2\2\u02a8\u02a9\7.\2\2\u02a9\u02ac\b%\1\2\u02aa"+
		"\u02ac\7\61\2\2\u02ab\u02a8\3\2\2\2\u02ab\u02aa\3\2\2\2\u02acI\3\2\2\2"+
		"\u02ad\u02ae\b&\1\2\u02ae\u02af\5L\'\2\u02af\u02b4\3\2\2\2\u02b0\u02b1"+
		"\f\3\2\2\u02b1\u02b3\5L\'\2\u02b2\u02b0\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5K\3\2\2\2\u02b6\u02b4\3\2\2\2"+
		"\u02b7\u02b9\5N(\2\u02b8\u02ba\5P)\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3"+
		"\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\7\\\2\2\u02bc\u02bf\3\2\2\2\u02bd"+
		"\u02bf\5\u0090I\2\u02be\u02b7\3\2\2\2\u02be\u02bd\3\2\2\2\u02bfM\3\2\2"+
		"\2\u02c0\u02c2\5D#\2\u02c1\u02c3\5N(\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3"+
		"\3\2\2\2\u02c3\u02c9\3\2\2\2\u02c4\u02c6\5^\60\2\u02c5\u02c7\5N(\2\u02c6"+
		"\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c0\3\2"+
		"\2\2\u02c8\u02c4\3\2\2\2\u02c9O\3\2\2\2\u02ca\u02cb\b)\1\2\u02cb\u02cc"+
		"\5R*\2\u02cc\u02d2\3\2\2\2\u02cd\u02ce\f\3\2\2\u02ce\u02cf\7]\2\2\u02cf"+
		"\u02d1\5R*\2\u02d0\u02cd\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2"+
		"\2\u02d2\u02d3\3\2\2\2\u02d3Q\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02de"+
		"\5d\63\2\u02d6\u02d8\5d\63\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02da\7[\2\2\u02da\u02db\5\64\33\2\u02db\u02dc\b"+
		"*\1\2\u02dc\u02de\3\2\2\2\u02dd\u02d5\3\2\2\2\u02dd\u02d7\3\2\2\2\u02de"+
		"S\3\2\2\2\u02df\u02e1\7\36\2\2\u02e0\u02e2\7n\2\2\u02e1\u02e0\3\2\2\2"+
		"\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\7D\2\2\u02e4\u02e5"+
		"\5V,\2\u02e5\u02e6\7E\2\2\u02e6\u02f3\3\2\2\2\u02e7\u02e9\7\36\2\2\u02e8"+
		"\u02ea\7n\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02ec\7D\2\2\u02ec\u02ed\5V,\2\u02ed\u02ee\7]\2\2\u02ee\u02ef"+
		"\7E\2\2\u02ef\u02f3\3\2\2\2\u02f0\u02f1\7\36\2\2\u02f1\u02f3\7n\2\2\u02f2"+
		"\u02df\3\2\2\2\u02f2\u02e7\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3U\3\2\2\2"+
		"\u02f4\u02f5\b,\1\2\u02f5\u02f6\5X-\2\u02f6\u02fc\3\2\2\2\u02f7\u02f8"+
		"\f\3\2\2\u02f8\u02f9\7]\2\2\u02f9\u02fb\5X-\2\u02fa\u02f7\3\2\2\2\u02fb"+
		"\u02fe\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fdW\3\2\2\2"+
		"\u02fe\u02fc\3\2\2\2\u02ff\u0305\5Z.\2\u0300\u0301\5Z.\2\u0301\u0302\7"+
		"^\2\2\u0302\u0303\5\64\33\2\u0303\u0305\3\2\2\2\u0304\u02ff\3\2\2\2\u0304"+
		"\u0300\3\2\2\2\u0305Y\3\2\2\2\u0306\u0307\7n\2\2\u0307[\3\2\2\2\u0308"+
		"\u0309\78\2\2\u0309\u030a\7@\2\2\u030a\u030b\5~@\2\u030b\u030c\7A\2\2"+
		"\u030c]\3\2\2\2\u030d\u030e\t\6\2\2\u030e_\3\2\2\2\u030f\u0316\t\7\2\2"+
		"\u0310\u0316\5j\66\2\u0311\u0312\7\16\2\2\u0312\u0313\7@\2\2\u0313\u0314"+
		"\7n\2\2\u0314\u0316\7A\2\2\u0315\u030f\3\2\2\2\u0315\u0310\3\2\2\2\u0315"+
		"\u0311\3\2\2\2\u0316a\3\2\2\2\u0317\u0318\7\66\2\2\u0318\u0319\7@\2\2"+
		"\u0319\u031a\5~@\2\u031a\u031b\7A\2\2\u031b\u0322\3\2\2\2\u031c\u031d"+
		"\7\66\2\2\u031d\u031e\7@\2\2\u031e\u031f\5\64\33\2\u031f\u0320\7A\2\2"+
		"\u0320\u0322\3\2\2\2\u0321\u0317\3\2\2\2\u0321\u031c\3\2\2\2\u0322c\3"+
		"\2\2\2\u0323\u0325\5r:\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u032a\5f\64\2\u0327\u0329\5h\65\2\u0328\u0327\3\2"+
		"\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b"+
		"\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032e\b\63\1\2\u032ee\3\2\2\2"+
		"\u032f\u0330\b\64\1\2\u0330\u0331\7n\2\2\u0331\u0338\b\64\1\2\u0332\u0333"+
		"\7@\2\2\u0333\u0334\5d\63\2\u0334\u0335\7A\2\2\u0335\u0336\b\64\1\2\u0336"+
		"\u0338\3\2\2\2\u0337\u032f\3\2\2\2\u0337\u0332\3\2\2\2\u0338\u036c\3\2"+
		"\2\2\u0339\u033a\f\b\2\2\u033a\u033c\7B\2\2\u033b\u033d\5t;\2\u033c\u033b"+
		"\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u0340\5.\30\2\u033f"+
		"\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\7C"+
		"\2\2\u0342\u036b\b\64\1\2\u0343\u0344\f\7\2\2\u0344\u0345\7B\2\2\u0345"+
		"\u0347\7-\2\2\u0346\u0348\5t;\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2"+
		"\2\u0348\u0349\3\2\2\2\u0349\u034a\5.\30\2\u034a\u034b\7C\2\2\u034b\u034c"+
		"\b\64\1\2\u034c\u036b\3\2\2\2\u034d\u034e\f\6\2\2\u034e\u034f\7B\2\2\u034f"+
		"\u0350\5t;\2\u0350\u0351\7-\2\2\u0351\u0352\5.\30\2\u0352\u0353\7C\2\2"+
		"\u0353\u0354\b\64\1\2\u0354\u036b\3\2\2\2\u0355\u0356\f\5\2\2\u0356\u0358"+
		"\7B\2\2\u0357\u0359\5t;\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\7P\2\2\u035b\u035c\7C\2\2\u035c\u036b\b\64"+
		"\1\2\u035d\u035e\f\4\2\2\u035e\u035f\7@\2\2\u035f\u0360\5v<\2\u0360\u0361"+
		"\7A\2\2\u0361\u0362\b\64\1\2\u0362\u036b\3\2\2\2\u0363\u0364\f\3\2\2\u0364"+
		"\u0366\7@\2\2\u0365\u0367\5|?\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2"+
		"\2\u0367\u0368\3\2\2\2\u0368\u0369\7A\2\2\u0369\u036b\b\64\1\2\u036a\u0339"+
		"\3\2\2\2\u036a\u0343\3\2\2\2\u036a\u034d\3\2\2\2\u036a\u0355\3\2\2\2\u036a"+
		"\u035d\3\2\2\2\u036a\u0363\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2"+
		"\2\2\u036c\u036d\3\2\2\2\u036dg\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0370"+
		"\7\17\2\2\u0370\u0372\7@\2\2\u0371\u0373\7p\2\2\u0372\u0371\3\2\2\2\u0373"+
		"\u0374\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2"+
		"\2\2\u0376\u0379\7A\2\2\u0377\u0379\5j\66\2\u0378\u036f\3\2\2\2\u0378"+
		"\u0377\3\2\2\2\u0379i\3\2\2\2\u037a\u037b\t\b\2\2\u037b\u037c\7@\2\2\u037c"+
		"\u037d\7@\2\2\u037d\u037e\5l\67\2\u037e\u037f\7A\2\2\u037f\u0380\7A\2"+
		"\2\u0380k\3\2\2\2\u0381\u0386\5n8\2\u0382\u0383\7]\2\2\u0383\u0385\5n"+
		"8\2\u0384\u0382\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u038b\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038b\3\2"+
		"\2\2\u038a\u0381\3\2\2\2\u038a\u0389\3\2\2\2\u038bm\3\2\2\2\u038c\u0392"+
		"\n\t\2\2\u038d\u038f\7@\2\2\u038e\u0390\5\20\t\2\u038f\u038e\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393\7A\2\2\u0392\u038d\3\2"+
		"\2\2\u0392\u0393\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0396\7n\2\2\u0395"+
		"\u038c\3\2\2\2\u0395\u0394\3\2\2\2\u0396o\3\2\2\2\u0397\u039d\n\n\2\2"+
		"\u0398\u0399\7@\2\2\u0399\u039a\5p9\2\u039a\u039b\7A\2\2\u039b\u039d\3"+
		"\2\2\2\u039c\u0397\3\2\2\2\u039c\u0398\3\2\2\2\u039d\u03a0\3\2\2\2\u039e"+
		"\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039fq\3\2\2\2\u03a0\u039e\3\2\2\2"+
		"\u03a1\u03a3\7P\2\2\u03a2\u03a4\5t;\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4"+
		"\3\2\2\2\u03a4\u03b4\3\2\2\2\u03a5\u03a7\7P\2\2\u03a6\u03a8\5t;\2\u03a7"+
		"\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03b4\5r"+
		":\2\u03aa\u03ac\7W\2\2\u03ab\u03ad\5t;\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad"+
		"\3\2\2\2\u03ad\u03b4\3\2\2\2\u03ae\u03b0\7W\2\2\u03af\u03b1\5t;\2\u03b0"+
		"\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\5r"+
		":\2\u03b3\u03a1\3\2\2\2\u03b3\u03a5\3\2\2\2\u03b3\u03aa\3\2\2\2\u03b3"+
		"\u03ae\3\2\2\2\u03b4s\3\2\2\2\u03b5\u03b6\b;\1\2\u03b6\u03b7\5^\60\2\u03b7"+
		"\u03bc\3\2\2\2\u03b8\u03b9\f\3\2\2\u03b9\u03bb\5^\60\2\u03ba\u03b8\3\2"+
		"\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"u\3\2\2\2\u03be\u03bc\3\2\2\2\u03bf\u03c5\5x=\2\u03c0\u03c1\5x=\2\u03c1"+
		"\u03c2\7]\2\2\u03c2\u03c3\7m\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03bf\3\2\2"+
		"\2\u03c4\u03c0\3\2\2\2\u03c5w\3\2\2\2\u03c6\u03c7\b=\1\2\u03c7\u03c8\5"+
		"z>\2\u03c8\u03ce\3\2\2\2\u03c9\u03ca\f\3\2\2\u03ca\u03cb\7]\2\2\u03cb"+
		"\u03cd\5z>\2\u03cc\u03c9\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2"+
		"\2\u03ce\u03cf\3\2\2\2\u03cfy\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d2"+
		"\58\35\2\u03d2\u03d3\5d\63\2\u03d3\u03d9\3\2\2\2\u03d4\u03d6\5:\36\2\u03d5"+
		"\u03d7\5\u0080A\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9"+
		"\3\2\2\2\u03d8\u03d1\3\2\2\2\u03d8\u03d4\3\2\2\2\u03d9{\3\2\2\2\u03da"+
		"\u03db\b?\1\2\u03db\u03dc\7n\2\2\u03dc\u03e2\3\2\2\2\u03dd\u03de\f\3\2"+
		"\2\u03de\u03df\7]\2\2\u03df\u03e1\7n\2\2\u03e0\u03dd\3\2\2\2\u03e1\u03e4"+
		"\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3}\3\2\2\2\u03e4"+
		"\u03e2\3\2\2\2\u03e5\u03e7\5N(\2\u03e6\u03e8\5\u0080A\2\u03e7\u03e6\3"+
		"\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\177\3\2\2\2\u03e9\u03f5\5r:\2\u03ea\u03ec"+
		"\5r:\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03f1\5\u0082B\2\u03ee\u03f0\5h\65\2\u03ef\u03ee\3\2\2\2\u03f0\u03f3"+
		"\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3"+
		"\u03f1\3\2\2\2\u03f4\u03e9\3\2\2\2\u03f4\u03eb\3\2\2\2\u03f5\u0081\3\2"+
		"\2\2\u03f6\u03f7\bB\1\2\u03f7\u03f8\7@\2\2\u03f8\u03f9\5\u0080A\2\u03f9"+
		"\u03fd\7A\2\2\u03fa\u03fc\5h\65\2\u03fb\u03fa\3\2\2\2\u03fc\u03ff\3\2"+
		"\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0425\3\2\2\2\u03ff"+
		"\u03fd\3\2\2\2\u0400\u0402\7B\2\2\u0401\u0403\5t;\2\u0402\u0401\3\2\2"+
		"\2\u0402\u0403\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u0406\5.\30\2\u0405\u0404"+
		"\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0425\7C\2\2\u0408"+
		"\u0409\7B\2\2\u0409\u040b\7-\2\2\u040a\u040c\5t;\2\u040b\u040a\3\2\2\2"+
		"\u040b\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\5.\30\2\u040e\u040f"+
		"\7C\2\2\u040f\u0425\3\2\2\2\u0410\u0411\7B\2\2\u0411\u0412\5t;\2\u0412"+
		"\u0413\7-\2\2\u0413\u0414\5.\30\2\u0414\u0415\7C\2\2\u0415\u0425\3\2\2"+
		"\2\u0416\u0417\7B\2\2\u0417\u0418\7P\2\2\u0418\u0425\7C\2\2\u0419\u041b"+
		"\7@\2\2\u041a\u041c\5v<\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u041d\3\2\2\2\u041d\u0421\7A\2\2\u041e\u0420\5h\65\2\u041f\u041e\3\2"+
		"\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
		"\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u03f6\3\2\2\2\u0424\u0400\3\2"+
		"\2\2\u0424\u0408\3\2\2\2\u0424\u0410\3\2\2\2\u0424\u0416\3\2\2\2\u0424"+
		"\u0419\3\2\2\2\u0425\u0451\3\2\2\2\u0426\u0427\f\7\2\2\u0427\u0429\7B"+
		"\2\2\u0428\u042a\5t;\2\u0429\u0428\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042c"+
		"\3\2\2\2\u042b\u042d\5.\30\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u0450\7C\2\2\u042f\u0430\f\6\2\2\u0430\u0431\7B\2"+
		"\2\u0431\u0433\7-\2\2\u0432\u0434\5t;\2\u0433\u0432\3\2\2\2\u0433\u0434"+
		"\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\5.\30\2\u0436\u0437\7C\2\2\u0437"+
		"\u0450\3\2\2\2\u0438\u0439\f\5\2\2\u0439\u043a\7B\2\2\u043a\u043b\5t;"+
		"\2\u043b\u043c\7-\2\2\u043c\u043d\5.\30\2\u043d\u043e\7C\2\2\u043e\u0450"+
		"\3\2\2\2\u043f\u0440\f\4\2\2\u0440\u0441\7B\2\2\u0441\u0442\7P\2\2\u0442"+
		"\u0450\7C\2\2\u0443\u0444\f\3\2\2\u0444\u0446\7@\2\2\u0445\u0447\5v<\2"+
		"\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044c"+
		"\7A\2\2\u0449\u044b\5h\65\2\u044a\u0449\3\2\2\2\u044b\u044e\3\2\2\2\u044c"+
		"\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0450\3\2\2\2\u044e\u044c\3\2"+
		"\2\2\u044f\u0426\3\2\2\2\u044f\u042f\3\2\2\2\u044f\u0438\3\2\2\2\u044f"+
		"\u043f\3\2\2\2\u044f\u0443\3\2\2\2\u0450\u0453\3\2\2\2\u0451\u044f\3\2"+
		"\2\2\u0451\u0452\3\2\2\2\u0452\u0083\3\2\2\2\u0453\u0451\3\2\2\2\u0454"+
		"\u0455\7n\2\2\u0455\u0085\3\2\2\2\u0456\u0457\5.\30\2\u0457\u0458\bD\1"+
		"\2\u0458\u0463\3\2\2\2\u0459\u045a\7D\2\2\u045a\u045b\5\u0088E\2\u045b"+
		"\u045c\7E\2\2\u045c\u0463\3\2\2\2\u045d\u045e\7D\2\2\u045e\u045f\5\u0088"+
		"E\2\u045f\u0460\7]\2\2\u0460\u0461\7E\2\2\u0461\u0463\3\2\2\2\u0462\u0456"+
		"\3\2\2\2\u0462\u0459\3\2\2\2\u0462\u045d\3\2\2\2\u0463\u0087\3\2\2\2\u0464"+
		"\u0466\bE\1\2\u0465\u0467\5\u008aF\2\u0466\u0465\3\2\2\2\u0466\u0467\3"+
		"\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\5\u0086D\2\u0469\u0472\3\2\2\2"+
		"\u046a\u046b\f\3\2\2\u046b\u046d\7]\2\2\u046c\u046e\5\u008aF\2\u046d\u046c"+
		"\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471\5\u0086D"+
		"\2\u0470\u046a\3\2\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473"+
		"\3\2\2\2\u0473\u0089\3\2\2\2\u0474\u0472\3\2\2\2\u0475\u0476\5\u008cG"+
		"\2\u0476\u0477\7^\2\2\u0477\u008b\3\2\2\2\u0478\u0479\bG\1\2\u0479\u047a"+
		"\5\u008eH\2\u047a\u047f\3\2\2\2\u047b\u047c\f\3\2\2\u047c\u047e\5\u008e"+
		"H\2\u047d\u047b\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f"+
		"\u0480\3\2\2\2\u0480\u008d\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0483\7B"+
		"\2\2\u0483\u0484\5\64\33\2\u0484\u0485\7C\2\2\u0485\u0489\3\2\2\2\u0486"+
		"\u0487\7l\2\2\u0487\u0489\7n\2\2\u0488\u0482\3\2\2\2\u0488\u0486\3\2\2"+
		"\2\u0489\u008f\3\2\2\2\u048a\u048b\7>\2\2\u048b\u048c\7@\2\2\u048c\u048d"+
		"\5\64\33\2\u048d\u048f\7]\2\2\u048e\u0490\7p\2\2\u048f\u048e\3\2\2\2\u0490"+
		"\u0491\3\2\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2"+
		"\2\2\u0493\u0494\7A\2\2\u0494\u0495\7\\\2\2\u0495\u0091\3\2\2\2\u0496"+
		"\u04c3\5\u0094K\2\u0497\u0498\bJ\1\2\u0498\u0499\5\u0096L\2\u0499\u049a"+
		"\bJ\1\2\u049a\u04c3\3\2\2\2\u049b\u049c\5\u009cO\2\u049c\u049d\bJ\1\2"+
		"\u049d\u04c3\3\2\2\2\u049e\u04c3\5\u009eP\2\u049f\u04c3\5\u00a0Q\2\u04a0"+
		"\u04c3\5\u00a2R\2\u04a1\u04a3\t\13\2\2\u04a2\u04a4\t\f\2\2\u04a3\u04a2"+
		"\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04ae\7@\2\2\u04a6"+
		"\u04ab\5*\26\2\u04a7\u04a8\7]\2\2\u04a8\u04aa\5*\26\2\u04a9\u04a7\3\2"+
		"\2\2\u04aa\u04ad\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac"+
		"\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ae\u04a6\3\2\2\2\u04ae\u04af\3\2"+
		"\2\2\u04af\u04bd\3\2\2\2\u04b0\u04b9\7[\2\2\u04b1\u04b6\5*\26\2\u04b2"+
		"\u04b3\7]\2\2\u04b3\u04b5\5*\26\2\u04b4\u04b2\3\2\2\2\u04b5\u04b8\3\2"+
		"\2\2\u04b6\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04ba\3\2\2\2\u04b8"+
		"\u04b6\3\2\2\2\u04b9\u04b1\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bc\3\2"+
		"\2\2\u04bb\u04b0\3\2\2\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd"+
		"\u04be\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04c1\7A"+
		"\2\2\u04c1\u04c3\7\\\2\2\u04c2\u0496\3\2\2\2\u04c2\u0497\3\2\2\2\u04c2"+
		"\u049b\3\2\2\2\u04c2\u049e\3\2\2\2\u04c2\u049f\3\2\2\2\u04c2\u04a0\3\2"+
		"\2\2\u04c2\u04a1\3\2\2\2\u04c3\u0093\3\2\2\2\u04c4\u04c5\7n\2\2\u04c5"+
		"\u04c6\7[\2\2\u04c6\u04d0\5\u0092J\2\u04c7\u04c8\7\26\2\2\u04c8\u04c9"+
		"\5\64\33\2\u04c9\u04ca\7[\2\2\u04ca\u04cb\5\u0092J\2\u04cb\u04d0\3\2\2"+
		"\2\u04cc\u04cd\7\32\2\2\u04cd\u04ce\7[\2\2\u04ce\u04d0\5\u0092J\2\u04cf"+
		"\u04c4\3\2\2\2\u04cf\u04c7\3\2\2\2\u04cf\u04cc\3\2\2\2\u04d0\u0095\3\2"+
		"\2\2\u04d1\u04d3\7D\2\2\u04d2\u04d4\5\u0098M\2\u04d3\u04d2\3\2\2\2\u04d3"+
		"\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\7E\2\2\u04d6\u0097\3\2"+
		"\2\2\u04d7\u04d8\bM\1\2\u04d8\u04d9\5\u009aN\2\u04d9\u04de\3\2\2\2\u04da"+
		"\u04db\f\3\2\2\u04db\u04dd\5\u009aN\2\u04dc\u04da\3\2\2\2\u04dd\u04e0"+
		"\3\2\2\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u0099\3\2\2\2\u04e0"+
		"\u04de\3\2\2\2\u04e1\u04e2\5\66\34\2\u04e2\u04e3\bN\1\2\u04e3\u04e6\3"+
		"\2\2\2\u04e4\u04e6\5\u0092J\2\u04e5\u04e1\3\2\2\2\u04e5\u04e4\3\2\2\2"+
		"\u04e6\u009b\3\2\2\2\u04e7\u04e9\5\62\32\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9"+
		"\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\7\\\2\2\u04eb\u009d\3\2\2\2\u04ec"+
		"\u04ed\bP\1\2\u04ed\u04ee\7#\2\2\u04ee\u04ef\7@\2\2\u04ef\u04f0\5\62\32"+
		"\2\u04f0\u04f1\7A\2\2\u04f1\u04f4\5\u0092J\2\u04f2\u04f3\7\35\2\2\u04f3"+
		"\u04f5\5\u0092J\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6"+
		"\3\2\2\2\u04f6\u04f7\bP\1\2\u04f7\u04ff\3\2\2\2\u04f8\u04f9\7/\2\2\u04f9"+
		"\u04fa\7@\2\2\u04fa\u04fb\5\62\32\2\u04fb\u04fc\7A\2\2\u04fc\u04fd\5\u0092"+
		"J\2\u04fd\u04ff\3\2\2\2\u04fe\u04ec\3\2\2\2\u04fe\u04f8\3\2\2\2\u04ff"+
		"\u009f\3\2\2\2\u0500\u0501\7\65\2\2\u0501\u0502\7@\2\2\u0502\u0503\5\62"+
		"\32\2\u0503\u0504\7A\2\2\u0504\u0505\5\u0092J\2\u0505\u052b\3\2\2\2\u0506"+
		"\u0507\7\33\2\2\u0507\u0508\5\u0092J\2\u0508\u0509\7\65\2\2\u0509\u050a"+
		"\7@\2\2\u050a\u050b\5\62\32\2\u050b\u050c\7A\2\2\u050c\u050d\7\\\2\2\u050d"+
		"\u052b\3\2\2\2\u050e\u050f\7!\2\2\u050f\u0511\7@\2\2\u0510\u0512\5\62"+
		"\32\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\3\2\2\2\u0513"+
		"\u0515\7\\\2\2\u0514\u0516\5\62\32\2\u0515\u0514\3\2\2\2\u0515\u0516\3"+
		"\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519\7\\\2\2\u0518\u051a\5\62\32\2\u0519"+
		"\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c\7A"+
		"\2\2\u051c\u052b\5\u0092J\2\u051d\u051e\7!\2\2\u051e\u051f\7@\2\2\u051f"+
		"\u0521\5\66\34\2\u0520\u0522\5\62\32\2\u0521\u0520\3\2\2\2\u0521\u0522"+
		"\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0525\7\\\2\2\u0524\u0526\5\62\32\2"+
		"\u0525\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528"+
		"\7A\2\2\u0528\u0529\5\u0092J\2\u0529\u052b\3\2\2\2\u052a\u0500\3\2\2\2"+
		"\u052a\u0506\3\2\2\2\u052a\u050e\3\2\2\2\u052a\u051d\3\2\2\2\u052b\u00a1"+
		"\3\2\2\2\u052c\u052d\7\"\2\2\u052d\u052e\7n\2\2\u052e\u053d\7\\\2\2\u052f"+
		"\u0530\7\31\2\2\u0530\u053d\7\\\2\2\u0531\u0532\7\25\2\2\u0532\u053d\7"+
		"\\\2\2\u0533\u0535\7)\2\2\u0534\u0536\5\62\32\2\u0535\u0534\3\2\2\2\u0535"+
		"\u0536\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u053d\7\\\2\2\u0538\u0539\7\""+
		"\2\2\u0539\u053a\5\22\n\2\u053a\u053b\7\\\2\2\u053b\u053d\3\2\2\2\u053c"+
		"\u052c\3\2\2\2\u053c\u052f\3\2\2\2\u053c\u0531\3\2\2\2\u053c\u0533\3\2"+
		"\2\2\u053c\u0538\3\2\2\2\u053d\u00a3\3\2\2\2\u053e\u0540\5\u00a6T\2\u053f"+
		"\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0542\7\2"+
		"\2\3\u0542\u00a5\3\2\2\2\u0543\u0544\bT\1\2\u0544\u0545\5\u00a8U\2\u0545"+
		"\u054a\3\2\2\2\u0546\u0547\f\3\2\2\u0547\u0549\5\u00a8U\2\u0548\u0546"+
		"\3\2\2\2\u0549\u054c\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
		"\u00a7\3\2\2\2\u054c\u054a\3\2\2\2\u054d\u0551\5\u00aaV\2\u054e\u0551"+
		"\5\66\34\2\u054f\u0551\7\\\2\2\u0550\u054d\3\2\2\2\u0550\u054e\3\2\2\2"+
		"\u0550\u054f\3\2\2\2\u0551\u00a9\3\2\2\2\u0552\u0554\5j\66\2\u0553\u0552"+
		"\3\2\2\2\u0554\u0557\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u0559\3\2\2\2\u0557\u0555\3\2\2\2\u0558\u055a\58\35\2\u0559\u0558\3\2"+
		"\2\2\u0559\u055a\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055d\5d\63\2\u055c"+
		"\u055e\5\u00acW\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f"+
		"\3\2\2\2\u055f\u0560\5\u0096L\2\u0560\u0561\bV\1\2\u0561\u00ab\3\2\2\2"+
		"\u0562\u0563\bW\1\2\u0563\u0564\5\66\34\2\u0564\u0569\3\2\2\2\u0565\u0566"+
		"\f\3\2\2\u0566\u0568\5\66\34\2\u0567\u0565\3\2\2\2\u0568\u056b\3\2\2\2"+
		"\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u00ad\3\2\2\2\u056b\u0569"+
		"\3\2\2\2\u0095\u00b6\u00b8\u00be\u00c5\u00ce\u00d7\u00eb\u00fc\u0106\u012c"+
		"\u0136\u0146\u0148\u0154\u0174\u0186\u0195\u0197\u01a4\u01a6\u01b7\u01b9"+
		"\u01d4\u01d6\u01e3\u01e5\u01f1\u01fd\u0209\u0215\u0221\u022a\u0236\u0245"+
		"\u024c\u0252\u0259\u025e\u0265\u0270\u027b\u0284\u0296\u029a\u029e\u02a6"+
		"\u02ab\u02b4\u02b9\u02be\u02c2\u02c6\u02c8\u02d2\u02d7\u02dd\u02e1\u02e9"+
		"\u02f2\u02fc\u0304\u0315\u0321\u0324\u032a\u0337\u033c\u033f\u0347\u0358"+
		"\u0366\u036a\u036c\u0374\u0378\u0386\u038a\u038f\u0392\u0395\u039c\u039e"+
		"\u03a3\u03a7\u03ac\u03b0\u03b3\u03bc\u03c4\u03ce\u03d6\u03d8\u03e2\u03e7"+
		"\u03eb\u03f1\u03f4\u03fd\u0402\u0405\u040b\u041b\u0421\u0424\u0429\u042c"+
		"\u0433\u0446\u044c\u044f\u0451\u0462\u0466\u046d\u0472\u047f\u0488\u0491"+
		"\u04a3\u04ab\u04ae\u04b6\u04b9\u04bd\u04c2\u04cf\u04d3\u04de\u04e5\u04e8"+
		"\u04f4\u04fe\u0511\u0515\u0519\u0521\u0525\u052a\u0535\u053c\u053f\u054a"+
		"\u0550\u0555\u0559\u055d\u0569";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}