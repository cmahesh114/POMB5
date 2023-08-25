package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegTC {
  WebDriver d;
	@Test
  public void Reg() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver64\\chromedriver-win64\\chromedriver.exe");
		d=new ChromeDriver();
		
		d.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		RegPageObj.Fname(d).sendKeys("Mahesh");
		Thread.sleep(2000);
		RegPageObj.Lname(d).sendKeys("Kumar");
		Thread.sleep(2000);
		RegPageObj.Email(d).sendKeys("MaheshKumar");
		Thread.sleep(2000);
		RegPageObj.phnum(d).sendKeys("123456");
		Thread.sleep(2000);
		RegPageObj.pswd(d).sendKeys("1233456");
		Thread.sleep(2000);
		RegPageObj.cnfrmpswd(d).sendKeys("13456789");
		Thread.sleep(2000);
		RegPageObj.cont(d).click();
  }
}
