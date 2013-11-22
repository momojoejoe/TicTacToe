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
 * Tests Creating new game.
 */
public class PlayerXWins1IT {
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
	 * Test if player X wins.
	 * @throws Exception throws exception.
	 */
	@Test
	public void testPlayerXWins1() throws Exception {
		//Creates a new game
		selenium.open("/");
		selenium.type("id=a", "Player 1");
		selenium.type("id=b", "Player 2");
		selenium.click("css=button.btn.btn-default");
		selenium.waitForPageToLoad("30000");

		selenium.click("0,0");
		Thread.sleep(1000);
		verifyEquals("X", selenium.driver.findElement(By.id="0,0").getText()));
		selenium.click("0,1");
		Thread.sleep(1000);
		verifyEquals("O", selenium.driver.findElement(By.id="0,1").getText()));
		selenium.click("1,0");
		Thread.sleep(1000);
		verifyEquals("X", selenium.driver.findElement(By.id="1,0").getText()));
		selenium.click("1,1");
		Thread.sleep(1000);
		verifyEquals("O", selenium.driver.findElement(By.id="1,1").getText()));
		selenium.click("2,0");
		Thread.sleep(1000);
		verifyEquals("X", selenium.driver.findElement(By.id="2,0").getText()));
		Thread.sleep(1000);
		//verifyEquals("Winner is Player 1", selenium.driver.findElement(By.id="winner-name").getText()));
		selenium.click("id=playay");
		selenium.waitForPageToLoad("30000");
	}

	/**
	 * Stop the selenium test.
	 * @throws Exception throws exception.
	 */
	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
