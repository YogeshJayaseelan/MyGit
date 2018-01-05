package testCases;



import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

	public class EditLeadPM extends ProjectMethods{
		
		@Test 
		public void EditLead() throws InterruptedException {
			
				click(locateElement("Linktext","Leads"));
				click(locateElement("Linktext","Find Leads"));
				type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Rohith");
				click(locateElement("xpath","//button[text()='Find Leads']"));
				Thread.sleep(3000);
				click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
				verifyTitle("View Lead | opentaps CRM");
				click(locateElement("Linktext","Edit"));
				type(locateElement("id","updateLeadForm_companyName"),"TestNG");
				click(locateElement("class","smallSubmit"));
				verifyExactText(locateElement("id", "viewLead_companyName_sp"),"Superstar Fans Club");
			
			
}
}