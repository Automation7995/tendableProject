package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class config {

	WebDriver driver;
	Properties properties = new Properties();

	public WebDriver launchingChromeBrowser() {
		propertyReader();
		long timeouts = Long.parseLong(properties.getProperty("Wait"));

		String browser = properties.getProperty("browser");

		if (browser.equals("chrome")) {

			try {
				WebDriverManager.chromedriver().setup();
				
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, PageLoadStrategy.NONE);
				
				driver = new ChromeDriver(chromeOptions);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
				driver.manage().window().maximize();
				driver.get(properties.getProperty("URL"));
				System.out.println("Starting Web Browser.........");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(e);
			}
		}

		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
			driver.manage().window().maximize();
			driver.get(properties.getProperty("URL"));
			System.out.println("Starting Web Browser.........");
		}
		return driver;

	}

	public void propertyReader() {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"/Users/rahulhandoo/eclipse-workspace/TendableTechChallenge/src/test/java/config/configuration.properties");
			properties.load(fileInputStream);
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void closeBrowser() {
		driver.quit();
	}

}
