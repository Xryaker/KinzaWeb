package googleTest;

import config.WebDriverConfig;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HillelTest2 extends WebDriverConfig {
    By consultButtonLocation = By.id("btn-consultation-hero");
    By title = By.className("section-content_descriptor");

    @BeforeClass
    public static void star() {
        createChromeDriver();
    }

    @Before
    public void bb() {
        driver.get("https://ithillel.ua/");
    }

    @Test
    public void test1() {
        WebElement button = driver.findElement(consultButtonLocation);
        System.out.println(button.getText());
        button.click();
    }

    @Test
    public void test2() {
        WebElement element = driver.findElement(title);
        System.out.println(element.getText());
    }

    @AfterClass
    public static void end() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
