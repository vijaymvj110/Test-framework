package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pom {

	@FindBy(id="username")
	public static WebElement username;
   
   @FindBy(id="exampleInputPassword1")
   public static WebElement password;
   
   @FindBy(xpath="//button[@type=\"submit\"]")
   public static WebElement getstarted;
}
