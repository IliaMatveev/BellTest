import PageObj.NewSearch;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainTest{
    private ChromeDriver driver;

    @Test
    public void main() {
        NewSearch HPLenovo = new NewSearch("Ноутбуки");
        HPLenovo.priseFrom("0");
        HPLenovo.priseTo("30000");
        HPLenovo.NewProdusser("//*[@id=\"search-prepack\"]/div/div/div[2]/div/div[1]/div[4]/fieldset/ul/li[6]/div/a/label/div/span");
        HPLenovo.NewProdusser("//*[@id=\"search-prepack\"]/div/div/div[2]/div/div[1]/div[4]/fieldset/ul/li[7]/div/a/label/div/span");
        HPLenovo.CheckElNum();
        HPLenovo.CheckFirstLink();
        HPLenovo.driver.quit();
    }

    @Test
    public void main2(){
        NewSearch AcerDell = new NewSearch("Планшеты");
        AcerDell.priseFrom("200");
        AcerDell.priseTo("215000");
        AcerDell.NewProdusser("//*[@id=\"search-prepack\"]/div/div/div[2]/div/div[1]/div[4]/fieldset/ul/li[2]/div/a/label/div/span");
        AcerDell.NewProdusser("//*[@id=\"search-prepack\"]/div/div/div[2]/div/div[1]/div[4]/fieldset/ul/li[3]/div/a/label/div/span");
        AcerDell.CheckElNum();
        AcerDell.CheckFirstLink();
        AcerDell.driver.quit();
    }

}
