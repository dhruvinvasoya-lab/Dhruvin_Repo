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

class fndigitaltlifeandroidaddfirstaccessorymonthlypayment {

	public static void fndigitaltlifeandroidaddfirstaccessorymonthlypayment() {
		tg.scroll("ele_tlifeAnAddFirstAccessory", Direction.DOWN);
		tg.wait("ele_tlifeAnAddFirstAccessory", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_tlifeAnCustomizeDeviceTitle", 1);
		tg.click("ele_tlifeAnAddFirstAccessory", 1);
		tg.wait(5);
		tg.click("ele_tlifeAnAddButton", 1);
		tg.wait(5);
		tg.scroll("ele_salesdoneaccessorypdpbutton", Direction.DOWN);
		tg.swipe(Direction.UP);
		tg.click("ele_salesdoneaccessorypdpbutton", 1);
		tg.scroll("ele_tlifeAnAccessoriesPayMonthlyOption", Direction.DOWN);
		tg.click("ele_tlifeAnAccessoriesPayMonthlyOption", 1);
	}
}