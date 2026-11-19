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
public class test_case_1795079154 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1795079154() {
		tg.openDevice();
				tg.wait("ele_windtext1795079312568", ComparisonType.IS_VISIBLE, 30);
				tg.swipe(Direction.DOWN);
				tg.click("ele_update1795079317060", 1);
				tg.wait("ele_searchcity1795079325141", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_searchcity1795079325141", 1);
				tg.wait("ele_ok1795079333511", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_ok1795079333511", 1);
				tg.wait("ele_searchlocation1795079340791", ComparisonType.IS_VISIBLE, 30);
				tg.type("ele_searchlocation1795079340791", "Mumbai", false);
				tg.click("ele_in1795079346991", 1);
				tg.wait("ele_mumbaiin1795079366167", ComparisonType.IS_VISIBLE, 30);
				tg.check.isEqualTo("ele_mumbaiin1795079366167","Mumbai, IN", false);
				tg.click("ele_opennavigationdrawer1795079369717", 1);
				tg.wait("ele_graphs1795079378813", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_graphs1795079378813", 1);
				tg.swipe(Direction.UP);
				tg.swipe(Direction.DOWN);
				tg.click("ele_moreoptions1795079392882", 1);
				tg.wait("ele_togglevalues1795079399665", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_togglevalues1795079399665", 1);
				tg.wait("ele_opennavigationdrawer1795079369717", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_opennavigationdrawer1795079369717", 1);
				tg.wait("ele_settings1795079413911", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_settings1795079413911", 1);
				tg.wait("ele_generalsettings1795079419897", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_generalsettings1795079419897", 1);
				tg.wait("ele_hideweatherdescription1795079428781", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_hideweatherdescriptioncheckbox1795079430708", 1);
				tg.wait("ele_enablenotificationsswitch1795079434883", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_enablenotificationsswitch1795079434883", 1);
				tg.wait("ele_enablenotificationsswitch1795079434883", ComparisonType.IS_VISIBLE, 30);
				tg.check.isOn("ele_enablenotificationsswitch1795079434883");
		tg.close();
	}
}