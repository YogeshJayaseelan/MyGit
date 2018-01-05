package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods {
	@Parameters({"URL","Uname","PWD"})
	@BeforeMethod
	public void login(String url, String Username, String Password) throws InterruptedException {
		startApp("chrome", url);
		Thread.sleep(2000);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, Username);		
		type(locateElement("id","password" ), Password);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("Linktext","CRM/SFA"));

	}
	@AfterMethod

	public void close(){
		closeBrowser();
	}
}

