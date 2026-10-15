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
public class rnp {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void rnp() {
		tg.openBrowser();
				tg.wait("ele_divtgwebcomma644", ComparisonType.IS_VISIBLE);
				tg.click("ele_divtgwebcomma644", 1);
				tg.wait("ele_divtgwebcomma644", ComparisonType.IS_VISIBLE);
				tg.type("ele_divtgwebcomma644", "jhon");
				tg.wait("ele_lastname449", ComparisonType.IS_VISIBLE);
				tg.click("ele_lastname449", 1);
				tg.wait("ele_lastname449", ComparisonType.IS_VISIBLE);
				tg.type("ele_lastname449", "DOe");
				tg.wait("ele_switchto860", ComparisonType.IS_VISIBLE);
				tg.click("ele_switchto860", 1);
				tg.wait("ele_frames000", ComparisonType.IS_VISIBLE);
				tg.click("ele_frames000", 1);
				tg.wait("ele_text096", ComparisonType.IS_VISIBLE);
				tg.click("ele_text096", 1);
				tg.wait("ele_text096", ComparisonType.IS_VISIBLE);
				tg.type("ele_text096", "hii");
				tg.wait("ele_iframewith273", ComparisonType.IS_VISIBLE);
				tg.click("ele_iframewith273", 1);
				tg.wait("ele_text756", ComparisonType.IS_VISIBLE);
				tg.click("ele_text756", 1);
				tg.wait("ele_text756", ComparisonType.IS_VISIBLE);
				tg.type("ele_text756", "hello");
				tg.click("ele_automation945", 1);
		tg.close();
	}
}