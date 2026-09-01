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
public class tdm2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tdm2() {
		tg.openBrowser();
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
		JSONObject var_Data = tg.getJsonData("https://poc27.testgrid.io/s/csv-to-json/20260831/WzgbWt.json");
		tg_int var_count = 0;
		var_count = tg.saveToVariable(0, var_count);
		tg_String var_v1 = "Null";
		tg_String var_v2 = "Null";
		while(tg.verify.isLessThan(var_count, 2)){
		var_v1 = tg.saveToVariable(var_v1, var_Data, "$.records["+var_count+"].First");
		tg.wait("ele_firstname110", ComparisonType.IS_VISIBLE);
		tg.type("ele_firstname110", var_v1);
		tg.wait(2);
		tg.wait("ele_LastName", ComparisonType.IS_VISIBLE);
		var_v2 = tg.saveToVariable(var_v2, var_Data, "$.records["+var_count+"].Last");
		tg.type("ele_LastName", var_v2);
		var_count = tg.increments(var_count, 1);
		}
		tg.close();
	}
}