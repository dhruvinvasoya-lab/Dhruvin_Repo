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
public class manualcitygraphsandforecast1791971943963 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void manualcitygraphsandforecast1791971943963() {
		tg.openDevice();
		// Precondition fresh launch with connectivity and location permission not granted
				tg.swipe(Direction.UP);
		tg.close();
	}
}