package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPageObj {

	public static WebElement Fname(WebDriver d)
	{
		return d.findElement(By.name("firstname"));
	}
	
	public static WebElement Lname(WebDriver d)
	{
		return d.findElement(By.name("lastname"));
	}
	
	public static WebElement Email(WebDriver d)
	{
		return d.findElement(By.xpath("//*[@id=\"input-email\"]"));
	}
	
	public static WebElement phnum(WebDriver d)
	{
		return d.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
	}
	
	public static WebElement pswd(WebDriver d)
	{
		return d.findElement(By.xpath("//*[@id=\"input-password\"]"));
	}
	
	public static WebElement cnfrmpswd(WebDriver d)
	{
		return d.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
	}
	
	public static WebElement cont(WebDriver d)
	{
		return d.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
	}
	
	
}
