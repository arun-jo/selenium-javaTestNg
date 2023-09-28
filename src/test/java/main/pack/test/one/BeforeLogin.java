package main.pack.test.one;

import main.pack.one.*;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BeforeLogin {

	// protected

	@Test
	public static void f1() throws InterruptedException {

		System.out.println("test 1");

		Setup.driver.findElement(By.name("username")).sendKeys("admin");
		Setup.driver.findElement(By.name("password")).sendKeys("user1");
		Setup.driver.findElement(By.name("login")).click();

	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("beforeMthode 1");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("afterMethode 1");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("beforeClass 1");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("afterclass 1");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("before test 1");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("after test 1");
	}

	@BeforeSuite
	public static void beforeSuite() {

		if (Setup.isBrowserOpen == false) {

			System.out.println("browser opened " + "before suite 1");
			Setup.getDriver();
			Setup.driver.get("https://www.qualitypointtech.com/webtimesheet/demo/index.php?");
		}

	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("after suite 1");
		Setup.quitDriver();
	}

}
