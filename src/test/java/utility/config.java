package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class config {
	
	WebDriver driver;
	Properties properties = new Properties();

	public WebDriver launchingChromeBrowser()
	{
		propertyReader();
		long timeouts = Long.parseLong(properties.getProperty("Wait"));
		
		String browser = properties.getProperty("browser");
	
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
			driver.manage().window().maximize();
//			driver.get(properties.getProperty("URL"));
			driver.navigate().to(properties.getProperty("URL"));
			System.out.println("Starting Web Browser.........");
		}
		
		return driver;

	}
	
	public void propertyReader() {
        
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/rahulhandoo/eclipse-workspace/TendableTechChallenge/src/test/java/config/configuration.properties");
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
