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
public class api_request {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void api_request() {
		tg.openBrowser();
		tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/index.html");
		tg.wait(5);
		tg_int var_IN1 = 10;
		tg_String var_Str1 = "null";
		tg_Double var_dbl1 = 10.1;
		JSONObject var_jsn1 = tg.getJsonData("{}");
				tg.readFromAPI("R1_api.json", var_IN1, var_Str1, var_dbl1, var_jsn1);
		tg.printLogs(var_IN1);
		tg.printLogs(var_Str1);
		tg.printLogs(var_dbl1);
		tg.printLogs(var_jsn1);
		tg.close();
	}
}