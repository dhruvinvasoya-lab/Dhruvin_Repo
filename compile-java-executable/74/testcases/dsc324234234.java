import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import org.bson.conversions.Bson;
import org.bson.Document;
import org.bson.BsonInt64;
import org.bson.BsonDocument;
import com.mongodb.*;
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
public class dsc324234234 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void dsc324234234() {
		tg.openDevice();
		tg.click("ele_address1794548381938", 1);
		tg.wait("ele_address1794548388981", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_address1794548388981", 1);
		tg.wait("ele_address1794548394130", ComparisonType.IS_VISIBLE, 30);
		tg.type("ele_address1794548394130", "http://192.168.88.44:8000/Demo", false);
		tg.click("ele_go1794548400855", 1);
		tg.click("ele_togglenavigation1794548438549", 1);
		tg.wait("ele_about1794548446441", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_about1794548446441", 1);
		tg.close();
	}
}