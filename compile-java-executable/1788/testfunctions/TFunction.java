import bcd;
import abc;
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

class tfunction {

	public static void tfunction() {
		tg.swipe(Direction.DOWN);
		tg.wait("ele_EnteremailaddressEditText1781676776708", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText1781676776708", 1);
		tg.wait("ele_EnteremailaddressEditText1781676776708", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1781676776708", "mail", true);
		tg.wait("ele_EnterpasswordEditText1781676786573", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnterpasswordEditText1781676786573", 1);
		tg.wait("ele_EnterpasswordEditText1781676786573", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnterpasswordEditText1781676786573", "passss", true);
		tg.wait("ele_textinputendiconImageButton1781676810574", ComparisonType.IS_VISIBLE);
		tg.click("ele_textinputendiconImageButton1781676810574", 1);
		tg.wait("ele_SignInButton1781676815494", ComparisonType.IS_VISIBLE);
		tg.click("ele_SignInButton1781676815494", 1);
		tg.wait(5);
	}
}