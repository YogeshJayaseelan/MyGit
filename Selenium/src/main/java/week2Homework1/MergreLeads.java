package week2Homework1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergreLeads {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set <String> window= driver.getWindowHandles();
		for(String eachWindow :window){
			//System.out.println(eachWindow);
			driver.switchTo().window(eachWindow);
		}
			System.out.println(driver.getCurrentUrl());
		driver.findElementByName("id").sendKeys("12107");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'][1]").click();
		Set <String> window1= driver.getWindowHandles();
		for(String eachWindow :window1){
			//System.out.println(eachWindow);
		driver.switchTo().window(eachWindow);
		}
	//	switchTo().defaultContent();
			System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath("(//img[@alt='Lookup' and contains(@src,'/images/fieldlookup.gif')])[2]").click();
		Set <String> window2= driver.getWindowHandles();
		for(String eachWindow :window2){
			//System.out.println(eachWindow);
		driver.switchTo().window(eachWindow);
		}
		System.out.println(driver.getCurrentUrl());
		driver.findElementByName("id").sendKeys("11549");
		driver.findElementByClassName("x-btn-text").click();
		Thread.sleep(3000);
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']").click();
		Set <String> window3= driver.getWindowHandles();
		for(String eachWindow :window3){
			//System.out.println(eachWindow);
		driver.switchTo().window(eachWindow);
		}
		System.out.println(driver.getCurrentUrl());
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys("12107");
		driver.findElementByXPath("//button[contains(text(),'Find Lead')]").click();
		driver.findElementByXPath("//div[text()='No records to display']");
		System.out.println("Verified the Error Message");
		driver.close();
      		
		}

	private static TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

}
