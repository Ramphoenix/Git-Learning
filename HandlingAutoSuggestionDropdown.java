package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromeDriverPath = ".\\WebDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver chdriver = new ChromeDriver();
		chdriver.get("https://www.makemytrip.com/");
		//chdriver.manage().window().maximize();
		Thread.sleep(2000);
		//chdriver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).click();
	    chdriver.findElement(By.cssSelector("#fromCity")).click();
	    WebElement source = chdriver.findElement(By.cssSelector(".react-autosuggest__input")) ;
        source.sendKeys("MUM");
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		//chdriver.findElement(By.cssSelector("#toCity")).click();	
		 WebElement destination = chdriver.findElement(By.cssSelector(".react-autosuggest__container")) ;
	     destination.click();
		 destination.sendKeys("MAA");
		 destination.sendKeys(Keys.ARROW_DOWN);
		 destination.sendKeys(Keys.ENTER);
	    //destination.sendKeys(Keys.ARROW_DOWN);
	    //destination.sendKeys(Keys.ENTER);
	
        Thread.sleep(2000);
        //chdriver.close();
        //chdriver.quit();
		
		
		
	}

	}


