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
public class ddheckdeclareandtdm2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void ddheckdeclareandtdm2() {
		tg.openBrowser();
				tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/form-step-1.html");
				tg.wait("ele_registrati708", ComparisonType.IS_VISIBLE, 15);
				tg.check.isVisible("ele_enteryourf216");
				tg.check.isVisible("ele_lastname733");
				tg.startSecureBlock();
				JSONObject var_DATA = tg.getJsonData("https://production.testgrid.io/s/csv-to-json/20261118/K5QZVr.json");
				tg.printLogs(var_DATA);
				tg_String var_FirstName = "Null";
				tg_String var_LastName = "Null";
				tg_int var_Count = 1;
				while(tg.verify.isLessThan(var_Count, 3)){
				var_FirstName = tg.saveToVariable(var_FirstName, var_DATA, "$.records["+var_Count+"].FirstName");
				var_LastName = tg.saveToVariable(var_LastName, var_DATA, "$.records["+var_Count+"].LastName");
				tg.type("ele_enteryourf216", var_FirstName);
				tg.type("ele_lastname733", var_LastName);
				tg.endSecureBlock();
				tg.printLogs(var_FirstName);
				tg.printLogs(var_LastName);
				tg.wait(5);
				var_Count = tg.increments(var_Count, 1);
				}
		tg.close();
	}
}