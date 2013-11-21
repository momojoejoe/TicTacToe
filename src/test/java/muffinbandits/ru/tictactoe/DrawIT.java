package muffinbandits.ru.tictactoe;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
// import java.util.regex.Pattern;
// import static org.apache.commons.lang3.StringUtils.join;

/**
 * Created by: arni11, bjarnthor12, sigruns12, sindris12, sindri12, theodor11 & thordurt12
 * Copyright (c) 2013
 * Project: TicTacToe
 * Package: muffinbandits.ru.tictactoe
 * Date: 19/11/13
 */

/**
 * Tests Draw.
 */
public class DrawIT {
	/**
	 * Selenium var.
	 */
	private Selenium selenium;

	/**
	 * Setup the selenium test.
	 * @throws Exception throws exception.
	 */
	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = System.getenv("STAGING_SERVER");
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	/**
	 * Test draw.
	 * @throws Exception throws exception.
	 */
	@Test
	public void testDraw() throws Exception {
		//Creates a new game
		selenium.open("/");
		selenium.type("id=a", "Player 1");
		selenium.type("id=b", "Player 2");
		selenium.click("css=button.btn.btn-default");
		selenium.waitForPageToLoad("30000");

		selenium.click("0,0");
		Thread.sleep(1000);
		// verifyEquals("X", selenium.getText("0,0"));
		selenium.click("0,1");
		Thread.sleep(1000);
		// verifyEquals("O", selenium.getText("0,1"));
		selenium.click("1,0");
		Thread.sleep(1000);
		// verifyEquals("X", selenium.getText("1,0"));
		selenium.click("2,0");
		Thread.sleep(1000);
		// verifyEquals("O", selenium.getText("2,0"));
		selenium.click("1,2");
		Thread.sleep(1000);
		// verifyEquals("X", selenium.getText("1,2"));
		selenium.click("1,1");
		Thread.sleep(1000);
		// verifyEquals("O", selenium.getText("1,1"));
		selenium.click("2,1");
		Thread.sleep(1000);
		// verifyEquals("X", selenium.getText("2,1"));
		selenium.click("2,2");
		Thread.sleep(1000);
		// verifyEquals("O", selenium.getText("2,2"));
		selenium.click("0,2");
		Thread.sleep(1000);
		// verifyEquals("X", selenium.getText("0,2"));
		// verifyEquals("DRAW!", selenium.getText("gameover"));
		selenium.click("id=playay");
		selenium.waitForPageToLoad("30000");
	}

	/**
	 * Stop selenium.
	 * @throws Exception throws exception.
	 */
	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
