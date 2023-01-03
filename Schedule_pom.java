package pageObjectModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
	@FindBy(xpath="//*[@id=\"d4e9d825-d7ab-4ea7-8a79-944dcead719e\"]")
	public static WebElement SelectCandidate;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[2]/button")
	public static WebElement NextToInterviewer;
	@FindBy(xpath="//*[@id=\"0f9b253c-8301-4149-ad06-3dce79a620f2\"]")
	public static WebElement SelectInterviewer;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[2]/button[2]")
	public static WebElement NextToInvite;
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/div/div[2]/div/div/input")
	public static WebElement ScheduleTime;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/form/div/div[2]/div/button[2]")
	public static WebElement AssignInterview;
}
