package week1Homework1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead  {

	public static void main(String[] args) throws InterruptedException {
	String str1;
		String str2;
		String str3;
		    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElementById("username").sendKeys("DemoCSR");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Find Leads").click();			
			driver.findElementByXPath("//*[@class='x-tab-strip-inner']/span[contains(text(),'Email')]").click();
			driver.findElementByName("emailAddress").sendKeys("vkc@google.com");
			driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
			str1 = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'][1]").getText();
			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'][1]").click();
			driver.findElementByLinkText("Duplicate Lead").click();
			str2 =driver.findElementById("sectionHeaderTitle_leads").getText();
			System.out.println("str2 is " + str2);
			if(str2.equalsIgnoreCase("Duplicate Lead"))
			System.out.println("The user is on the Duplicate lead page");
			else
			System.out.println("user is on the wrong page");
			driver.findElementByClassName("smallSubmit").click();
			str3 = driver.findElementById("viewLead_firstName_sp").getText();
			System.out.println("str1 is " +str1);
			System.out.println("str3 is" +str3);
			if(str1.equalsIgnoreCase(str3))
			System.out.println("The lead name and the captured name are same");
			else
			System.out.println("The Lead name & the captured name are not same");
				
	}

}
