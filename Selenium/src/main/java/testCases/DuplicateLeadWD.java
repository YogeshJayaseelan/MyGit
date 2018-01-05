package testCases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DuplicateLeadWD extends ProjectMethods{

	@Test(groups={"sanity","regression"})
	public void duplicateLead() {
		try{
			startApp("chrome", "http://leaftaps.com/opentaps");
			Thread.sleep(5000);
			WebElement eleUserName = locateElement("id", "username");
			type(eleUserName, "DemoCSR");		
			type(locateElement("id", "password"), "crmsfa");
			click(locateElement("class", "decorativeSubmit"));	
			Thread.sleep(5000);
			click(locateElement("Linktext","CRM/SFA"));
			Thread.sleep(5000);
			click(locateElement("Linktext","Leads"));
			click(locateElement("Linktext","Find Leads"));
			click(locateElement("xpath","//*[@class='x-tab-strip-inner']/span[contains(text(),'Email')]"));
			Thread.sleep(5000);
			type(locateElement("xpath","//input[@name='emailAddress']"),"vkc@google.com");
			click(locateElement("xpath","//button[Contains(text(),'Find Leads')]"));
			WebElement ele= locateElement("Xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'][1]");
			String str1=(String) getText("The first string is ",ele);
			click(ele);			
			click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'][1]"));	
			click(locateElement("Linktext","Duplicate Lead"));
			WebElement ele2= locateElement("id","sectionHeaderTitle_leads");
			String str2=(String) getText("The Second String is",ele2);
			if(str2.equalsIgnoreCase("Duplicate Lead"))
			System.out.println("The user is on the Duplicate lead page");
			else
			System.out.println("user is on the wrong page");
			click(locateElement("Class","smallSubmit"));
			WebElement ele3= locateElement("id","viewLead_firstName_sp");
			String str3=(String) getText("The Second String is",ele3);		
			System.out.println("str1 is " +str1);
			System.out.println("str3 is" +str3);
			if(str1.equalsIgnoreCase(str3))
			System.out.println("The lead name and the captured name are same");
			else
			System.out.println("The Lead name & the captured name are not same");

		}
		catch(Exception e){
			e.printStackTrace();
		}


	}

}
