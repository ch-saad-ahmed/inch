
#include "Timer.h"
#include <string.h>

module SenseC
{
  uses {
    interface Boot;
    interface Leds;
    interface Timer<TMilli>;
    interface Timer<TMilli> as Timer1;
    interface Random;
  }
}
implementation
{ 

  int arrInd = 0;
  //RSA algo related intializations Link: http://www.coders-hub.com/2013/04/c-code-to-encrypt-and-decrypt-message.html#.WK4EMO1Va-o
  long int p,q,n,t,flag,e[60],d[60],temp[60],j,m[60],en[60],i; 
  char msg[2400]; 
  char tempMsg[60];


  event void Boot.booted() {
    call Timer.startOneShot(10);
    
  }
//RSA reference Link: http://www.coders-hub.com/2013/04/c-code-to-encrypt-and-decrypt-message.html#.WK4EMO1Va-o
int prime(long int pr) 
{ 
    int i; 
    long long int  x = 0,count=0,i1;
      
        for(i1=1;x<=pr;i1+=2)
        {
            x = x + i1;
            count++;
        }
    j=count;
    for(i=2;i<=j;i++) 
    { 
        if(pr%i==0) 
        return 0; 
    } 
    return 1; 
} 
  
long int cd(long int x) 
{ 
    long int k=1; 
    while(1) 
    { 
        k=k+t; 
        if(k%x==0) 
        return(k/x); 
    } 
} 

void ce() 
{ 
    int k; 
    k=0; 
    for(i=2;i<t;i++) 
    { 
        if(t%i==0) 
        continue; 
        flag=prime(i); 
        if(flag==1&&i!=p&&i!=q) 
        { 
            e[k]=i; 
            flag=cd(e[k]); 
            if(flag>0) 
            { 
                d[k]=flag; 
                k++; 
            } 
            if(k==99) 
            break; 
        } 
    } 
} 

void encrypt() 
{ 
    long int pt,ct,key=e[0],k,len; 
    i=0; 
    len=strlen(tempMsg); 
    while(i!=len) 
    { 
        pt=tempMsg[i]; 
        pt=pt-96; 
        k=1; 
        for(j=0;j<key;j++) 
        { 
            k=k*pt; 
            k=k%n; 
        } 
        temp[i]=k; 
        ct=k+96; 
        en[i]=ct; 
        i++; 
    } 
    en[i]=-1; 
} 

void decrypt() 
{ 
    long int pt,ct,key=d[0],k; 
    i=0; 
    while(en[i]!=-1) 
    { 
        ct=temp[i]; 
        k=1; 
        for(j=0;j<key;j++) 
        { 
            k=k*ct; 
            k=k%n; 
        } 
        pt=k+96; 
        m[i]=pt; 
        i++; 
    } 
    m[i]=-1; 
}

  event void Timer.fired() 
  {
	  	int i = arrInd;

		for(i = arrInd;i<arrInd + 60;i++)
			msg[i]= 'a'+call Random.rand16() % 10;

		for(i = 0;i< 60;i++)
			tempMsg[i]= msg[arrInd + i];
		TempMsg[59]= NULL;
		n=p*q; 
		t=(p-1)*(q-1); 
		ce();
		cd(10);
		encrypt(); 
		call Timer.startOneShot(call Random.rand16() % 100);
  }






}

