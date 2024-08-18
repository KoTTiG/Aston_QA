import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("cookie-agree")).click();


    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @DisplayName("Test Fields")
    void testFields() {
        WebElement field = driver.findElement(By.className("pay"));

        WebElement account = field.findElement(By.id("connection-phone"));
        String textAccount = account.getAttribute("placeholder");
        WebElement sum = field.findElement(By.id("connection-sum"));
        String textSum = sum.getAttribute("placeholder");
        WebElement mail = field.findElement(By.id("connection-email"));
        String textMail = mail.getAttribute("placeholder");

        assertEquals("Номер телефона", textAccount);
        assertEquals("Сумма", textSum);
        assertEquals("E-mail для отправки чека", textMail);

        field.findElement(By.className("select__header")).click();

        account = field.findElement(By.id("internet-phone"));
        textAccount = account.getAttribute("placeholder");
        sum = field.findElement(By.id("internet-sum"));
        textSum = sum.getAttribute("placeholder");
        mail = field.findElement(By.id("internet-email"));
        textMail = mail.getAttribute("placeholder");

        assertEquals("Номер абонента", textAccount);
        assertEquals("Сумма", textSum);
        assertEquals("E-mail для отправки чека", textMail);

        account = field.findElement(By.id("score-instalment"));
        textAccount = account.getAttribute("placeholder");
        sum = field.findElement(By.id("instalment-sum"));
        textSum = sum.getAttribute("placeholder");
        mail = field.findElement(By.id("instalment-email"));
        textMail = mail.getAttribute("placeholder");

        assertEquals("Номер счета на 44", textAccount);
        assertEquals("Сумма", textSum);
        assertEquals("E-mail для отправки чека", textMail);

        account = field.findElement(By.id("score-arrears"));
        textAccount = account.getAttribute("placeholder");
        sum = field.findElement(By.id("arrears-sum"));
        textSum = sum.getAttribute("placeholder");
        mail = field.findElement(By.id("arrears-email"));
        textMail = mail.getAttribute("placeholder");

        assertEquals("Номер счета на 2073", textAccount);
        assertEquals("Сумма", textSum);
        assertEquals("E-mail для отправки чека", textMail);

    }

    @Test
    @DisplayName("Test Frame")
    void testFrame() throws InterruptedException {
        WebElement field = driver.findElement(By.className("pay"));
        WebElement phone = field.findElement(By.id("connection-phone"));
        phone.click();
        String expected_phone = "297777777";
        phone.sendKeys(expected_phone);
        WebElement fieldSum = field.findElement(By.id("connection-sum"));
        fieldSum.click();
        String expected_cost = "100";
        fieldSum.sendKeys(expected_cost);
        WebElement btn = field.findElement(By.className("button"));
        btn.click();

        WebElement iframe = driver.findElement(By.className("bepaid-iframe"));


        driver.switchTo().frame(iframe);
        WebElement divCost = driver.findElement(By.className("pay-description__cost"));
        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(divCost, "BYN"));



        WebElement cost = driver.findElement(By.tagName("span"));
        String costText = cost.getText();

        phone = driver.findElement(By.className("pay-description__text"));
        String phoneText = phone.getText();

        WebElement input = driver.findElement(By.className("ng-tns-c46-1"));
        String placeholder = input.getText();

        WebElement button = driver.findElement(By.tagName("button"));
        String buttonText = button.getText();

        assertEquals(expected_cost+".00 BYN", costText);
        assertEquals("Оплата: Услуги связи Номер:375"+expected_phone, phoneText);
        assertEquals("Номер карты", placeholder);
        assertEquals("Оплатить "+expected_cost+".00 BYN", buttonText);
    }

}
