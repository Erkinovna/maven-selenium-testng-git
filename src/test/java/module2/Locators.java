package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



      public class Locators {

          public static void main(String[] args) throws InterruptedException {

              WebDriver driver = new ChromeDriver();

              // Your driver receives the html from the server and lands there
              driver.get("http://dev-hrm.yoll.io/index.php");

              // findElement is a method that will look for a specific web element in the html
              // however, by itself it cannot do it
              // we will need to provide a locator inside
              // By.id, By.name
              Thread.sleep(5000);

              // This expression returns a WebElement type
              WebElement loginButton = driver.findElement(By.id("btnLogin"));
              loginButton.click();

              Thread.sleep(3000);

              driver.quit();

          }

      }















