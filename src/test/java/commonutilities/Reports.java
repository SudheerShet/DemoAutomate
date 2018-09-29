package commonutilities;

import java.io.*;
import java.sql.Driver;
import java.text.*;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.ReporterConfig;

import com.relevantcodes.extentreports.*;

public class Reports {
	
	 public static ExtentReports report;
	 public static ExtentTest logger;  
	       
	 static Calendar cal = Calendar.getInstance();
	 static SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
	public static String projectDirectory = System.getProperty("user.dir");
	public static String ReportLocation=projectDirectory+"\\Utilities\\Report\\CreateOrder"+ sdf.format(cal.getTime())+".html";
	    
	public static void intialiseconfig()
	{
	    report=new ExtentReports(ReportLocation, true);
	    logger=report.startTest("CreateOrder");    
	}

	public static String captureScreenShot(WebDriver driver,String screenshotname)
	{
	    try{
	        TakesScreenshot ts=(TakesScreenshot) driver; 
	        File src=ts.getScreenshotAs(OutputType.FILE);
	        String des=projectDirectory+"\\Utilities\\Report\\Screenshots\\"+screenshotname+".png";
	        File destination =new File(des);
	        FileUtils.copyFile(src, destination);
	        return des;        
	    }
	    catch(Exception e)
	    {
	        System.out.println("Exception while taking screen shot"+e.getMessage());
	        return e.getMessage();
	    }
	    
	}

	public static void PassCase (String ImgDesc,String imagename )
	{
	    String screenshot_path=Reports.captureScreenShot(DriverConfig.driver, imagename);
	    String image= logger.addScreenCapture(screenshot_path);
	    Reports.logger.log(LogStatus.PASS, ImgDesc, image);
	}

	public static void FailCase (String failedDetail,String imagename )
	{
	    String screenshot_path=Reports.captureScreenShot(DriverConfig.driver, imagename);
	    String image= logger.addScreenCapture(screenshot_path);
	    Reports.logger.log(LogStatus.FAIL, failedDetail, image);
	}
	    

}
