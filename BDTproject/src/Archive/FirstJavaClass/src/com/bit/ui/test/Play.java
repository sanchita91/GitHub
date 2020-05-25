package com.bit.ui.test;

public class Play {
	//will declare two global variable
	int a=23;
	int b=7;
	int d=87;
	int c=56;
	String s="shahid";
	//create two regular method
	void printStringValuue(String s)
	{
		System.out.println(s);
	}
	
	
	
	void add1()
	{
		System.out.println(10+20);
	}
	
	void add(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	
	void add() {
		 c=a+b;
		 System.out.println(c);
	}//end
	
	void sub() {
		 d=a-b;
		 System.out.println(d);
	}//end

	void result() {
		int e=c+d;
		System.out.println(e);
	}//end
}
