package week2.day3;

public class Browser {
	String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser objbrowser = new Browser();
		objbrowser.launchBrowser("browserName");
		objbrowser.loadUrl();
		
		

	}

}
