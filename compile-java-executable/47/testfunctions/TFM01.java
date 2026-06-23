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

class tfm01 {

	public static void tfm01() {
		int var_S1 = (int) tg.testFunction("F2", new Object[]{var_V1});
		tg.printLogs(var_S1);
		tg.printLogs(var_V1);
		// [DISABLED] String var_S1 = (String) tg.testFunction("RNP2", new Object[]{var_ra_RS1, var_ra_RS2, var_V1});
	}
}