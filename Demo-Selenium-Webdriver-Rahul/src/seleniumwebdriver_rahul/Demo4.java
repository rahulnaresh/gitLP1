package seleniumwebdriver_rahul;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RAHULRahul\\\\AOTSM_Automation\\\\AOTSMMidTierRegression\\\\SeleniumDriverandServerJar\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
	     WebElement link = driver.findElement(By.linkText("Car Rentals"));
		Actions action = new Actions(driver);
	/*	action.moveToElement(link).click().perform();*/
		//or
		
		
		//action.moveToElement(link).build().perform();
		//link.click();
		//or
		
		Action mouseover = action.moveToElement(link).build();
		mouseover.perform();
		//action.sendKeys(link, (Keys.ENTER)).perform();
		//or
		action.click().perform();

		

	}

}
