package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownPractice3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
                driver.get("https://demo.automationtesting.in/Register.html");
                WebElement skillsDropdownWebElement = driver.findElement(By.id("Skills"));
        Select skillsDropdown = new Select(skillsDropdownWebElement);
        skillsDropdown.selectByVisibleText("Mac");
                WebElement selectedOption = skillsDropdown.getFirstSelectedOption(); // returns the option as a WebElement
                System.out.println("Option 1 check if selected:");
        System.out.println("Selected Option Is: " + selectedOption.getText());

        Thread.sleep(1000);
               System.out.println("Option 2 check if selected:");
        // TODO - Create reusable method that checks if an option is selected or not based on visibleText
        WebElement macOption = driver.findElement(By.xpath("//select[@id = 'Skills']/option[text() = 'Mac']"));
        System.out.println("Mac option is selected: " + macOption.isSelected());
        Thread.sleep(1000);

        boolean isJavaSelected = driver.findElement(By.xpath("//select[@id = 'Skills']/option[text() = 'Java']")).isSelected();
        System.out.println("Java option is selected: " + isJavaSelected);

        driver.quit();

    }
}













