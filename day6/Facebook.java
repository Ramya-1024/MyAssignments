package week2.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		//Create account using create account button
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		// Enter a firstname and surname
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Ramya");
		WebElement surName = driver.findElement(By.name("lastname"));
		surName.sendKeys("Manoj");
		WebElement emailadd = driver.findElement(By.name("reg_email__"));
		emailadd.sendKeys("ramya12@gmail.com");
		WebElement newPwd = driver.findElement(By.id("password_step_input"));
		newPwd.sendKeys("ramys");
		WebElement day = driver.findElement(By.id("day"));
		Select option1 = new Select(day);
		option1.selectByIndex(10);
		WebElement month = driver.findElement(By.id("month"));
		Select option2 = new Select(month);
		option2.selectByValue("10");
		WebElement year = driver.findElement(By.id("year"));
		Select option3 = new Select(year);
		option3.selectByVisibleText("1999");
		driver.findElement(By.id("sex")).click();
		
		
		

	}

}
