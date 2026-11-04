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
public class rnp1____ {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void rnp1____() {
		tg.openBrowser();
		tg.wait(5);
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait("ele_firstname268", ComparisonType.IS_VISIBLE);
		tg.click("ele_firstname268", 1);
		tg.wait("ele_firstname268", ComparisonType.IS_VISIBLE);
		tg.type("ele_firstname268", "jhon");
		tg.wait("ele_divtgwebcomma371", ComparisonType.IS_VISIBLE);
		tg.click("ele_divtgwebcomma371", 1);
		tg.wait("ele_divtgwebcomma371", ComparisonType.IS_VISIBLE);
		tg.type("ele_divtgwebcomma371", "Doe");
		tg.openNewTab();
		tg.navigateToUrl("https://demo.automationtesting.in/Frames.html");
		tg.wait("ele_text177", ComparisonType.IS_VISIBLE);
		tg.click("ele_text177", 1);
		tg.wait("ele_text177", ComparisonType.IS_VISIBLE);
		tg.type("ele_text177", "single");
		// [DISABLED] tg.wait("ele_close258", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_close258", 1);
		tg.wait("ele_iframewith041", ComparisonType.IS_VISIBLE);
		tg.click("ele_iframewith041", 1);
		tg.wait("ele_text086", ComparisonType.IS_VISIBLE);
		tg.type("ele_text086", "nested");
		tg.close();
	}
}