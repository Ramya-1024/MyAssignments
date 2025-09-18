package week3.day7;

public class Edge extends Browser {
	
	public void takesnap() {
		System.out.println("Took snap for evidence");}
	
	public void clearCookies() {
		System.out.println("Chrome is cleared cookies from settings");}

	public static void main(String[] args) {
		Edge driver2 = new Edge();
		driver2.takesnap();
		driver2.clearCookies();
		driver2.openURL();
		driver2.closeBrowser();
		driver2.navigateBack();



	}

}
