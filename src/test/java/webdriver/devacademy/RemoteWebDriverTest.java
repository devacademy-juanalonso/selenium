package webdriver.devacademy;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebDriverTest {

	@Test
	public void remoteHubTest() throws MalformedURLException {
		ChromeOptions chrome = new ChromeOptions();
		URL hubUrl = new URL("http://selenium-hub:4444/wd/hub");

		WebDriver webDriver = new RemoteWebDriver(hubUrl, chrome);
		webDriver.get("http://www.google.es");

		assertEquals("Google", webDriver.getTitle());
		webDriver.quit();
	}
}
