package stepDefintions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPageDefintion {
	
	protected WebDriver driver; 
	
	protected WebDriver getdriver() {
		if (driver == null) {
			driver = new ChromeDriver();
			
		}
		return driver;
	}

}
