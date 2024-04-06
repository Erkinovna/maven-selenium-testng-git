package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementAttributes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.bestbuy.com/");

        Thread.sleep(3000);

        WebElement searchInputBox = driver.findElement(By.id("gh-search-input"));

        String expextedPlayceholdervalue = "What can we help you find today?";
        String actualPlaceholderValue = searchInputBox.getAttribute("playceholder");
        searchInputBox.getAttribute( "playceholder");
        System.out.println("Expected Placeholder Value: " + expextedPlayceholdervalue);
        System.out.println("Actual Placeholder Value: " + actualPlaceholderValue);

        if ((expextedPlayceholdervalue.equals(actualPlaceholderValue))) {
            System.out.println("TEST: PASSED.");
        }else {
            System.out.println("TEST:FAIL.");

            System.out.println("value attribute before typing: " +searchInputBox.getAttribute("value"));
            searchInputBox.sendKeys("Iphone 15 Pro Max");
            System.out.println("value attribute before typing: " +searchInputBox.getAttribute("value"));
            System.out.println("Get the value of a boolean attribute: " + searchInputBox.getAttribute("disabled"));
            WebElement searchButton = driver.findElement(By.cssSelector(".header- searching- button"));
            String expectedButtonColor = "rgb(0,70,190)";
            searchButton.click();
            Thread.sleep(5000);
            searchButton.click();

            // Wait until page redirects and renders
            Thread.sleep(1000);

            // In order to get any information from the element
            // remember to locate the element first

            // Locate the button of first product
            WebElement seeDetailsButton = driver.findElement(By.xpath("(//li[@class = 'sku-item'])[1]//a[text() = 'See Details']"));

            // Get the css property's value of - background-color, background
            String actualSeeDetailsButtonColor = seeDetailsButton.getCssValue("background-color"); // this returns a string
            System.out.println("Expected background color: " + expectedButtonColor);
            System.out.println("Actual background color: " + actualSeeDetailsButtonColor);

            // rgb - red green blue
            // also css will hold the data about alpha - the alpha is responsible how transparent is your color
            // 1 - means solid
            // 0.1 - pretty transparent
            // rgba(0, 70, 190, 1)
            if(expectedButtonColor.equals(actualSeeDetailsButtonColor)){
                System.out.println("COLOR TEST: PASSED");
            } else {
                System.out.println("COLOR TEST: FAILED");
            }

            // Get the font type (font-family) of that button
            System.out.println("Font Type: " + seeDetailsButton.getCssValue("font-family"));
            System.out.println("Font Color: " + seeDetailsButton.getCssValue("color"));
            System.out.println("Font Size: " + seeDetailsButton.getCssValue("font-size"));

            driver.quit();


        }

    }

        }



