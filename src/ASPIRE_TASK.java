
import java.util.Random;


import org.testng.annotations.Test;

public class ASPIRE_TASK extends PARAMETER {
	@Test(invocationCount=6)
	public void geturl() {
String[] myWebSiteLanguage = {"https://sa.almosafer.com/ar","https://sa.almosafer.com/en"};
Random rand = new Random();
//int randomNumber = rand.nextInt(0,2);
int randomNumber = rand.nextInt(0,50000)%2; 
driver.get(myWebSiteLanguage[randomNumber]);
String actualTitle = driver.getTitle();
if(randomNumber==1) {
	myAssertion.assertEquals(actualTitle, "Almosafer: Flights, Hotels, Activities & Airlines Ticket Booking");
}
else {myAssertion.assertEquals(actualTitle, "المسافر: رحلات، فنادق، أنشطة ممتعة و تذاكر طيران");
}
myAssertion.assertAll();
}
}

