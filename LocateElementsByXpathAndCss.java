package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsByXpathAndCss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String chromeDriverPath = ".\\WebDrivers\\chromedriver.exe";

		String loungeUrl ="https://10.20.50.61/lounge/sign_in.php" ;
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		WebDriver chDriver = new ChromeDriver() ;
		chDriver.get(loungeUrl);
		chDriver.findElement(By.cssSelector("#u-name")).sendKeys("aeslngapi6");
		chDriver.findElement(By.xpath("//*[@id='pswd']")).sendKeys("Ameen@1");
		chDriver.findElement(By.xpath("//*[@id='signInButton']")).click();
		//chDriver.findElement(By.linkText("Forgot Password")).click();
        chDriver.manage().window().maximize();
        Thread.sleep(2000);
        chDriver.findElement(By.partialLinkText("Out")).click();
		Thread.sleep(2000);
		chDriver.close();
		chDriver.quit();

	}

}
