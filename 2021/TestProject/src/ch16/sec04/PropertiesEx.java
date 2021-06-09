package ch16.sec04;

import java.util.Properties;

public class PropertiesEx {
	
	public static void main(String[] args) {
		Properties pro = new Properties();
		String path = PreopertiesEx.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(Path, "utf-8");
		properties.load(new FileReader(path));
		
		// getProperty(Å°): value¹ÝÈ¯
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
	}

}
