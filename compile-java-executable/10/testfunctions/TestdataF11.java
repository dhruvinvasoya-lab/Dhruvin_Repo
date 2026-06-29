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

class testdataf11 {

	public static void testdataf11() {
		tg.wait("ele_EnteremailaddressEditText1781004199257", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText1781004199257", 1);
		tg.wait("ele_EnteremailaddressEditText1781004199257", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1781004199257", var_ra_TotalR, true);
		tg.wait(1);
		tg.type("ele_EnteremailaddressEditText1781004199257", var_FullName, true);
		tg.wait(1);
		tg.type("ele_EnteremailaddressEditText1781004199257", var_DBdata, true);
	}
}