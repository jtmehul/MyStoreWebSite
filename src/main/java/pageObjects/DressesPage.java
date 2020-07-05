package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressesPage {

	
	public WebDriver driver;
	
	public DressesPage(WebDriver driver){
		this.driver = driver;
	}
	
	By subCat = By.id("subcategories");
	public static By leftColumn = By.xpath("//div[@id='left_column']/div/h2");
	
	By dressSubCategory = By.xpath("//ul[@class='clearfix']/li/h5/a");
	
	public WebElement getSubCat(){
		return driver.findElement(subCat);
	}
	
	public List<WebElement> getDressSubCategory(){
		return driver.findElements(dressSubCategory);
	}
}
