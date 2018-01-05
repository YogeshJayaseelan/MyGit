package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class JqueryUi {

	@Test
	public void frame() throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("MicrosoftEdge");
		dc.setPlatform(Platform.WINDOWS);
		
        //RemoteWebDriver driver = new RemoteWebDriver(
				//new URL("http://192.168.1.56:4444/wd/hub"), dc);//
		
		//Load the URL
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
	//	WebElement demo = driver.findElementByClassName("demo-frame");
		
		// switch to the frame
//		driver.switchTo().frame(demo);	
		//Drag within frame
//		WebElement drag =driver.findElementById("draggable");
//		WebElement drop =driver.findElementById("draggable");
//		int Xaxis =drag.getLocation().getX();
//		int Yaxis = drag.getLocation().getY();
//		System.out.println(Xaxis);
//		System.out.println(Yaxis);
//		Actions builder =new Actions(driver);
//		builder.dragAndDropBy(drop, 15, 15).build().perform();
//		
//		int Xaxis1 =drag.getLocation().getX();
//		int Yaxis1 = drag.getLocation().getY();
//		
//		System.out.println(Xaxis1+" "+Yaxis1);
		
		
	
		
		// Get the text of the draggable
	//	System.out.println(driver.findElementById("draggable").getText());
		
		// come out frame
		//driver.switchTo().defaultContent();
		
		// Click on the Download
	//	driver.findElementByLinkText("Download").click();
		
		//Sortable 
		
		driver.findElementByLinkText("Sortable").click();
		WebElement item1 =driver.findElementByXPath("//li[contains(text(),'Item 1')]");
		WebElement item5 =driver.findElementByXPath("//li[contains(text(),'Item 5')]");
		int xOffset=item5.getLocation().getX();
		int yOffset=item5.getLocation().getY();
		Actions builder =new Actions(driver);
     	builder.clickAndHold(item1).moveByOffset(xOffset, yOffset).build().perform();
		
		
	}
}