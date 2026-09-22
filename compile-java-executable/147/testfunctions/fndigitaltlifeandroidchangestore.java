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

class fndigitaltlifeandroidchangestore {

	public static void fndigitaltlifeandroidchangestore() {
		tg.wait("ele_tlifeAnChangeStoreButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnChangeStoreButton", 1);
		tg.wait(5);
		tg.wait("ele_tlifeAnStorePickupSearchBox", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_tlifeAnStorePickupSearchBox", 1);
		tg.wait(5);
		// [DISABLED] tg.type("ele_tlifeAnStorePickupSearchEditBox", "75067", true);
		// [DISABLED] tg.wait("ele_tlifeAnkeyboardSearchButton", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_tlifeAnkeyboardSearchButton", 1);
		tg.wait(5);
		tg.click("ele_tlifeAnStorePickupFirstStore", 1);
		tg.wait(2);
		tg.click("ele_tlifeAnStorePickupUpdateButton", 1);
	}
}