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
public class callfuncss {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void callfuncss() {
		tg.openDevice();
				tg.testFunction("convertfunc", new Object[]{});
		START_CUSTOM_SCRIPT;
		WebElement RefreshButton = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Update']"));
		RefreshButton.click();
		
		WebElement SearchCity = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Search City']"));
		SearchCity.click();
		
		WebElement searchBackBtn = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));
		searchBackBtn.click();
		
		System.out.println("Enter Last Name ");
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}