package config;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class WebDriverConfig {
    static ChromeDriverService.Builder cdservice = new ChromeDriverService.Builder()
            .withSilent(true)
            .usingAnyFreePort();
    public  static WebDriver driver;

    public static void createChromeDriver(){
        driver=new ChromeDriver(cdservice.build());
        driver.manage().window().maximize();
    }

}
