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
public class new_assertion_tc {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void new_assertion_tc() {
		tg.openBrowser();
		tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/form-step-1.html");
		tg.wait("ele_enteryourf216", ComparisonType.IS_VISIBLE);
		tg.click("ele_enteryourf216", 1);
		tg.type("ele_enteryourf216", "upen");
		tg.softCheck.contains("ele_enteryourf216","upen", true);
		tg.softCheck.isNotEqualTo("ele_enteryourf216","Goswami", false);
		tg.softCheck.isEqualTo("ele_enteryourf216","upen", true);
		tg.check.contains("ele_enteryourf216","upen", false);
		tg.check.isEqualTo("ele_enteryourf216","Upen", false);
		tg.check.isNotEqualTo("ele_enteryourf216","goswwami", false);
		tg.wait("ele_enteryourf216", ComparisonType.CONTAINS, "upen");
		tg.wait("ele_enteryourf216", ComparisonType.EQUAL_TO, "upen");
		tg.wait("ele_enteryourf216", ComparisonType.NOT_EQUAL_TO, "Goswami");
		tg.softCheck.contains("ele_enteryourf216","upe", true);
		tg.softCheck.isNotEqualTo("ele_enteryourf216","Goswami", false);
		tg.softCheck.isEqualTo("ele_enteryourf216","upen", true);
		tg.wait("ele_lastname733", ComparisonType.IS_VISIBLE);
		tg.click("ele_lastname733", 1);
		tg.type("ele_lastname733", "Goswami");
		tg.softCheck.contains("ele_lastname733","Goswami", true);
		tg.wait(1);
		tg.close();
	}
}