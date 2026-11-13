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
public class tcmanual1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcmanual1() {
		tg.openDevice();
				tg.wait(1);
				tg.click("ele_screens1794544201639", 1);
				tg.wait("ele_opendetailscreen1794544167579", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_opendetailscreen1794544167579", 1);
				tg.wait("ele_pushanotherscreen1794544182530", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_pushanotherscreen1794544182530", 1);
				tg.wait("ele_nesteddetail1794544190874", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_detailscreen1794544192016", 1);
				tg.wait("ele_detailscreen1794544199371", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_screens1794544676189", 1);
				tg.wait(2);
				tg.wait("ele_form1794544698222", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_form1794544698222", 1);
		tg.close();
	}
}