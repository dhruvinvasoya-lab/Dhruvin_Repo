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
public class rnpmohit1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void rnpmohit1() {
		tg.openDevice();
				tg.wait("ele_SearchSearchField1781251414344", ComparisonType.IS_VISIBLE);
				tg.click("ele_SearchSearchField1781251414344", 1);
				tg.wait("ele_SearchSearchField1781251414344", ComparisonType.IS_VISIBLE);
				tg.type("ele_SearchSearchField1781251414344", "sound", true);
				tg.wait("ele_SearchButton1781251442875", ComparisonType.IS_VISIBLE);
				tg.click("ele_SearchButton1781251442875", 1);
		tg.close();
	}
}