package week2.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Testleaf");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Ramya");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Dayalan");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option1 = new Select(source);
		option1.selectByIndex(4);
		WebElement marCam = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option2 = new Select(marCam);
		option2.selectByVisibleText("Automobile");
		WebElement ownerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select option3 = new Select(ownerShip);
		option3.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
