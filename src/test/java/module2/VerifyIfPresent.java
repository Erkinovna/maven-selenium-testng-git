package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyIfPresent {

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

        Thread.sleep(1000);

        usernameInput.sendKeys();
        passwordInput.sendKeys();
        loginButton.click();

        Thread.sleep(1000);

        WebElement welcomeMessage = driver.findElement(By.cssSelector("#welcome"));

        boolean isMessageDisplayed = welcomeMessage.isDisplayed();
        System.out.println("The welcome message is displayed: " + isMessageDisplayed);



        driver.quit();

    }
}
