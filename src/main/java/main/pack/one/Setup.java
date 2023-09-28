package main.pack.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {

    public static boolean isBrowserOpen = false;
	public static WebDriver driver;

    public static boolean getDriver() {
    	
        if (isBrowserOpen == false) {
        	
           driver = new FirefoxDriver();
           isBrowserOpen = true;
        }
        return isBrowserOpen;
    }

    public static void quitDriver() {
        if (driver != null) {
        	
            driver.quit();
            driver = null;
        }
    }
}
