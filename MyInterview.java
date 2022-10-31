package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import commonFunctions.CommonDatas;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyInterview {
	Logger logger=Logger.getLogger(CommonDatas.class);
  @Test
	public void myinterviewvalidation() throws InterruptedException {
	  logger.info("My interview page");
	  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://dev.viewandhire.com");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("vijay110m@gmail.com");
		WebElement password = driver.findElement(By.id("exampleInputPassword1"));
		password.sendKeys("pass@123");
		WebElement getstarted=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/form/div[4]/button"));
		getstarted.click();
		WebElement myinterviewtab=driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a"));
		myinterviewtab.click();
		
		/*
		 * 
		 * WebElement reviewicon = driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[9]/span/i[1]"
		 * )); reviewicon.click();
		 * 
		 * WebElement notestext = driver.findElement(By.id("textArea")); notestext.
		 * sendKeys("Overall performance is good.He is eligible for next round of interview.Better communication skills"
		 * );
		 * 
		 * WebElement goodicon = driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div[2]/div/div/div/div[4]/div[4]/div[2]/div[2]/div[1]/div[1]/button/img"
		 * )); goodicon.click();
		 * 
		 * WebElement saveandcomplete = driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div[2]/div/div/div/div[4]/div[4]/div[2]/div[2]/div[2]/div/button"
		 * )); saveandcomplete.click(); Thread.sleep(3000); WebElement
		 * prelimcompletepopup =
		 * driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/p"));
		 * prelimcompletepopup.click();
		 */
		
		WebElement techplayicon = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[9]/span/i[1]"));
		techplayicon.click();
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div[4]/div[4]/div[2]/div[1]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div/span/div"));
		Actions move = new Actions(driver);
		Action action =move.dragAndDropBy(slider, 170, 0).build();
		action.perform();
		
		WebElement slider1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div[4]/div[4]/div[2]/div[1]/div[1]/div[1]/div[4]/div/div[2]/div/div[1]/div/div/span/div"));
		Actions move1 = new Actions(driver);
		Action action1 =move1.dragAndDropBy(slider1, 170, 0).build();
		action1.perform();
		
		WebElement domainskill=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div[4]/div[4]/div[2]/div[1]/div[1]/div[2]/div[3]/div/div[1]/input"));
		domainskill.sendKeys("core java");
		
		WebElement slider2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div[4]/div[4]/div[2]/div[1]/div[1]/div[2]/div[3]/div/div[2]/div/div[1]/div/div/span/div"));
		Actions move2 = new Actions(driver);
		Action action2 =move2.dragAndDropBy(slider2, 170, 0).build();
		action2.perform();
	
		WebElement technotes = driver.findElement(By.id("textArea"));
		technotes.sendKeys("Overall performance is good.Selected for next round of interview");
		
		WebElement average = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div[4]/div[4]/div[2]/div[2]/div[1]/div[2]/button/img"));
		average.click();
		
		WebElement techsave = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div[4]/div[4]/div[2]/div[2]/div[2]/div/button[1]"));
		techsave.click();
		
		WebElement techcomplete = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div[4]/div[4]/div[2]/div[2]/div[2]/div/button[2]"));
		techcomplete.click();
	}
}
