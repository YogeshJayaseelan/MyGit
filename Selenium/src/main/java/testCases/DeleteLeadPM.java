package testCases;



import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DeleteLeadPM extends ProjectMethods{

	@Test(groups="sanity")
	public void DeleteLead() throws InterruptedException {
		try{
			click(locateElement("Linktext","Leads"));
			click(locateElement("Linktext","Find Leads"));
			click(locateElement("xpath", "(//span[@class='x-tab-strip-text '])[2]"));
			Thread.sleep(5000);
			type(locateElement("xpath","//input[@name='phoneNumber']"),"8808625312");
			click(locateElement("xpath", "(//button[@class='x-btn-text'])[7]"));
			Thread.sleep(3000);
			String text=getText(locateElement("xpath", "(//a[@class='linktext'])[4]"));

			//		verifyDisplayed(locateElement("Linktext", "10177"));
			click(locateElement("xpath", "(//a[@class='linktext'])[4]"));
			click(locateElement("Linktext", "Delete"));
			Thread.sleep(3000);
			click(locateElement("Linktext","Find Leads"));
			type(locateElement("name","id"),text);
			//
				click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
			Thread.sleep(3000);
			getText(locateElement("xpath", "//div[@class='x-paging-info']"));
			}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
