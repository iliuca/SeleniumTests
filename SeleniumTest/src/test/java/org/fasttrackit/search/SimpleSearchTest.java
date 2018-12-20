package org.fasttrackit.search;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;

public class SimpleSearchTest {

@Test
    public void SimpleSearchWithOneKeyword(){
        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        String keyword = "camera";
        driver.findElement(By.id("search")).sendKeys(keyword + Keys.ENTER);
        List<WebElement> productNames = driver.findElements(By.cssSelector("h2.product-name > a"));
        for (WebElement productName: productNames){
            MatcherAssert.assertThat("Some product names do not contained the searched keyword",
                    productName.getText(), containsString(keyword.toUpperCase()));
        }
    }
}