package iRCTC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcLogin {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("Peter");
		driver.findElementById("userRegistrationForm:password").sendKeys("RedBlack@07");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("RedBlack@07");
		Select Dropdown = new Select (driver.findElementById("userRegistrationForm:securityQ"));
		Dropdown.selectByVisibleText("What is your pet name?");		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Khan");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Mike");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Knight");
		WebElement Radio = driver.findElementById("userRegistrationForm:gender:0");
		Radio.click();
		WebElement Radio1 = driver.findElementById("userRegistrationForm:maritalStatus:1");
		Radio1.click();
		Select Dropdown1 = new Select (driver.findElementById("userRegistrationForm:dobDay"));
		Dropdown1.selectByValue("02");	
		Select Dropdown2 = new Select (driver.findElementById("userRegistrationForm:dobMonth"));
		Dropdown2.selectByValue("02");	
		Select Dropdown3 = new Select (driver.findElementById("userRegistrationForm:dateOfBirth"));
		Dropdown3.selectByValue("1998");
		Select Dropdown4 = new Select (driver.findElementById("userRegistrationForm:occupation"));
		Dropdown4.selectByVisibleText("Professional");
		Select Dropdown5 = new Select (driver.findElementById("userRegistrationForm:countries"));
		Dropdown5.selectByValue("240");
		driver.findElementById("userRegistrationForm:email").sendKeys("Knight@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("324343243242");
		Select Dropdown6 = new Select (driver.findElementById("userRegistrationForm:nationalityId"));
		Dropdown6.selectByValue("240");
		driver.findElementById("userRegistrationForm:address").sendKeys("1/19");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("22260");
		driver.findElementById("userRegistrationForm:landline").sendKeys("3581834556");
		
		}

}
