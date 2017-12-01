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
    	FileUtils. copyFile(src, new File("test01.png"));
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
    	FileUtils. copyFile(src, new File("test02.png"));
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
    	FileUtils. copyFile(src, new File("test03.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("SCALENE"));
    }
    
     @Test
    public void test02a() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("10");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("15");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("10");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test04.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("ISOSCELES"));
    }
    
     @Test
    public void test02b() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("15");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("10");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("10");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test05.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("ISOSCELES"));
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
    	FileUtils. copyFile(src, new File("test06.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }
    
    @Test
    public void test05() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("0");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("10");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("10");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test07.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }
    
    @Test
    public void test06() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.clear();
        a.sendKeys("-1");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("10");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("10");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test08.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }

        @Test
    public void test07() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("3");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("4");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("7");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test09.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }
    
    
        @Test
    public void test07a() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("3");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("7");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("4");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test10.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }
    
    
        @Test
    public void test07b() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("7");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("3");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("4");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test11.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }

    @Test
    public void test08() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("1");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("2");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("4");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test12.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }
    
    @Test
    public void test08a() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("1");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("4");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("2");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test13.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }
    
    @Test
    public void test08b() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("4");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("1");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("2");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test14.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }

    @Test
    public void test09() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("1.5");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("1.5");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("2.5");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test15.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }
    
    @Test
    public void test010() throws Exception{
        driver.navigate().to("http://54.169.240.93:8080/triangleweb/");
        WebElement a = driver.findElement(By.name("a"));
        a.sendKeys("1");
        WebElement b = driver.findElement(By.name("b"));
        b.sendKeys("1");
        WebElement c = driver.findElement(By.name("c"));
        c.sendKeys("");
        c.submit();
        File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
    	FileUtils. copyFile(src, new File("test16.png"));
    	String source = driver.getPageSource();
        Assert.assertTrue(source.contains("INVALID"));
    }
    
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
