import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ChromeTest {

    WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("cookie-agree")).click();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void testTitle() {

        WebElement field = driver.findElement(By.className("pay"));
        String title = field.findElement(By.tagName("h2")).getText();
        assertEquals(title,"Онлайн пополнение\nбез комиссии");
    }

    @Test
    void testIcon() {

        WebElement field = driver.findElement(By.className("pay"));
        WebElement icons = field.findElement(By.className("pay__partners"));
        assertEquals(true,icons.isDisplayed());
    }

    @Test
    void testLink() {

        WebElement field = driver.findElement(By.className("pay"));

        field.findElement(By.tagName("a")).click();
        String url = driver.getCurrentUrl();
        assertEquals(url,"https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");

    }

    @Test
    void testInput() {

        WebElement field = driver.findElement(By.className("pay"));
        WebElement phone = field.findElement(By.id("connection-phone"));
        phone.click();
        phone.sendKeys("297777777");
        WebElement fieldSum = field.findElement(By.id("connection-sum"));
        fieldSum.click();
        fieldSum.sendKeys("100");
        WebElement btn = field.findElement(By.className("button"));
        btn.click();
        assertNotEquals(null, driver.findElement(By.className("bepaid-app")));
    }

}
