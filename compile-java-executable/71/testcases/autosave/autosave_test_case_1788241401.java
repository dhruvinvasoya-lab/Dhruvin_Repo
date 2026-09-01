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
public class test_case_1788241401 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1788241401() {
		tg.openBrowser();
				tg.wait("ele_FirstName59054454539812", ComparisonType.IS_VISIBLE);
				tg.type("ele_FirstName59054454539812", "John");
				tg.wait("ele_LastName60054454539812", ComparisonType.IS_VISIBLE);
				tg.type("ele_LastName60054454539812", "Doe");
				tg.wait("ele_Emailaddress63054454539812", ComparisonType.IS_VISIBLE);
				tg.type("ele_Emailaddress63054454539812", "john.doe@test.com");
				tg.wait("ele_Phone66054454539812", ComparisonType.IS_VISIBLE);
				tg.type("ele_Phone66054454539812", "9876543210");
				tg.wait("ele_Male69054454539812", ComparisonType.IS_VISIBLE);
				tg.click("ele_Male69054454539812", 1);
				tg.wait("ele_Cricket73054454539812", ComparisonType.IS_VISIBLE);
				tg.click("ele_Cricket73054454539812", 1);
				tg.wait("ele_Year216054454539812", ComparisonType.IS_VISIBLE);
				tg.selectDropdownByValue("ele_Year216054454539812","1995");
				tg.wait("ele_Month317054454539812", ComparisonType.IS_VISIBLE);
				tg.selectDropdownByValue("ele_Month317054454539812","May");
				tg.wait("ele_Day330054454539812", ComparisonType.IS_VISIBLE);
				tg.selectDropdownByValue("ele_Day330054454539812","12");
				tg.wait("ele_Password363054454539812", ComparisonType.IS_VISIBLE);
				tg.type("ele_Password363054454539812", "Password@123");
				tg.wait("ele_ConfirmPassword365054454539812", ComparisonType.IS_VISIBLE);
				tg.type("ele_ConfirmPassword365054454539812", "Password@123");
				tg.wait("ele_Photofile369054454539812", ComparisonType.IS_VISIBLE);
				tg.wait("ele_Submit366054454539812", ComparisonType.IS_CLICKABLE);
				tg.click("ele_Submit366054454539812", 1);
				tg.wait("ele_AutomationDemoSiteheading2055123889487", ComparisonType.IS_VISIBLE);
				tg.check.isVisible("ele_AutomationDemoSiteheading2055123889487");
				tg.check.isVisible("ele_Registerheading40055123889487");
		tg.close();
	}
}