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

class convertfunc {

	public static void convertfunc() {
		tg.swipe(Direction.DOWN);
		tg.wait("ele_EnteremailaddressEditText1781932997565", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText1781932997565", 1);
		tg.wait("ele_EnteremailaddressEditText1781932997565", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1781932997565", "#TGITVAR.FirstName", false);
		tg.wait("ele_EnterpasswordEditText1781933013783", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnterpasswordEditText1781933013783", 1);
		tg.wait("ele_EnterpasswordEditText1781933013783", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnterpasswordEditText1781933013783", "#TGITVAR.LastName", false);
		tg.wait("ele_FrameLayout1781933036748", ComparisonType.IS_VISIBLE);
		tg.click("ele_FrameLayout1781933036748", 1);
		tg.wait("ele_SignInButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_SignInButton", 1);
		// [DISABLED] tg.click("ele_SignInButton", 1);
		// [DISABLED] tg.click("ele_SignInButton", 1);
		tg.wait("ele_Ele1", ComparisonType.IS_VISIBLE);
	}
}