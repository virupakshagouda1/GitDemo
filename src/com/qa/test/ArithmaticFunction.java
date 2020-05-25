package com.qa.test;

public class ArithmaticFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticFunction obj  = new ArithmaticFunction();
		obj.test();
		
		int x = obj.sum(); 
		System.out.println(x);
	}

	public void test() {
		System.out.println("test method");
		System.out.println("change in GitProject");
	}
	
	public int sum() 
	{ 
		int a=10;
	int b=20;
	int c;
	c=a+b;
	return c;
			
	}
}
