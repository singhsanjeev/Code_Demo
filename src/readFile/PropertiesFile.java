package readFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		File f = new File("D:\\sanju_Programs\\student1.properties");
		FileInputStream fiss = new FileInputStream(f);
		//FileInputStream fis = new FileInputStream("D:\\sanju_Programs\\student1.properties");
		p.load(fiss);
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("course"));
	}

}

