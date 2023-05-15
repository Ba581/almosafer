
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ARC extends PARAMETER{
	@Test()
	public void  defaultCurrencyIsCorrectSAR() throws InterruptedException  {
	String[] myWebSiteLanguage = {"https://sa.almosafer.com/ar","https://sa.almosafer.com/en"};
	Random rand = new Random();
	int randomNumber = rand.nextInt(0,2); 
	driver.get(myWebSiteLanguage[randomNumber]);

	WebElement CorrectSARar = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
	
	WebElement CorrectSARen  = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[2]/div/button"));

Thread.sleep(3000);
	String actualCorrectSARen = CorrectSARen.getText();
	 String actualCorrectSARar = CorrectSARar.getText();
	
	 	String expextedCorrectSAR ="SAR";
	if(randomNumber==0) 
	{myAssertion.assertEquals(actualCorrectSARar ,expextedCorrectSAR);
	}
	else {myAssertion.assertEquals( actualCorrectSARen ,expextedCorrectSAR);}

	myAssertion.assertAll();}
	
	
	
	
}
