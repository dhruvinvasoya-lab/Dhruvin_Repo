import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class customscriptw {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void customscriptw() {
		tg.openBrowser();
				tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		START_CUSTOM_SCRIPT;
		try {
		WebElement DemoAutomationLogo = ( WebElement ) driver.findElement(By.xpath("//h1[normalize-space()='Automation Demo Site']"));
		            System.out.println("Automation Demo Site  Logo IS visible.");
		            WebElement firstNameElememt = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		            if(firstNameElememt.isDisplayed())
		            {
		                firstNameElememt.click();
		                System.out.println("Clicked on first Name successfully.");
		                Thread.sleep(500);
		                firstNameElememt.sendKeys("IRONMAN");
		                System.out.println("firstName is added on Name Filed.");
		            }
		            WebElement lastNameElement = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		            if(lastNameElement.isDisplayed())
		            {
		                lastNameElement.click();
		                System.out.println("Click on lastName Filed");
		                lastNameElement.sendKeys("J.A.R.V.I.S.");
		                System.out.println("lastName Is Enter Successfully.");
		            }
		            Thread.sleep ( 1500 );
		            WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='Skills']"));
		END_CUSTOM_SCRIPT;
		// Create a new Select object
		START_CUSTOM_SCRIPT;
		            Select dropdown = new Select(dropdownElement);
		END_CUSTOM_SCRIPT;
		// Select an option from the dropdown
		START_CUSTOM_SCRIPT;
		            dropdown.selectByVisibleText("Microsoft Publisher");
		            System.out.println("Select dropdown Successfully.");
		            WebElement userEmail = driver.findElement(By.xpath("//input[@type='email']"));
		            if(userEmail.isDisplayed())
		            {
		                userEmail.click();
		                System.out.println("Clicked on userEmail successfully.");
		                Thread.sleep(1500);
		                userEmail.sendKeys("nptest@gmail.com");
		                System.out.println("Email is added on userEmail Filed.");
		            }
		           WebElement Gender = driver.findElement( By.cssSelector("input[value='Male']"));
		            Gender.click();
		            System.out.println("Check Redio Button On Gender.");
		            Thread.sleep(500);
		            driver.get("https://www.dezlearn.com/nested-iframes-example/");
		            Thread.sleep(500);
		            WebElement SingleIframe = driver.findElement(By.xpath("//iframe[@id='parent_iframe']"));
		            boolean isVisible = SingleIframe.isDisplayed();
		            if (isVisible) {
		                System.out.println("The SingleIframe is visible.");
		END_CUSTOM_SCRIPT;
		} else {
		START_CUSTOM_SCRIPT;
		                System.out.println("The SingleIframe is not visible.");
		            }
		            driver.switchTo().frame("parent_iframe");
		            WebElement Parentiframedriver= driver.findElement(By.xpath("//h4[normalize-space()='Parent iframe']"));
		            if (Parentiframedriver.isDisplayed()) {
		                System.out.println("Switched to iframe successfully");
		END_CUSTOM_SCRIPT;
		} else {
		START_CUSTOM_SCRIPT;
		                System.out.println("Switched to iframe not Work");
		            }
		            driver.switchTo().frame("iframe1");
		                driver.findElement(By.xpath("(//button[contains(text(),'Click')])[1]")).click();
		                System.out.println("Tap on nested iframe Button");
		            WebElement nestediframeclick = driver.findElement(By.xpath("//p[text()[normalize-space()='Hooray..! You clicked the button from iframe 2']]"));
		            if (nestediframeclick.isDisplayed()) {
		                System.out.println("Switched to iframe successfully");
		END_CUSTOM_SCRIPT;
		} else {
		START_CUSTOM_SCRIPT;
		                System.out.println("Switched to iframe not Work");
		            }
		                Thread.sleep(500);
		            driver.switchTo().parentFrame();
		            System.out.println("Switched to parentFrame successfully");
		            WebElement parentiFrame = driver.findElement(By.xpath("//button[text()[normalize-space()='Click Here']]"));
		            isVisible = parentiFrame.isDisplayed();
		            if (isVisible) {
		                System.out.println("The MultipleIframe is visible.");
		END_CUSTOM_SCRIPT;
		} else {
		START_CUSTOM_SCRIPT;
		                System.out.println("The MultipleIframe is not visible.");
		            }
		            driver.findElement(By.xpath("(//button[contains(text(),'Click')])[1]")).click();
		            System.out.println("Tap on parent iframe Button");
		            WebElement parentiframeclick = driver.findElement(By.xpath("//p[text()[normalize-space()='Hooray..! You clicked the button from iframe 1']]"));
		            if (parentiframeclick.isDisplayed()) {
		                System.out.println("Switched to iframe successfully");
		END_CUSTOM_SCRIPT;
		} else {
		START_CUSTOM_SCRIPT;
		                System.out.println("Switched to iframe not Work");
		            }
		            driver.switchTo().defaultContent();
		            WebElement NestediFramesExample = driver.findElement(By.xpath("//h2[normalize-space()='Nested iFrames Example']"));
		            String text = "Nested iFrames Example";
		            if (NestediFramesExample.getText().contains(text)) {
		                System.out.println("Text found in element");
		END_CUSTOM_SCRIPT;
		} else {
		START_CUSTOM_SCRIPT;
		                System.out.println("Text not found in element");
		            }
		 }catch (Exception e){
		    e.printStackTrace();
		} 
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}