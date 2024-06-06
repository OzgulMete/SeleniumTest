package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium01_tesbihKonagi {
    @Test
    public void main () throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tesbihkonagi.com/"); //sayfaya gider
        String expectedTitle="TESBİH KONAĞI";
        String expectedUrl="https://www.tesbihkonagi.com/";
        System.out.println("expectedUrl"+ expectedUrl);
        String expectedPageSources=driver.getPageSource();
        String expectedHandle="";
        //doğrulama
        String actualTitle= driver.getTitle();
        Thread.sleep(500);
        String actualUrl=driver.getCurrentUrl();
        String actualPageSources=driver.getPageSource();
        Assert.assertEquals(expectedTitle,actualTitle);
        Assert.assertEquals(expectedUrl,actualUrl);

    }
}
