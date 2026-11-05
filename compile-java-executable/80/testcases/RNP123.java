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
public class rnp123 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void rnp123() {
		tg.openBrowser();
				tg.wait(5);
				tg.wait("ele_firstname268", ComparisonType.IS_VISIBLE);
				tg.click("ele_firstname268", 1);
				tg.wait("ele_firstname268", ComparisonType.IS_VISIBLE);
				tg.type("ele_firstname268", "Jhon");
				tg.wait("ele_input239", ComparisonType.IS_VISIBLE);
				tg.click("ele_input239", 1);
				tg.wait("ele_input239", ComparisonType.IS_VISIBLE);
				tg.type("ele_input239", "Doe");
				tg.wait("ele_textareatgwebcomma584", ComparisonType.IS_VISIBLE);
				tg.click("ele_textareatgwebcomma584", 1);
				tg.wait("ele_textareatgwebcomma584", ComparisonType.IS_VISIBLE);
				tg.type("ele_textareatgwebcomma584", "Demo Address ");
		tg.close();
	}
}