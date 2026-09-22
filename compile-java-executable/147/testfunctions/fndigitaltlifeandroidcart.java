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

class fndigitaltlifeandroidcart {

	public static void fndigitaltlifeandroidcart() {
		tg.wait(5);
		tg.wait("ele_tlifeAnCartHeader", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnCartHeader", 1);
		tg.wait(2);
		tg.scroll("ele_tlifeAnCartDeviceName", Direction.DOWN);
		tg.wait("ele_tlifeAnCartDeviceName", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_tlifeAnCartDeviceName");
		tg.wait(2);
		tg.scroll("ele_tlifeAnCartProtection", Direction.DOWN);
		tg.wait(1);
		tg.check.isVisible("ele_tlifeAnCartProtection");
		tg.swipe(Direction.UP);
	}
}