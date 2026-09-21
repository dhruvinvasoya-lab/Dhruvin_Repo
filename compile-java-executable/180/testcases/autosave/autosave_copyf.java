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
public class copyf {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void copyf() {
		tg.openDevice();
				tg.wait("ele_email61071231042760", ComparisonType.IS_VISIBLE);
				tg.type("ele_email61071231042760", "demo.user@email.com", true);
				tg.wait("ele_phonenumber69071231042760", ComparisonType.IS_VISIBLE);
				tg.type("ele_phonenumber69071231042760", "9876543210", true);
				tg.check.isEqualTo("ele_email61071231042760","demo.user@email.com");
				tg.check.isEqualTo("ele_phonenumber69071231042760","9876543210");
		tg.close();
	}
}