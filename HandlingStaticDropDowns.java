package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 String chromeDriverPath = ".\\WebDrivers\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		 WebDriver chDriver = new ChromeDriver () ;
		 chDriver.get("https://www.spicejet.com");
		 chDriver.findElement(By.id("divpaxinfo")).click(); 
		 Select sobj = new Select(chDriver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
         sobj.selectByValue("2");
         Thread.sleep(2000);
         sobj.selectByIndex(6);
         Thread.sleep(2000);
         sobj.selectByVisibleText("4");
 		 Thread.sleep(2000);
 		 System.out.println(chDriver.findElement(By.id("divpaxinfo")).getText());
		 chDriver.close();
		 chDriver.quit();
	}

}
