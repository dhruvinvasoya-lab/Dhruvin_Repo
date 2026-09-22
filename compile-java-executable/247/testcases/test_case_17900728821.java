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
public class test_case_17900728821 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_17900728821() {
		tg.openBrowser();
		tg.check.isVisible("ele_Registertextele40103033174948");
		tg.type("ele_FirstNameele59103301550297", "John");
		tg.type("ele_LastNameele60103301550297", "Doe");
		tg.type("ele_Emailaddressele63103301550297", "john.doe@test.com");
		tg.type("ele_Phoneele66103301550297", "9876543210");
		tg.click("ele_Maleele69103301550297", 1);
		tg.click("ele_Cricketele73103301550297", 1);
		tg.click("ele_Englishlanguageele87103301550297", 1);
		tg.click("ele_Hindilanguageele95103301550297", 1);
		tg.selectDropdownByValue("ele_Skillsele200103301550297","Java");
		tg.selectDropdownByValue("ele_Skillsele200103301550297","India");
		tg.selectDropdownByValue("ele_Yearele216103301550297","1995");
		tg.selectDropdownByValue("ele_Monthele317103301550297","May");
		tg.type("ele_Passwordele363103301550297", "Password@123");
		tg.type("ele_ConfirmPasswordele365103301550297", "Password@123");
		tg.type("ele_ProfilePictureele369103301550297", "profile.jpg");
		tg.click("ele_Submitele366103301550297", 1);
		tg.close();
	}
}