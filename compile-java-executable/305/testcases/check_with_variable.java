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
public class check_with_variable {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void check_with_variable() {
		tg.openBrowser();
		tg.wait(5);
		tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/index.html");
		tg.wait("ele_startwitht007", ComparisonType.IS_VISIBLE);
		tg_String var_CheckAction = "13";
		tg.check.isVisible("ele_Modules");
		tg.check.isEqualTo(var_CheckAction,"13", false);
		tg.check.isNotEqualTo(var_CheckAction,"12", false);
		tg.check.isGreaterThanOrEqualTo(var_CheckAction,"13");
		tg.check.isLessThanOrEqualTo(var_CheckAction,"3400");
		tg.check.isGreaterThan(var_CheckAction,"12");
		tg.check.isLessThan(var_CheckAction,"2432");
		tg.check.isGreaterThanOrEqualTo(var_CheckAction,"13");
		tg.check.isLessThanOrEqualTo(var_CheckAction,"701");
		tg.check.contains("ele_Modules",var_CheckAction, false);
		tg.wait(5);
		tg.close();
	}
}