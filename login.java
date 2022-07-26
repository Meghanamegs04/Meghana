package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login {
@Test
public void log() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\meghana.ds\\\\Downloads\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
	driver.findElement(By.id("username")).sendKeys("dummi");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("hachiko");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
	}

}
