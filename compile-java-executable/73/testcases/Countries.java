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
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class countries {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void countries() {
		tg.openDevice();
		tg.click("ele_btncountry1794542100819", 1);
		tg.wait("ele_search1794542107198", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_search1794542107198", 1);
		tg.wait("ele_search1794542113837", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_search1794542113837", 1);
		tg.type("ele_search1794542113837", "India", false);
		tg.click("ele_cardmain1794542124126", 1);
		tg.wait("ele_back1794542131643", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_back1794542131643", 1);
		tg.wait("ele_back1794542131643", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_back1794542131643", 1);
		START_CUSTOM_SCRIPT;
		/* CoTester: swipe "Countries, Wonders of the world, Continents…" down */ { org.openqa.selenium.Rectangle tgR = driver.findElement(org.openqa.selenium.By.xpath("//android.widget.ScrollView[@resource-id=\"ru.androidtools.countries_of_the_world:id/include_main\"]")).getRect(); org.openqa.selenium.interactions.PointerInput tgF = new org.openqa.selenium.interactions.PointerInput(org.openqa.selenium.interactions.PointerInput.Kind.TOUCH, "finger"); org.openqa.selenium.interactions.Sequence tgS = new org.openqa.selenium.interactions.Sequence(tgF, 1); tgS.addAction(tgF.createPointerMove(java.time.Duration.ZERO, org.openqa.selenium.interactions.PointerInput.Origin.viewport(), tgR.getX() + (int) (tgR.getWidth() * 0.5), tgR.getY() + (int) (tgR.getHeight() * 0.2))); tgS.addAction(tgF.createPointerDown(0)); tgS.addAction(new org.openqa.selenium.interactions.Pause(tgF, java.time.Duration.ofMillis(150))); tgS.addAction(tgF.createPointerMove(java.time.Duration.ofMillis(400), org.openqa.selenium.interactions.PointerInput.Origin.viewport(), tgR.getX() + (int) (tgR.getWidth() * 0.5), tgR.getY() + (int) (tgR.getHeight() * 0.8))); tgS.addAction(new org.openqa.selenium.interactions.Pause(tgF, java.time.Duration.ofMillis(200))); tgS.addAction(tgF.createPointerUp(0)); ((org.openqa.selenium.interactions.Interactive) driver).perform(java.util.Arrays.asList(tgS)); }
		END_CUSTOM_SCRIPT;
		tg.click("ele_btngame1794542155479", 1);
		tg.close();
	}
}