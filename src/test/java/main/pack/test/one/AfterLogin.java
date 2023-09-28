package main.pack.test.one;

import org.testng.annotations.Test;
import main.pack.one.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AfterLogin {

	// private static WebDriver driver;

	// (dependsOnMethods = "f2")

	@Test
	public void f2() {

		System.out.println(Setup.driver.getTitle());

		Setup.driver
				.findElement(
						By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[3]/td/ul/li[2]/a"))
				.click();
	}

	@Test
	public void f3() {

		Setup.driver
				.findElement(
						By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[3]/td/ul/li[1]/a"))
				.click();
		System.out.println("current url " + Setup.driver.getCurrentUrl());
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("beforeMthode 2");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("afterMethode 2");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("beforeClass 2");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("afterclass 2");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("before test 2");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("after test 2");
	}

	@BeforeSuite
	public static void beforeSuite() {

		// System.out.println("isBrowserOpen value:" + Setup.isBrowserOpen);

		if (Setup.isBrowserOpen == false) {

			System.out.println("isBrowserOpen value = " + Setup.isBrowserOpen);
			System.out.println("browser opened " + "before suite 1");
			Setup.getDriver();
			Setup.driver.get("https://www.qualitypointtech.com/webtimesheet/demo/index.php?");
		}

		else {
			System.out.println("isbrowservalue = true");
		}
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("after suite 2");

		Setup.quitDriver();

	}
}
