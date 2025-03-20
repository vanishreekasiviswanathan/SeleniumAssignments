package week1.day3;

public class Browser {


	public void launchBrowser(){
		System.out.println("Browser is launched");
	}
	
	public void loadURL(){
		System.out.println("URL is loading");
	}

	public static void main(String[] args) {
		Browser browserObject = new Browser();
		browserObject.launchBrowser();
		browserObject.loadURL();

	}

}
