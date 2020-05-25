package com.bit.ui.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Execute {


	public static 	 main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		Play p=new Play();
		p.printStringValuue("aminul");
		p.printStringValuue("shahid");
		p.add();
		p.add(7, 9);
		p.add(34, 67);
		p.sub();
		p.result();
		int x=p.a;
		Demo d=new Demo();
		d.add();
		d.sub();
		d.mutiple();
		System.out.println(d.b);
	}

	//what is global/instance and local variable
	//what is object and how to create an object of class
	//how to create a variable
	//how to create a regular method
	//what is main method
	
	
	
}
