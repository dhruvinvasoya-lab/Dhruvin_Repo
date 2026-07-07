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
public class tc01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc01() {
		tg.openDevice();
		tg.wait(5);
		var_upjson = tg.getJsonData("https://qainofc2.testgrid.io/s/csv-to-json/20260610/Z6W2jS.json");
		// [DISABLED] tg.testFunction("TF05", new Object[]{});
		tg.printLogs(var_JSONG);
		tg.wait(1);
		tg.printLogs(var_upjson);
		tg.wait(1);
		tg.deactivateApp(var_urbundle);
		tg.deactivateApp(var_neval);
		tg.wait(5);
		tg.wait(2);
		tg.close();
	}
}