package util.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

//    public static WebDriver getNewDriverInstance(String browserName) {
//        switch (browserName.toLowerCase()) {
//            case "Chrome":
//                ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.addArguments("--headless");
//                chromeOptions.addArguments("start-maximized");
//                
//                System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32_126.0.6478\\chromedriver.exe");
//                WebDriver driver = new ChromeDriver(chromeOptions);
//                return driver;
//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//                return new FirefoxDriver();
//            case "firefox-headless":
//                FirefoxBinary firefoxBinary = new FirefoxBinary();
//                firefoxBinary.addCommandLineOptions("--headless");
//                firefoxBinary.addCommandLineOptions("--window-size=1280x720");
//                FirefoxOptions firefoxOptions = new FirefoxOptions();
//                firefoxOptions.setBinary(firefoxBinary);
//                WebDriverManager.firefoxdriver().setup();
//                return new FirefoxDriver(firefoxOptions);
//            case "edge":
//                WebDriverManager.edgedriver().setup();
//                return new EdgeDriver();
//            default:
//                WebDriverManager.chromedriver().setup();
//                return new ChromeDriver();
//        }
//    }
	
	public static WebDriver getNewDriverInstance(String browserName)
	{
	    ChromeOptions chromeOptions = new ChromeOptions();
	   // chromeOptions.addArguments("--headless");
	    chromeOptions.addArguments("start-maximized");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
	    return driver;
	    
	}
	
}