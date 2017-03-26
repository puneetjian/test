package makemytrip;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.crypto.ExemptionMechanismException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.makemytrip.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//span[@class='arrow_downall']")).click();
driver.findElement(By.xpath("//span[contains(.,'Domestic Holidays')]")).click();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");

WebElement close_element = driver.findElement(By.xpath("//*[contains(@class, 'wewidgeticon we_close')]"));
WebDriverWait Wait_Utils=new WebDriverWait(driver, 10);
Wait_Utils.until(ExpectedConditions.elementToBeClickable(close_element));
//Wait_Utils.elementtobeClickable(driver, close_element);

close_element.click();

driver.switchTo().defaultContent();

//driver.findElement(By.xpath("//a[contains(.,' International ')]")).click();
driver.quit();


}
}
