package Singleton;

public class AppConfig {

	private AppConfig()
	{
		
	}
	
	private static AppConfig obj = new AppConfig();
	                             // null;
	
	public static AppConfig getInstance()
	{
		// if(obj==null)
		// obj = new AppConfig
		return obj;
	}
}
