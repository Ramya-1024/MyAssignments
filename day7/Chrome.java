package week3.day7;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("Chrome is launched Incognito mode");}
	
	public void clearCache() {
		System.out.println("Chrome is cleared cache from settings");}

	public static void main(String[] args) {
		Chrome driver1 = new Chrome();
		driver1.openIncognito();
		driver1.clearCache();
		driver1.openURL();
		driver1.closeBrowser();
		driver1.navigateBack();
		

	}

}
