package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
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
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get(properties.getProperty("URL"));
				System.out.println("Starting Web Browser.........");
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				((JavascriptExecutor) driver).executeScript("window.stop();");
			} catch (Exception e) {
				System.out.println("Website loading infinitely");
			}
		}

		if (browser.equals("firefox")) {
			try {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get(properties.getProperty("URL"));
				System.out.println("Starting Web Browser.........");
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				((JavascriptExecutor) driver).executeScript("window.stop();");
			} catch (Exception e) {
				System.out.println("Website loading infinitely");
			}
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
