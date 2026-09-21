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
public class test_case_1788768895 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1788768895() {
		tg.openDevice();
				tg.wait("ele_Fullname38081520592999", ComparisonType.IS_VISIBLE);
				tg.type("ele_Fullname38081520592999", "DemoFull", true);
				tg.wait(2);
				tg.type("ele_Firstname45081520592999", "DemoFirst", true);
				tg.wait("ele_Clear31081606313043", ComparisonType.IS_VISIBLE);
				tg.click("ele_Clear31081606313043", 1);
				tg.click("ele_Controlstab132081637020927", 1);
				tg.wait("ele_Male52081706209578", ComparisonType.IS_VISIBLE);
				tg.click("ele_Female61081706209578", 1);
		tg.close();
	}
}