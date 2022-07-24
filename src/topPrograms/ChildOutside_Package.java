package accessmodifiers;

import start.BrowserLaunch;

public class ChildOutside_Package extends BrowserLaunch {

	static public  void main(String [] args) {
		ChildOutside_Package launch = new ChildOutside_Package();
		// access to protected method  OperaBrowserLaunch () from other package through inheritance
		launch.OperaBrowserLaunch();  
		
		
		
	}

}
