package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDualDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.driver.Chrome", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jdsports.co.uk");
		WebElement searchtext=driver.findElement(By.id("srchInput"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='adidas'", searchtext);
		
	}

}
