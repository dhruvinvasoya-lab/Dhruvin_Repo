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
public class tc20 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc20() {
		tg.openBrowser();
		tg.wait(1);
		tg.type("ele_username603", "Authenticator_Gooogle@@25");
		tg.wait(1);
		tg.type("ele_username670", "Authenticator_Mac_Mini@@30");
		tg.wait(1);
		tg.type("ele_username603", "Authenticator_Test@@35");
		tg.wait(1);
		tg.close();
	}
}