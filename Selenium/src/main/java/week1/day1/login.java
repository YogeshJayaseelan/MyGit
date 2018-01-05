package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:/drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//To open a url 
		driver.get("http://leaftaps.com/opentaps/control/main");
		//To maximize the browser window
		driver.manage().window().maximize();
		
		// To enter the username 
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Revathi");
		driver.findElementByClassName("smallSubmit").click();
		
		

		
		

		
	

	}

}
