package testCase;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonData.CommonFunctions;
import pageObjectModel.JobRegister_pom;

public class job_tc extends CommonFunctions{
	Logger logger=Logger.getLogger(CommonFunctions.class);
	@Test
	public void registerjob() throws InterruptedException, AWTException {
		logger.info("Registeration of job");
		testcase=extentReport.createTest("Registeration of job");		
		PageFactory.initElements(driver,JobRegister_pom.class);
		JobRegister_pom.JobLink.click();
		Thread.sleep(2000);
		JobRegister_pom.RegisterJob.click();
		JobRegister_pom.JobTitle.sendKeys("Quality Engineer");
		Select SelectOrganization=new Select(JobRegister_pom.SelectOrganization);
		SelectOrganization.selectByIndex(4);
		Select JobCategoryDropdown=new Select(JobRegister_pom.JobCategoryDropdown);
		JobCategoryDropdown.selectByValue("IT/Software");
		Select EmploymentType=new Select(JobRegister_pom.EmploymentType);
		EmploymentType.selectByVisibleText("Part Time");
		Select Priority=new Select(JobRegister_pom.Priority);
		Priority.selectByVisibleText("High");
		Select LevelDropdown=new Select(JobRegister_pom.LevelDropdown);
		LevelDropdown.selectByIndex(2);
		Select ExperienceDropdown=new Select(JobRegister_pom.ExperienceDropdown);
		ExperienceDropdown.selectByVisibleText("13 - 15 yrs");
		Select Currency=new Select(JobRegister_pom.Currency);
		Currency.selectByValue("IN");
		JobRegister_pom.MinimumCompensation.sendKeys("500000");
		JobRegister_pom.MaximumCompensation.sendKeys("800000");
		JobRegister_pom.MajorSkillCheckbox1.click();
		JobRegister_pom.MajorSkillCheckbox2.click();
		JobRegister_pom.SubSkillCheckbox1.click();
		JobRegister_pom.SubSkillCheckbox2.click();
		JobRegister_pom.Vacancy.sendKeys("45");
		JobRegister_pom.Description.sendKeys("Software Testers are responsible for the quality of software development and deployment. "
				+ "They are involved in performing automated and manual tests to ensure the software created by developers is fit for purpose. "
				+ "Some of the duties include analysis of software, and systems, mitigate risk and prevent software issues.");

		JobRegister_pom.Responsibilities.sendKeys("Analyzing users stories and/use cases/requirements for validity and feasibility."
				+ "collaborate closely with other team members and departments."
				+ "execute all levels of testing (System, Integration, and Regression)"
				+ "Design and develop automation scripts when needed.");
		JobRegister_pom.NextButton.click();
		testcase.log(Status.PASS,"job registered successfully");
		Thread.sleep(2000);
		JobRegister_pom.RoundDropdown1.click();
		JobRegister_pom.PreliminaryRound.click();
		JobRegister_pom.SelectPreliminaryQuestion.click();
		Thread.sleep(1000);
		JobRegister_pom.QuestionDropdown.click();
		Select CommonQuetions=new Select(JobRegister_pom.QuestionSet);
		CommonQuetions.selectByValue("Common Questions");
		JobRegister_pom.QuestionSelection1.click();
		JobRegister_pom.QuestionSelection2.click();
		JobRegister_pom.QuestionSelection3.click();
		JobRegister_pom.Question1Save.click();
		JobRegister_pom.PrelimCreationPopup.click();
		Thread.sleep(1000);
		JobRegister_pom.AddNewRound1.click();
		JobRegister_pom.Round2.click();
		JobRegister_pom.Technical.click();
		JobRegister_pom.TechHoursdDropdown.click();
		JobRegister_pom.TechHoursSelection.click();
		JobRegister_pom.TechMinutesDropdown.click();
		JobRegister_pom.TechMinutesSelection.click();
		JobRegister_pom.TechnicalSave.click();
		JobRegister_pom.TechSavePopup.click();
		Thread.sleep(1000);
		JobRegister_pom.AddRound3.click();
		JobRegister_pom.SelectRound3.click(); 
		JobRegister_pom.SelectExercise.click();
		JobRegister_pom.SelectDaysdDropdown.click();
		JobRegister_pom.SelectDays.click();
		JobRegister_pom.UploadProblemLink.click();
		JobRegister_pom.BrowseProblem.sendKeys(
				"C:\\Users\\sveeraraghavan\\Downloads\\QA\\Exercise\\Technical Exercises_Angular_Question.zip"); 
		Thread.sleep(2000);
		JobRegister_pom.ExerciseSave.click(); 
		JobRegister_pom.ExerciseSavePopup.click();
		Thread.sleep(2000); 
		JobRegister_pom.AddNewRound3.click();
		Thread.sleep(1000);
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		JobRegister_pom.SelectRound4.click();
		JobRegister_pom.Managerial.click();
		JobRegister_pom.ManagerialHrsSelection.click();
		JobRegister_pom.Select2Hrs.click();
		JobRegister_pom.ManagerialMinutesSelection.click();
		Thread.sleep(2000);
		Actions actions1=new Actions(driver);
		actions1.scrollToElement(JobRegister_pom.Minutes20);
		actions1.perform();
		Thread.sleep(2000);
		JobRegister_pom.Minutes20.click(); 
		JobRegister_pom.ManagerialSave.click();
		JobRegister_pom.ManagerialSavePopup.click();
		Thread.sleep(2000);
		JobRegister_pom.AddNewRound5.click();
		Thread.sleep(2000);
		JavascriptExecutor executor2=(JavascriptExecutor)driver;
		executor2.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		Thread.sleep(2000);
		/*
		 * Actions actions2=new Actions(driver);
		 * actions2.scrollToElement(JobRegister_pom.HRRound).perform();
		 * Thread.sleep(2000);
		 */
		JobRegister_pom.SelectHRRoundType.click();
		JobRegister_pom.HRRound.click();
		JobRegister_pom.SelectHRHrs.click(); 
		JobRegister_pom.HR3Hrs.click();
		JobRegister_pom.SaveHRRound.click(); 
		JobRegister_pom.HRSavedPopup.click();
		Thread.sleep(2000);
		JavascriptExecutor executor3=(JavascriptExecutor)driver;
		executor3.executeScript("window.scrollTo(0, -document.body.scrollHeight)", "");
		JobRegister_pom.AddNewRound6.click(); 
		Thread.sleep(1000);
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		Thread.sleep(3000);
		JobRegister_pom.AutoRoundRadio.click();
		JobRegister_pom.SelectRoundAuto.click();
		JobRegister_pom.AutoTechnical.click();
		JobRegister_pom.MinutesDuration.click();
		JobRegister_pom.AutoMinutesSelection.click();
		JobRegister_pom.AutoTechnicalSave.click();
		JobRegister_pom.AutoTechSavePopup.click();
		Thread.sleep(2000);

		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		executor5.executeScript("window.scrollTo(0, document.body.scrollHeight)",""); 
		Thread.sleep(2000);

		JobRegister_pom.Next1.click();
		testcase.log(Status.PASS,"Interview rounds created");
		JobRegister_pom.InterviewPanel1.click();
		JobRegister_pom.InterviewPanel2.click();
		JobRegister_pom.InterviewPanel3.click();
		Thread.sleep(1000);
		JavascriptExecutor executor6=(JavascriptExecutor)driver;
		executor6.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		JobRegister_pom.CompleteButton.click();
		testcase.log(Status.PASS,"Interview panel created for job ");
		Thread.sleep(2000);



		/*
		 * String file="C:\\Users\\USER\\Downloads\\sample-zip-file.zip";
		 * StringSelection selection=new StringSelection(file);
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		 * 
		 * Robot robot=new Robot();
		 *  robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); Thread.sleep(4000);
		 * robot.keyRelease(KeyEvent.VK_V);
		 *  robot.keyRelease(KeyEvent.VK_CONTROL);
		 * Thread.sleep(7000);
		 */


	}
	}
