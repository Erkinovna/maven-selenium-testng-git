package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageInformation {
    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url ="http://dev-hrm.yoll.io/";
        driver.get(url);

        String title =driver.getTitle();
        System.out.println("Page Title : " +title);

        String currently = driver.getCurrentUrl();
        System.out.println("Actual URL: " + currently);
        Thread.sleep(3000);


        driver.quit();

    }
}
