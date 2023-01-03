package pageObjectModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobRegister_pom {
	@FindBy(xpath="/html/body/div/div[1]/nav/div/ul/div/li[1]/a")
	public static WebElement JobLink;
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div[1]/div[1]/nav[2]/div/ul/li[1]/span")
	public static WebElement RegisterJob;
	@FindBy(id="companyName")
	public static WebElement JobTitle;
	@FindBy(id="size")
	public static WebElement SelectOrganization;
	@FindBy(id="jobCategory")
	public static WebElement JobCategoryDropdown;
	@FindBy(id="Type")
	public static WebElement EmploymentType;
	@FindBy(id="Priority")
	public static WebElement Priority;
	@FindBy(id="level")
	public static WebElement LevelDropdown;
	@FindBy(id="experience")
	public static WebElement ExperienceDropdown;
	@FindBy(id="currency")
	public static WebElement Currency;
	@FindBy(name="min")
	public static WebElement MinimumCompensation;
	@FindBy(name="max")
	public static WebElement MaximumCompensation;
	@FindBy(id="MS-HL4FCN2353")
	public static WebElement MajorSkillCheckbox1;
	@FindBy(id="MS-1F2I25KHHK")
	public static WebElement MajorSkillCheckbox2;
	@FindBy(id="SS-52C5F4JE5J")
	public static WebElement SubSkillCheckbox1;
	@FindBy(id="SS-HEI3C2L55E")
	public static WebElement SubSkillCheckbox2;
	@FindBy(id="vacancy")
	public static WebElement Vacancy;
	@FindBy(xpath="//*[@id=\"reg-input\"]/form/div[5]/div/div/div/div/textarea")
	public static WebElement Description;
	@FindBy(xpath="//*[@id=\"reg-input\"]/form/div[6]/div/div/div/textarea")
	public static WebElement Responsibilities;
	@FindBy(xpath="//*[@id=\"reg-input\"]/form/div[7]/div/div/button[2]")
	public static WebElement NextButton;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/span")
	public static WebElement RoundDropdown1;
	@FindBy(id="Preliminary")
	public static WebElement PreliminaryRound;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div/div/div/div/div/div[3]/div/span/div/div/span[1]")
	public static WebElement SelectPreliminaryQuestion;
	@FindBy(id="questionTitleId")
	public static WebElement QuestionDropdown;
	@FindBy(id="questionTitleId")
	public static WebElement QuestionSet;
	@FindBy(id="f51d96f2-4943-41fb-90bb-e12aace889e4")
	public static WebElement QuestionSelection1;
	@FindBy(id="0c06d64c-cb93-4bb3-9ef8-0ae1dd186d3a")
	public static WebElement QuestionSelection2;
	@FindBy(id="10c73eb6-448c-49e3-9892-f3a3e344c59f")
	public static WebElement QuestionSelection3;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div/div/div/div/div/div[1]/div[2]/div[2]/button")
	public static WebElement Question1Save;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/span")
	public static WebElement PrelimCreationPopup;
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/span/button")
	public static WebElement AddNewRound1;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/span")
	public static WebElement Round2;
	@FindBy(id="Technical")
	public static WebElement Technical;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/span")
	public static WebElement TechHoursdDropdown;
	@FindBy(id="1 Hr")
	public static WebElement TechHoursSelection;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/div/span")
	public static WebElement TechMinutesDropdown;
	@FindBy(id="25 Minutes")
	public static WebElement TechMinutesSelection;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/button")
	public static WebElement TechnicalSave;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/span")
	public static WebElement TechSavePopup;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[1]/div[2]/span/button")
	public static WebElement AddRound3;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/span")
	public static WebElement SelectRound3;
	@FindBy(id="Technical Exercise")
	public static WebElement SelectExercise;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/span")
	public static WebElement SelectDaysdDropdown;
	@FindBy(id="1 Day")
	public static WebElement SelectDays;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/span/span")
	public static WebElement UploadProblemLink;
	@FindBy(name="photo")
	public static WebElement BrowseProblem;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/button")
	public static WebElement ExerciseSave;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/span")
	public static WebElement ExerciseSavePopup;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[1]/div[2]/span/button")
	public static WebElement AddNewRound3;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/span")
	public static WebElement SelectRound4;
	@FindBy(id="Managerial")
	public static WebElement Managerial;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/span")
	public static WebElement ManagerialHrsSelection;
	@FindBy(id="2 Hrs")
	public static WebElement Select2Hrs;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/div/span")
	public static WebElement ManagerialMinutesSelection;
	@FindBy(id="20 Minutes")
	public static WebElement Minutes20;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/button")
	public static WebElement ManagerialSave;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/span")
	public static WebElement ManagerialSavePopup;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[1]/div[2]/span/button")
	public static WebElement AddNewRound5;
	@FindBy(xpath = "//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[1]/div/span")
	public static WebElement SelectHRRoundType;
	@FindBy(id="HR")
	public static WebElement HRRound;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/span")
	public static WebElement SelectHRHrs;
	@FindBy(id="3 Hrs")
	public static WebElement HR3Hrs;
	@FindBy(xpath = "//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/button")
	public static WebElement SaveHRRound;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/span")
	public static WebElement HRSavedPopup;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[1]/div[2]/span/button")
	public static WebElement AddNewRound6;
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/fieldset/input[2]")
	public static WebElement AutoRoundRadio;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/span")
	public static WebElement SelectRoundAuto;
	@FindBy(id="Technical")
	public static WebElement AutoTechnical;
	@FindBy(xpath = "//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[2]/div/span")
	public static WebElement MinutesDuration;
	@FindBy(id="40 Minutes")
	public static WebElement AutoMinutesSelection;
	@FindBy(xpath="//*[@id=\"reg-input\"]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/button")
	public static WebElement AutoTechnicalSave;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/span")
	public static WebElement AutoTechSavePopup;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[4]/div/div/button[2]")
	public static WebElement Next1;
	@FindBy(id="0f9b253c-8301-4149-ad06-3dce79a620f2")
	public static WebElement InterviewPanel1;
	@FindBy(id="8dba21ec-07d3-4595-9202-a0930c4a7c8a")
	public static WebElement InterviewPanel2;
	@FindBy(id="b47dbce6-9985-4054-a5db-76452d30fbd2")
	public static WebElement InterviewPanel3;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[3]/div/button[2]")
	public static WebElement CompleteButton;

}
