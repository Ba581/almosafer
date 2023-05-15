


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.asserts.SoftAssert;

public class PARAMETER {
	static WebDriver driver=new ChromeDriver();
	
	SoftAssert myAssertion=new SoftAssert();
	
	@BeforeTest
	public void setup() {
		driver.get("https://sa.almosafer.com/en");
	
		 
	}
	
	@AfterTest
	public void close () {
		driver.close();
		}


}
