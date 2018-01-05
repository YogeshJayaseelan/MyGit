package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class SeMethods implements WdMethods{
	int i= 1;
	RemoteWebDriver driver = null ;
	WebElement ele = null;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Browser "+browser+" Launched successfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Diver is either closed or does not exists");
		}finally{
			takeSnap();
		}
	}
		


	public void startApp(String browser) {


	}

	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id": 
				ele = driver.findElementById(locValue);
				break;
			case "xpath": 
				ele = driver.findElementByXPath(locValue);
				break;	
			case "class": 
				ele = driver.findElementByClassName(locValue);
				break;
			case "Linktext":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "name":
				ele = driver.findElementByName(locValue);
				break;
			}		
//			return ele;
		} catch (NoSuchElementException e) {
			System.err.println("element was not found");
		} finally{
			takeSnap();
		}
		return ele;
	}

	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("Given Value :"+data+" Is Entered Successfully");
			
		} catch (NoSuchElementException e) {
			System.err.println("ele not found");
		}finally{
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("Element is Clicked Successfully");


	}

	public String getText(WebElement ele) {
		String text = null;
					try {			
			 text= ele.getText();
						
		} catch (NoSuchElementException e) {
			System.err.println("Element not Found");
		
		}finally{
			takeSnap();
		}
		return text;
		// TODO Auto-generated method stub
		//return null;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {

		try {
			Select Dropdown = new Select (ele);
			Dropdown.selectByVisibleText(value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element Not Found");
		}		finally{
			takeSnap();
			
		}


		// TODO Auto-generated method stub

	}
	
	public void selectDropDownUsingValue(WebElement ele, String value) {

		try {
			Select Dropdown = new Select (ele);
			Dropdown.selectByVisibleText(value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element Not Found");
		}		finally{
			takeSnap();
			
		}


		// TODO Auto-generated method stub

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select Dropdown = new Select (ele);
			Dropdown.selectByIndex(index);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element not found");
		}
	}



	public boolean verifyTitle(String expectedTitle) {
		boolean result = false;
		try {
			String title = driver.getTitle();
			System.out.println("The tiel of the current page is" +title);
			if(title.equals(expectedTitle)){
				result= true;
			}
			else{
				
			// TODO Auto-generated method stub
			result = false;
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Driver is either closed or does not exists");
		}finally{
			takeSnap();
		}
		return result;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		
				// TODO Auto-generated method stub
		String exactText = ele.getText();
		if((expectedText).equalsIgnoreCase(exactText)){
			System.out.println("Text matches");
		}
			else{
				System.out.println("Text Does not Match");
			}
		}

	

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		try{
		String partialText = ele.getText();
		if(expectedText.contains(partialText)){
			System.out.println("The Patial Text Matches");
		}
		else{
			System.out.println("The Partizl text does not match");
			}
		}catch(ElementNotFoundException e){
			System.err.println("Element Not found");
		}finally{
			takeSnap();
		}
		
		
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		
		// TODO Auto-generated method stub
		try{
		String exactat = ele.getAttribute(attribute);
		if(attribute.equals(exactat)){
			System.out.println("The Attribute value matches");
		}
		else{
			System.out.println("The Attribute value does not matches");
			}
		}
				catch(ElementNotFoundException e){
			System.err.println("Element Not found");
		}finally{
			takeSnap();
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		try{
		String partialat = ele.getAttribute(attribute);
		if(attribute.equals(partialat)){
			System.out.println("The Partial attribute value matches");
			}
		else{
			System.out.println("The partial attribute value does not matches");
		}
		}catch(NoSuchElementException e){
			System.err.println("Element Not Found");
			
		}finally{
			takeSnap();
	}
	
		}

	

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		try{
			
		boolean selectElement =ele.isSelected();
		if(selectElement==true){
			System.out.println("Element is selected");
		}
		else{
			System.out.println("Element is not selected");
		}
		}
		catch(ElementNotFoundException e){
			System.err.println("Element Not Found");
		}finally{
			takeSnap();
		}
		}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		ele.isDisplayed();
		System.out.println("The captured lead id is:"+ele);

	}

	public void switchToWindow(int index) {
		try {
			Set<String> allWindowHandles=driver.getWindowHandles();
			List<String> allHandles=new ArrayList<>();
			allHandles.addAll(allWindowHandles);
			driver.switchTo().window(allHandles.get(index));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Driver is either closed or does not exists");
		}
		// TODO Auto-generated method stub

	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		System.out.println("Frame is Switched");
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
		System.out.println("Alert is Accepted");

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert();
		System.out.println("Alert is Dismissed");

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String getalert=driver.switchTo().alert().getText();
		System.out.println("Alert text is"+getalert);
		return getalert;
		
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/snap"+i+".jpeg");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		i++;
		

	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println("The browser is closed");
		} catch (WebDriverException e) {
			System.err.println("The driver is either closed or driver does not exists");
			// TODO Auto-generated catch block
			
		}

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			System.out.println("All the browser are closed");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The driver is either closed or driver does not exists");
			
		}
		
		

	}



	@Override
	public String getText(String string, WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}








}
