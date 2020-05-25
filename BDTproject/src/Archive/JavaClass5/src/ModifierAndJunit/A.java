package ModifierAndJunit;

import org.junit.Test;

import com.C;

public class A{
	private class Y{}
	/*what is modifier?
	modify class, methods and field
	Two kinds of modifier:
		1.Access-->who gives access label of class methods and variable
	Four kinds of Access modifier:
		1.public 2. default 3. protected 4. private
	Note: for methods
	public always possible
	2. private noway possible
	3. default same package possible but different package no possible
	4.protected different package instantiate no possible
	 but inhetance is possible and same package possible
		
		for variable exactly same except private
		means private variable can be access using getter setter concept
		
		
	for top class private and protected not possible
	for inner class all access modifier possible
	in same source file if we have more than one class that can be only default 
	and cannot be main class
		
		
		
		
		2.Non Access-->who change the attributes of class methods and variable
	name of few nonaccess modifier
		1. static 2. final 3. abstract 4. volatile  5. transient */
	
	@Test
	public void test1() {
		//same package using instantiate
				B x=new B();
				x.m1();
				x.m2();
				x.m3();
				//x.m4(); private is not accessible
				
	}
	
	@Test
	public void test2() {
		//different package using instantiate
				C x=new C();
				x.m2();// only public is accessible
				//x.m1();
				//x.m3();
				//x.m4();
				
	}
	
	

}
