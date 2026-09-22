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

@Listeners(TestListener.class);
public class digital_tlifeandroid_shop_upgrade_watchsingleline {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_tlifeandroid_shop_upgrade_watchsingleline() {
		tg.openDevice();
		var_Environment = tg.saveToVariable("Qlab02", var_Environment);
		JSONObject var_ProdTestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260525/ucfqNI.json");
		JSONObject var_Qlab02TestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260525/eljBzV.json");
		JSONObject var_Qlab03TestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260518/svtQ8S.json");
		JSONObject var_CurrentTestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260518/XFSW7D.json");
		if(tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Qlab02")){
		START_CUSTOM_SCRIPT;
		var_CurrentTestData=var_Qlab02TestData;
		END_CUSTOM_SCRIPT;
		}
		if(tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Qlab03")){
		START_CUSTOM_SCRIPT;
		var_CurrentTestData=var_Qlab03TestData;
		END_CUSTOM_SCRIPT;
		}
		if(tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Prod")){
		START_CUSTOM_SCRIPT;
		var_CurrentTestData=var_ProdTestData;
		END_CUSTOM_SCRIPT;
		}
		if(tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "ProdGreen")){
		START_CUSTOM_SCRIPT;
		var_CurrentTestData=var_ProdTestData;
		END_CUSTOM_SCRIPT;
		}
		if(tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Stage")){
		START_CUSTOM_SCRIPT;
		var_CurrentTestData=var_ProdTestData;
		END_CUSTOM_SCRIPT;
		}
		tg.printLogs(var_TLifeUserName);
		tg.printLogs(var_TLifePassword);
		var_TLifeUserName = tg.saveToVariable("7176931409", var_TLifeUserName);
		var_TLifePassword = tg.saveToVariable("pass@123", var_TLifePassword);
		tg_String var_deviceName = "";
		tg.testFunction("TestFunctionHandleEnvironmentSwitcherAndLogin", new Object[]{});
		START_CUSTOM_SCRIPT;
		((io.appium.java_client.android.AndroidDriver) driver).setLocation(new org.openqa.selenium.html5.Location(47.552008, -122.057529, 0));
		END_CUSTOM_SCRIPT;
		tg.testFunction("fndigitaltlifeandroidclickonshoptab", new Object[]{});
		tg.wait("ele_tlifeAnShopThisStoreButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnShopThisStoreButton", 1);
		tg.testFunction("fndigitaltlifeandroidreadytocheckoutremove", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidclickonlookupgradecard", new Object[]{});
		if(tg.performAssert("ele_continueUpgradingButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_continueUpgradingButton", 1);
		}
		tg.wait(10);
		tg.testFunction("fndigitaltlifeandroidclickonwatch", new Object[]{});
		tg.wait("ele_BOWISToggle", ComparisonType.IS_VISIBLE);
		if(tg.performAssert("ele_BOWISToggle", ComparisonType.IS_ON)){
		tg.click("ele_BOWISToggle", 1);
		}
		// [DISABLED] tg.click("ele_BOWISToggle", 1);
		tg.testFunction("fndigitaltlifeandroidfirstdevicecolor", new Object[]{});
		// [DISABLED] tg.testFunction("fndigitaltlifeandroideip", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidwatchstorage", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidselectbopis", new Object[]{});
		tg.swipe(Direction.UP);
		// [DISABLED] tg.testFunction("fndigitaltlifeandroidchangestore", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidskiptradein", new Object[]{});
		tg.swipe(Direction.UP);
		tg.swipe(Direction.UP);
		tg.swipe(Direction.UP);
		tg.testFunction("fndigitaltlifeandroidselectprotection", new Object[]{});
		tg.testFunction("fnDigitalTLifeAndroidAddFirstAccessoryMonthlyPayment", new Object[]{});
		// [DISABLED] tg.testFunction("fndigitaltlifeandroidaccessoryeip", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidaddtocart", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidcart", new Object[]{});
		tg.wait(5);
		tg.testFunction("fnDigitalTlifeAndriodValidateFullfillmentMethodShowsBOPISStore", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidcheckout", new Object[]{});
		tg.wait(5);
		tg.testFunction("fndigitaltlifeandroidacceptagreements", new Object[]{});
		tg.wait(5);
		tg.testFunction("fndigitaltlifeandroidaddcard", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidrevieworderbopis", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidpurchasebreakdown", new Object[]{});
		tg.wait(5);
		tg.close();
	}
}