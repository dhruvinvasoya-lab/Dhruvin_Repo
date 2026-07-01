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
public class tc01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc01() {
		tg.openBrowser();
		tg.wait(2);
		tg.type("ele_username094", "adsfadsf");
		tg.typeEncrypted("ele_password304", "DL+KAmbQPS+yzAeiL99Syg==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.click("ele_submit669", 1);
		tg.testFunction("TF001", new Object[]{});
		tg.click("ele_password758");
		tg.wait(2);
		tg.type("ele_username094", "adsfadsf");
		tg.typeEncrypted("ele_password304", "DL+KAmbQPS+yzAeiL99Syg==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.click("ele_submit669", 1);
		tg.testFunction("TF001", new Object[]{});
		tg.click("ele_password758");
		tg.close();
	}
}