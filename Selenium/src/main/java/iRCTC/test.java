package iRCTC;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {

	@Test(invocationCount=2)
	public void creat(){
		System.out.println("@Test");

	}
	@BeforeMethod
	public void log(){
		System.out.println("@Before");

	}
	
	


}
