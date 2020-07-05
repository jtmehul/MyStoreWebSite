package testData;

import org.testng.annotations.DataProvider;

public class TestCaseData {
	
	@DataProvider 
	public static Object[][] getData(){
		return new Object [][]{
				{ "CASUAL DRESSES", "Product successfully added to your shopping cart" }
				};
	}	

}
