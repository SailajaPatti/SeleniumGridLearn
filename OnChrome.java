package SeleniumGrid.ParallelExcByGrid;

import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class OnChrome {
	
	@Test
	public void getTitle() throws MalformedURLException ,SocketTimeoutException {
		ChromeOptions options=new ChromeOptions();
		ChromeOptions.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(options);
		DesiredCapabilities caps=new DesiredCapabilities();
		
		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		WebDriver driver1=new RemoteWebDriver(new URL ("http://172.25.120.223/25:4444") , caps);
		driver1.get("https://www.google.com");
		System.out.println(driver1.getTitle());
		
	}

}
