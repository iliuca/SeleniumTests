package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    @Test
    public void TestRegister(){
    System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("ACCOUNT")).click();
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("CREATE AN ACCOUNT")).click();
        driver.findElement(By.id("firstname")).sendKeys("Ion");
        driver.findElement(By.id("lastname")).sendKeys("Pop");
        driver.findElement(By.name("email")).sendKeys("ion@test.com");
        driver.findElement(By.name("password")).sendKeys("password4test");
        driver.findElement(By.name("confirmation")).sendKeys("password4test");
        driver.findElement(By.id("is_subscribed")).click();

}

}
