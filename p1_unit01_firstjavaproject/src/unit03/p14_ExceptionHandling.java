package unit03;

import java.util.*;

public class p14_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ABC5 obj=new ABC5();
obj.basicException1();
obj.handleException();
obj.multipleCatch();
obj.multipleCatch();
obj.inputMismatchException();
obj.stackOverflowError(2);
obj.indexOutofBound();
obj.nullPointerException();
	}

}

class ABC5 {
	//compiler cannot catch this exception at compile time
	void basicException1() {
		int b=0;
		int a=100/0;
		System.out.println(a);
	}
void handleException() {
		try {
			//sensitive code
			int b=0;
			int a=100/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		//rest of the code
		System.out.println("done");
	}
void multipleCatch() {
	try {
		//sensitive code
		int b=0;
		int a=100/0;
		System.out.println(a);
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	
	catch(Exception e) {
		System.out.println(e.getMessage());
	}


	
	/*
	try {
		//sensitive code
		int b=0;
		int a=100/0;
		System.out.println(a);
	}
	//Exception class is Super class of every exception classes therefore catch(Arithmetic exception) will not work 
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	
	
	
	*/
	
	
	
}
void inputMismatchException() {
	try {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int number=sc.nextInt();
System.out.println("you have entered:"+number);
	sc.close();
}
	catch(InputMismatchException e) {
	System.out.println(e+"resolved");
	}
	System.out.println("done");
}

void stackOverflowError(int i) {
	//stackoverflow is a error  it cannot be handled
	try {
		
	
		while(i>0) {
			i++;
			stackOverflowError(i);
			
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	System.out.println("other code");
	}


	
void indexOutofBound() {
	try {
		int num[]= {1,2,3};
		System.out.println(num[10]);
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println("done");
	}

	
	
}void nullPointerException() {
	try{
		String a= null;
		System.out.println(a.length());
	}
	
	catch(NullPointerException e) { 
		//related to class in string is class in java so without obj cant declare
		System.out.println(e.getMessage());
		
	}
		
	}
	
void useofThrow(int age) throws Exception {
	//checked exxception gives exception at compile time
	if(age<18) {
		throw new Exception();
	}
	else {
		System.out.println("you are allowed enterr");
	}
}
	

void useofThrow_And_Finally()
{
	
	try {
		useofThrow(10);
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		
	}
	finally {//only can wrote after try
		System.out.println("always run");
		
	}
	System.out.println("other code");
}}
