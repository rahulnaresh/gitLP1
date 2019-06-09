package seleniumwebdriver_rahul;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHULRahul\\AOTSM_Automation\\AOTSMMidTierRegression\\SeleniumDriverandServerJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();

	}

}
