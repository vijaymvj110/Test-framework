package pageObjectsModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CandidateRegister_pom {

	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/div/li[2]/a")
	public static WebElement CandidateLink;
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div[1]/div[1]/nav[2]/div/ul/li[1]/a")
	public static WebElement RegisterCandidate;
	@FindBy(id="resumeTitle")
	public static WebElement ResumeTitle;
	@FindBy(id="firstName")
	public static WebElement FirstName;
	@FindBy(id="lastName")
	public static WebElement LastName;
	@FindBy(id="timeZone")
	public static WebElement TimeZoneDropdown;
	@FindBy(id="skypeId")
	public static WebElement SkypeId;
	@FindBy(id="mobile")
	public static WebElement Mobile;
	@FindBy(id="address")
	public static WebElement address1;
	@FindBy(id="street")
	public static WebElement Address2;
	@FindBy(id="city")
	public static WebElement City;
	@FindBy(id="state")
	public static WebElement State;
	@FindBy(id="country")
	public static WebElement SelectCountry;
	@FindBy(id="zipCode")
	public static WebElement Zipcode;
	@FindBy(id="CO-A1ACI3K334")
	public static WebElement TcsCheckbox;
	@FindBy(id="CO-NNKIALEMGM")
	public static WebElement HpCheckbox;
	@FindBy(id="MS-1C51MF2M5K")
	public static WebElement Majorskill1;
	@FindBy(id="SS-5I1J514HJ5")
	public static WebElement minorskill1;
	@FindBy(id="MS-A4311F2KL3")
	public static WebElement Majorskill2;
	@FindBy(id="SS-AAFL3C35HJ")
	public static WebElement Minorskill2;
	@FindBy(id="SS-144ML3C324")
	public static WebElement Minorskill3;
	@FindBy(id="education")
	public static WebElement Education;
	@FindBy(id="domainExpertise")
	public static WebElement DomainExpertise;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/form/div[6]/div[3]/div/div/span/span[3]")
	public static WebElement RatingSlider;
	@FindBy(id="workingCompany")
	public static WebElement CurrentCompany;
	@FindBy(id="awards")
	public static WebElement Awards;
	@FindBy(id="eziEmailId")
	public static WebElement Username;
	@FindBy(id="passportNumber")
	public static WebElement PassportNumber;
	@FindBy(id="noOfYearsExp")
	public static WebElement Experience;
	@FindBy(id="source")
	public static WebElement Source;
	@FindBy(id="Employee Reference")
	public static WebElement EmployeeReference;
	@FindBy(id="referredBy")
	public static WebElement ReferenceName;
	@FindBy(id="currentCTC")
	public static WebElement CurrentCTC;
	@FindBy(id="expectedCTC")
	public static WebElement ExpectedCTC;
	@FindBy(id="noticePeriod")
	public static WebElement NoticePeriod;
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/form/div[10]/div/form/button[2]")
	public static WebElement NextButton1;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/div[1]/div[1]/div/div/div/div/div[3]/div/div/span/input")
	public static WebElement ResumeUpload;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div/div[3]/div/div/span/input")
	public static WebElement profilePhoto;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[3]/div/div/span/input")
	public static WebElement CertificateUpload;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/div[3]/div/button[2]")
	public static WebElement CompleteButton;
	
}
