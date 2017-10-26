package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Verify {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    baseUrl = "https://acc-reg.sphdigital.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testVerify() throws Exception {
    driver.get(baseUrl + "/RegAuth2/sphLogin.html?svc=sts&goto=https%3A%2F%2Facc-auth.sphdigital.com%2Famserver%2Foauth2%2Fauthorize%3Fresponse_type%3Dcode%26client_id%3Dstraitstimes_oauth%26redirect_uri%3Dhttps%253A%252F%252Fstraitstimes-mobilegateway-api-SIN-LIVE.stapi.straitstimes.com%252Fapi%252FSphToken%26state%3D%257B%2522originalUrl%2522%253A%2522http%253A%252F%252Fwww.straitstimes.com%252Fglobal%253Flogin%253Dtrue%2522%252C%2522sessionId%2522%253A968186007%252C%2522sessionToken%2522%253A%25226d7a3fa2f2ce4b30862abcd8adf4978c%2522%252C%2522deviceId%2522%253A%252205fbff72c124c04aa69b3bb42585f601110.54.139.68%2522%252C%2522platform%2522%253A%2522web%2522%252C%2522company%2522%253A%2522sph%2522%252C%2522publication%2522%253A%2522ST%2522%252C%2522longitude%2522%253Anull%252C%2522latitude%2522%253Anull%252C%2522newlyRegistered%2522%253A%2522%2522%257D%26scope%3Daonickname%2520uid%2520sn%2520cn%2520aoregservice%2520aovisitorid%2520aologinid");
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("ruthc.it@gmail.com");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("Temp1234");
    driver.findElement(By.cssSelector("button.btn")).click();
    driver.findElement(By.cssSelector("a.block-link")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img.img-responsive")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("button.navbar-toggle-user")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
