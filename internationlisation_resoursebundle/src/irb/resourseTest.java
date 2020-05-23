package irb;

import java.util.Locale;
import java.util.ResourceBundle;

public class resourseTest {

	public static void main(String[] args) {
		String baseName = "rb\\props\\welcome";
		Locale locle = null;
		locle = locle.getDefault();
		System.out.println(locle);
		ResourceBundle massage = ResourceBundle.getBundle(baseName, locle);
		System.out.println(massage.getString("welcome.msg"));

	}

}
