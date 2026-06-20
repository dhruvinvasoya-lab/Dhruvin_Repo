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
public class sec3tc1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void sec3tc1() {
		tg.openDevice();
		tg.swipe(Direction.DOWN);
		tg.pageLoadStart("pg1");
		tg.wait("ele_EnteremailaddressEditText1781935138283", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText1781935138283", 1);
		tg.pageLoadEnd("pg1");
		tg.startSecureBlock();
		tg.wait("ele_EnteremailaddressEditText1781935138283", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1781935138283", "emaiiiiillll", true);
		tg.wait("ele_FrameLayout1781935163995", ComparisonType.IS_VISIBLE);
		tg.click("ele_FrameLayout1781935163995", 1);
		tg.wait("ele_FrameLayout1781935163995", ComparisonType.IS_VISIBLE);
		tg.type("ele_FrameLayout1781935163995", "passswrod", true);
		tg.endSecureBlock();
		tg.wait("ele_textinputendiconImageButton1781935227060", ComparisonType.IS_VISIBLE);
		tg.click("ele_textinputendiconImageButton1781935227060", 1);
		tg.wait("ele_SignUpTextView1781935242929", ComparisonType.IS_VISIBLE);
		tg.click("ele_SignUpTextView1781935242929", 1);
		tg.wait("ele_SignInTextView1781935248733", ComparisonType.IS_VISIBLE);
		tg.click("ele_SignInTextView1781935248733", 1);
		tg.close();
	}
}