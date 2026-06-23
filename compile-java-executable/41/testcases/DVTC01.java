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
public class dvtc01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void dvtc01() {
		tg.openBrowser();
				tg.wait(5);
				String var_S1 = (String) tg.testFunction("DVTF01", new Object[]{var_ra_str1, var_ra_str2, var_V1});
				tg.printLogs(var_S1);
				tg.switchToTab(var_V1);
		tg.close();
	}
}