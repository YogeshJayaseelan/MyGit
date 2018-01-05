package iRCTC;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Edit {



	@BeforeMethod
	public void log(){
		System.out.println("@BeforeEdit");

	}

	@Test
	public void edit(){
		System.out.println("@TestEdit");
	}


}
