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
				tg.click("ele_btncountry1794542100819", 1);
				tg.wait("ele_search1794542107198", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_search1794542107198", 1);
				tg.wait("ele_search1794542113837", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_search1794542113837", 1);
				tg.type("ele_search1794542113837", "India", false);
				tg.click("ele_cardmain1794542124126", 1);
				tg.wait("ele_back1794542131643", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_back1794542131643", 1);
				tg.wait("ele_back1794542131643", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_back1794542131643", 1);
				tg.swipe("ele_btnquiz1794545465556", Direction.DOWN);
				tg.click("ele_btnquiz1794545465556", 1);
				tg.wait("ele_categoryflag1794545480174", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_categoryflag1794545480174", 1);
				tg.wait("ele_back1794542131643", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_back1794542131643", 1);
				tg.wait("ele_categorycurrency1794545490583", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_categorycurrency1794545490583", 1);
				tg.wait("ele_back1794542131643", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_back1794542131643", 1);
				tg.wait("ele_back1794542131643", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_back1794542131643", 1);
				tg.swipe("ele_btncountry1794542100819", Direction.UP);
				tg.check.isVisible("ele_btncountry1794542100819");
		tg.close();
	}
}