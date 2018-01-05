package testCases;


import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLeadWD extends ProjectMethods{

	@Test(groups="smoke")
	public void createLead() {
		try{
			click(locateElement("Linktext","Create Lead"));
			type(locateElement("id","createLeadForm_companyName"),"Thalaivar Fans Club");
			type(locateElement("id","createLeadForm_firstName"),"Rajini");
			type(locateElement("id","createLeadForm_lastName"),"Kanth");
			selectDropDownUsingIndex(locateElement("id","createLeadForm_dataSourceId"),2);
			selectDropDownUsingIndex(locateElement("id","createLeadForm_marketingCampaignId"),3);
			type(locateElement("id","createLeadForm_generalProfTitle"),"Thalaivar");
			type(locateElement("id","createLeadForm_generalProfTitle"),"Superstar");
			type(locateElement("id","createLeadForm_departmentName"),"Cinema");
			type(locateElement("id","createLeadForm_annualRevenue"),"50Crores");
			selectDropDownUsingText(locateElement("id","createLeadForm_currencyUomId"),"INR - Indian Rupee");
			selectDropDownUsingIndex(locateElement("id","createLeadForm_industryEnumId"),9);
			type(locateElement("id","createLeadForm_numberEmployees"),"30");
			selectDropDownUsingIndex(locateElement("id","createLeadForm_ownershipEnumId"),4);
			type(locateElement("id","createLeadForm_sicCode"),"007");
			type(locateElement("id","createLeadForm_tickerSymbol"),"R");
			type(locateElement("id","createLeadForm_description"),"Legend");
			type(locateElement("id","createLeadForm_importantNote"),"OneMan Show");
			type(locateElement("id","createLeadForm_lastNameLocal"),"Kan");
			 


			click(locateElement("class","smallSubmit"));
		}
		catch(Exception e){
			e.printStackTrace();
		}


	}

}
