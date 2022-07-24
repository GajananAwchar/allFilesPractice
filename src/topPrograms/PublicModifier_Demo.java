package accessmodifiers;

import start.BrowserLaunch;

public class PublicModifier_Demo {

	public static void main(String[] args) {
		// import BrowserLaunch() from start package
		BrowserLaunch launch = new BrowserLaunch();
		// access to public method  ChromeBrowserLaunch () from other package directly by using object creation
		launch.ChromeBrowserLaunch();
	}

}
