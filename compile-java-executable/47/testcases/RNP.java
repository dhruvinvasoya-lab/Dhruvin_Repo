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

@Listeners(TestListener.class);
public class rnp {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void rnp() {
		tg.openBrowser();
		tg.wait(5);
		tg_int var_in1 = 10;
		// [DISABLED] var_S1 = (int) tg.testFunction("F2", new Object[]{var_V1});
		tg.printLogs(var_S1);
		tg.type("ele_firstname112", var_S1);
		tg_int var_v123 = 100;
		tg.writeToCSV("var_v123", var_v123, var_ra_RS1);
		// [DISABLED] tg.writeToCSV("var_ra_RS2", var_ra_RS2, "sdgvds");
		// [DISABLED] tg.writeToCSV("var_ra_Rs3", var_ra_Rs3, "gterge");
		tg.close();
	}
}