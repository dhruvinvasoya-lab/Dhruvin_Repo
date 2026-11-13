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
public class tc1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc1() {
		tg.openDevice();
				tg.wait("ele_ok1794540178453", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_ok1794540178453", 1);
				if(tg.performAssert("ele_allow1794540195491", ComparisonType.IS_VISIBLE)){
				tg.click("ele_allow1794540195491", 1);
				}
				tg.wait("ele_wind00ms1794540202044", ComparisonType.IS_VISIBLE, 30);
				tg.swipe(Direction.DOWN);
				tg.click("ele_update1794540211657", 1);
				tg.wait("ele_searchcity1794540231317", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_searchcity1794540231317", 1);
				tg.wait("ele_searchlocation1794540237490", ComparisonType.IS_VISIBLE, 30);
				tg.type("ele_searchlocation1794540237490", "London", false);
				tg.wait(2);
		tg.close();
	}
}