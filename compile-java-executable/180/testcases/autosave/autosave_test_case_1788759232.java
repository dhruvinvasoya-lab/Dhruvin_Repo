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
public class test_case_1788759232 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1788759232() {
		tg.openDevice();
				tg.wait("ele_Fullname38053420848822", ComparisonType.IS_VISIBLE);
				tg.type("ele_Fullname38053420848822", "DemoFull", true);
				tg.wait(2);
				tg.type("ele_Firstname45053420848822", "DemoFirst", true);
				tg.wait("ele_Clear31053503601727", ComparisonType.IS_VISIBLE);
				tg.click("ele_Clear31053503601727", 1);
				tg.click("ele_Controlstab132053536782586", 1);
				tg.wait("ele_Male52053606868205", ComparisonType.IS_VISIBLE);
				tg.click("ele_Female61053606868205", 1);
				tg.click("ele_Screenstab113053637843776", 1);
				tg.wait("ele_OpenModalSheet99053709931173", ComparisonType.IS_VISIBLE);
				tg.click("ele_OpenModalSheet99053709931173", 1);
				tg.wait("ele_Close197053754343496", ComparisonType.IS_VISIBLE);
				tg.swipe(Direction.DOWN);
				tg.wait("ele_OpenDetailScreen37053828525518", ComparisonType.IS_VISIBLE);
				tg.wait(2);
				tg.click("ele_OpenDetailScreen37053828525518", 1);
				tg.wait("ele_PushAnotherScreen21053900443194", ComparisonType.IS_VISIBLE);
				tg.click("ele_PushAnotherScreen21053900443194", 1);
				tg.click("ele_Back13053929118271", 1);
				tg.wait("ele_DetailScreen12053929118271", ComparisonType.IS_VISIBLE);
				tg.click("ele_Back13053929118271", 1);
				tg.wait(2);
				tg.click("ele_tab30053929118271", 1);
		tg.close();
	}
}