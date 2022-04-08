package oopsConcepts;

public class App {

	private static App app;
	 
	private App()
	{
		
	}
	public static App getInstance()
	{
		if (null==app) {
			app = new App();
		}
		return app;
	}
	
}



