package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonDatas;
import pageObjectsModel.Setting_pom;

public class Setting extends CommonDatas {
	Logger logger=Logger.getLogger(CommonDatas.class);
    @Test(priority = 1)
	public void OrganizationRegister() throws InterruptedException {
    	logger.info("Registeration of organization");
    	testcase=extentReport.createTest("Open the Organization register");
    	PageFactory.initElements(driver, Setting_pom.class);
    	Setting_pom.SettingTab.click();
    	Setting_pom.OrganizationTab.click();
    	Setting_pom.AddOrganization.click();
    	Setting_pom.OrganizationName.sendKeys("JeanMartin Madurai");
    	Setting_pom.Address1.sendKeys("8 th cross street,ganapathy Avenue");
    	Setting_pom.Address2.sendKeys("Gomathiyapuram");
    	Setting_pom.City.sendKeys("Madurai");
    	Setting_pom.State.sendKeys("Tamilnadu");
    	Select select=new Select(Setting_pom.Country);
    	select.selectByIndex(1);
    	Setting_pom.Zipcode.sendKeys("600500");
    	Setting_pom.OrganizationSave.click();
    	testcase.log(Status.PASS,"Organization registered succesfully");
    	Thread.sleep(2000);
	}
    @Test(priority = 2)
     public void JobCategoryRegister() throws InterruptedException {
    	logger.info("Registeration of job category");
    	testcase=extentReport.createTest("Open the Job category register");
    	PageFactory.initElements(driver, Setting_pom.class);
    	 Setting_pom.JobCategory.click();
    	 Setting_pom.AddJobCategoryButton.click();
    	 Setting_pom.JobCategoryName.sendKeys("Web Technologies");
    	 Thread.sleep(2000);
    	 Setting_pom.SaveJobCategory.click();
    	 testcase.log(Status.PASS,"Job category registered succesfully");
    	 Thread.sleep(2000);
     }
    @Test(priority = 3)
     public void Skills() throws InterruptedException {
    	logger.info("Registeration of major and sub skills");
    	testcase=extentReport.createTest("Open the Skill register");
    	PageFactory.initElements(driver, Setting_pom.class);
   Setting_pom.SkillsTab.click();
   Setting_pom.AddMajorSkills.click();
   Setting_pom.MajorSkillName.sendKeys("Automation Testing");
   Setting_pom.MajorSkillSave.click();
   Setting_pom.AddSubSkillButton.click();
   Setting_pom.MajorSkillSelection.click();
   Setting_pom.MajorSkillSelected.click();
   Setting_pom.EnterSubSkill.sendKeys("MS SQL");
   Setting_pom.SaveSubSkill.click();
   testcase.log(Status.PASS,"Major and minor Skills registered succesfully");
   Thread.sleep(2000);
     }
    @Test(priority = 4)
    public void QuestionsBank() throws InterruptedException {
    	logger.info("Registeration of question set and Questions");
    	testcase=extentReport.createTest("Open the Questions register");
    	PageFactory.initElements(driver, Setting_pom.class);
    	Setting_pom.QuestionsTab.click();
    	Setting_pom.AddQuestionsSet.click();
    	Setting_pom.QuestionSetName.sendKeys("Automation Testing");
    	Setting_pom.SaveQuestions.click();
    	Thread.sleep(2000);
    	Setting_pom.AddQuestionList.click();
    	Thread.sleep(2000);
    	Setting_pom.AddQuestions.click();
    	Setting_pom.AddQuestionBankName.sendKeys("Selenium");
    	Select SelectDuration=new Select(Setting_pom.SelectDuration);
    	SelectDuration.selectByVisibleText("3 Minutes");
    	Setting_pom.SaveQuestionsList.click();
    	testcase.log(Status.PASS,"Questions & questions set registered succesfully");
    	Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void Users() {
    	logger.info("Registeration of user");
    	testcase=extentReport.createTest("Open the User register");
    	PageFactory.initElements(driver, Setting_pom.class);
    	Setting_pom.UsersTab.click();
    	Setting_pom.AddUserButton.click();
    	Setting_pom.UserfirstName.sendKeys("Kavin");
    	Setting_pom.UserLastName.sendKeys("kumar");
    	Setting_pom.UserName.sendKeys("vijaymvj110m25@gmail.com");
    	Select SelectRole=new Select(Setting_pom.UserRole);
    	SelectRole.selectByValue("HR");
    	Select SelectTimezone=new Select(Setting_pom.Timezone);
    	SelectTimezone.selectByIndex(1);
    	Setting_pom.OrganizationForUser.click();
    	Setting_pom.SelectHP.click();
    	Setting_pom.SelectTCS.click();
    	Setting_pom.OrganizationForUser2.click();
    	Setting_pom.SaveUser.click();
    	testcase.log(Status.PASS,"User created successfully");
    	
   
    }
}
