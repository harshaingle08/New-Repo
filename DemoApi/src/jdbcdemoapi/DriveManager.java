package jdbcdemoapi;

public class DriveManager {

	public static Connection getConnection(String url, String username, String password) {
		
		if(url.equals("mysql") && username.equals("root") && password.equals("root")) 
		{
			return new Mysql();
		}
		
		else if(url.equals("Oracle") && username.equals("System") && password.equals("System")) 
		{
			return new Oracle();
		}
		else {
			
			return null;
		}
	}
}
