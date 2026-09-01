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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
@Listeners(TestListener.class);
public class declare {

	@Test
	public void declare() {
		tg.openBrowser();
		tg.navigateToUrl("https://letcode.in/forms");
		tg.wait("ele_Form", ComparisonType.IS_VISIBLE);
		tg_int var_count = 1;
		var_count = tg.saveToVariable(1, var_count);
		while(tg.verify.isLessThanOrEqualTo(var_count, 2)){
		tg.declare("ele_name", "(//input[@class='input'])[{$}]", var_count);
		tg.click("ele_name", 1);
		tg.type("ele_name", "Jhon");
		var_count = tg.increments(var_count, 1);
		}
		tg.clearNetworkLog();
		tg.scrollToElement("ele_FirstName", Direction.DOWN);
		tg.close();
	}
}