package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        Thread.sleep(2000);

        // -xpath - //input[@ng-model = 'FirstName']
        // -cssSelector - [ng-model = FirstName]

        WebElement firstNameInputBox = driver.findElement(By.xpath("[ng-model = 'FirstName']"));
        firstNameInputBox.sendKeys("Omar");
        Thread.sleep(2000);
        firstNameInputBox.sendKeys(Keys.chord(Keys.TAB, "Ramo",
                Keys.TAB, "123 main Street,Main City, 12345,ST,USA",
                Keys.TAB, "omarramo@email.com",
                Keys.TAB, "123-321-1221") );

        Thread.sleep(5000);

        driver.quit();


    }
}
