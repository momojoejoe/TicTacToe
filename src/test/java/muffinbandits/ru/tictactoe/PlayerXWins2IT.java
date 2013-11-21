package muffinbandits.ru.tictactoe;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class PlayerXWins2IT {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = System.getenv("STAGING_SERVER");
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testPlayerXWins2() throws Exception {
		//Creates a new game
		selenium.open("/");
		selenium.type("id=a", "Player 1");
		selenium.type("id=b", "Player 2");
		selenium.click("css=button.btn.btn-default");
		selenium.waitForPageToLoad("30000");

		selenium.click("1,0");
		Thread.sleep(1000);
		// verifyEquals("X", selenium.getText("1,0"));
		selenium.click("0,0");
		Thread.sleep(1000);
		// verifyEquals("O", selenium.getText("0,0"));
		selenium.click("1,1");
		Thread.sleep(1000);
		// verifyEquals("X", selenium.getText("1,1"));
		selenium.click("0,1");
		Thread.sleep(1000);
		// verifyEquals("O", selenium.getText("0,1"));
		selenium.click("1,2");
		Thread.sleep(1000);
		// verifyEquals("X", selenium.getText("1,2"));
		// verifyEquals("Winner is Player 1", selenium.getText("winner-name"));
		selenium.click("id=playay");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}