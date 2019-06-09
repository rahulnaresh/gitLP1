package seleniumwebdriver_rahul;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHULRahul\\AOTSM_Automation\\AOTSMMidTierRegression\\SeleniumDriverandServerJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement userName = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		action.moveToElement(userName).click().perform();
		//action.sendKeys(userName,(Keys.ENTER)).perform();
		action.sendKeys("sunil").perform();
		action.moveToElement(password).click().perform();
		action.sendKeys("sunil").perform();
		action.sendKeys(Keys.ENTER).perform();
		WebElement radioOneWay = driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']"));
		action.moveToElement(radioOneWay).build().perform();
		action.click().perform();
		WebElement passenger = driver.findElement(By.name("passCount"));
		action.moveToElement(passenger).click().perform();
		Select passangerSelect = new Select(passenger);
		passangerSelect.selectByIndex(3);
		action.click().perform();
		
	
	
		//action.sendKeys("sunil")

	}

}
