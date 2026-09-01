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
public class writetocsv {

	@Test
	public void writetocsv() {
		tg.openBrowser();
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_FirstName");
		tg.check.isVisible("ele_LastName");
		tg.type("ele_FirstName", "#TGITVAR.FirstName");
		tg.type("ele_LastName", "#TGITVAR.LastName");
		tg_String var_FName = "FirstName";
		tg_String var_LName = "LastName";
		tg.writeToCSV("var_FName", var_FName, "");
		tg.writeToCSV("var_LName", var_LName, "");
		tg.close();
	}
}