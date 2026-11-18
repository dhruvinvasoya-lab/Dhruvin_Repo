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
public class press_key {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void press_key() {
		tg.openBrowser();
		tg.navigateToUrl("https://notifications.testgrid.io/qawebtest/virtual-keyboard.html");
		tg.pressKey(CONTROL_S, 1);
		tg.pressKey(CONTROL_Q, 1);
		tg.pressKey(CONTROL_R, 1);
		tg.pressKey(CONTROL_G, 1);
		tg.pressKey(F1, 1);
		tg.pressKey(F2, 1);
		tg.pressKey(F3, 1);
		tg.pressKey(F4, 1);
		tg.pressKey(F5, 1);
		tg.pressKey(F6, 1);
		tg.pressKey(F7, 1);
		tg.pressKey(F8, 1);
		tg.pressKey(F9, 1);
		tg.pressKey(F10, 1);
		tg.pressKey(F11, 1);
		tg.pressKey(F12, 1);
		tg.pressKey(ENTER, 1);
		tg.pressKey(TAB, 1);
		tg.pressKey(ESCAPE, 1);
		tg.pressKey(BACKSPACE, 1);
		tg.pressKey(DELETE, 1);
		tg.pressKey(PAGE_UP, 1);
		tg.pressKey(PAGE_DOWN, 1);
		tg.pressKey(HOME, 1);
		tg.pressKey(END, 1);
		tg.pressKey(ARROW_UP, 1);
		tg.pressKey(ARROW_DOWN, 1);
		tg.pressKey(ARROW_LEFT, 1);
		tg.pressKey(ARROW_RIGHT, 1);
		tg.pressKey(SPACEBAR, 1);
		tg.pressKey(SHIFT_SPACEBAR, 1);
		tg.close();
	}
}