package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropdownPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://dmytro-ch21.github.io/");

        WebElement dropdownWebElement = driver.findElement(By.id("multiSelect"));

        Select dropdown = new Select(dropdownWebElement);

        dropdown.selectByIndex(0);
        Thread.sleep(2000);

        dropdown.deselectByValue("audi");
        Thread.sleep(2000);

        dropdown.selectByVisibleText("Mercedes");
        Thread.sleep(2000);

        List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();

        dropdown.deselectAll();
    }
}
