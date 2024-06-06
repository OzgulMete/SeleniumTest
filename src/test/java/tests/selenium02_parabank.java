package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium02_parabank {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");//1.sayfa

        Thread.sleep(2000);
        driver.navigate().to("https://demo.applitools.com/");

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.close();

    }

}
