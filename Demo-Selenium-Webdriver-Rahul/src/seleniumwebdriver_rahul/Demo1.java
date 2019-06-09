package seleniumwebdriver_rahul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//For Firefox how to set up the driver to launch the firefox browser
		
		
		
		//For chrome - how to set up the driver to launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHULRahul\\AOTSM_Automation\\AOTSMMidTierRegression\\SeleniumDriverandServerJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//navigate command also used as get to launch the url for browser but navigate gives 
		//more flexibiilty of navigating as back , forward , refresh , wait 
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
					
		//driver.manage.window is used to maximixe the window size 
		driver.manage().window().maximize();
		
		String expectedTitle = "OrangeHRM";
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id='divLoginButton']/input")).click();
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("If title matches then logout");
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
			//Using link text
			//driver.findElement(By.linkText("Logout")).click();
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			Thread.sleep(3000);
			driver.close();
			}
		else
			System.out.println("Title does not match");
		
		//Driver.close only closes the current instance of browser under control by the webdriver
		//driver.close();
		
		//Driver.quit only closes all the instance of browser under control by the webdriver
		
		//driver.quit();
	}

}
