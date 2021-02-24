package Academy;

import java.io.IOException;

import org.testng.annotations.Test;
import Academy.base;

public class HomePage extends base {
	
	 @Test
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		driver.get("https://google.com");
	}
}
