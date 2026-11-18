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
public class ddstartifwithvariable {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void ddstartifwithvariable() {
		tg.openBrowser();
		tg.wait(5);
		tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/index.html");
		tg_int var_teter = 2326;
		tg_String var_startifElse = "2326";
		if(tg.performAssert("ele_startwitht007", ComparisonType.IS_VISIBLE)){
		if(tg.performAssert("ele_startwitht007", ComparisonType.IS_INVISIBLE)){
		} else {
		if(tg.performAssert(var_teter, ComparisonType.EQUAL_TO, 2326)){
		if(tg.performAssert(var_teter, ComparisonType.NOT_EQUAL_TO, 2300)){
		if(tg.performAssert(var_teter, ComparisonType.GREATER_THAN_OR_EQUAL_TO, 340)){
		if(tg.performAssert(var_teter, ComparisonType.GREATER_THAN_OR_EQUAL_TO, 2326)){
		if(tg.performAssert(var_teter, ComparisonType.LESS_THAN_OR_EQUAL_TO , 2522)){
		if(tg.performAssert(var_teter, ComparisonType.LESS_THAN_OR_EQUAL_TO , 2326)){
		if(tg.performAssert(var_teter, ComparisonType.GREATER_THAN , 70)){
		if(tg.performAssert(var_teter, ComparisonType.LESS_THAN , 2544)){
		if(tg.performAssert(var_startifElse, ComparisonType.CONTAINS , 2326)){
		if(tg.performAssert("ele_startwitht007", ComparisonType.IS_ENABLE)){
		tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/form-step-1.html");
		tg.wait(5);
		if(tg.performAssert("ele_Disabledoption", ComparisonType.IS_ENABLE)){
		tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/form-step-1.html");
		tg.click("ele_single994", 1);
		tg.wait("ele_enteryourf216", ComparisonType.IS_VISIBLE);
		tg.type("ele_enteryourf216", "start if test");
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		tg.close();
	}
}