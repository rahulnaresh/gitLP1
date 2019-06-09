package seleniumwebdriver_rahul;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHULRahul\\AOTSM_Automation\\AOTSMMidTierRegression\\SeleniumDriverandServerJar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		if(username.isEnabled()) {
			username.sendKeys("sunil");
			Thread.sleep(3000);
			username.clear();
			username.sendKeys("sunil");
			
		}
		if (username.isDisplayed()) {
		password.sendKeys("sunil");
		driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
		Thread.sleep(3000);
		}
		
		//WebElement is used to store an element in a variable 
		WebElement radioElement = driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']"));
		
		if(radioElement.isSelected()) {
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
				
		//Select is an interface for storing the dropdown 	
		Select passanger = new Select(driver.findElement(By.name("passCount")));
		//Ways of selecting a different value in a drop down
		//passanger.selectByVisibleText("2");
		//passanger.selectByIndex(1);
		passanger.selectByValue("2");
		
		List<WebElement> passangerValues = passanger.getOptions();
		//String passangerValues = passanger.getOptions().toString();
		System.out.println(passangerValues.size());
		
		for(int i = 0; i <passangerValues.size(); i++) {
			System.out.println("Passanger list "+(i+1) +"Value is :" + passangerValues.get(i).getText());
			
		}
		
		WebElement dropDown = driver.findElement(By.name("fromPort"));
		
		Select fromPortDD = new Select (dropDown);
		fromPortDD.selectByIndex(3);
		List<WebElement> fromportValues = fromPortDD.getOptions();
		System.out.println("Size of fromPort DD value is " + fromportValues.size());
		for(int j = 0;j<fromportValues.size();j++) {
			System.out.println(fromportValues.get(j).getText());
		}
		
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("reserveFlights")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("passFirst0")).sendKeys("Ra");
		driver.findElement(By.name("passLast0")).sendKeys("Na");
		driver.findElement(By.name("creditnumber")).sendKeys("1234");
		//driver.findElement(By.xpath("//*[contains,text()'Ticketless Travel']")).click();
		
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		for(WebElement e:checkbox) {
			e.click();
		}
		
		
		
		
		
		
		
		
		
		
		}
		
		

		
	}

}
