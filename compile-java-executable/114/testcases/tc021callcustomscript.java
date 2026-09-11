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
public class tc021callcustomscript {
	@Test
	public void tc021callcustomscript() {
		tg.openBrowser();
		tg.wait(5);
		tg.swipe(Direction.UP);
		tg.click("ele_CardElements");
		tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
		tg.click("ele_MenuTextBox");
		tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
		START_CUSTOM_SCRIPT;
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("User Name Test");
		
		WebElement  email = driver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/input[1]"));
		email.sendKeys("test@test.com");
		END_CUSTOM_SCRIPT;
		tg.wait(5);
		tg.close();
	}
}