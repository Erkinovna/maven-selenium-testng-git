package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PracticeKeys {

    public static void main(String[] args) {

        WebDriver driver;

        driver = new FirefoxDriver();

        driver.get("bestbuy");

        driver.findElement(By.xpath(""));
    }
    public static WebDriver getdriver(String browserType){
        switch (browserType){
            case "Chrome":
                return new ChromeDriver();
            case "Firefox":
                return new FirefoxDriver();
            case  "Safari":
                return  new SafariDriver();
            default:
                return new ChromeDriver();
        }



    }
}
