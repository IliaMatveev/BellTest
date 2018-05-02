package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class BellYandexTest {
    public WebDriver driver;


    public BellYandexTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        try{
            ChromeOptions options = new ChromeOptions();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.yandex.ru");
            System.out.println("Успешно открыли сайт яндекс");

        }catch (Exception ex){
            System.out.println("Не открылся сайт яндекс");
            driver.close();
        }
    }
}


