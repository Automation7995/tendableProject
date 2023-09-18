package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class config {
	
	WebDriver driver;
	Properties properties = new Properties();
	long timeouts = Long.parseLong(properties.getProperty("Wait"));
	
	@Given("^Browser should launch successfully and user should get navigated to URL.$")
	public WebDriver launchingChromeBrowser()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
		String browser = properties.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(properties.getProperty("URL"));
			System.out.println("Starting Web Browser.........");
		}
		
		return driver;

	}
	
	public void propertyReader() {
        
        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
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
