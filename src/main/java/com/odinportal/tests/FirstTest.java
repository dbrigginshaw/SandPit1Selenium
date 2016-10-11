package com.odinportal.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by duncanbrigginshaw on 11/10/2016.
 */
public class FirstTest {

    @Test
    public void myFirstTest(){
        //WebDriver driver = new RemoteWebDriver("");
        WebDriver driver = new SafariDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        driver.navigate().to("http://www.axesamples.com/axe40/applications/OdinPortal");
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.cssSelector("input[type='text'][name='TextBoxUserId']")).sendKeys(new String[] {"Test"});
        driver.findElement(By.cssSelector("input[type='button'][value='Login']")).click();
        driver.close();
        driver.quit();
    }
}
