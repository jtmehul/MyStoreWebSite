package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CasualDresses {
	
	public WebDriver driver;
	
	public CasualDresses(WebDriver driver){
		this.driver = driver;
	}
	
	public  By layeredLeftBlock = By.xpath("//div[@id='layered_block_left']/p");
	By productListGrid = By.cssSelector(".product_list.grid.row");
	public By printedDressProductBlock = By.xpath("//div[@class='left-block']/div");
	By btnAddtoCart = By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']/span");
	By prodName = (By.xpath("//h5[@itemprop='name']/a"));
	By prodText = By.cssSelector(".layer_cart_product > h2");
	
	public WebElement getListGridProduct(){
		return driver.findElement(layeredLeftBlock);
	}
	
	public WebElement getProductPrinted(){
		return driver.findElement(printedDressProductBlock);
	}
	public WebElement getAddToCartBtn(){
		return driver.findElement(btnAddtoCart);
	}
	public WebElement getProductName(){
		return driver.findElement(prodName);
	}
	public WebElement getProductTextFinal(){
		return driver.findElement(prodText);
	}

}
