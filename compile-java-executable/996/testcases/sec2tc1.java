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
public class sec2tc1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void sec2tc1() {
		tg.openDevice();
		tg.swipe(Direction.DOWN);
		// [DISABLED] tg.wait("ele_ImageView1781934027403", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_ImageView1781934027403", 1);
		tg.wait("ele_SignInButton", ComparisonType.IS_VISIBLE);
		tg.wait("ele_EnteremailaddressEditText1781934190418", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText1781934190418", 1);
		tg.startSecureBlock();
		tg.wait("ele_EnteremailaddressEditText1781934190418", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1781934190418", "#TGITVAR.FirstName", true);
		tg.wait("ele_EnterpasswordEditText1781934205081_1781934233", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnterpasswordEditText1781934205081_1781934233", 1);
		tg.wait("ele_textinputendiconImageButton1781934359076", ComparisonType.IS_VISIBLE);
		tg.click("ele_textinputendiconImageButton1781934359076", 1);
		tg.endSecureBlock();
		tg.wait("ele_SignUpTextView1781934368812", ComparisonType.IS_VISIBLE);
		tg.click("ele_SignUpTextView1781934368812", 1);
		tg.wait("ele_SignInTextView1781934378065", ComparisonType.IS_VISIBLE);
		tg.click("ele_SignInTextView1781934378065", 1);
		tg.close();
	}
}