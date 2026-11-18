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
public class call_func_param {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void call_func_param() {
		tg.openBrowser();
		JSONObject var_jsondata = tg.getJsonData("{}");
		var_jsondata = (JSONObject) tg.testFunction("func_param_json", new Object[]{"EmilyBlunt", 30, 45000});
		tg.printLogs("JSON Function Param Done====================");
		tg_String var_strdata = "Null";
		var_strdata = (String) tg.testFunction("func_param_string", new Object[]{"John", "Keneddy", "St. Louis", "Google", "QA", "qa.test@test.com", "Active"});
		tg.printLogs(var_strdata);
		tg.printLogs("String Function Param Done====================");
		tg_int var_intdata = 0;
		var_intdata = ((Number) tg.testFunction("func_param_int", new Object[]{10, 20, 30, 40, 50, 60, 10, 5, 15, 10, 100, 4, 7, 8, 9, 12, 3, 25, 6, 11})).intValue();
		tg.printLogs(var_intdata);
		tg.printLogs("Integer Function Param Done=========================");
		tg.close();
	}
}