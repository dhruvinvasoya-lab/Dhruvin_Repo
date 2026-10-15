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
public class repeatedgenderselection1791962534364 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void repeatedgenderselection1791962534364() {
		tg.openBrowser();
				tg.navigateToUrl("https://ultimateqa.com/automation/");
				tg.check.isVisible("ele_AutomationPracticetextele19072740218629");
				tg.wait("ele_Learnhowtoautomateanapplicationthatevolvesovertimelinkele25072834870923", ComparisonType.IS_VISIBLE);
				tg.click("ele_Learnhowtoautomateanapplicationthatevolvesovertimelinkele25072834870923", 1);
				tg.wait("ele_FirstNameele59074805059862", ComparisonType.IS_VISIBLE);
				tg.type("ele_FirstNameele59074805059862", "Alex");
				tg.type("ele_LastNameele60074805059862", "Morgan");
				tg.type("ele_EmailAddressele63074805059862", "alex.morgan@example.com");
				tg.type("ele_Phoneele66074805059862", "2025550147");
		tg.close();
	}
}