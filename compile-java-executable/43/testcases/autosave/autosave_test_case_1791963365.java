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
public class test_case_1791963365 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1791963365() {
		tg.openBrowser();
				tg.wait("ele_firstnameele59074016668429", ComparisonType.IS_VISIBLE);
				tg.type("ele_firstnameele59074016668429", "James");
				tg.type("ele_lastnameele60074016668429", "Wilson");
				tg.type("ele_addressele62074016668429", "123 Maple Street, Austin, TX 78701");
				tg.type("ele_emailele64074016668429", "james.wilson@example.com");
				tg.type("ele_mobileele67074016668429", "2025550147");
				tg.wait("ele_moviesele76074016668429", ComparisonType.IS_CLICKABLE);
				tg.click("ele_moviesele76074016668429", 1);
		tg.close();
	}
}