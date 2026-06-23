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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class Ftest {

    public static int var_V1 = 10;

    public static String var_ra_str2 = "vd";

    public static String var_ra_str1 = "eg";

    public static String var_S1 = "sdf";

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void dvtc01() {
        tg.openBrowser();
        tg.wait(5);
        var_S1 = (String) tg.testFunction("DVTF01", new Object[] { var_ra_str1, var_ra_str2, var_V1 });
        tg.printLogs(var_S1);
        tg.close();
    }

    public static Object dvtf01(String FirstName, String LastName, Integer amount) {
        String var_TGReturn = "";
        tg.customScriptStart();
        System.out.println("FName " + FirstName);
        System.out.println("LName " + LastName);
        var_TGReturn = FirstName + " " + LastName + " " + amount;
        System.out.println("Full Name " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }
}
