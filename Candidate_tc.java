package testCase;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonData.CommonFunctions;
import pageObjectModel.CandidateRegister_pom;

public class Candidate_tc extends CommonFunctions {
	Logger logger=Logger.getLogger(CommonFunctions.class);
	@Test
	public void registercandidate() throws InterruptedException {
		logger.info("Registertion of candidate");
		testcase=extentReport.createTest("Registertion of candidate");
		testcase.log(Status.PASS,"Registering the candidate details");
		PageFactory.initElements(driver,CandidateRegister_pom.class);
		CandidateRegister_pom.CandidateLink.click();
		//driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		CandidateRegister_pom.RegisterCandidate.click();
		CandidateRegister_pom.ResumeTitle.sendKeys("Java Developer");
		CandidateRegister_pom.FirstName.sendKeys("Surya");
		CandidateRegister_pom.LastName.sendKeys("Kumar");
		Select TimeZone=new Select(CandidateRegister_pom.TimeZoneDropdown);
		TimeZone.selectByValue("India");
		CandidateRegister_pom.SkypeId.sendKeys("surya.kumar@123sky");
		CandidateRegister_pom.Mobile.sendKeys("9988776655");
		CandidateRegister_pom.address1.sendKeys("Flat.no:12/123,Green Avenue");
		CandidateRegister_pom.Address2.sendKeys("Ever green cross street");
		CandidateRegister_pom.City.sendKeys("Madurai");
		CandidateRegister_pom.State.sendKeys("Tamilnadu");
		Select Country=new Select(CandidateRegister_pom.SelectCountry);
		Country.selectByIndex(1);
		CandidateRegister_pom.Zipcode.sendKeys("600200");
		CandidateRegister_pom.TcsCheckbox.click();
		CandidateRegister_pom.HpCheckbox.click();
		CandidateRegister_pom.Majorskill1.click();
		CandidateRegister_pom.minorskill1.click();
		CandidateRegister_pom.Majorskill2.click();
		CandidateRegister_pom.Minorskill2.click();
		CandidateRegister_pom.Minorskill3.click();
		CandidateRegister_pom.Education.sendKeys("M.Tech");
		CandidateRegister_pom.DomainExpertise.sendKeys("Artificial Intelligence,Data science");
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		executor5.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(CandidateRegister_pom.RatingSlider, 150, 0).perform();
		CandidateRegister_pom.CurrentCompany.sendKeys("Cognizant");
		CandidateRegister_pom.Awards.sendKeys("Best coding,Team Lead");
		CandidateRegister_pom.Username.sendKeys("vijaymvj110m+201@gmail.com");
		CandidateRegister_pom.PassportNumber.sendKeys("DHTRV765JK");
		Select Experience=new Select(CandidateRegister_pom.Experience);
		Experience.selectByVisibleText("Fresher");
		Select Source=new Select(CandidateRegister_pom.Source);
		Source.selectByVisibleText("Employee Reference");
		CandidateRegister_pom.ReferenceName.sendKeys("Vinay Rahesh");
		CandidateRegister_pom.CurrentCTC.sendKeys("400000");
		CandidateRegister_pom.ExpectedCTC.sendKeys("600000"); 
		Select NoticePeriod=new Select(CandidateRegister_pom.NoticePeriod);
		NoticePeriod.selectByVisibleText("1 Month");
		JavascriptExecutor executor6=(JavascriptExecutor)driver;
		executor6.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		Thread.sleep(1000);
		CandidateRegister_pom.NextButton1.click();
		Thread.sleep(2000);
		testcase.log(Status.PASS,"Candidate registered successfully");
		CandidateRegister_pom.ResumeUpload.sendKeys("C:\\Users\\sveeraraghavan\\Downloads\\QA\\Resume\\AAKASH S K.pdf");
		testcase.log(Status.PASS,"Candidate reume uploaded successfully");
		Thread.sleep(3000);
		CandidateRegister_pom.profilePhoto.sendKeys("C:\\Users\\sveeraraghavan\\Downloads\\QA\\jpg\\Sithsabesh.jpg");
		testcase.log(Status.PASS,"Candidate photo uploaded successfully");
		Thread.sleep(3000);
		CandidateRegister_pom.CertificateUpload.sendKeys("C:\\Users\\sveeraraghavan\\Downloads\\QA\\Certificates\\4ADLB13D34.jpg");
		Thread.sleep(3000);
		CandidateRegister_pom.CertificateUpload.sendKeys("C:\\Users\\sveeraraghavan\\Downloads\\QA\\Certificates\\3H2K51G5G5.jpg");
		testcase.log(Status.PASS,"Candidate certificates uploaded successfully");
		Thread.sleep(3000);
		CandidateRegister_pom.CompleteButton.click();
		Thread.sleep(2000);

	}
}
