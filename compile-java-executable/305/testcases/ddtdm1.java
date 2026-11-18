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
public class ddtdm1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void ddtdm1() {
		tg.openBrowser();
				tg.wait(5);
				tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/form-step-1.html");
				tg.wait("ele_registrati708", ComparisonType.IS_VISIBLE, 15);
				tg.check.isVisible("ele_enteryourf216");
				tg.check.isVisible("ele_lastname164");
				tg.type("ele_enteryourf216", "#TGITVAR.FirstName");
				tg.wait(3);
				tg.type("ele_lastname164", "#TGITVAR.LastName");
				tg.printLogs("ele_enteryourf216");
				tg.wait(2);
				tg.printLogs("ele_lastname164");
				tg.wait(5);
		tg.close();
	}
}