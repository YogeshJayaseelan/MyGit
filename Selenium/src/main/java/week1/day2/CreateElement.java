package week1.day2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.findElementByClassName("gsfi").sendKeys("AjithKumar",Keys.ENTER);
		//driver.findElementByName("btnK").click();
		List <WebElement> links = driver.findElementsByTagName("a");
		for (WebElement name :links ) {
		  if (name.getText().toLowerCase().contains("AjithKumar".toLowerCase()) || name.getText().toLowerCase().contains("Ajith Kumar".toLowerCase()))
			  System.out.println(name.getText());
		} 		
		
		
			
			
				
	if("Ajith Kumar - Wikipedia".equalsIgnoreCase("ajith kumar - wikipedia"))
		System.out.println("true");
	else
		System.out.println("false");
	
	
	}
		
		
	}


