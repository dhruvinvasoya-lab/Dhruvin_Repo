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
public class securetest {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void securetest() {
		tg.openDevice();
		tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText1782727175745", 1);
		tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText1782727175745", 1);
		tg.testFunction("TestFunctionForQtestTest", new Object[]{});
		tg.startSecureBlock();
		tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1782727175745", "gautamkumar@testgmail.com", true);
		tg.wait("ele_EnterpasswordEditText1782727214455", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnterpasswordEditText1782727214455", 1);
		tg.wait("ele_EnterpasswordEditText1782727214455", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnterpasswordEditText1782727214455", "testpassword@123", true);
		tg.wait("ele_textinputendiconImageButton1782727228418", ComparisonType.IS_VISIBLE);
		tg.click("ele_textinputendiconImageButton1782727228418", 1);
		tg.wait("ele_textinputendiconImageButton1782727228418", ComparisonType.IS_VISIBLE);
		tg.click("ele_textinputendiconImageButton1782727228418", 1);
		tg.endSecureBlock();
		tg.wait(1);
		tg.wait(1);
		tg.click("ele_AlgeriaTextView1781517755743");
		tg.click("ele_AlgeriaTextView1781517755743");
		tg.click("ele_AlgeriaTextView1781517755743");
		tg.testFunction("CallTestFunctionCheck", new Object[]{});
		tg_int var_intvariables = 20;
		tg.printLogs("ele_ForgotPasswordTextView1783329197916");
		tg.networkAssert("QtestNewAsesert");
		tg.close();
	}
}