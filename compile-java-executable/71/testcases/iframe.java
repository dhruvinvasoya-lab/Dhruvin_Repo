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
public class iframe {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void iframe() {
		tg.openBrowser();
		tg.navigateToUrl("https://demo.automationtesting.in/Frames.html");
		tg.wait("ele_AutomationDemoSite", ComparisonType.IS_VISIBLE);
		tg.click("ele_SingleIframe", 1);
		tg.wait("ele_singleifra502", ComparisonType.IS_VISIBLE);
		tg.click("ele_singleifra502", 1);
		tg.switchToFrame("ele_pyourbrows871");
		tg.wait("ele_div824", ComparisonType.IS_VISIBLE);
		tg.click("ele_div824", 1);
		tg.wait("ele_text951", ComparisonType.IS_VISIBLE);
		tg.click("ele_text951", 1);
		tg.wait("ele_text951", ComparisonType.IS_VISIBLE);
		tg.type("ele_text951", "Demo");
		tg.switchToDefaultContent();
		tg.click("ele_IframewithinanIframe", 1);
		tg.switchToFrame("ele_pyourbrows619");
		tg.switchToFrame("ele_pyourbrows855");
		tg.wait("ele_text279", ComparisonType.IS_VISIBLE);
		tg.click("ele_text279", 1);
		tg.wait("ele_text279", ComparisonType.IS_VISIBLE);
		tg.type("ele_text279", "Demo 2");
		tg.switchToDefaultContent();
		tg.close();
	}
}