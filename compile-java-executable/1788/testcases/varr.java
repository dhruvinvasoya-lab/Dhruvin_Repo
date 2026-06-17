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
public class varr {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void varr() {
		tg.openDevice();
		tg.swipe(Direction.DOWN);
		tg.wait("ele_EnteremailaddressEditText1781676776708", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1781676776708", "#TGITVAR.First", false);
		tg.printLogs(var_Gstr);
		tg.printLogs(var_ra_rint);
				var_Gstr = tg.readFromAPI("Req_api.json").getString();
		tg.printLogs(var_Gstr);
		tg.wait(6);
		tg.close();
	}
}