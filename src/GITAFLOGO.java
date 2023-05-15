import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GITAFLOGO extends PARAMETER {
// @Test()
//public void Verify_qitaf_logoisd_isplayed_in_footer (){
//	WebElement divcontainssvg = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[2]"));
//	 List<WebElement> findElements = divcontainssvg.findElements(By.tagName("svg"));
//	 String Actual_qitafid = findElements.get(0).getAttribute("data-testid");
//	 String Expected_qitafid = "Footer__QitafLogo";
//	 myAssertion.assertEquals(Actual_qitafid, Expected_qitafid);
//	 myAssertion.assertAll();
//	 
//}
// @Test()
//	public void Footer_more_svg() {
//		WebElement divContainsMoreSvg = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[1]"));
//		List<WebElement> moreSVG = divContainsMoreSvg.findElements(By.tagName("svg"));
//		
//		
//		
//		String Expected_qitafid0 ="Footer__MadaCardLogo";
//		String Expected_qitafid1 ="Footer__MasterCardLogo";
//		String Expected_qitafid2 ="Footer__VisaCardLogo";
//		String Expected_qitafid3 ="Footer__AmericanExpressCardLogo";
//		
//		for(int i=0;i<moreSVG.size();i++) {
//			String	Actual_qitafid = moreSVG.get(i).getAttribute("data-testid");
//		if(i==0) {myAssertion.assertEquals(Actual_qitafid, Expected_qitafid0);}
//		if(i==1) {myAssertion.assertEquals(Actual_qitafid, Expected_qitafid1);}
//		if(i==2) {myAssertion.assertEquals(Actual_qitafid, Expected_qitafid2);}
//		if(i==3) {myAssertion.assertEquals(Actual_qitafid, Expected_qitafid3);}
//		
//			
//			
//		
//		myAssertion.assertAll();}
//		}
		@Test()
		public void Footer_Css(){
			WebElement qitaf = driver.findElement(By.cssSelector("data-testid=\"Footer__QitafLogo\""));
			qitaf.isDisplayed();
			myAssertion.assertEquals(qitaf.isDisplayed(), true);
			myAssertion.assertAll();
		}
		
 }


 

