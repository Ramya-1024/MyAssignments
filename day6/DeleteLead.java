package week2.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		WebElement phoneNum = driver.findElement(By.name("phoneNumber"));
		phoneNum.sendKeys("23978");
		driver.findElement(By.partialLinkText("Find Leads")).click();
		Thread.sleep(2000);
		String testFirstLeadId = driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).getText();
	    System.out.println(testFirstLeadId);


	}

}
