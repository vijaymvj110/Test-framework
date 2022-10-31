package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectsModel.Login_pom;

public class CommonDatas {
    public static WebDriver driver=null;
    public static Properties properties=null;
    public static ExtentReports extentReport=null;
    public static ExtentSparkReporter htmlReporter=null;
    public static ExtentTest testcase;
    
    Logger logger= Logger.getLogger(CommonDatas.class);
	public Properties loadpropertyfile() throws IOException {
		
		FileInputStream fileInputStream=new FileInputStream("Config.properties");
		properties=new Properties();
		properties.load(fileInputStream);
		return properties;
	}
	@BeforeSuite
	public void launchBrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Loading the property file");
		loadpropertyfile();
		extentReport= new ExtentReports();
		htmlReporter=new ExtentSparkReporter("ExtentReport.html");
		extentReport.attachReporter(htmlReporter);
		String browser=properties.getProperty("Browser");
		String Url=properties.getProperty("Url");
		
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			logger.info("Launching Chrome browser");
			testcase=extentReport.createTest("Launching Chrome browser");
			testcase.log(Status.PASS,"Chrome browser opened");
			driver =new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			logger.info("Launching Firefox browser");
			testcase=extentReport.createTest("Launching Firefox browser");
			testcase.log(Status.PASS,"Firefox browser opened");
			driver =new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		logger.info("Navigating to application");
		testcase=extentReport.createTest("Navigating to application");	
		testcase.log(Status.PASS,"Login page opened");
		driver.navigate().to(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		/*logger.info("Login to the application");
		  PageFactory.initElements(driver,Login_pom.class);
		 Login_pom.username.sendKeys(properties.getProperty("Username"));
		 Login_pom.password.sendKeys(properties.getProperty("Password"));
		 Login_pom.getstarted.click();
		 testcase.log(Status.PASS,"logged in to VnH application");*/
		 
	}
	@AfterSuite
	public void tearDown() {
		extentReport.flush();
		
	}
}
