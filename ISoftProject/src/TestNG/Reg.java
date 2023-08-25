package TestNG;

import org.testng.annotations.Test;

import POM.RegPageObj;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Reg {
	WebDriver d;
  @Test(dataProvider = "dp")
  public void f(String fname, String lname,String email,String phn) {
  
	  RegPageObj.Fname(d).sendKeys("fname");
	  RegPageObj.Lname(d).sendKeys("lname");
	  RegPageObj.Email(d).sendKeys("emain");
	  RegPageObj.phnum(d).sendKeys("phn");
  }
 
  @BeforeMethod
  public void beforeMethod() 
  {
	  d.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	  d.manage().window().maximize();
	  String at=d.getTitle();
	  System.out.println("Title of the Page:"+at);
  }

  @AfterMethod
  public void afterMethod() {
	  
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Mahi","Kumar","cmk114","123456" },
      new Object[] {"Raj","Kumar","rajkn","987654" },
      new Object[] {"Nanda","Kishor","KOMkishore","756904" },
      
    };
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver64\\chromedriver-win64\\chromedriver.exe");
		d=new ChromeDriver();
		
  }

  @AfterClass
  public void afterClass() 
  {
	  d.quit();
  }

}
