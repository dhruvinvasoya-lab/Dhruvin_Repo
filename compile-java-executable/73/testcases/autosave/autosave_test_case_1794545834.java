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
public class test_case_1794545834 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1794545834() {
		tg.openDevice();
				tg.click("ele_19216888124demo1794547977171", 1);
				tg.type("ele_19216888124demo1794547977171", "http://192.168.88.44:8000/Demo", true);
				tg.click("ele_19216888124demo1794547977171", 1);
				tg.wait(2);
				tg.click("92%WIDTH,90%HEIGHT", 1);
				tg.click("ele_togglenavigation1794548060455", 1);
				tg.wait("ele_about1794548067626", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_about1794548067626", 1);
		tg.close();
	}
}