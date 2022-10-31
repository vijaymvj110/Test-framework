package pageObjectsModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Setting_pom {
	
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div/div[4]/ul/li[2]/a/span")
	public static WebElement SettingTab;
	@FindBy(xpath="//*[@id=\"myTabContent\"]/div/ul/div/li[1]/a")
	public static WebElement OrganizationTab;
	@FindBy(id="add")
	public static WebElement AddOrganization;
	@FindBy(id="organizationId")
	public static WebElement OrganizationName;
	@FindBy(id="addressId")
	public static WebElement Address1;
	@FindBy(id="address1Id")
	public static WebElement Address2;
	@FindBy(id="cityId")
    public static WebElement City;
	@FindBy(id="stateId")
	public static WebElement State;
	@FindBy(id="countryId")
	public static WebElement Country;
	@FindBy(id="zipCodeId")
	public static WebElement Zipcode;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[8]/div[1]/button")
	public static WebElement OrganizationSave;
	@FindBy(xpath="//*[@id=\"myTabContent\"]/div/ul/div/li[2]/a")
	public static WebElement JobCategory;
	@FindBy(id="add")
	public static WebElement AddJobCategoryButton;
	@FindBy(id="jobCategoryId")
	public static WebElement JobCategoryName;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[4]/div[1]/button")
	public static WebElement SaveJobCategory;
	@FindBy(xpath="//*[@id=\"myTabContent\"]/div/ul/div/li[3]/a")
	public static WebElement SkillsTab;
	@FindBy(id="add")
	public static WebElement AddMajorSkills;
	@FindBy(id="skillName")
	public static WebElement MajorSkillName;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div[1]/button")
	public static WebElement MajorSkillSave;
	@FindBy(id="addSubSkill")
	public static WebElement AddSubSkillButton;
	@FindBy(id="selectMajorSkill")
	public static WebElement MajorSkillSelection;
	@FindBy(id="MS-1C51MF2M5K")
	public static WebElement MajorSkillSelected;
	@FindBy(id="subSkillName")
	public static WebElement EnterSubSkill;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div[1]/button")
	public static WebElement SaveSubSkill;
	@FindBy(xpath="//*[@id=\"myTabContent\"]/div/ul/div/li[4]/a")
	public static WebElement QuestionsTab;
	@FindBy(id="add")
	public static WebElement AddQuestionsSet;
	@FindBy(id="organizationId")
	public static WebElement QuestionSetName;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[4]/div[1]/button")
	public static WebElement SaveQuestions;
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/div/table/tbody/tr[1]/td[3]/span[2]/span/i")
	public static WebElement AddQuestionList;
	@FindBy(id="add")
	public static WebElement AddQuestions;
	@FindBy(id="organizationId")
	public static WebElement AddQuestionBankName;
	@FindBy(id="statusId")
	public static WebElement SelectDuration;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[4]/div[1]/button")
	public static WebElement SaveQuestionsList;
	@FindBy(xpath="//*[@id=\"myTabContent\"]/div/ul/div/li[5]/a")
	public static WebElement UsersTab;
	@FindBy(id="add")
	public static WebElement AddUserButton;
	@FindBy(id="firstNameId")
	public static WebElement UserfirstName;
	@FindBy(id="lastNameId")
	public static WebElement UserLastName;
	@FindBy(id="userNameId")
	public static WebElement UserName;
	@FindBy(id="roleId")
	public static WebElement UserRole;
	@FindBy(id="timeZoneId")
	public static WebElement Timezone;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[5]/div[2]/div/div/div/span[1]/span")
	public static WebElement OrganizationForUser;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[5]/div[2]/div/div/div[2]/div/ul/li[1]/label/span/input")
	public static WebElement SelectHP;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[5]/div[2]/div/div/div[2]/div/ul/li[2]/label/span/input")
	public static WebElement SelectTCS;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[5]/div[2]/div/div/div/span[1]")
	public static WebElement OrganizationForUser2;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[8]/div[1]/button")
	public static WebElement SaveUser;
}

