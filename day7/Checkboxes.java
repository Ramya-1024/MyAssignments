package week3.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		Thread.sleep(2000);
		//click on the basic checkbox
		WebElement basicCheckbox = driver.findElement(By.xpath("//span[text()='Basic']"));
		basicCheckbox.click();
		WebElement notifyCheckbox = driver.findElement(By.xpath("//span[text()='Ajax']"));
		notifyCheckbox.click();
	}
}
