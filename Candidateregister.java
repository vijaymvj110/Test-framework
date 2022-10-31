package testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonDatas;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectsModel.CandidateRegister_pom;

public class Candidateregister extends CommonDatas {
	Logger logger=Logger.getLogger(CommonDatas.class);
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
		CandidateRegister_pom.SkypeId.sendKeys("asdf12345qwedq12");
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
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(CandidateRegister_pom.RatingSlider, 150, 0).perform();
		CandidateRegister_pom.CurrentCompany.sendKeys("Cognizant");
		CandidateRegister_pom.Awards.sendKeys("Best coding,Team Lead");
		CandidateRegister_pom.Username.sendKeys("vijaymvj110m+201@gmail.com");
		CandidateRegister_pom.PassportNumber.sendKeys("12345abcde45");
		Select Experience=new Select(CandidateRegister_pom.Experience);
		Experience.selectByVisibleText("Fresher");
		Select Source=new Select(CandidateRegister_pom.Source);
		Source.selectByVisibleText("Employee Reference");
		CandidateRegister_pom.ReferenceName.sendKeys("Vinay Rahesh");
		CandidateRegister_pom.CurrentCTC.sendKeys("400000");
		CandidateRegister_pom.ExpectedCTC.sendKeys("600000"); 
		Select NoticePeriod=new Select(CandidateRegister_pom.NoticePeriod);
		NoticePeriod.selectByVisibleText("1 Month");
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		executor5.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		Thread.sleep(1000);
		CandidateRegister_pom.NextButton1.click();
		Thread.sleep(2000);
		testcase.log(Status.PASS,"Candidate registered successfully");
		CandidateRegister_pom.ResumeUpload.sendKeys("C:\\Users\\USER\\Downloads\\Testing\\L54FKK2BLM.pdf");
		testcase.log(Status.PASS,"Candidate reume uploaded succesfully");
		Thread.sleep(4000);
		CandidateRegister_pom.profilePhoto.sendKeys("C:\\Users\\USER\\Downloads\\Testing\\32N5AA1MJ5.jpeg");
		testcase.log(Status.PASS,"Candidate photo uploaded succesfully");
		Thread.sleep(4000);
		CandidateRegister_pom.CertificateUpload.sendKeys("C:\\Users\\USER\\Downloads\\Testing\\4B32JALI3L.jpeg");
		CandidateRegister_pom.profilePhoto.sendKeys("C:\\Users\\USER\\Downloads\\Testing\\32N5AA1MJ5.jpeg");
		Thread.sleep(4000);
		CandidateRegister_pom.CertificateUpload.sendKeys("C:\\Users\\USER\\Downloads\\Testing\\E5I2BK3AKC.jpg");
		Thread.sleep(4000);
		CandidateRegister_pom.CertificateUpload.sendKeys("C:\\Users\\USER\\Downloads\\Testing\\CHJB1GAK2E.jpg");
		testcase.log(Status.PASS,"Candidate certificates uploaded succesfully");
		Thread.sleep(3000);
		CandidateRegister_pom.CompleteButton.click();
		Thread.sleep(2000);

	}
}
