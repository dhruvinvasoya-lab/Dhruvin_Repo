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
public class tc015repeatif {
	@Test
	public void tc015repeatif() {
		tg.openBrowser();
		tg.wait(5);
		tg.swipe(Direction.UP);
		tg.click("ele_CardElements");
		tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
		tg.click("ele_MenuTextBox");
		tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
		tg.wait(5);
		tg_int var_Count = 0;
		while(tg.verify.isEqualTo(var_Count, 5)){
		var_Count = tg.increments(var_Count, 1);
		}
		tg.close();
	}
}