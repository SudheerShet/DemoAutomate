package commonutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DriverConfig {

public static  WebDriver driver;

/*public static WebDriver getInstance()
{
	if(driver==null)
	{
		driver=new WebDriver();
	}
	return driver;
	
}*/



	static public void openBrowse(String browserName)
	{
		if(driver==null)
		{
		switch(browserName)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "E:\\Software\\selenium web driver and jar files\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-infobars");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		//	driver.get("http://demo.automationtesting.in/Register.html");
			break;
			
		case "ie" :
			break;
		}
		Reports.intialiseconfig();	
	}
	
	}
	
}

