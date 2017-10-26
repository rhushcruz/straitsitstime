package STautomationFramework;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class loginview2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver", "path/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
    driver = new FirefoxDriver();
    baseUrl = "http://www.straitstimes.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLoginview2() throws Exception {
    driver.get(baseUrl + "/global");
    driver.findElement(By.cssSelector("button.navbar-toggle-user")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("ruthc.it@gmail.com");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("Temp1234");
    driver.findElement(By.cssSelector("button.btn")).click();
    System.out.println("Successfully logged in.");
    driver.findElement(By.cssSelector("a.block-link")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("img.img-responsive")));
      System.out.println("Image found. ");
    } catch (Error e) {
      verificationErrors.append(e.toString());
      System.out.println("No image found.");
    }
    driver.findElement(By.cssSelector("button.navbar-toggle-user")).click();
    driver.findElement(By.linkText("Logout")).click();
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
