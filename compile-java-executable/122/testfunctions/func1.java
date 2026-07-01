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

class func1 {

	public static void func1() {
		tg.wait(2);
		tg_String var_name = "alice";
		tg.typeEncrypted("ele_lastname360", "Vault_HashiCorp_cotester_password@@tmobile/data/APM0103858/shared/accounts/cotester");
		tg.type("ele_firstname080", "Vault_HashiCorp_app_username@@tmobile/data/APM0103858/shared/accounts/tosca");
		tg.type("ele_firstname064", "Vault_HashiCorp_cotester_username@@tmobile/data/APM0103858/shared/accounts/cotester");
	}
}