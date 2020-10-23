package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nasher {
  private WebDriver driver;
  private String baseUrl;
  private final StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() {
    driver = new ChromeDriver();
    baseUrl = "http://codal.ir/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNasher() {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("ناشران")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txbValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txbValue")).sendKeys("ایران خودرو");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
    driver.findElement(By.xpath("(//td[@onclick=\"window.open('Company.aspx?Symbol=%d8%ae%d9%88%d8%af%d8%b1%d9%88');\"])[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp |  | 30000]]
  }

  @After
  public void tearDown() {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
