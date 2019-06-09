package seleniumwebdriver_rahul;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RAHULRahul\\\\AOTSM_Automation\\\\AOTSMMidTierRegression\\\\SeleniumDriverandServerJar\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		String notWorkingTitle = "Under Construction: Mercury Tours";	
		List<WebElement> mercuryLeftLinks = driver.findElements(By.className("mouseOut"));
		String [] links = new String[mercuryLeftLinks.size()];
		for(int i= 0;i<mercuryLeftLinks.size(); i++) {
			links[i] = mercuryLeftLinks.get(i).getText().toString();
				
		}
		for(String s:links ) {
			driver.findElement(By.linkText(s)).click();
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(notWorkingTitle)) {
				System.out.println("\"" +"Link" + "\"" +s + "\"" +"is not working");
				
			}
			else {
				System.out.println("Link " + s + "\t is working");
				
			}
			driver.navigate().back();
		}
		

	}

}
