/**
 * 
 */
package com.edm_dsm_web.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.edm_dsm_web.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */
public class BaseEDM {
	public static Properties prop;

	// Declare ThreadLocal Driver
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

	// loadConfig method is to load the configuration
	@BeforeSuite(groups = { "Smoke", "Sanity", "Regression" })
	public void loadConfig() throws IOException {
		ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\configurations\\configuration1.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver.get();
	}

	public void launchApp(String browserName) throws InterruptedException {
		// String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
//			WebDriverManager.chromedriver().clearDriverCache().setup();
//			WebDriverManager.chromedriver().clearResolutionCache().setup();
//			Thread.sleep(2000);
//			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(cp);
//			options.addArguments("headless");
			// driver=new ChromeDriver(options);

			// Set Browser to ThreadLocalMap
			driver.set(new ChromeDriver(options));
		} else if (browserName.equalsIgnoreCase("FireFox")) {
//			WebDriverManager.firefoxdriver().setup();

			FirefoxOptions options=new FirefoxOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//			options.addArguments("--headless");

			driver.set(new FirefoxDriver(options));
		} else if (browserName.equalsIgnoreCase("Edge")) {
//			WebDriverManager.edgedriver().setup();

			EdgeOptions options=new EdgeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//			options.addArguments("headless");

			driver.set(new EdgeDriver(options));
		}

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("implicitWait"))));
		getDriver().manage().timeouts()
				.pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(prop.getProperty("pageLoadTimeOut"))));
		// Launching the URL
		// getDriver().get(prop.getProperty("url"));
	}

	@AfterSuite(groups = { "Smoke", "Regression", "Sanity" })
	public void afterSuite() {
		ExtentManager.endReport();
	}

}
