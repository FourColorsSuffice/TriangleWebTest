package com.example;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;

public class TriangleWebTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.gecko.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @Test
    public void test01() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("10");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("10");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("10");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("C:\\Users\\LAB\\Downloads\\triangle-example-master\\triangle-example-master\\test01.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("EQUILATERAL"));
    }
    @Test
    public void test02() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("10");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("10");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("15");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("C:\\Users\\LAB\\Downloads\\triangle-example-master\\triangle-example-master\\test02.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("ISOSCELES"));
    }
    @Test
    public void test03() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("3");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("4");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("5");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("C:\\Users\\LAB\\Downloads\\triangle-example-master\\triangle-example-master\\test03.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("SCALENE"));
    }
    @Test
    public void test04() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("0");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("0");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("0");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("C:\\Users\\LAB\\Downloads\\triangle-example-master\\triangle-example-master\\test04.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }
    
        @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
