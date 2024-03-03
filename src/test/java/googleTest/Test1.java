package googleTest;

import config.WebDriverConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 extends WebDriverConfig {
    By googleSearch = new By.ByName("q");

    @BeforeClass
    public static void beforGoogle() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();//устанавливает окно в максимальный режим
    }


    @Test
    public void tes1() {

        driver.get("http:\\google.com");// go to url link
        System.out.println(driver.getTitle());// возвращает титул страницы
        System.out.println(driver.getCurrentUrl());// возвращает текущий адресс

    }

    @Test
    public void test2() {
        WebElement search = driver.findElement(googleSearch);
        search.sendKeys("Vasiliy");
        search.sendKeys(Keys.ENTER);
    }

    @Test
    public void test3() {
       WebElement search=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        search.sendKeys("Vasiliy");
        search.sendKeys(Keys.ENTER);
    }

    @AfterClass
    public static void after() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignore) {

        }
        driver.close();
    }
}
