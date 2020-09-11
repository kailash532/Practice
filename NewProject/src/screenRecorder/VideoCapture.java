package screenRecorder;

import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import static org.monte.media.FormatKeys.MIME_AVI;
import static org.monte.media.FormatKeys.MediaTypeKey;
import static org.monte.media.FormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.CompressorNameKey;
import static org.monte.media.VideoFormatKeys.DepthKey;
import static org.monte.media.VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE;
import static org.monte.media.VideoFormatKeys.QualityKey;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoCapture {
	private static ScreenRecorder screenRecorder;
	private static String fileSeperator = System.getProperty("file.separator");
	public static void startVideoCapture()
	{
		try
		{ 	
			
				GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
				int width = gd.getDisplayMode().getWidth();
				int height = gd.getDisplayMode().getHeight();
				java.awt.Rectangle captureArea = new java.awt.Rectangle(width,height);
				GraphicsConfiguration gc = GraphicsEnvironment
		            .getLocalGraphicsEnvironment()
		            .getDefaultScreenDevice()
		            .getDefaultConfiguration();
//				File mediaFolder = new File("C:\\hataf\\source\\TestLogs\\videos");   
				File mediaFolder = new File(System.getProperty("user.dir")+"/TestLogs/videos/"); 
				screenRecorder = new ScreenRecorder(gc,captureArea,
					       new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
					       new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
					            CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
					            DepthKey, 24, FrameRateKey, Rational.valueOf(15),
					            QualityKey, 1.0f,
					            KeyFrameIntervalKey, 15 * 60),
					       new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
					            FrameRateKey, Rational.valueOf(30)),
					      null,mediaFolder);
			    screenRecorder.start();
			
		}
		
		catch(Exception e)
		{
			
		} 	
	}
	
	public static String stopVideoCapture(String sVideoFileName)
	{
		String videofilepath = null;
		try
		{
			
				screenRecorder.stop();
				videofilepath =  renameCapturedVideoFile(sVideoFileName);
			
		}
	
		catch(Exception e)
		{
			
		}
		return videofilepath;
	}
	
	public static String renameCapturedVideoFile(String sVideoFileName)
	{
		String videofilepath = null;
		try
		{
//			File mediaFolder=new File("C:\\hataf\\source\\TestLogs\\videos");
			File mediaFolder=new File(System.getProperty("user.dir")+"/TestLogs/videos/");
			File[] files = mediaFolder.listFiles();
		    Arrays.sort(files, new Comparator<Object>()
		    {
		    public int compare(Object o1, Object o2) 
		    {
		    	//return new Long(((File)o1).lastModified()).compareTo(new Long(((File)o2).lastModified())); // for ascending order
		    	return -1*(new Long(((File)o1).lastModified()).compareTo(new Long(((File)o2).lastModified()))); //for descending order 
		    }
		    });
//		    File oldfile = new File("C:\\hataf\\source\\TestLogs\\videos"+fileSeperator+files[0].getName());
		    File oldfile = new File(System.getProperty("user.dir")+"/TestLogs/videos/"+fileSeperator+files[0].getName());
		    File newfile = null;
//		    if(!new File("C:\\hataf\\source\\TestLogs\\videos"+fileSeperator+sVideoFileName+".avi").exists())
		    if(!new File(System.getProperty("user.dir")+"/TestLogs/videos/"+fileSeperator+sVideoFileName+".mp4").exists())
		    {
//		    	newfile = new File("C:\\hataf\\source\\TestLogs\\videos"+fileSeperator+sVideoFileName+".avi");
		    	newfile = new File(System.getProperty("user.dir")+"/TestLogs/videos/"+fileSeperator+sVideoFileName+".mp4");
		    	System.out.println(newfile.getAbsolutePath());
		    	videofilepath = newfile.getAbsolutePath();
		    }
		    else
		    {

		    	Date date = new Date() ;
		    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
//		    	newfile = new File("C:\\hataf\\source\\TestLogs\\videos"+fileSeperator+sVideoFileName+"(1).avi");
		    	newfile = new File(System.getProperty("user.dir")+"/TestLogs/videos/"+fileSeperator+sVideoFileName+dateFormat.format(date)+".mp4");
		    	System.out.println(newfile.getAbsolutePath());
		    	videofilepath = newfile.getAbsolutePath();
		    }
		    boolean isFileRenamed = oldfile.renameTo(newfile);
		    if(!isFileRenamed)
		    {
		    	
		    }
		    
		}
		catch(Exception e)
		{
			
		}
		
		return videofilepath;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\AutomationFramework_gradle\\hataf\\source\\Lib\\chromedriver.exe");
		VideoCapture vc=new VideoCapture();
		WebDriver driver =new ChromeDriver();
		vc.startVideoCapture();
		driver.get("https://www.google.com");
		
		vc.stopVideoCapture(System.getProperty("user.dir")+"/TestLogs/videos/");
		driver.quit();
	}

}
