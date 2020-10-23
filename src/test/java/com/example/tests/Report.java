package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Report {
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
  public void testReportPass() {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("#ctl00_aSearch > h6")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txbName")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txbName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txbName")).sendKeys("بانک");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ListResult2"))).selectByVisibleText("بانک حکمت ايرانيان");
    driver.findElement(By.cssSelector("option[value=\"حکمت\"]")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgFromDate")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("button.dpButton")).click();
    driver.findElement(By.cssSelector("div.dpDayHighlight")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgToDate")).click();
    driver.findElement(By.cssSelector("td.dpTDHover")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddpIsAudited_1")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCompanyState"))).selectByVisibleText("پذیرفته شده در بورس تهران");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
    driver.findElement(By.id("ReportList_Title_364325")).click();
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
