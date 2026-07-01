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

class copyoftf001 {

	public static void copyoftf001() {
		tg.wait(2);
		tg.startSecureBlock();
		tg.type("ele_username094", "Vault_HashiCorp_db_user@@secret/data/database");
		tg.typeEncrypted("ele_password304", "Vault_HashiCorp_password@@secret/data/testgrid");
		tg.endSecureBlock();
	}
}