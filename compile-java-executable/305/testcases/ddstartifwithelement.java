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
public class ddstartifwithelement {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void ddstartifwithelement() {
		tg.openBrowser();
				tg.wait(5);
				tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/index.html");
				if(tg.performAssert("ele_Modules", ComparisonType.IS_VISIBLE)){
				if(tg.performAssert("ele_Modules", ComparisonType.IS_INVISIBLE)){
		} else {
				if(tg.performAssert("ele_Modules", ComparisonType.EQUAL_TO, 13)){
				if(tg.performAssert("ele_Modules", ComparisonType.NOT_EQUAL_TO, 2300)){
				if(tg.performAssert("ele_Modules", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 12)){
				if(tg.performAssert("ele_Modules", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 13)){
				if(tg.performAssert("ele_Modules", ComparisonType.LESS_THAN_OR_EQUAL_TO , 14)){
				if(tg.performAssert("ele_Modules", ComparisonType.LESS_THAN_OR_EQUAL_TO , 701)){
				if(tg.performAssert("ele_Modules", ComparisonType.GREATER_THAN , 11)){
				if(tg.performAssert("ele_Modules", ComparisonType.LESS_THAN , 2544)){
				if(tg.performAssert("ele_Modules", ComparisonType.CONTAINS , 13)){
				tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/form-step-1.html");
				if(tg.performAssert("ele_Disabledoption", ComparisonType.IS_ENABLE)){
				tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/index.html");
				tg.wait(5);
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