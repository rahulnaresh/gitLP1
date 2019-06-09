package seleniumwebdriver_rahul;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHULRahul\\AOTSM_Automation\\AOTSMMidTierRegression\\SeleniumDriverandServerJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://realestate.upskills.in/wp-admin/");
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		WebElement howdyLink = driver.findElement(By.xpath("//*[contains(text(),'Howdy']"));
		Actions action = new Actions(driver);
		//action.moveToElement(howdyLink).build().perform();
		action.contextClick(howdyLink).build().perform(); // COntect click is to right click on the element
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
	}

}
