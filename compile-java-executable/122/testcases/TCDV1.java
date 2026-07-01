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
public class tcdv1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcdv1() {
		tg.openBrowser();
		tg.wait(5);
		tg.click("ele_firstname272", 1);
		tg.type("ele_firstname272", "Vault_HashiCorp_app_username@@tmobile/data/APM0103858/shared/accounts/tosca");
		tg.click("ele_lastname360", 1);
		tg.type("ele_lastname360", "Vault_HashiCorp_app_username@@tmobile/data/APM0103858/shared/accounts/tosca");
		tg.click("ele_textareatgwebcomma638", 1);
		tg.type("ele_textareatgwebcomma638", "This is Demo text");
		tg.close();
	}
}