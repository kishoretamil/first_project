package xpath_text;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {
public static void main(String[] args) throws InterruptedException {
//	System.setProperty(null, null)
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	Thread.sleep(3000);
	driver.get("https://www.facebook.com/");
//	WebElement txtusername = driver.findElement(By.className("inputtext"));
//	txtusername.sendKeys("tamil");
//	
//	WebElement txtpassword = driver.findElement(By.className("inputtext"));
//	txtpassword.sendKeys("1996");
//	
	//xpath
	WebElement txtusername = driver.findElement(By.xpath("//input[@type='text']"));
	txtusername .sendKeys("tamil");
	WebElement txtpassword = driver.findElement(By.xpath("//input[@type='password']"));
	txtpassword .sendKeys("1996");
	
	WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1'"));
	btnlogin.click();
	
//	WebElement btncreate = driver.findElement(By.xpath("//a[@role='button'][2]"));
//	btncreatebtncreate.click();
	//findelements
	
	List<WebElement> li = driver.findElements(By.xpath("//a[@role='button']"));
	WebElement btncreate = li.get(1);
	btncreate.click();
	
	
}
}
