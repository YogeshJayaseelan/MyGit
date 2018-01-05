package wINDOWHANDLE;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNextWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Contact Us").click();
		Set<String> window= driver.getWindowHandles();
		//System.out.println(window.size()); ---- To get the total number of windows opened 
		//System.out.println(driver.getTitle());--- to get the Tile of the Window
		for(String eachWindow :window){
			//System.out.println(eachWindow);
			driver.switchTo().window(eachWindow);
		}
		System.out.println(driver.getCurrentUrl());
		}
		

	}

