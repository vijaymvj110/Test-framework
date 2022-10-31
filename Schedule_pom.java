package pageObjectsModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonFunctions.CommonDatas;

public class Schedule_pom {

	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/div/li[3]/a")
	public static WebElement ScheduleTab;
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div[1]/div[1]/div/div[3]/div/div[1]/button/span")
	public static WebElement AddInterview;
	@FindBy(id="jobTitle")
	public static WebElement Jobtitle;
	@FindBy(id="selectRound")
	public static WebElement RoundSelection;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div/div[3]/button")
	public static WebElement NextButton;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/span/span[2]/span")
	public static WebElement AssignCandidateInterviewer;
	@FindBy(id="33de3951-8372-463e-8251-1e2754633422")
	public static WebElement SelectCandidate;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[2]/button")
	public static WebElement NextToInterviewer;
	@FindBy(id="ecf94bf5-0d11-4573-b834-c4dd5294a14e")
	public static WebElement SelectInterviewer;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[2]/button[2]")
	public static WebElement NextToInvite;
	@FindBy(xpath="//*[@id=\"mui-7\"]")
	public static WebElement ScheduleTime;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/form/div/div[2]/div/button[2]")
	public static WebElement AssignInterview;
}
