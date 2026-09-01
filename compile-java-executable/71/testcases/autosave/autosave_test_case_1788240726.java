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
public class test_case_1788240726 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void test_case_1788240726() {
		tg.openBrowser();
				tg.wait("ele_firstname83054307304811", ComparisonType.IS_VISIBLE);
				tg.type("ele_firstname83054307304811", "John");
				tg.wait("ele_lastname83054307304811", ComparisonType.IS_VISIBLE);
				tg.type("ele_lastname83054307304811", "Doe");
				tg.wait("ele_email83054307304811", ComparisonType.IS_VISIBLE);
				tg.type("ele_email83054307304811", "john.doe@test.com");
				tg.wait("ele_phone83054307304811", ComparisonType.IS_VISIBLE);
				tg.type("ele_phone83054307304811", "9876543210");
		tg.close();
	}
}