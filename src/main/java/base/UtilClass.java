package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilClass {
	

	public static void getJSExecutor(WebElement locator, WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", locator);
	}
	
	public static void getActionMoveCursor(WebElement moveElement, WebDriver driver){
		Actions action = new Actions(driver);
		action.moveToElement(moveElement).release().build().perform();
	}
	public static void getWaitForElement(WebDriver driver, By locElement){
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locElement));
	}
}
