package com.bit.test;

public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		Demo d=new Demo();
		d.add();
		d.add(a, 6);
		d.printValue();
		d.printValue("shaid");
		d.printboolean();
		d.printboolean(false);
		d.printcharValue();
		d.printcharValue('f');
		d.myclassValue(d);
		d.myclassValue(new Fatima());
		d.myclassValue(new Riffy());
	}

}
