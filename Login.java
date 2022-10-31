package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.google.common.annotations.VisibleForTesting;

import commonFunctions.CommonDatas;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectsModel.Login_pom;

public class Login extends CommonDatas{
	
	Logger logger=Logger.getLogger(CommonDatas.class);
@Test
public void loginPage() {
	logger.info("Login to the application");
	testcase=extentReport.createTest("Login to the application");
	PageFactory.initElements(driver,Login_pom.class);
	Login_pom.username.sendKeys(properties.getProperty("Username"));
	Login_pom.password.sendKeys(properties.getProperty("Password"));
	Login_pom.getstarted.click();
	testcase.log(Status.PASS,"Login to VnH successfully");
}
	

	
	
}
