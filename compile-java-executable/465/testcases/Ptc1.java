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
public class ptc1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
    	@XrayTest(key = "TES-3")
	public void ptc1() {
		tg.openDevice();
				tg.wait("ele_EnteremailaddressEditText1795069027705", ComparisonType.IS_VISIBLE);
				tg.pageLoadStart("Pg1");
				tg.click("ele_EnteremailaddressEditText1795069027705", 1);
				tg.pageLoadEnd("Pg1");
		// [DISABLED] 		tg.startSecureBlock();
				tg.type("ele_EnteremailaddressEditText1795069027705", "#TGITVAR.FirstName", true);
		// [DISABLED] 		tg.endSecureBlock();
				tg.pageLoadStart("pass");
				tg.wait("ele_EnterpasswordEditText1795069087658", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnterpasswordEditText1795069087658", 1);
				tg.pageLoadEnd("pass");
		// [DISABLED] 		tg.startSecureBlock();
				tg.wait("ele_EnterpasswordEditText1795069087658", ComparisonType.IS_VISIBLE);
				tg.type("ele_EnterpasswordEditText1795069087658", "#TGITVAR.LastName", true);
		// [DISABLED] 		tg.endSecureBlock();
				tg.pageLoadStart("Eye");
				tg.wait("ele_FrameLayout1795069107008", ComparisonType.IS_VISIBLE);
				tg.click("ele_FrameLayout1795069107008", 1);
				tg.pageLoadEnd("Eye");
				tg.wait("ele_SignInButton", ComparisonType.IS_VISIBLE);
				tg.click("ele_SignInButton", 1);
		tg.close();
	}
}