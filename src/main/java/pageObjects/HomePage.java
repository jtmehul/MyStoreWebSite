package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Objects;

public class HomePage {
	
	public WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	By shoopingCart = By.xpath(Objects.shoppingCart);
	By headerLogo = By.cssSelector(Objects.logo);
	By categoryDress = By.xpath(Objects.dressCode);
	
	
	public WebElement getShoppingCart(){
		return driver.findElement(shoopingCart);
	}
	public WebElement getHeaderLogo(){
		return driver.findElement(headerLogo);
	}
	public WebElement getCategortDress(){
		return driver.findElement(categoryDress);
	}
	
}
