package testCase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonData.CommonFunctions;
import pageObjectModel.Login_pom;

public class Login_tc extends CommonFunctions{
	Logger logger=Logger.getLogger(CommonFunctions.class);
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
