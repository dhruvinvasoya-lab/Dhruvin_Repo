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
public class tc001 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc001() {
		tg.openBrowser();
				tg.wait(2);
				tg.wait("ele_username603", ComparisonType.IS_VISIBLE);
				tg.click("ele_username603", 1);
				tg.wait("ele_username603", ComparisonType.IS_VISIBLE);
				tg.type("ele_username603", "Vault_HashiCorp_password@@secret/data/testgrid");
				tg.wait("ele_password527", ComparisonType.IS_VISIBLE);
				tg.click("ele_password527", 1);
				tg.wait("ele_password417", ComparisonType.IS_VISIBLE);
				tg.click("ele_password417", 1);
				tg.wait("ele_password417", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_password417", "Vault_HashiCorp_password@@secret/data/login");
				tg.wait("ele_submit524", ComparisonType.IS_VISIBLE);
				tg.click("ele_submit524", 1);
		tg.close();
	}
}