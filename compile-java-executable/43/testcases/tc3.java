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
public class tc3 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc3() {
		tg.openBrowser();
				tg.navigateToUrl("https://ultimateqa.com/automation/");
				tg.wait("ele_evolvingapplicationlinkele25071440103799", ComparisonType.IS_VISIBLE);
				tg.click("ele_evolvingapplicationlinkele25071440103799", 1);
				tg.wait("ele_sprint1headingele20071603765914", ComparisonType.IS_VISIBLE);
				tg.type("ele_firstnameele22071603765914", "FirstDemo");
				tg.click("ele_nextsprintlinkele24071603765914", 1);
				tg.wait("ele_iteration2headingele20071710268476", ComparisonType.IS_VISIBLE);
				tg.type("ele_firstnameele22071710268476", "FirstDemo");
				tg.type("ele_lastnameele23071710268476", "LastDemo");
				tg.click("ele_gotosprint3linkele25071710268476", 1);
				tg.wait("ele_iteration3headingele20071759471139", ComparisonType.IS_VISIBLE);
				tg.click("ele_maleele22071759471139", 1);
				tg.type("ele_firstnameele39071848469084", "FirstDemo");
				tg.type("ele_lastnameele40071848469084", "LastDemo");
				tg.click("ele_gotosprint4linkele42071848469084", 1);
				tg.wait("ele_iteration4headingele34071940632126", ComparisonType.IS_VISIBLE);
				tg.click("ele_gotosprint5linkele51071940632126", 1);
				tg.wait("ele_iteration5headingele34072028161295", ComparisonType.IS_VISIBLE);
				tg.click("ele_submitele50072028161295", 1);
		tg.close();
	}
}