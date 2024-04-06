package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RecapTablePractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(4000);

       List<WebElement> authors = driver.findElements(By.xpath("//*[@name = 'BookTable']/tbody//td[2]"));
        for (WebElement element :authors) {
            System.out.println(element.getText());

        }
        driver.quit();
        }

public static void printColumnFromtable(WebDriver driver, int position){

        List<WebElement>authors = driver.findElements(By.xpath("//*[@name = 'BookTable']/tdody//td["+position+"]"));
        for(WebElement element : authors ){
        System.out.println(element.getText());
    }
}
    }
