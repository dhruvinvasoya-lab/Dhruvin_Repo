import org.openqa.selenium.support.ui.Select;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.time.MonthDay;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import org.openqa.selenium.html5.Location;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.Pause;
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
import io.appium.java_client.ios.IOSDriver;

@Listeners(TestListener.class)
public class TestSuite1 {

    public static String var_PackageName = "com.tmobile.tuesdays";

    public static String var_TLifePassword01_Hermes = "Test123456@#$";

    public static String var_TLifeUserName01_Hermes = "4706620025";

    public static int var_LineNumber = 1;

    public static String var_SDD_Address = "1403 NW Sammamish Rd";

    public static Double var_ADDADP = 24.00;

    public static String var_BASEIMEI = "35693803564380";

    public static String var_Fiber_plan_name = "fiber plan";

    public static String var_altitude = "0";

    public static String var_longitude = "-122.057529";

    public static String var_latitude = "47.552008";

    public static String var_Not_Eligible_Address_Plan = "91 Christopher Dr South Shore KY 41175";

    public static String var_HIS_Eligible_OnlyAway_Address = "157 REBECCA DR GARDENDALE AL 35071";

    public static String var_HSI_Eligible_Capped_Nomad_Address = "744 COALFIRE AVE BESSEMER AL 35023";

    public static String var_PersonalInfo_Address = "1 Ravinia Dr, Atlanta, GA 30346";

    public static String var_PersonalInfo_Email = "loopbacktest@gmail.com";

    public static String var_PersonalInfo_PhoneNo = "9910002000";

    public static String var_PersonalInfo_SSN = "0005";

    public static String var_PersonalInfo_DOB = "12281991";

    public static String var_PersonalInfo_LastName = "Back";

    public static String var_PersonalInfo_FirstName = "Loopback";

    public static String var_HSI_InEligible_Address = "12040 Juvenile St, Greenfield, OH 45123";

    public static String var_HSI_Eligible_Residential_Address = "3202 STRATFORD GREEN CT, AVONDALE ESTATES, GA 30002";

    public static String var_HSI_Eligible_Business_Address = "1700 Crystal Dr, Arlington";

    public static int var_NumberOfLinesRequired = 3;

    public static String var_IneligibleHSIAddress = "null";

    public static String var_EIDNumber = "89049032006008882600112598684628";

    public static String var_IMEINumber = "985412365874417";

    public static String var_qlabEnv = "Qlab02";

    public static String var_HSI_Address = "null";

    public static String var_Environment = "Prodgreen";

    public static String var_SyncupICCIDNumber = "null";

    public static String var_SyncupIMEINumber = "null";

    public static String var_PortinNumber = "null";

    public static String var_bowisLocationOnPopUp = "null";

    public static String var_bowisStoreLocation = "null";

    public static String var_tradeinvalue = "null";

    public static String var_DeviceStorage = "null";

    public static String var_Accessory_Name = "Apple";

    public static String var_Protection_Plan = "Protection 360";

    public static int var_removeHowManyLines = 3;

    public static String var_HSI_EligibleAddress = "null";

    public static String var_AccessoryName = "Accessory";

    public static String var_TG_copy_Exp = "mQB1zQLWJclvb+qqjkkZRQ==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_PlanName = "Experience More";

    public static String var_TradeInIMEI = "353629306900878";

    public static String var_Device_Name = "null";

    public static String var_deviceColor = "null";

    public static String var_Savingsvalue = "null";

    public static String var_SDDAdress1151 = "1403 NW Sammamish Rd";

    public static String var_Select_Environment = "Staging";

    public static String var_FirstDeviceName = "(//android.widget.TextView[@resource-id=\"device_name\"])[1]\'";

    public static String var_Prod_UserName = "7188648059";

    public static int var_sdfd = 23344;

    public static String var_PhoneNumber = "4048672642";

    public static String var_Password = "MagentaTest2026!";

    public static String var_DeviceName = "Galaxy S26 Ultra";

    public static String var_Username = "4255045541";

    public static String var_Bank_Prod_Routing_Number = "051000017";

    public static String var_Bank_Prod_Account_Number = "12345678";

    public static String var_Bank_Prod_Account_Name = "John Trivolta";

    public static String var_BundleID_Prod = "com.tmobile.tuesdays";

    public static String var_CC_Prod_Zipcode = "3fkdqo8zA8jWUTRp8jvN/A==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_CVV = "e32PkIF1vJKRdjlEfJt31g==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Exp = "vE70OZVYgwPXlm1szEm04Q==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Number = "Vwb+o1AxvPj5Epm8kXeQU2WjcjlW2JkMb2NXuZ2tfPY=:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Name = "W2bnNIX3yy9u4wBjFAGVTEl/me0QmkVBfzMnmGylutc=:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_TLifePassword = "MagentaTest2026!";

    public static String var_TLifeUserName = "7188648059";

    public static int var_count = 5;

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_tlifeandroid_shop_upgrade_devicesinglelineshipto() {
        tg.openDevice();
        // [DISABLED] var_Environment = tg.saveToVariable("Production", var_Environment);
        JSONObject var_ProdTestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260525/ucfqNI.json");
        JSONObject var_Qlab02TestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260525/eljBzV.json");
        JSONObject var_Qlab03TestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260518/svtQ8S.json");
        JSONObject var_CurrentTestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260518/XFSW7D.json");
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Qlab02")) {
            tg.customScriptStart();
            var_CurrentTestData = var_Qlab02TestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Qlab03")) {
            tg.customScriptStart();
            var_CurrentTestData = var_Qlab03TestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Prod")) {
            tg.customScriptStart();
            var_CurrentTestData = var_ProdTestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "ProdGreen")) {
            tg.customScriptStart();
            var_CurrentTestData = var_ProdTestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Stage")) {
            tg.customScriptStart();
            var_CurrentTestData = var_ProdTestData;
            tg.customScriptEnd();
        }
        // [DISABLED] var_TLifeUserName = tg.saveToVariable(var_TLifeUserName, var_CurrentTestData, "$.records[0].LocationRefreshUser");
        // [DISABLED] var_TLifePassword = tg.saveToVariable(var_TLifePassword, var_CurrentTestData, "$.records[0].LocationRefreshUserPassword");
        tg.printLogs(var_TLifeUserName);
        tg.printLogs(var_TLifePassword);
        // [DISABLED] var_TLifeUserName = tg.saveToVariable("3016409035", var_TLifeUserName);
        // [DISABLED] var_TLifePassword = tg.saveToVariable("pass@123", var_TLifePassword);
        var_TLifeUserName = tg.saveToVariable("4253409885", var_TLifeUserName);
        var_TLifePassword = tg.saveToVariable("Tmobile@2143", var_TLifePassword);
        String var_deviceName = "";
        tg.testFunction("TestFunctionHandleEnvironmentSwitcherAndLogin", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidclickonshoptab", new Object[] {});
        tg.testFunction("fndigitalandroidremovecart", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidclickonlookupgradecard", new Object[] {});
        tg.wait("ele_tlifeAnFirstDevice", ComparisonType.IS_VISIBLE, 20);
        var_deviceName = tg.getElementAttribute("ele_tlifeAnFirstDevice", "text", var_deviceName);
        tg.testFunction("fndigitaltlifeandroidfirstdevice", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidfirstdevicecolor", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidselectdevicestorage", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidselectshipping", new Object[] {});
        tg.testFunction("fnDigitalTlifeAndroidTradeInDeviceNew", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidselectprotectionplan", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidskipaccessories", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidclickonaddtocart", new Object[] {});
        tg.testFunction("fnDigitalTlifeAndroidVerifyPromo", new Object[] {});
        tg.scroll("ele_tlifeAnCartDeviceName", Direction.DOWN);
        tg.wait("ele_tlifeAnCartDeviceName", ComparisonType.IS_VISIBLE);
        tg.check.isEqualTo("ele_tlifeAnCartDeviceName", var_deviceName);
        tg.scroll("ele_tlifeAnCartTradeInCreditLabel", Direction.DOWN);
        tg.wait("ele_tlifeAnCartTradeInCreditLabel", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_tlifeAnCartTradeInCreditLabel");
        tg.testFunction("fndigitaltlifeandroidswitchdeliverytogroundandback", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidclickoncheckout", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidacceptagreements", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidaddcard", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidclickonpurchasebreakdown", new Object[] {});
        tg.wait("ele_tlifeAnBreakdownDeviceName", ComparisonType.IS_VISIBLE);
        tg.check.isEqualTo("ele_tlifeAnBreakdownDeviceName", var_deviceName);
        tg.testFunction("fndigitaltlifeandroidverifypurchasebreakdown", new Object[] {});
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

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_tlifeandroid_shop_upgrade_watchsingleline() {
        tg.openDevice();
        var_Environment = tg.saveToVariable("Qlab02", var_Environment);
        JSONObject var_ProdTestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260525/ucfqNI.json");
        JSONObject var_Qlab02TestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260525/eljBzV.json");
        JSONObject var_Qlab03TestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260518/svtQ8S.json");
        JSONObject var_CurrentTestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260518/XFSW7D.json");
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Qlab02")) {
            tg.customScriptStart();
            var_CurrentTestData = var_Qlab02TestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Qlab03")) {
            tg.customScriptStart();
            var_CurrentTestData = var_Qlab03TestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Prod")) {
            tg.customScriptStart();
            var_CurrentTestData = var_ProdTestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "ProdGreen")) {
            tg.customScriptStart();
            var_CurrentTestData = var_ProdTestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Stage")) {
            tg.customScriptStart();
            var_CurrentTestData = var_ProdTestData;
            tg.customScriptEnd();
        }
        tg.printLogs(var_TLifeUserName);
        tg.printLogs(var_TLifePassword);
        var_TLifeUserName = tg.saveToVariable("7176931409", var_TLifeUserName);
        var_TLifePassword = tg.saveToVariable("pass@123", var_TLifePassword);
        String var_deviceName = "";
        tg.testFunction("TestFunctionHandleEnvironmentSwitcherAndLogin", new Object[] {});
        tg.customScriptStart();
        ((io.appium.java_client.android.AndroidDriver) driver).setLocation(new org.openqa.selenium.html5.Location(47.552008, -122.057529, 0));
        tg.customScriptEnd();
        tg.testFunction("fndigitaltlifeandroidclickonshoptab", new Object[] {});
        tg.wait("ele_tlifeAnShopThisStoreButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnShopThisStoreButton", 1);
        tg.testFunction("fndigitaltlifeandroidreadytocheckoutremove", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidclickonlookupgradecard", new Object[] {});
        if (tg.performAssert("ele_continueUpgradingButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_continueUpgradingButton", 1);
        }
        tg.wait(10);
        tg.testFunction("fndigitaltlifeandroidclickonwatch", new Object[] {});
        tg.wait("ele_BOWISToggle", ComparisonType.IS_VISIBLE);
        if (tg.performAssert("ele_BOWISToggle", ComparisonType.IS_ON)) {
            tg.click("ele_BOWISToggle", 1);
        }
        // [DISABLED] tg.click("ele_BOWISToggle", 1);
        tg.testFunction("fndigitaltlifeandroidfirstdevicecolor", new Object[] {});
        // [DISABLED] tg.testFunction("fndigitaltlifeandroideip", new Object[]{});
        tg.testFunction("fndigitaltlifeandroidwatchstorage", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidselectbopis", new Object[] {});
        tg.swipe(Direction.UP);
        // [DISABLED] tg.testFunction("fndigitaltlifeandroidchangestore", new Object[]{});
        tg.testFunction("fndigitaltlifeandroidskiptradein", new Object[] {});
        tg.swipe(Direction.UP);
        tg.swipe(Direction.UP);
        tg.swipe(Direction.UP);
        tg.testFunction("fndigitaltlifeandroidselectprotection", new Object[] {});
        tg.testFunction("fnDigitalTLifeAndroidAddFirstAccessoryMonthlyPayment", new Object[] {});
        // [DISABLED] tg.testFunction("fndigitaltlifeandroidaccessoryeip", new Object[]{});
        tg.testFunction("fndigitaltlifeandroidaddtocart", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidcart", new Object[] {});
        tg.wait(5);
        tg.testFunction("fnDigitalTlifeAndriodValidateFullfillmentMethodShowsBOPISStore", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidcheckout", new Object[] {});
        tg.wait(5);
        tg.testFunction("fndigitaltlifeandroidacceptagreements", new Object[] {});
        tg.wait(5);
        tg.testFunction("fndigitaltlifeandroidaddcard", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidrevieworderbopis", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidpurchasebreakdown", new Object[] {});
        tg.wait(5);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digital_tlifeandroid_shop_upgrade_watchsingleline_copy() {
        tg.openDevice();
        var_Environment = tg.saveToVariable("Qlab02", var_Environment);
        JSONObject var_ProdTestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260525/ucfqNI.json");
        JSONObject var_Qlab02TestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260525/eljBzV.json");
        JSONObject var_Qlab03TestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260518/svtQ8S.json");
        JSONObject var_CurrentTestData = tg.getJsonData("https://tmobile.testgrid.io/s/csv-to-json/20260518/XFSW7D.json");
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Qlab02")) {
            tg.customScriptStart();
            var_CurrentTestData = var_Qlab02TestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Qlab03")) {
            tg.customScriptStart();
            var_CurrentTestData = var_Qlab03TestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Prod")) {
            tg.customScriptStart();
            var_CurrentTestData = var_ProdTestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "ProdGreen")) {
            tg.customScriptStart();
            var_CurrentTestData = var_ProdTestData;
            tg.customScriptEnd();
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Stage")) {
            tg.customScriptStart();
            var_CurrentTestData = var_ProdTestData;
            tg.customScriptEnd();
        }
        tg.printLogs(var_TLifeUserName);
        tg.printLogs(var_TLifePassword);
        var_TLifeUserName = tg.saveToVariable("7176931409", var_TLifeUserName);
        var_TLifePassword = tg.saveToVariable("pass@123", var_TLifePassword);
        String var_deviceName = "";
        tg.testFunction("TestFunctionHandleEnvironmentSwitcherAndLogin", new Object[] {});
        tg.customScriptStart();
        ((io.appium.java_client.android.AndroidDriver) driver).setLocation(new org.openqa.selenium.html5.Location(47.552008, -122.057529, 0));
        tg.customScriptEnd();
        tg.testFunction("fndigitaltlifeandroidclickonshoptab", new Object[] {});
        tg.wait("ele_tlifeAnShopThisStoreButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnShopThisStoreButton", 1);
        tg.testFunction("fndigitaltlifeandroidreadytocheckoutremove", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidclickonlookupgradecard", new Object[] {});
        if (tg.performAssert("ele_continueUpgradingButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_continueUpgradingButton", 1);
        }
        tg.wait(10);
        tg.testFunction("fndigitaltlifeandroidclickonwatch", new Object[] {});
        tg.wait("ele_BOWISToggle", ComparisonType.IS_VISIBLE);
        if (tg.performAssert("ele_BOWISToggle", ComparisonType.IS_ON)) {
            tg.click("ele_BOWISToggle", 1);
        }
        // [DISABLED] tg.click("ele_BOWISToggle", 1);
        tg.testFunction("fndigitaltlifeandroidfirstdevicecolor", new Object[] {});
        // [DISABLED] tg.testFunction("fndigitaltlifeandroideip", new Object[]{});
        tg.testFunction("fndigitaltlifeandroidwatchstorage", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidselectbopis", new Object[] {});
        tg.swipe(Direction.UP);
        // [DISABLED] tg.testFunction("fndigitaltlifeandroidchangestore", new Object[]{});
        tg.testFunction("fndigitaltlifeandroidskiptradein", new Object[] {});
        tg.swipe(Direction.UP);
        tg.swipe(Direction.UP);
        tg.swipe(Direction.UP);
        tg.testFunction("fndigitaltlifeandroidselectprotection", new Object[] {});
        tg.testFunction("fnDigitalTLifeAndroidAddFirstAccessoryMonthlyPayment", new Object[] {});
        // [DISABLED] tg.testFunction("fndigitaltlifeandroidaccessoryeip", new Object[]{});
        tg.testFunction("fndigitaltlifeandroidaddtocart", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidcart", new Object[] {});
        tg.wait(5);
        tg.testFunction("fnDigitalTlifeAndriodValidateFullfillmentMethodShowsBOPISStore", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidcheckout", new Object[] {});
        tg.wait(5);
        tg.testFunction("fndigitaltlifeandroidacceptagreements", new Object[] {});
        tg.wait(5);
        tg.testFunction("fndigitaltlifeandroidaddcard", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidrevieworderbopis", new Object[] {});
        tg.testFunction("fndigitaltlifeandroidpurchasebreakdown", new Object[] {});
        tg.wait(5);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void securetest() {
        tg.openDevice();
        tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782727175745", 1);
        tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782727175745", 1);
        tg.testFunction("TestFunctionForQtestTest", new Object[] {});
        tg.startSecureBlock();
        tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782727175745", "gautamkumar@testgmail.com", true);
        tg.wait("ele_EnterpasswordEditText1782727214455", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1782727214455", 1);
        tg.wait("ele_EnterpasswordEditText1782727214455", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnterpasswordEditText1782727214455", "testpassword@123", true);
        tg.wait("ele_textinputendiconImageButton1782727228418", ComparisonType.IS_VISIBLE);
        tg.click("ele_textinputendiconImageButton1782727228418", 1);
        tg.wait("ele_textinputendiconImageButton1782727228418", ComparisonType.IS_VISIBLE);
        tg.click("ele_textinputendiconImageButton1782727228418", 1);
        tg.endSecureBlock();
        tg.wait(1);
        tg.wait(1);
        tg.click("ele_AlgeriaTextView1781517755743");
        tg.click("ele_AlgeriaTextView1781517755743");
        tg.click("ele_AlgeriaTextView1781517755743");
        tg.testFunction("CallTestFunctionCheck", new Object[] {});
        int var_intvariables = 20;
        tg.printLogs("ele_ForgotPasswordTextView1783329197916");
        tg.networkAssert("QtestNewAsesert");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc1() {
        tg.openDevice();
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782989341799", "gautam@gmail.com", true);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1784028263660", 1);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnterpasswordEditText1784028263660", "pass4TG$", true);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc2() {
        tg.openDevice();
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782989341799", "gautam@gmail.com", true);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1784028263660", 1);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnterpasswordEditText1784028263660", "pass4TG$", true);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc3() {
        tg.openDevice();
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782989341799", "gautam@gmail.com", true);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1784028263660", 1);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnterpasswordEditText1784028263660", "pass4TG$", true);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc4() {
        tg.openDevice();
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782989341799", "gautam@gmail.com", true);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1784028263660", 1);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnterpasswordEditText1784028263660", "pass4TG$", true);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tttttt() {
        tg.openDevice();
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782989341799", "gautam@gmail.com", true);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1784028263660", 1);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnterpasswordEditText1784028263660", "pass4TG$", true);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void testsampletc() {
        tg.openDevice();
        tg.wait("ele_LoginView1775060160216", ComparisonType.IS_VISIBLE);
        tg.click("ele_LoginView1775060160216", 1);
        // [DISABLED] tg.wait(1);
        // [DISABLED] tg.testFunction("Functiontocopy", new Object[]{});
        // [DISABLED] tg.click("ele_LoginView1775060160216", 1);
        // [DISABLED] tg.wait(1);
        // [DISABLED] tg.testFunction("Functiontocopy", new Object[]{});
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void demo() {
        tg.openDevice();
        tg.wait(1);
        tg.wait(1);
        tg.wait(1);
        tg.wait(1);
        // [DISABLED] tg.wait(5);
        tg.close();
    }

    public static void calltestfunctioncheck() {
        tg.wait(1);
        tg.wait(2);
        tg.startSecureBlock();
        tg.wait(5);
        tg.endSecureBlock();
        tg.wait(10);
    }

    public static void functiontocopy() {
        tg.wait("ele_LoginView1775060160216", ComparisonType.IS_VISIBLE);
        // test copying
        String var_username = "abc";
    }

    public static void testfunctionforqtesttest() {
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782989341799", "calltestfunction@testfunction.io", true);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1784028263660", 1);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE, 4);
        tg.type("ele_EnterpasswordEditText1784028263660", "pass4TG$", true);
    }

    public static void testfunctionhandleenvironmentswitcherandlogin() {
        tg.wait(5);
        tg.customScriptStart();
        ((io.appium.java_client.android.AndroidDriver) driver).setLocation(new org.openqa.selenium.html5.Location(25.276987, 55.296249, 0));
        tg.customScriptEnd();
        tg.deactivateApp("com.tmobile.tmte");
        tg.clearAppData("com.tmobile.tmte");
        tg.activateApp("com.tmobile.tmte");
        tg.wait(30);
        tg.testFunction("fnDigitaltlifeAndroidHandleEnvironmentSwitcher");
        if (tg.performAssert("ele_tlifeAnFingerprintSetupUseFingerprintLabel", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnFingerprintSetupCloseButton", 1);
        }
        if (tg.performAssert("ele_tlifeAnWelcomeContinueButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnWelcomeContinueButton", 1);
        }
        if (tg.performAssert("ele_tlifeButtonSkipForNow", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeButtonSkipForNow", 1);
            tg.wait(2);
            tg.click("ele_tlifeButtonYesSkip", 1);
        }
        if (tg.performAssert("ele_tlifeAnWelcomeContinueButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnWelcomeContinueButton", 1);
        }
        if (tg.performAssert("ele_tlifeAndroidDataChoicesScreen", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAndroidDataChoicesContinueButton", 1);
            tg.scroll("ele_tlifeAndroidDataChoicesAcceptButton", Direction.DOWN);
            tg.click("ele_tlifeAndroidDataChoicesAcceptButton", 1);
        }
        if (tg.performAssert("ele_tlifeAndroidNextButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAndroidNextButton", 1);
            tg.wait(2);
            tg.click("ele_tlifeAnAllowButton", 1);
        }
        // [DISABLED] if(tg.performAssert("ele_tlifeAndroidNextButton", ComparisonType.IS_VISIBLE)){
        // [DISABLED] tg.click("ele_tlifeAndroidNextButton", 1);
        // [DISABLED] tg.wait(10);
        // [DISABLED] tg.click("ele_tlifeAllownotificationsLabel", 1);
        // [DISABLED] }
        if (tg.performAssert("ele_tlifeAndroidNextButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAndroidNextButton", 1);
            tg.wait(2);
            tg.click("ele_tlifeAnLocationWhileUsingTheAppButton", 1);
        }
        if (tg.performAssert("ele_tlifeAnBtnChangeSettings", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnNoThanksButton", 1);
        }
        if (tg.performAssert("ele_tlifeAndroidIntelligentHubCancel", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnCancelBtn", 1);
        }
        if (tg.performAssert("ele_tlifeAndroidWelcomeToMagentaStatusPage", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAndroidWelcomeToMagentaStatusPageCloseButton", 1);
        }
        tg.wait(15);
        if (tg.performAssert("ele_tlifeAnSnackbarRetryButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnSnackbarRetryButton", 1);
        }
        // [DISABLED] if(tg.performAssert("ele_BOWISCheckinCTA", ComparisonType.IS_VISIBLE)){
        // [DISABLED] tg.click("ele_ClosePopUp", 1);
        // [DISABLED] }
        // [DISABLED] if(tg.performAssert("ele_tlifeAnButtonPersonaliseShortcutCloseIcon", ComparisonType.IS_VISIBLE)){
        // [DISABLED] tg.click("ele_tlifeAnButtonPersonaliseShortcutCloseIcon", 1);
        // [DISABLED] }
        // [DISABLED] if(tg.performAssert("ele_tlifeAndBtnContinueWelcome", ComparisonType.IS_VISIBLE)){
        // [DISABLED] tg.click("ele_tlifeAndBtnContinueWelcome", 1);
        // [DISABLED] }
        tg.wait("ele_ManageTab", ComparisonType.IS_VISIBLE);
        if (tg.performAssert("ele_ManageTab", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_ManageTab", 1);
        }
        tg.wait("ele_tlifeAnSettingsButtonn", ComparisonType.IS_VISIBLE);
        if (tg.performAssert("ele_tlifeAnNotnowButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnNotnowButton", 1);
        }
        if (tg.performAssert("ele_tlifeAnSettingsButtonn", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnSettingsButtonn", 1);
            tg.click("ele_tlifeAnBtnLogInWithTmoID", 1);
            if (tg.performAssert("ele_tlifeAnLogInWithPasswordButton", ComparisonType.IS_VISIBLE)) {
                tg.click("ele_tlifeAnLogInWithPasswordButton", 1);
            }
        }
        if (tg.performAssert("ele_tlifeAnUsePasswordButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnUsePasswordButton", 1);
        }
        tg.wait("ele_tlifeAnTmobileIDTextBox", ComparisonType.IS_VISIBLE);
        tg.type("ele_tlifeAnTmobileIDTextBox", var_TLifeUserName, true);
        tg.type("ele_tlifePasswordAnTextBox", var_TLifePassword, true);
        tg.click("ele_tlifeAnLoginButton", 1);
        if (tg.performAssert("ele_tlifeAnWelcomeContinueButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnWelcomeContinueButton", 1);
        }
        if (tg.performAssert("ele_tlifeAnWelcomeContinueButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnWelcomeContinueButton", 1);
        }
        if (tg.performAssert("ele_tlifeAndroidDataChoicesScreen", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAndroidDataChoicesContinueButton", 1);
            tg.scroll("ele_tlifeAndroidDataChoicesAcceptButton", Direction.DOWN);
            tg.click("ele_tlifeAndroidDataChoicesAcceptButton", 1);
        }
        if (tg.performAssert("ele_tlifeAnSettingsBackButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnSettingsBackButton", 1);
        }
        // [DISABLED] if(tg.performAssert("ele_tlifeAnNotnowButton", ComparisonType.IS_VISIBLE)){
        // [DISABLED] tg.click("ele_tlifeAnNotnowButton", 1);
        // [DISABLED] }
        // [DISABLED] if(tg.performAssert("ele_tlifeAnAccountAccessReviewLabel", ComparisonType.IS_VISIBLE)){
        // [DISABLED] tg.click("ele_tlifeAnNotnowButton", 1);
        // [DISABLED] }
    }

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

    public static void fndigitaltlifeandriodvalidatefullfillmentmethodshowsbopisstore() {
        tg.scroll("ele_bopisStoreInCartPage", Direction.DOWN);
        tg.check.isVisible("ele_bopisStoreInCartPage");
    }

    public static void fndigitaltlifeandroidtradeindevicenew() {
        tg.wait(5);
        tg.swipe(Direction.UP);
        if (tg.performAssert("ele_tlifeAnTradeInButton", ComparisonType.IS_VISIBLE)) {
            tg.scroll("ele_tlifeAnTradeInButton", Direction.DOWN);
            tg.click("ele_tlifeAnTradeInButton", 1);
        }
        if (tg.performAssert("ele_tlifeAndroidProsGetTradeinEstimate", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAndroidProsGetTradeinEstimate", 1);
        }
        // [DISABLED] tg.scroll("ele_tlifeAndroidProsGetTradeinEstimate", Direction.DOWN);
        // [DISABLED] tg.click("ele_tlifeAndroidProsGetTradeinEstimate", 1);
        if (tg.performAssert("ele_DeviceDetailsUnavailableTextPopUpHeader", ComparisonType.IS_VISIBLE)) {
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

    public static void fndigitaltlifeandroidverifypromo() {
        if (tg.performAssert("ele_tlifeAnPromotionCard", ComparisonType.IS_VISIBLE)) {
            tg.check.isVisible("ele_tlifeAnPromotionCard");
        }
    }

    public static void fndigitaltlifehandlereviewcartpaymentadjustpopup() {
        if (tg.performAssert("ele_YourpaymentsadjustedbasedonourfinancingofferPopup", ComparisonType.IS_VISIBLE)) {
            // [DISABLED] 		tg.click("ele_PaymentAdjustmentPopUpCloseBtn", 1);
            tg.click("ele_tlifeAnButtonCloseImage", 1);
        }
    }

    public static void fndigitaltlifeandroidhandleenvironmentswitcher() {
        tg.check.isVisible("ele_EnvironmentswitcherPagetitle");
        tg.click("ele_AppEnvselection", 1);
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Qlab01")) {
            tg.click("ele_tlifeAndroidQlab01Environment");
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Qlab02")) {
            tg.click("ele_tlifeAndroidQlab02Environment", 1);
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Qlab03")) {
            tg.click("ele_tlifeAndroidQlab03Environment", 1);
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Stage")) {
            tg.click("ele_tlifeAndroidStageEnvironment", 1);
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Prodgreen")) {
            tg.click("ele_tlifeAndroidProdGreenEnvironment", 1);
        }
        if (tg.performAssert(var_Environment, ComparisonType.EQUAL_TO, "Prod")) {
            tg.click("ele_tlifeAndroidProdEnvironment", 1);
        }
        tg.click("ele_tlifeAndroidSaveButton", 1);
        if (tg.performAssert("ele_Welcomepagecontinuebutton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_Welcomepagecontinuebutton");
        }
        if (tg.performAssert("ele_Closebutton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_Closebutton");
        }
    }

    public static void fndigitalandroidremovecart() {
        tg.wait(10);
        if (tg.performAssert("ele_tlifeAnReadytoCheckout", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnReadytoCheckout", 1);
            tg.wait(2);
            tg.testFunction("fnDigitalTlifehandleReviewCartPaymentAdjustPopUp");
            tg.click("ele_tlifeAnCartHeader", 1);
            while (tg.verify.isInvisible("ele_tlifeAnShopForMoreButtonn")) {
                tg.testFunction("fnDigitalTlifehandleReviewCartPaymentAdjustPopUp");
                if (tg.performAssert("ele_tlifeAnCartDeviceMenuButton", ComparisonType.IS_VISIBLE)) {
                    tg.click("ele_tlifeAnCartDeviceMenuButton", 1);
                    tg.wait(2);
                    tg.click("ele_tlifeAnRemoveDeviceOption", 1);
                    tg.wait(1);
                    tg.click("ele_tlifeAnDialogRemoveButton", 1);
                    tg.wait(2);
                }
                if (tg.performAssert("ele_tlifeAnCartLineCardChevron", ComparisonType.IS_VISIBLE)) {
                    tg.click("ele_tlifeAnCartLineCardChevron", 1);
                    tg.wait(2);
                    tg.click("ele_tlifeAnCartDeviceMenuButton", 1);
                    tg.wait(2);
                    tg.click("ele_tlifeAnRemoveDeviceOption", 1);
                    tg.wait(1);
                    tg.click("ele_tlifeAnDialogRemoveButton", 1);
                    tg.wait(2);
                }
            }
            tg.click("ele_tlifeAnShopForMoreButton", 1);
            tg.wait(2);
        }
    }

    public static void fndigitaltlifeandroidacceptagreements() {
        tg.wait(15);
        if (tg.performAssert("ele_DismissPopup", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_DismissPopup", 1);
        }
        tg.wait("ele_tlifeAnConsentElectronicCheckbox", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnConsentElectronicCheckbox", 1);
        tg.wait("ele_tlifeAnEquipmentPlanCheckboxFirst", ComparisonType.IS_VISIBLE);
        if (tg.performAssert("ele_tlifeAnEquipmentPlanCheckboxFirst", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnEquipmentPlanCheckboxFirst", 1);
        }
        tg.wait(5);
        if (tg.performAssert("ele_tlifeAnEquipmentPlanCheckboxSecond", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnEquipmentPlanCheckboxSecond", 1);
        }
        tg.swipe(Direction.UP);
        tg.wait(5);
        if (tg.performAssert("ele_tlifeAnTradeInAgreementCheckbox", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnTradeInAgreementCheckbox", 1);
        }
        tg.wait("ele_tlifeAnAgreeAndContinueButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnAgreeAndContinueButton", 1);
        tg.wait(10);
    }

    public static void fndigitaltlifeandroidaccessoryeip() {
        tg.wait(1);
        tg.swipe(Direction.UP);
        tg.wait("ele_tlifeAnAccEIP", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnAccEIP", 1);
        tg.wait(2);
    }

    public static void fndigitaltlifeandroidaddcard() {
        tg.wait("ele_tlifeAnPaymentNameField", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_tlifeAnPaymentNameField", 1);
        tg.wait("ele_tlifeAnPaymentNameField", ComparisonType.IS_VISIBLE);
        tg.type("ele_tlifeAnPaymentNameField", "Master Card", true);
        tg.wait("ele_tlifeAnPaymentCardNumberField", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnPaymentCardNumberField", 1);
        tg.wait("ele_tlifeAnPaymentCardNumberField", ComparisonType.IS_VISIBLE);
        tg.type("ele_tlifeAnPaymentCardNumberField", "5555 5555 5555 4444", true);
        tg.wait("ele_tlifeAnPaymentExpiryDateField", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnPaymentExpiryDateField", 1);
        tg.wait("ele_tlifeAnPaymentExpiryDateField", ComparisonType.IS_VISIBLE);
        tg.type("ele_tlifeAnPaymentExpiryDateField", "330", true);
        tg.wait("ele_tlifeAnPaymentCVVField", ComparisonType.IS_VISIBLE, 6);
        tg.click("ele_tlifeAnPaymentCVVField", 1);
        tg.wait("ele_tlifeAnPaymentCVVField", ComparisonType.IS_VISIBLE);
        tg.type("ele_tlifeAnPaymentCVVField", "777", true);
        tg.wait("ele_tlifeAnPaymentNicknameField", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnPaymentNicknameField", 1);
        tg.type("ele_tlifeAnPaymentNicknameField", "testcard", true);
        tg.click("ele_tlifeAnToggleSavetomywallet", 1);
        tg.click("ele_tlifeAnSelectToggleUsethisasmypaymentaddress", 1);
        tg.wait("ele_tlifeAnPaymentContinueButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnPaymentContinueButton", 1);
        tg.wait(5);
    }

    public static void fndigitaltlifeandroidaddtocart() {
        tg.wait(1);
        tg.scroll("ele_tlifeAnAddtoCart", Direction.DOWN);
        tg.click("ele_tlifeAnAddtoCart", 1);
        tg.wait(20);
    }

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

    public static void fndigitaltlifeandroidcheckout() {
        tg.wait(10);
        tg.wait("ele_tlifeAnlabelReviewCartCheckout", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnlabelReviewCartCheckout", 1);
        if (tg.performAssert("ele_tlifeAnlabelAdddevicesbeforecheckingout", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_NoThanksButton", 1);
        }
    }

    public static void fndigitaltlifeandroidclickonaddtocart() {
        tg.wait(10);
        if (tg.performAssert("ele_tlifeAnContinueButton", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnContinueButton", 1);
        }
        tg.wait(10);
        tg.scroll("ele_tlifeAnAddToCartButtonn", Direction.DOWN);
        tg.click("ele_tlifeAnAddToCartButtonn", 1);
        tg.wait(30);
    }

    public static void fndigitaltlifeandroidclickoncheckout() {
        tg.wait("ele_tlifeAnCheckOutButton", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_tlifeAnCheckOutButton", 1);
        tg.wait(10);
    }

    public static void fndigitaltlifeandroidclickonlookupgradecard() {
        tg.wait(5);
        // [DISABLED] tg.scroll("ele_tlifeAnUpgradeCard", Direction.DOWN);
        tg.wait(2);
        tg.click("ele_tlifeAnUpgradeCard", 1);
        tg.wait(10);
    }

    public static void fndigitaltlifeandroidclickonpurchasebreakdown() {
        tg.scroll("ele_tlifeAnViewPurchaseBreakdownLink", Direction.DOWN);
        tg.wait("ele_tlifeAnViewPurchaseBreakdownLink", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnViewPurchaseBreakdownLink", 1);
        tg.wait(5);
    }

    public static void fndigitaltlifeandroidclickonshoptab() {
        tg.wait(5);
        tg.wait("ele_tlifeAnTabShop", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnTabShop", 1);
    }

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

    public static void fndigitaltlifeandroideip() {
        tg.wait(5);
        tg.wait("ele_tlifeAnPaymonthly", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnPaymonthly", 1);
        tg.wait(2);
    }

    public static void fndigitaltlifeandroidfirstdevice() {
        tg.wait("ele_tlifeAnFirstDevice", ComparisonType.IS_VISIBLE, 20);
        var_Device_Name = tg.getElementAttribute("ele_tlifeAnFirstDevice", "text", var_Device_Name);
        tg.click("ele_tlifeAnFirstDevice", 1);
        tg.printLogs(var_Device_Name);
        tg.wait(10);
    }

    public static void fndigitaltlifeandroidfirstdevicecolor() {
        tg.scroll("ele_tlifeAnFirstDeviceColor", Direction.DOWN);
        tg.wait("ele_tlifeAnFirstDeviceColor", ComparisonType.IS_VISIBLE);
        var_deviceColor = tg.getElementAttribute("ele_tlifeAnFirstDeviceColor", "text", var_deviceColor);
        tg.click("ele_tlifeAnFirstDeviceColor", 1);
        tg.printLogs(var_deviceColor);
    }

    public static void fndigitaltlifeandroidpurchasebreakdown() {
        tg.wait(5);
        tg.scroll("ele_tlifeAnViewPurchaseBreakdownLink", Direction.DOWN);
        tg.click("ele_tlifeAnViewPurchaseBreakdownLink", 1);
        tg.wait("ele_tlifeAnPurchasebreakdownHeader", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnPurchasebreakdownHeader", 1);
        // [DISABLED] tg.wait("ele_tlifeAnPurchasebreakdownDevice", ComparisonType.IS_VISIBLE);
        // [DISABLED] tg.check.isVisible("ele_tlifeAnPurchasebreakdownDevice");
        // [DISABLED] tg.wait("ele_tlifeAnPurchasebreakdownProtection", ComparisonType.IS_VISIBLE);
        // [DISABLED] tg.check.isVisible("ele_tlifeAnPurchasebreakdownProtection");
        tg.swipe(Direction.UP);
        tg.wait("ele_tlifeAnPurchasebreakdownEstimatedTax", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_tlifeAnPurchasebreakdownEstimatedTax");
        tg.scroll("ele_tlifeAnPurchasebreakdownTotal", Direction.DOWN);
        tg.check.isVisible("ele_tlifeAnPurchasebreakdownTotal");
        if (tg.performAssert("ele_tlifeAnPurchaseBreakdownClose", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnPurchasebreakdownCloseButton", 1);
        }
        tg.wait(5);
    }

    public static void fndigitaltlifeandroidreadytocheckoutremove() {
        tg.wait(5);
        if (tg.performAssert("ele_tlifeAnReadytoCheckout", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_tlifeAnReadytoCheckout", 1);
            tg.wait(10);
            tg.wait("ele_MenuButton1773294044176", ComparisonType.IS_VISIBLE);
            tg.click("ele_MenuButton1773294044176", 1);
            tg.wait(2);
            tg.wait("ele_RemovedeviceTextView1773574735446", ComparisonType.IS_VISIBLE);
            tg.click("ele_RemovedeviceTextView1773574735446", 1);
            tg.wait(2);
            tg.wait("ele_tlifeAnRemovecartdevice", ComparisonType.IS_VISIBLE);
            tg.click("ele_tlifeAnRemovecartdevice", 1);
            tg.wait(5);
            tg.wait("ele_tlifeAnShopForMore", ComparisonType.IS_VISIBLE);
            tg.click("ele_tlifeAnShopForMore", 1);
            tg.wait(5);
        }
    }

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

    public static void fndigitaltlifeandroidselectbopis() {
        tg.wait(5);
        tg.wait("ele_tlifeAnPickupStore", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnPickupStore", 1);
        tg.swipe(Direction.UP);
        tg.wait(4);
    }

    public static void fndigitaltlifeandroidselectdevicestorage() {
        tg.wait(5);
        tg.scroll("ele_tlifeAnDeviceStorageButton", Direction.DOWN);
        tg.wait("ele_tlifeAnDeviceStorageButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnDeviceStorageButton", 1);
    }

    public static void fndigitaltlifeandroidselectprotection() {
        tg.wait(15);
        tg.scroll("ele_tlifeAnAddProtection", Direction.DOWN);
        tg.click("ele_tlifeAnAddProtection", 1);
        tg.wait(5);
    }

    public static void fndigitaltlifeandroidselectprotectionplan() {
        tg.swipe(Direction.UP);
        tg.swipe(Direction.UP);
        tg.scroll("ele_tlifeAnProtectionSelectButtonn", Direction.DOWN);
        tg.wait("ele_tlifeAnProtectionSelectButtonn", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnProtectionSelectButtonn", 1);
        tg.wait(10);
    }

    public static void fndigitaltlifeandroidselectshipping() {
        tg.wait("ele_tlifeAnShippingButton", ComparisonType.IS_VISIBLE);
        tg.scroll("ele_tlifeAnShippingButton", Direction.DOWN);
        tg.click("ele_tlifeAnShippingButton", 1);
        tg.wait(10);
    }

    public static void fndigitaltlifeandroidskipaccessories() {
        tg.wait(30);
        tg.swipe(Direction.UP);
        tg.swipe(Direction.UP);
        tg.swipe(Direction.UP);
        tg.swipe(Direction.UP);
        tg.scroll("ele_tlifeAnSkipAccessoriesButton", Direction.DOWN);
        tg.wait("ele_tlifeAnSkipAccessoriesButton", ComparisonType.IS_VISIBLE);
        tg.wait(10);
        tg.click("ele_tlifeAnSkipAccessoriesButton", 1);
        tg.wait(5);
    }

    public static void fndigitaltlifeandroidskiptradein() {
        tg.wait(5);
        tg.swipe("ele_TradeinView", Direction.UP);
        tg.scroll("ele_selectskiptradein", Direction.DOWN);
        tg.click("ele_selectskiptradein", 1);
        tg.wait(2);
        tg.wait("ele_tlifeAnSkipTradeinContinueButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnSkipTradeinContinueButton", 1);
        tg.wait(5);
    }

    public static void fndigitaltlifeandroidswitchdeliverytogroundandback() {
        tg.scroll("ele_tlifeAnDeliveryMethodEditButton", Direction.DOWN);
        tg.wait("ele_tlifeAnDeliveryMethodEditButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnDeliveryMethodEditButton", 1);
        tg.wait("ele_tlifeAnDeliveryGround", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnDeliveryGround", 1);
        tg.wait(2);
        tg.customScriptStart();
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence tap1 = new Sequence(finger1, 1);
        tap1.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 540, 2000));
        tap1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(java.util.Arrays.asList(tap1));
        tg.customScriptEnd();
        tg.wait(5);
        // [DISABLED] tg.wait("ele_tlifeAnDeliveryTypeGround", ComparisonType.IS_VISIBLE, 20);
        tg.scroll("ele_tlifeAnDeliveryMethodEditButton", Direction.DOWN);
        tg.wait("ele_tlifeAnDeliveryMethodEditButton", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnDeliveryMethodEditButton", 1);
        tg.wait("ele_tlifeAnDeliveryTwoDay", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnDeliveryTwoDay", 1);
        tg.wait(2);
        tg.customScriptStart();
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
        Sequence tap2 = new Sequence(finger2, 1);
        tap2.addAction(finger2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 540, 2000));
        tap2.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(java.util.Arrays.asList(tap2));
        tg.customScriptEnd();
        tg.wait(5);
        tg.wait("ele_tlifeAnDeliveryTwoDay", ComparisonType.IS_VISIBLE, 20);
    }

    public static void fndigitaltlifeandroidverifypurchasebreakdown() {
        if (tg.performAssert("ele_tlifeAnBreakdownProtection360Label", ComparisonType.IS_VISIBLE)) {
            tg.scroll("ele_tlifeAnBreakdownProtection360Label", Direction.DOWN);
        }
        if (tg.performAssert("ele_tlifeAnBreakdownShippingLabel", ComparisonType.IS_VISIBLE)) {
            tg.scroll("ele_tlifeAnBreakdownShippingLabel", Direction.DOWN);
            tg.wait("ele_tlifeAnBreakdownShippingLabel", ComparisonType.IS_VISIBLE);
        }
        tg.scroll("ele_tlifeAnBreakdownEstimatedTaxLabel", Direction.DOWN);
        tg.wait("ele_tlifeAnBreakdownEstimatedTaxLabel", ComparisonType.IS_VISIBLE);
        tg.scroll("ele_tlifeAnPurchasebreakdownTotal", Direction.DOWN);
        tg.wait("ele_tlifeAnBreakdownTotalLabel", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnPurchasebreakdownCloseButton", 1);
    }

    public static void fndigitaltlifeandroidwatchstorage() {
        tg.wait(5);
        tg.swipe(Direction.UP);
        tg.swipe(Direction.UP);
        tg.scroll("ele_tlifeAnWatchStorage", Direction.DOWN);
        // [DISABLED] tg.wait("ele_tlifeAnWatchStorage", ComparisonType.IS_VISIBLE);
        tg.click("ele_tlifeAnWatchStorage", 1);
        tg.wait(2);
    }
}
