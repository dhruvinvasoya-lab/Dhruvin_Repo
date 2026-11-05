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
public class amazon__ {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void amazon__() {
		tg.openBrowser();
		tg.navigateToUrl("https://www.amazon.in/");
		tg.pageLoadStart("Amazon");
		tg.wait("ele_i881", ComparisonType.IS_VISIBLE);
		tg.click("ele_i881", 1);
		tg.wait("ele_bestseller423", ComparisonType.IS_VISIBLE);
		tg.click("ele_bestseller423", 1);
		tg.pageLoadEnd("Amazon");
		// [DISABLED] tg.networkAssert("Amazon");
		tg_String var_V1 = "abc";
		tg_int var_V2 = 5;
		tg_Double var_V3 = 10.2;
		JSONObject var_V4 = tg.getJsonData("{}");
				tg.readFromAPI("req_api.json", var_V1, var_V2, var_V3, var_V4);
		tg.printLogs(var_V1);
		tg.printLogs(var_V2);
		tg.printLogs(var_V3);
		tg.printLogs(var_V4);
		tg.close();
	}
}