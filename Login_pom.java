package pageObjectsModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pom {
	
   @FindBy(id="username")
	public static WebElement username;
   
   @FindBy(id="exampleInputPassword1")
   public static WebElement password;
   
   @FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div/div/div[2]/div/form/div[4]/button")
   public static WebElement getstarted;
}
