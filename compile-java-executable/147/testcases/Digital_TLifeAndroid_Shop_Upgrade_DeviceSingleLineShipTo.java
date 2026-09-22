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
public class digital_tlifeandroid_shop_upgrade_devicesinglelineshipto {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_tlifeandroid_shop_upgrade_devicesinglelineshipto() {
		tg.openDevice();
		// [DISABLED] var_Environment = tg.saveToVariable("Production", var_Environment);
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
		// [DISABLED] var_TLifeUserName = tg.saveToVariable(var_TLifeUserName, var_CurrentTestData, "$.records[0].LocationRefreshUser");
		// [DISABLED] var_TLifePassword = tg.saveToVariable(var_TLifePassword, var_CurrentTestData, "$.records[0].LocationRefreshUserPassword");
		tg.printLogs(var_TLifeUserName);
		tg.printLogs(var_TLifePassword);
		// [DISABLED] var_TLifeUserName = tg.saveToVariable("3016409035", var_TLifeUserName);
		// [DISABLED] var_TLifePassword = tg.saveToVariable("pass@123", var_TLifePassword);
		var_TLifeUserName = tg.saveToVariable("4253409885", var_TLifeUserName);
		var_TLifePassword = tg.saveToVariable("Tmobile@2143", var_TLifePassword);
		tg_String var_deviceName = "";
		tg.testFunction("TestFunctionHandleEnvironmentSwitcherAndLogin", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidclickonshoptab", new Object[]{});
		tg.testFunction("fndigitalandroidremovecart", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidclickonlookupgradecard", new Object[]{});
		tg.wait("ele_tlifeAnFirstDevice", ComparisonType.IS_VISIBLE, 20);
		var_deviceName = tg.getElementAttribute("ele_tlifeAnFirstDevice", "text", var_deviceName);
		tg.testFunction("fndigitaltlifeandroidfirstdevice", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidfirstdevicecolor", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidselectdevicestorage", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidselectshipping", new Object[]{});
		tg.testFunction("fnDigitalTlifeAndroidTradeInDeviceNew", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidselectprotectionplan", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidskipaccessories", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidclickonaddtocart", new Object[]{});
		tg.testFunction("fnDigitalTlifeAndroidVerifyPromo", new Object[]{});
		tg.scroll("ele_tlifeAnCartDeviceName", Direction.DOWN);
		tg.wait("ele_tlifeAnCartDeviceName", ComparisonType.IS_VISIBLE);
		tg.check.isEqualTo("ele_tlifeAnCartDeviceName",var_deviceName);
		tg.scroll("ele_tlifeAnCartTradeInCreditLabel", Direction.DOWN);
		tg.wait("ele_tlifeAnCartTradeInCreditLabel", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_tlifeAnCartTradeInCreditLabel");
		tg.testFunction("fndigitaltlifeandroidswitchdeliverytogroundandback", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidclickoncheckout", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidacceptagreements", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidaddcard", new Object[]{});
		tg.testFunction("fndigitaltlifeandroidclickonpurchasebreakdown", new Object[]{});
		tg.wait("ele_tlifeAnBreakdownDeviceName", ComparisonType.IS_VISIBLE);
		tg.check.isEqualTo("ele_tlifeAnBreakdownDeviceName",var_deviceName);
		tg.testFunction("fndigitaltlifeandroidverifypurchasebreakdown", new Object[]{});
		// [DISABLED] tg.wait("ele_tlifeAnBreakdownProtection360Label", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.wait("ele_tlifeAnBreakdownShippingLabel", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.wait("ele_tlifeAnBreakdownEstimatedTaxLabel", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.wait("ele_tlifeAnBreakdownTotalLabel", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_tlifeAnBreakdownTotalLabel", 1);
		// [DISABLED] tg.wait("ele_tlifeAnPurchaseBreakdownClose", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_tlifeAnPurchaseBreakdownClose", 1);
		tg.wait(5);
		tg.close();
	}
}