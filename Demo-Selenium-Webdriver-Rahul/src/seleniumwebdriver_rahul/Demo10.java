package seleniumwebdriver_rahul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHULRahul\\AOTSM_Automation\\AOTSMMidTierRegression\\SeleniumDriverandServerJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath("//tbody//tr[1]//td[1]")).getText();
		System.out.println(s);
		String v = driver.findElement(By.xpath("//*[@name='email']//parent::td//parent::tr//preceding-sibling::tr//td//label")).getText();
		System.out.println(v);
		String v1 = driver.findElement(By.xpath("//*[@name='email']//ancestor::tr//preceding-sibling::tr//td//label")).getText();
		System.out.println(v1);
		String v2 = driver.findElement(By.xpath("//*[@name='email']//parent::td//following-sibling::td[2]//label//input")).getText();
		System.out.println(v2);
		String v3 = driver.findElement(By.xpath("//*[@name='email']//parent::td//following-sibling::td[2]//label//input")).getAttribute("value");
		System.out.println(v3);
		
		
		
	}

}
