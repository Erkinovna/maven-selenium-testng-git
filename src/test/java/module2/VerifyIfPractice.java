package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyIfPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://dev-hrm.yoll.io/index.php/auth/login");
        Thread.sleep(3000);


        String usernama = "yoll-student";
        String password = "Bootcamp5";


        WebElement usernameInput = driver.findElement(By.cssSelector("#txtUsername"));
        WebElement passwordInput = driver.findElement(By.cssSelector(""));
        WebElement loginButton = driver.findElement(By.cssSelector(""));

        usernameInput.sendKeys();
        passwordInput.sendKeys();
        loginButton.click();

        Thread.sleep(3000);

        WebElement logo = driver.findElement(By.cssSelector("img[src *= yoll-logo"));
        System.out.println("logo varification PASSED");
        System.out.println("Lego verification FAILED");

       // List<WebElement> logoList = driver.findElements(By.cssSelector("img[src *= yoll-logo]"));
      //  System.out.println("Element found: "+ logoList.size ());

       // if(logoList.size()==1) {
         //   System.out.println("Logo verification Passed");
       // }else {


        }




    }

