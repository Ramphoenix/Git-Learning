package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsByCustomizedCssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeDriverPath = ".\\WebDrivers\\chromedriver.exe";
        String SalesForceUrl ="https://login.salesforce.com/" ;
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		WebDriver chDriver = new ChromeDriver() ;
		chDriver.get(SalesForceUrl);
		//chDriver.findElement(By.id("username")).sendKeys("test");
		//chDriver.findElement(By.xpath("//*[@id='password']")).sendKeys("hello");
		//chDriver.findElement(By.xpath("//*[@id='Login']")).click();
		//String Error_msg = chDriver.findElement(By.cssSelector("#error")).getText() ;
		
		chDriver.findElement(By.cssSelector("input[id='username']")).sendKeys("test");
		chDriver.findElement(By.cssSelector("input[id='password']")).sendKeys("password");
		chDriver.findElement(By.cssSelector("input#Login")).click();
		String Error_msg = chDriver.findElement(By.cssSelector("div#error.loginError")).getText() ;
		
		//loginError
	    System.out.println("login Error message is "+Error_msg);
		
		

	}

}
