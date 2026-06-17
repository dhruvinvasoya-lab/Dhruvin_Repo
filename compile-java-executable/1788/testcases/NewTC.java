import abc;
import bcd;
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
public class newtc {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void newtc() {
		tg.openDevice();
				tg.swipe(Direction.DOWN);
				tg.wait("ele_SignUpTextView1781681796229", ComparisonType.IS_VISIBLE);
				tg.click("ele_SignUpTextView1781681796229", 1);
				tg.wait("ele_SignInTextView1781681802461", ComparisonType.IS_VISIBLE);
				tg.click("ele_SignInTextView1781681802461", 1);
		tg.close();
	}
}