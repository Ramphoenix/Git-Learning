package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlindCalendarsMenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromeDriverPath = ".\\WebDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver chdriver = new ChromeDriver();
		chdriver.get("https://www.spicejet.com");
		chdriver.manage().window().maximize();
		Thread.sleep(4000);
		chdriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();		
		chdriver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(1000);     
		//Using Parent & Child Node 
        chdriver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //ui-state-default ui-state-highlight ui-state-active
        chdriver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        

	}

}
