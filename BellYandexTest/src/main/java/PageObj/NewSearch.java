package PageObj;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class NewSearch extends ToYandexMarket {

    public NewSearch(String Category) {

        try {
            WebElement element = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/noindex/ul/li[2]/a")));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            WebElement notebooks = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.linkText(Category)));
            Actions action2 = new Actions(driver);
            action2.moveToElement(notebooks).build().perform();
            notebooks.click();
            System.out.println("Успешно перешли во вкладку компьютеры и выбрали категорию");
        }catch (Exception ex){
            System.out.println("Не перешли во вкладку компьютеры и не выбрали категорию");
            driver.close();
        }


    }

    public void priseFrom(String text){

        try {
            WebElement newPrice = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("glpricefrom")));
            newPrice.sendKeys(text);
            System.out.println("Выбрали цену от");
        }catch (Exception ex){
            System.out.println("Не выбрали цену от");
            driver.close();
        }

    }

    public void priseTo(String text){

        try {
            WebElement newPrice = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("glpriceto")));
            newPrice.sendKeys(text);
            System.out.println("Выбрали цену до");
        }catch (Exception ex){
            System.out.println("Не выбрали цену до");
            driver.close();
        }

    }

    public void NewProdusser(String prod) {

        try {
            WebElement newProd = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(prod)));
            newProd.click();
            System.out.println("Выбрали производителя");
        }catch (Exception ex){
            System.out.println("Не выбрали производителя");
            driver.close();
        }


    }

    public void CheckElNum() {

        try {
            int elNum = 48;
            WebElement newProd = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.n-snippet-card2:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1)")));
            Assert.assertTrue(driver.findElements(By.cssSelector("div.n-snippet-card2")).size() == elNum);
            System.out.println("Проверили число элементов поиска на странице");
        }catch (Exception ex){
            System.out.println("Не проверили число элементов поиска на странице");
            driver.close();
        }

    }

    public void CheckFirstLink() {
        try {
            String firstpc;
            WebElement notebooks = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.n-snippet-card2")));
            driver.navigate().refresh();
            firstpc = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[4]/div[1]/div/a")).getText();
            WebElement search = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header-search']")));
            search.sendKeys(firstpc);
            search.sendKeys(Keys.ENTER);
            WebElement ntbook = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.className("n-title__text")));
            Assert.assertTrue(driver.findElement(By.className("n-title__text")).getText().contains(firstpc));
            System.out.println("Сравнили первый элемент поиска на странице со строкой поиска на совпадение");
        }catch (Exception ex){
            System.out.println("Не сравнили первый элемент поиска на странице со строкой поиска на совпадение");
            driver.close();
        }
        }


}

