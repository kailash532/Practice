/*package AutomationPackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_Setup {
	
	
 @Before
	public  void setUp() throws MalformedURLException, InterruptedException{
	 System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
 		String nodeurl = "http://192.168.56.1:4444/wb/hub";
 		DesiredCapabilities cap = DesiredCapabilities.chrome();
 		cap.setBrowserName("chrome");
 		cap.setPlatform(Platform.WIN10);
 		driver = new RemoteWebDriver(new URL(nodeurl), cap);
 		System.out.println("launching chrome browser"); 
 		
	      
	}
 
 		 @Test
 		  public void verifyHomepageTitle() throws InterruptedException, MalformedURLException{
 	 		String baseurl = "https://www.jdsports.co.uk/";
 	 		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
 	 		String nodeurl = "http://192.168.56.1:4444/wb/hub";
 	 		WebDriver driver;
 	 		ChromeOptions cap=new ChromeOptions();
 	 		
 	 		
 	 		driver=new RemoteWebDriver(new URL(nodeurl),cap);
 	 		
 	 		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 		      
 		      driver.get(baseurl);
 		      
 		      driver.quit();
 		      
 	}		
 			
 		 
 	
}*/