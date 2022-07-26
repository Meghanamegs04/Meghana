package project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class contactus {
	
		@Test
		public void cont() throws InterruptedException
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
			driver.findElement(By.linkText("Support")).click();
			driver.findElement(By.linkText("Contact Us")).click();
			Set<String>window=driver.getWindowHandles();  //window handling
			Iterator<String>it=window.iterator(); //parent window to child window
			String parentId=it.next();
			String childId=it.next();
			driver.switchTo().window(childId);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("meghana");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("meghanads@123");
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9035844424");
			driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("hiiiiii");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			}

		}


