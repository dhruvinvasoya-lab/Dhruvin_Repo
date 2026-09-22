import org.openqa.selenium.support.ui.Select;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.time.MonthDay;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import org.openqa.selenium.html5.Location;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.Pause;
import java.time.Duration;
import static org.openqa.selenium.interactions.PointerInput.Kind.TOUCH;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
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
public class weather2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void weather2() {
		tg.openDevice();
		// [DISABLED] tg.wait(5);
		// [DISABLED] tg.wait(5);
		tg.typeEncrypted("ele_OpennavigationdrawerImageButton1788169794160", var_TLifePassword01_Hermes, false);
		tg.click("ele_mainmenurefreshTextView1788169786082", 1);
		tg.check.isInvisible("ele_mainmenurefreshTextView1788169786082");
		tg.wait("ele_OpennavigationdrawerImageButton1788169794160", ComparisonType.IS_VISIBLE);
		tg.click("ele_OpennavigationdrawerImageButton1788169794160", 1);
		tg.wait("ele_CurrentWeatherCheckedTextView1788169797194", ComparisonType.IS_VISIBLE);
		tg.click("ele_CurrentWeatherCheckedTextView1788169797194", 1);
		tg.close();
	}
}