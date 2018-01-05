package testCases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLeadDP extends ProjectMethods{

	@Test(dataProvider="fetchdata",invocationCount=2)
	public void createLead(String cName, String fName, String lName, String Drop1, int Drop2) {
		try{
			click(locateElement("Linktext","Create Lead"));
			type(locateElement("id","createLeadForm_companyName"),cName);
			type(locateElement("id","createLeadForm_firstName"),fName);
			type(locateElement("id","createLeadForm_lastName"),lName);
			selectDropDownUsingValue(locateElement("id","createLeadForm_dataSourceId"),Drop1);
			selectDropDownUsingIndex(locateElement("id","createLeadForm_marketingCampaignId"),Drop2);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}


	@DataProvider(name="fetchdata")
	public Object[][] getData(){
		Object [][] data = new Object [2][5];
		data[0][0]= "DataProvider";
		data[0][1]="Test";
		data[0][2]="Leaf";
		data[0][3]="Cold Call";
		data[0][4]=2;

		data[1][0]="Chaitanya";
		data[1][1]="Test";
		data[1][2]="Leaf";
		data[1][3]="Cold Call";
		data[1][4]=2;
	return data;
	}
}