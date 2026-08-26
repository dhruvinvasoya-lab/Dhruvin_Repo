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
public class saucelab {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void saucelab() {
		tg.openDevice();
		tg.wait(2);
		// [DISABLED] tg.pageLoadStart("saucelab");
		tg.printPageSource();
		tg.printLogs("==========================================================================================================================================================");
		tg.testFunction("date_utility", new Object[]{});
		tg_String var_var1 = "null";
				var_var1 = tg.readFromAPI("request1_api.json").getString();
		tg.printLogs(var_var1);
		tg.close();
	}
}