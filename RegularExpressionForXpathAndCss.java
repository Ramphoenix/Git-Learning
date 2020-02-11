package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpressionForXpathAndCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeDriverPath = ".\\WebDrivers\\chromedriver.exe";
        String SalesForceUrl ="http://www.rediff.com/" ;
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		WebDriver chDriver = new ChromeDriver() ;
		chDriver.get(SalesForceUrl);
		
		chDriver.findElement(By.cssSelector("a[title*='Rediffmail'")).click();
		chDriver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Raghu");
		chDriver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("rr.er");
		chDriver.findElement(By.xpath("//input[contains(@name,'btnchkavail')]")).click();
		//chDriver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

	}

}
