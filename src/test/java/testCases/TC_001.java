package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CasualDresses;
import pageObjects.DressesPage;
import pageObjects.HomePage;
import testData.TestCaseData;
import base.Base;
import base.UtilClass;

public class TC_001 extends Base {
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void launchBrowser() throws IOException{
		driver = intiBrowser();
	}
	@Test(dataProvider="getData", dataProviderClass=TestCaseData.class)
	public void testCase001(String str1, String str2) throws InterruptedException{
	
	HomePage hp = new HomePage(driver);
	hp.getShoppingCart().click();
	hp.getHeaderLogo().click();
	hp.getCategortDress().click();
	
	DressesPage dp = new DressesPage(driver);
	UtilClass.getWaitForElement(driver, dp.leftColumn);
	UtilClass.getJSExecutor(dp.getSubCat(), driver);
	
	List<WebElement> dressCategory = dp.getDressSubCategory();
	int count = dp.getDressSubCategory().size();
	System.out.println(count);
	for(int i=0; i<count;i++){
		String str = dressCategory.get(i).getText();
		System.out.println(str);
		if(str.equalsIgnoreCase(str1)){
			dp.getDressSubCategory().get(i).click();
		}
		break;
	}
	CasualDresses cdp = new CasualDresses(driver);
	UtilClass.getWaitForElement(driver,cdp.layeredLeftBlock);
	UtilClass.getJSExecutor(cdp.getListGridProduct(), driver);	
	WebElement targetElement = cdp.getProductPrinted();
	UtilClass.getWaitForElement(driver, cdp.printedDressProductBlock);
	UtilClass.getActionMoveCursor(targetElement, driver);
	cdp.getAddToCartBtn().click();
	String productName= cdp.getProductName().getText();
	System.out.println(productName);
	String successMessage = cdp.getProductTextFinal().getText();
	String strSuccessMessage = successMessage.trim();
	System.out.println(strSuccessMessage);
	Assert.assertEquals(str2,strSuccessMessage);
	
	}
	@AfterTest
	public void quitBrowser(){
		driver.quit();
	}
}
