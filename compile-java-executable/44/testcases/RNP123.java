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
public class rnp123 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void rnp123() {
		tg.openBrowser();
		tg.wait("ele_firstname134", ComparisonType.IS_VISIBLE);
		tg.click("ele_firstname134", 1);
		tg.wait("ele_firstname134", ComparisonType.IS_VISIBLE);
		tg.startSecureBlock();
		tg.type("ele_firstname134", "Vault_HashiCorp_username");
		tg.endSecureBlock();
		tg.wait(5);
		tg.click("ele_lastname217", 1);
		tg.close();
	}
}