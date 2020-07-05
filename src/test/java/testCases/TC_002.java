package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;

public class TC_002 extends Base{

	public WebDriver driver;
	@BeforeTest
	public void startBrowser() throws IOException{
	   driver = intiBrowser();
	}
	
	@Test
	public void testTitle(){
		
		String expectedTitle= "My Store";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void quiteBrowser(){
		driver.quit();
	}
}
