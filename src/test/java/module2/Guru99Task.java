package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Guru99Task {
    public static void main(String[] args) throws InterruptedException {
        String username ="test@email.com";
        String password = "test";
        WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http:demo.guru99.com/test/newtours/");
        WebElement usernameInput = driver.findElement(By.name(("userName")));
        WebElement passwordInput = driver.findElement(By.name(("password")));
        WebElement submitButton = driver.findElement(By.name(("submit")));


        usernameInput.sendKeys(username);
        Thread.sleep(2000);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        submitButton.click();
        Thread.sleep(5000);

        WebElement vacationsLink = driver.findElement(By.partialLinkText("Vacation"));
        vacationsLink.click();
        Thread.sleep(10000);


        WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
        registerLink.click();
        Thread.sleep(10000);


        String expectedUrlPostFix = "/register.php";
        String actualUrl = driver.getCurrentUrl();



        if(actualUrl.endsWith(expectedUrlPostFix)){
            System.out.println("Registration Page Test: PASSED");
        } else {
            System.err.println("Registration Page Test: FAILED");
        }


        driver.quit();

    }
}









