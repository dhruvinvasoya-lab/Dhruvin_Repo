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
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class test_case_1794540470 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1794540470() {
		tg.openDevice();
				tg.wait("ele_ok1794540178453", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_ok1794540178453", 1);
				tg.wait("ele_wind00ms1794540202044", ComparisonType.IS_VISIBLE, 30);
				tg.swipe(Direction.DOWN);
				tg.wait("ele_update1794540211657", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_update1794540211657", 1);
				tg.wait("ele_searchcity1794540231317", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_searchcity1794540231317", 1);
				tg.wait("ele_searchlocation1794540237490", ComparisonType.IS_VISIBLE, 30);
				tg.type("ele_searchlocation1794540237490", "Mumbai", false);
				tg.wait("ele_in1794540643512", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_in1794540643512", 1);
				tg.wait("ele_opennavigationdrawer1794540665580", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_opennavigationdrawer1794540665580", 1);
				tg.wait("ele_graphs1794540673303", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_graphs1794540673303", 1);
				tg.swipe(Direction.UP);
				tg.swipe(Direction.DOWN);
				tg.wait("ele_moreoptions1794540694842", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_moreoptions1794540694842", 1);
				tg.wait("ele_togglevalues1794540706261", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_togglevalues1794540706261", 1);
				tg.wait("ele_opennavigationdrawer1794540665580", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_opennavigationdrawer1794540665580", 1);
				tg.wait("ele_settings1794540726278", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_settings1794540726278", 1);
				tg.wait("ele_generalsettings1794540735920", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_generalsettings1794540735920", 1);
				tg.check.isVisible("ele_generalsettings1794540788597");
		tg.close();
	}
}