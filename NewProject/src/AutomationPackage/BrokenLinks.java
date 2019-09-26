package AutomationPackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BrokenLinks {
    
    private static WebDriver driver = null;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
       
        
        
        driver = new ChromeDriver();
        
 
		
		driver.get("https://www.jdsports.co.uk/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url1=ele.getAttribute("href");
			System.out.println("link number"+i);
			verifyLinkActive(url1);
			
		}
		driver.quit();
		
		Dimension d =new Dimension(100, 200);
		driver.manage().window().setSize(d);
		Point p=new Point(100, 200);
		driver.manage().window().setPosition(p);
		Actions act=new Actions(driver);
		
		
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
		HttpURLConnection httpURLConnect=null;
        try 
        {
           URL url = new URL(linkUrl);
           
           httpURLConnect  =(HttpURLConnection)url.openConnection();
           
           
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
             System.out.println("validLink");
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } 
        catch (Exception e) {
        	
        }
        
    } 

    }

