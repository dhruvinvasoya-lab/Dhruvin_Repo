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
public class sec42tc1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void sec42tc1() {
		tg.openDevice();
				tg.swipe(Direction.DOWN);
				tg.wait("ele_EnteremailaddressEditText1781936349571", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnteremailaddressEditText1781936349571", 1);
				tg.wait("ele_EnteremailaddressEditText1781936349571", ComparisonType.IS_VISIBLE);
				tg.type("ele_EnteremailaddressEditText1781936349571", "#TGITVAR.FirstName", true);
				tg.wait("ele_EnterpasswordEditText1781936359487", ComparisonType.IS_VISIBLE);
				tg.click("ele_EnterpasswordEditText1781936359487", 1);
				tg.wait("ele_EnterpasswordEditText1781936359487", ComparisonType.IS_VISIBLE);
				tg.type("ele_EnterpasswordEditText1781936359487", "#TGITVAR.LastName", true);
				tg.wait("ele_textinputendiconImageButton1781936372734", ComparisonType.IS_VISIBLE);
				tg.click("ele_textinputendiconImageButton1781936372734", 1);
		tg.close();
	}
}