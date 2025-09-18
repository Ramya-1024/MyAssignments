package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	private static WebElement element;

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		// set up chrome
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		// Enter a username and password
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		// Click to login
		driver.findElement(By.className("decorativeSubmit")).click();
		// click on CRM link
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		WebElement AccountName = driver.findElement(By.id("accountName"));
		AccountName.sendKeys("Testleaf");
		// enter a description
		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("Selenium Automation Tester");
		//create account
		driver.findElement(By.className("smallSubmit")).click();
	    // enter the title
		String title = driver.getTitle();
		System.out.println("LeafTaps");
		driver.close();
		
		
		
		

	}

}
