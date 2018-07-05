package maven.apple1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppleBuyReturndetails {
@Test
	public class Applebuyreturndetails {
		public void AppleBuy() throws InterruptedException{
			System.setProperty("webdriver.gecko.driver", "/Applications/geckodriver");
			//System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		    WebDriver driver=new FirefoxDriver();
			 driver.get("http://www.apple.com");
			 AppleBuy ab=new AppleBuy (driver);
			 ab.Ipdselect().click();
			 ab.buy().click();
			 ab.selectsilver().click();
			 Thread.sleep(1000);
			 ab.selectgb().click();
			 Thread.sleep(1000);
			 ab.selectwificell().click();
			 Thread.sleep(1000);
			 ab.addapplecare().click();
			 Thread.sleep(1000);
			 ab.add().click();
			 Thread.sleep(1000);
			 ab.selectcontinue().click();
			 ab.addtocart().click();
			 ab.reviewbag().click();
			 Thread.sleep(1000);
			 ab.checkout().click();
			 ab.contguest().click();
			 Thread.sleep(1000);
			 ab.continueshipping().click();
			 Thread.sleep(1000);
			 ab.fn().sendKeys("sindhu");
			 Thread.sleep(1000);
			 ab.ln().sendKeys("birudala");
			 Thread.sleep(1000);
			 ab.address().sendKeys("1550 technologydrive");
			 ab.zipcode().sendKeys("95110");
			 ab.emailaddress().sendKeys("sindhu.vinny@gmail.com");
			 ab.contact().sendKeys("404-919-8335");
			 Thread.sleep(1000);
			 ab.continuepayment().click();
			 Thread.sleep(2000);
			 ab.recommend().click();
			 Thread.sleep(1000);
			 ab.clickoncreditoption().click();
			 Thread.sleep(1000);
			 ab.entercreditnumber().sendKeys("1234561234561");
			 Thread.sleep(1000);
			 ab.expirydate().sendKeys("06/20");
			 Thread.sleep(1000);
			 ab.cvvno().sendKeys("123");
			 String Actualmessage=driver.findElement(By.className("form-message-wrapper")).getText();
			    System.out.println(Actualmessage);
			    String expectedMessage = "credit card payment Successful!";
			    Assert.assertEquals(Actualmessage,expectedMessage);
			    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[5]/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/button")).click();
			 
			 
}
}
}






