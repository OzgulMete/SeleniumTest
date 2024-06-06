package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium03_parabankTest {
    @Test
    public void main() throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        String expectedUrlParabank="https://parabank.parasoft.com/parabank/index.htm";
        String actualUrlParabank=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrlParabank,actualUrlParabank);

        driver.navigate().to("https://demo.applitools.com/");
        String expectedUrlDemo="https://demo.applitools.com/";
        String actualUrlDemo=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrlDemo,actualUrlDemo);

        Thread.sleep(2000);
        driver.navigate().back();
        actualUrlParabank=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrlParabank,actualUrlParabank);

        driver.navigate().forward();
        actualUrlDemo=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrlDemo,actualUrlDemo);



    }
}
