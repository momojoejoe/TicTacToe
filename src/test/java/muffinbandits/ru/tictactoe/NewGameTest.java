package com.example.tests;

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

public class NewGameTest {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://muffinbandits.herokuapp.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testNewGame() throws Exception {
		selenium.open("/");
		selenium.type("id=a", "BearThor");
		selenium.type("id=b", "DeeBó");
		selenium.click("css=button.btn.btn-default");
		selenium.waitForPageToLoad("5000");
		selenium.click("1,0");
		Thread.sleep(1000);
		selenium.click("0,0");
		selenium.click("1,1");
		Thread.sleep(1000);
		selenium.click("0,1");
		Thread.sleep(1000);
		selenium.click("2,2");
		Thread.sleep(1000);
		selenium.click("0,2");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
