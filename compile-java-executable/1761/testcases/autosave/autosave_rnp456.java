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
public class rnp456 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void rnp456() {
		tg.openDevice();
				tg.wait("ele_TextField1781196893169", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextField1781196893169", 1);
				tg.wait("ele_TextField1781196902965", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextField1781196902965", 1);
				tg.wait("ele_TextView1781196969443", ComparisonType.IS_VISIBLE);
				tg.click("ele_TextView1781196969443", 1);
		tg.close();
	}
}