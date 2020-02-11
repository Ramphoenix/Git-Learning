package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsByCustomizedXpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeDriverPath = ".\\WebDrivers\\chromedriver.exe";

		String SalesForceUrl ="https://login.salesforce.com/" ;
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		WebDriver chDriver = new ChromeDriver() ;
		chDriver.get(SalesForceUrl);
		
		chDriver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
		chDriver.findElement(By.xpath("//input[@name='pw']")).sendKeys("hello");
		chDriver.findElement(By.xpath("//input[@value='Log In']")).click();
		String Error_msg = chDriver.findElement(By.xpath("//div[@id='error']")).getText() ;
		
		
		System.out.println("login Error message is "+Error_msg);

	}

}
