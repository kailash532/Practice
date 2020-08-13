package Sample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleSeleniumTest {
	static WebDriver driver;
	static WebDriverWait wait;
	public void getCitiesWeatherInfo(List<String> cities) throws InterruptedException {
		int citiesCount=cities.size();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		for(int i=0;i<citiesCount;i++) {
					
			js.executeScript("var el=arguments[0]; setTimeout(function() { el.click(); }, 10);", driver.findElement(By.xpath("//div[@class='cityText'][text()='"+cities.get(i)+"']")));
			
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//div[@class='cityText'][text()='"+cities.get(i)+"']")));
			Thread.sleep(1000);
			js.executeScript("var el=arguments[0]; setTimeout(function() { el.click(); }, 10);", driver.findElement(By.xpath("//a[@href='#close']")));
		}
		
		
		
	}
	
	public void isElementVisibleOnpage(By ele) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ksopparapu\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SampleSeleniumTest sel=new SampleSeleniumTest();
	driver.get("https://social.ndtv.com/static/Weather/report/?pfrom=home-topsubnavigation");
	driver.manage().window().maximize();
	List<WebElement> citiesWebelements=driver.findElements(By.xpath("//div[@class='messages']//div//input"));
	
	int numberOfCities=citiesWebelements.size();
	List<String> selectedCities=new ArrayList<>();
 	for(int i=0;i<numberOfCities;i++) {
		boolean isselected=citiesWebelements.get(i).isSelected();
		if(isselected)
			selectedCities.add(citiesWebelements.get(i).getAttribute("id"));
		else
			System.out.println("default");
		System.out.println(citiesWebelements.get(i).getAttribute("id")+"#########"+isselected);
		
	}
 	sel.getCitiesWeatherInfo(selectedCities);
	

	}

}
