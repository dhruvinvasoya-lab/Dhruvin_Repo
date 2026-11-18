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
public class ddrepeatifwithelemente {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void ddrepeatifwithelemente() {
		tg.openBrowser();
		tg.wait(5);
		tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/form-step-1.html");
		tg.wait("ele_registrati708", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_enteryourf216");
		tg.check.isVisible("ele_lastname164");
		JSONObject var_DATA = tg.getJsonData("https://production.testgrid.io/s/csv-to-json/20261118/K5QZVr.json");
		tg_String var_FirstName = "Null";
		tg_String var_LastName = "Null";
		tg_int var_Count = 2;
		while(tg.verify.isEqualTo(var_Count, 2)){
		while(tg.verify.isNotEqualTo(var_Count, 0)){
		while(tg.verify.isGreaterThanOrEqualTo(var_Count, 2)){
		while(tg.verify.isGreaterThan(var_Count, 1)){
		tg.declare("ele_testDeclare", "#checkbox{$}", var_Count);
		tg.wait("ele_registrati708", ComparisonType.IS_VISIBLE, 9);
		var_FirstName = tg.saveToVariable(var_FirstName, var_DATA, "$.records["+var_Count+"].FirstName");
		var_LastName = tg.saveToVariable(var_LastName, var_DATA, "$.records["+var_Count+"].LastName");
		tg.type("ele_enteryourf216", var_FirstName);
		tg.type("ele_lastname164", var_LastName);
		tg.wait(5);
		var_Count = tg.increments(var_Count, -2);
		}
		}
		}
		}
		tg.wait(5);
		tg.type("ele_enteryourf216", "test repeat If");
		tg.wait(10);
		tg.close();
	}
}