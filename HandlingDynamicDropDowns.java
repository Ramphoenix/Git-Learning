package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HandlingDynamicDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String chromeDriverPath = ".\\WebDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver chdriver = new ChromeDriver();
		chdriver.get("https://www.spicejet.com");
		
		Thread.sleep(2000);
		chdriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();		
		chdriver.findElement(By.xpath("//a[@value='BLR']")).click();

		//Using Indexes 
		//chdriver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		Thread.sleep(1000);     
		//Using Parent & Child Node 
        chdriver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        Assert.assertFalse(chdriver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).isSelected());
        
        //System.out.println(chdriver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).isSelected());
        chdriver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_friendsandfamily]")).click();
        chdriver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).click();
        Assert.assertTrue(chdriver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).isSelected());
        //System.out.println(chdriver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).isSelected());
        Assert.assertEquals(chdriver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
        //System.out.println(chdriver.findElements(By.cssSelector("input[type='checkbox']")).size());
        chdriver.findElement(By.xpath("//div[@class='row1 adult-infant-child']")).click();
        
        Select sobj = new Select(chdriver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        sobj.selectByValue("3");
        Select sobj2 = new Select(chdriver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
        sobj2.selectByValue("2");
        chdriver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        Select sobj3 = new Select(chdriver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        sobj3.selectByValue("USD");
        System.out.println(chdriver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
        //Assert.assertEquals(chdriver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText(),"USD");
        Assert.assertEquals(chdriver.findElement(By.id("divpaxinfo")).getText(), "3 Adult, 2 Infant");
        //System.out.println(chdriver.findElement(By.id("divpaxinfo")).getText());
        
        Thread.sleep(2000);
        chdriver.close();
        chdriver.quit();
	}

}
