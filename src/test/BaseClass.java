package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeTest
	public void method3() {
		
		System.out.println("Inside Before Test");
	}
	
	@BeforeMethod
	public void method1() {
		
		System.out.println("Inside Before Method");
		
		
	}
	
	@AfterMethod
	public void method2() {
		
		System.out.println("Inside After Method");
	}
	
	@AfterTest
	public void method4() {
		
		System.out.println("Inside After Test");
	}

}
