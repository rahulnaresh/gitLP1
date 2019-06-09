package seleniumwebdriver_rahul;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RAHULRahul\\\\AOTSM_Automation\\\\AOTSMMidTierRegression\\\\SeleniumDriverandServerJar\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		String usernameVal = username.getAttribute("value");
		System.out.println(usernameVal);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Performance")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'PIM')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Recru")).click();
		Thread.sleep(3000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
	//	System.out.println(links);
		System.out.println(links.size());
		for(WebElement e: links) {
			String linktext = e.getText();
			System.out.println(linktext);
					
		}
		

		
		
		
	

	}

}
