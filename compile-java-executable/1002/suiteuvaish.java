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
@Listeners(TestListener.class)
public class suiteuvaish {

    public static String var_ra_runtimeurunapp = "ABC";

    public static String var_nestapp = "com.nestdesign.nestforms";

    public static String var_urunapp = "com.app.urunner";

    public static int var_ra_rintdate = 12;

    public static int var_GBInt = 100;

    public static String var_GBStr = "GlobalString";
}
