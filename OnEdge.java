package SeleniumGrid.ParallelExcByGrid;

import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class OnEdge {
	
	@Test
	public void getTitleOfW3Schools() throws MalformedURLException,SocketTimeoutException {
		DesiredCapabilities caps=new DesiredCapabilities();
		//caps.setCapability(CapabilityType.BROWSER_NAME, "msedge");
		caps.setBrowserName("msedge");
		WebDriver driver=new RemoteWebDriver(new URL("http://172.25.120.223/25:4444"), caps);
		driver.get("https://www.w3schools.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
