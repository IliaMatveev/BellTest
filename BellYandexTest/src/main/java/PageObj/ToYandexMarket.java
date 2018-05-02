package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToYandexMarket extends BellYandexTest {
    public ToYandexMarket(){

        try {
            WebElement toYM = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Маркет")));
            Actions act = new Actions(driver);
            act.moveToElement(toYM).build().perform();
            toYM.click();
            System.out.println("Успешно перешли в яндекс маркет");
        }catch (Exception ex){
            System.out.println("Не перешли в яндекс маркет");
            driver.close();

        }


    }
}
