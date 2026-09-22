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
import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import org.openqa.selenium.html5.Location;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.Pause;
import java.time.Duration;
import static org.openqa.selenium.interactions.PointerInput.Kind.TOUCH;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
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

class fndigitaltlifeandroidtradeindevicenew {

	public static void fndigitaltlifeandroidtradeindevicenew() {
		tg.wait(5);
		tg.swipe(Direction.UP);
		if(tg.performAssert("ele_tlifeAnTradeInButton", ComparisonType.IS_VISIBLE)){
		tg.scroll("ele_tlifeAnTradeInButton", Direction.DOWN);
		tg.click("ele_tlifeAnTradeInButton", 1);
		}
		if(tg.performAssert("ele_tlifeAndroidProsGetTradeinEstimate", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAndroidProsGetTradeinEstimate", 1);
		}
		// [DISABLED] tg.scroll("ele_tlifeAndroidProsGetTradeinEstimate", Direction.DOWN);
		// [DISABLED] tg.click("ele_tlifeAndroidProsGetTradeinEstimate", 1);
		if(tg.performAssert("ele_DeviceDetailsUnavailableTextPopUpHeader", ComparisonType.IS_VISIBLE)){
		tg.wait("ele_tlifeAnContinueButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnContinueButton", 1);
		tg.wait("ele_tlifeAnEnterIMEINumberLink", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnEnterIMEINumberLink", 1);
		}
		tg.wait(3);
		tg.wait("ele_tlifeAnIMEINumberFieldd", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_tlifeAnIMEINumberFieldd", 1);
		tg.type("ele_tlifeAnIMEINumberFieldd", var_TradeInIMEI, true);
		tg.wait("ele_tlifeAnTradeInContinueButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnTradeInContinueButton", 1);
		tg.wait("ele_tlifeAnTradeinYesButton", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_tlifeAnTradeinYesButton", 1);
		tg.wait("ele_tlifeAnAcceptAndContinueButton", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_tlifeAnAcceptAndContinueButton", 1);
		tg.wait(3);
	}
}