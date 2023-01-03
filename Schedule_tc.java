package testCase;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonData.CommonFunctions;
import pageObjectModel.Schedule_pom;
public class Schedule_tc extends CommonFunctions{
	Logger logger=Logger.getLogger(CommonFunctions.class);
	@Test
	public void scheduleinterview() throws InterruptedException, AWTException {
		logger.info("Scheduling the interview");
		testcase=extentReport.createTest("Scheduling the interview");
		PageFactory.initElements(driver,Schedule_pom.class);
		Schedule_pom.ScheduleTab.click();
		Thread.sleep(2000);
		Schedule_pom.AddInterview.click();
		Schedule_pom.Jobtitle.sendKeys("Quality Engineer");
		Thread.sleep(3000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	    Select SelectPrelim=new Select(Schedule_pom.RoundSelection);
	    SelectPrelim.selectByIndex(1);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Schedule_pom.NextButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Schedule_pom.AssignCandidateInterviewer.click();
		Schedule_pom.SelectCandidate.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Schedule_pom.NextToInterviewer.click();
		Schedule_pom.SelectInterviewer.click();
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Schedule_pom.NextToInvite.click();
		Schedule_pom.ScheduleTime.sendKeys("01312023104515AM");
		//Schedule_pom.AssignInterview.click();
		
		
		    }		
}
