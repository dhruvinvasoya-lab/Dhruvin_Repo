import io.testgrid.listeners.TestListener;
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
public class tc005swipe {
	@Test
	public void tc005swipe() {
		tg.openBrowser();
		tg.wait(5);
		tg.swipe(Direction.UP);
		tg.click("ele_CardElements");
		tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
		tg.click("ele_MenuTextBox");
		tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
		tg.swipe("ele_MenuForms", Direction.UP);
		tg.swipe("ele_LogoToolsQA", Direction.DOWN);
		tg.swipe(Direction.LEFT);
		tg.swipe(Direction.RIGHT);
		tg.close();
	}
}