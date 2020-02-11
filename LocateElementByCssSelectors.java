package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByCssSelectors {
	
	public static void main(String[] args) throws InterruptedException {
	
	String chromeDriverPath = ".\\WebDrivers\\chromedriver.exe";
    String ERPQAURL ="https://10.20.50.61/erp/" ;
	System.setProperty("webdriver.chrome.driver",chromeDriverPath);
	WebDriver chDriver = new ChromeDriver() ;
	chDriver.get(ERPQAURL);
	chDriver.findElement(By.cssSelector("input[id='uname']")).sendKeys("abansode");
	chDriver.findElement(By.cssSelector("input[id='pwd']")).sendKeys("erp");
	chDriver.findElement(By.cssSelector("input[id='loginbut']")).click();
    Thread.sleep(2000);
	chDriver.close();
	chDriver.quit();

}
}