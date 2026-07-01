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
public class res {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void res() {
		tg.openDevice();
				tg.swipe(Direction.DOWN);
				tg.wait("ele_buttonsubmitButton1781783308177", ComparisonType.IS_VISIBLE);
				tg.click("ele_buttonsubmitButton1781783308177", 1);
				tg.wait("ele_alertcancelButton1781783317724", ComparisonType.IS_VISIBLE);
				tg.click("ele_alertcancelButton1781783317724", 1);
		tg.close();
	}
}