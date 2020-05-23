package internationalisation_fileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class interTest1 {

	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File("F:\\study\\Spring\\internationalisation\\src"
					+ "\\internationalisation_common\\title.properties")));
			String language = System.getProperty("user.language");
			System.out.println(language);
			if (language.equals("jp")) {
				language = props.getProperty("welcome.msg.jp");
			} else {
				language = props.getProperty("welcome.msg.en");
			}
			System.out.println(language);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
