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
public class ddcheckwithelement {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void ddcheckwithelement() {
		tg.openBrowser();
				tg.wait(5);
				tg.pageLoadStart("URL");
				tg.startSecureBlock();
				tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/index.html");
				tg.pageLoadEnd("URL");
				tg.endSecureBlock();
				tg.pageLoadStart("Sales");
				tg.check.isVisible("ele_Modules");
				tg.pageLoadEnd("Sales");
				tg.pageLoadStart("Sales1");
				tg.check.isEqualTo("ele_Modules","13", false);
				tg.check.isNotEqualTo("ele_Modules","14", false);
				tg.check.contains("ele_Modules","13", false);
				tg.check.isGreaterThan("ele_Modules","12");
				tg.pageLoadEnd("Sales1");
				tg.check.isLessThan("ele_Modules","15");
				tg.check.isGreaterThanOrEqualTo("ele_Modules","13");
				tg.pageLoadStart("Sales2");
				tg.check.isLessThanOrEqualTo("ele_Modules","13");
				tg.check.isGreaterThanOrEqualTo("ele_Modules","13");
				tg.check.isLessThanOrEqualTo("ele_Modules","50");
				tg.pageLoadEnd("Sales2");
				tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/form-step-1.html");
				tg.check.isEnabled("ele_ResetButton");
				tg.wait(5);
				tg.check.isEnabled("ele_Disabledoption");
				tg.wait(5);
		tg.printPageSource();
				tg.wait("ele_registrati708", ComparisonType.IS_VISIBLE);
		tg.setBrowserResolution("800", "800");
				tg.wait(5);
		tg.setBrowserResolution("1920", "1080");
				tg.wait(5);
		tg.close();
	}
}