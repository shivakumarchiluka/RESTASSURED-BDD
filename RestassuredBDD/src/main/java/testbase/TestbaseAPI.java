package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class TestbaseAPI {
	
	public static Properties property;

	
	public TestbaseAPI() {
		

		try {
			property = new Properties();
			
			FileInputStream ip = new FileInputStream("C:\\Users\\Admin\\git\\RESTASSURED-BDD\\RestassuredBDD\\src\\m"
					+ "ain\\java\\com\\truepush\\qa\\configuration\\configuration.properties");

			property.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	

}
