package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signup {
@Test
public void aign() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\meghana.ds\\\\Downloads\\\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Sign up")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Meghana");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("DS");
	driver.findElement(By.cssSelector("input[type='Email']")).sendKeys("meghanads@gmail.com");
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("meghana");
	driver.findElement(By.cssSelector("input[type='date']")).sendKeys("14-07-2022");
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[4]/input")).click();
	driver.findElement(By.cssSelector("input[min='0']")).sendKeys("9035844424");
	driver.findElement(By.cssSelector("textarea[rows='3']")).sendKeys("hiii");
	driver.findElement(By.cssSelector("button[class='btn btn-info form-control']")).click();
}
}

