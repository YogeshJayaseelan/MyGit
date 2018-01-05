package fRAME;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {
		public static void main(String[] args) {
			String str1;
			String str2;
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
					ChromeDriver driver = new ChromeDriver();
					driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				    driver.switchTo().frame("iframeResult");
				    driver.findElementByXPath("//button[text()='Try it']").click();
				    
				    Alert alert = driver.switchTo().alert();
				    str1 = "Welcome to Frame Concepts";
				    alert.sendKeys(str1);
				    alert.accept();
				    
				    str2 = driver.findElementById("demo").getText();
				    System.out.println(str2);
				    
				    if(str1.equalsIgnoreCase(str2))
				    	System.out.println("The content matches");
				    else
				    	System.out.println("The content does not match");
	}
				    
	

}
