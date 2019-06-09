package seleniumwebdriver_rahul;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHULRahul\\AOTSM_Automation\\AOTSMMidTierRegression\\SeleniumDriverandServerJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		//keys.chord is used to control multiple keyboard actions
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("tabs are : " + tabs.size());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		
		
	}

}
