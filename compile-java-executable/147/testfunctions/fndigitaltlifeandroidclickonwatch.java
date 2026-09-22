import org.openqa.selenium.support.ui.Select;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.time.MonthDay;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;
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

class fndigitaltlifeandroidclickonwatch {

	public static void fndigitaltlifeandroidclickonwatch() {
		tg.wait(10);
		tg.check.isVisible("ele_tlifeAnShopSmartwatchesPage");
		tg.click("ele_tlifeAnShopSmartwatchesPage", 1);
		tg.wait(2);
		tg.scroll("ele_tlifeAnAddWatch", Direction.DOWN);
		// [DISABLED] tg.swipe("ele_tlifeAnSelectWatch", Direction.DOWN);
		tg.wait(15);
		// [DISABLED] tg.wait("ele_tlifeAnSelectWatch", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnAddWatch", 1);
		tg.wait(15);
		tg.swipe(Direction.UP);
		// [DISABLED] tg.scroll("ele_tlifeAnFirstColor", Direction.DOWN);
		// [DISABLED] tg.wait("ele_tlifeAnFirstColor", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_tlifeAnFirstColor", 1);
		// [DISABLED] tg.swipe(Direction.UP);
		tg.wait(5);
	}
}