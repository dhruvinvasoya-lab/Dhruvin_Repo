import org.openqa.selenium.support.ui.Select;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.time.MonthDay;
import org.testng.Assert;
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

class fndigitaltlifeandroidrevieworderbopis {

	public static void fndigitaltlifeandroidrevieworderbopis() {
		// [DISABLED] tg.wait(5);
		// [DISABLED] tg.wait("ele_BackButton1773166713328", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_BackButton1773166713328", 1);
		tg.wait("ele_tlifeAnReviewOrderHeader", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnReviewOrderHeader", 1);
		tg.wait(1);
		tg.wait("ele_tlifeAnRevieworderBopisDeliveryMethod", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_tlifeAnRevieworderBopisDeliveryMethod");
		tg.wait(2);
	}
}