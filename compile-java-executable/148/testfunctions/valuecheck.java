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
class valuecheck {

	public static void valuecheck() {
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
		tg_int var_count = 5;
		tg.check.isEqualTo(var_count,5);
		tg.check.isNotEqualTo(var_count,3);
		tg.check.isGreaterThanOrEqualTo(var_count,4);
		tg.check.isLessThanOrEqualTo(var_count,7);
		tg.check.isGreaterThan(var_count,1);
		tg.check.isLessThan(var_count,6);
	}
}