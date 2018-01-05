package testCases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class MergeLeadWD extends ProjectMethods {
	
	@Test(groups="regression")
	public void mergeLead() throws InterruptedException{
		try {
			click(locateElement("xpath","//a[text()='Leads']"));
			click(locateElement("Linktext","Merge Leads"));
			click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
			switchToWindow(1);
			type(locateElement("xpath", "(//div[@class='x-form-element']/input)[1]"), "10179");
			click(locateElement("xpath", "(//button[text()='Find Leads'])[1]"));
			Thread.sleep(4000);
			click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'])[1]"));
			switchToWindow(0);
			click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
			switchToWindow(1);
			type(locateElement("xpath", "(//div[@class='x-form-element']/input)[1]"), "11028");
			click(locateElement("xpath", "(//button[text()='Find Leads'])[1]"));
			Thread.sleep(4000);
			click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'])[1]"));
			switchToWindow(0);
			click(locateElement("Linktext", "Merge"));
			acceptAlert();
			click(locateElement("Linktext", "Find Leads"));
			type(locateElement("xpath", "//input[@name='id']"), "10179");
			click(locateElement("xpath", "//button[text()='Find Leads']"));
			verifyDisplayed(locateElement("xpath","//div[text()='No records to display']"));
			System.out.println("Error is verified");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
