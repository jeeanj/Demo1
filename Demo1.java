package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\D k\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.htmlcanvasstudio.com/");
	driver.findElement(By.xpath("//input[@title='Draw a line']")).click();
	
	WebElement element = driver.findElement(By.xpath("//div[@id='container']"));
	
	Actions builder = new Actions(driver);
	builder.moveToElement(element,300,139).perform();
	builder.clickAndHold(element).perform();
	builder.moveByOffset(394,141).perform();
	  	
	
}
}
