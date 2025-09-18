package week3.day7;

public class Browser {
	// Add two variables
	public String browserName = "Chrome ";
	public String browserVersion = "137.0.7151.119";
	// Add methods
	public void openURL() {
		System.out.println(browserName + "browser launched");
	}
	
	public void closeBrowser() {
		System.out.println(browserName + "browser closed");
	}
		
	public void navigateBack() {
		System.out.println(browserName + "navigated back");
	}

	public static void main(String[] args) {
		Browser driver = new Browser();
		driver.openURL();
		driver.closeBrowser();
		driver.navigateBack();
		
	}

}
