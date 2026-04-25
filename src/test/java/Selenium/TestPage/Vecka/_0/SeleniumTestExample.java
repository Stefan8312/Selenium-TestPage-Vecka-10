import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTestExample {

    @Test
    public void seleniumTest() {

        // Automatically downloads ChromeDriver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.kimmoahola.net/selenium.html");

        //
        WebElement title =
                driver.findElement(By.id("main-title"));
        System.out.println("Title: " + title.getText());

        // 2
        WebElement paragraph =
                driver.findElement(By.className("text-paragraph"));
        System.out.println("Paragraph: " + paragraph.getText());

        // 3
        WebElement username =
                driver.findElement(By.name("username"));
        username.sendKeys("TestUser");

        // 4
        WebElement checkbox =
                driver.findElement(By.name("check2"));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        // 5
        WebElement radioBlue =
                driver.findElement(By.cssSelector("input[value='blue']"));
        radioBlue.click();

        // 6
        WebElement dropdownElement =
                driver.findElement(By.id("dropdown"));

        Select dropdown =
                new Select(dropdownElement);

        dropdown.selectByVisibleText("Option 3");

        // 7
        WebElement button =
                driver.findElement(By.className("btn-class"));
        button.click();

        // 8
        WebElement link =
                driver.findElement(By.id("link-id"));

        String href =
                link.getAttribute("href");

        System.out.println("Link href: " + href);

        // 9
        WebElement nestedSpan =
                driver.findElement(By.cssSelector("#nested-span"));

        System.out.println("Nested span: "
                + nestedSpan.getText());

        // 10
        WebElement image =
                driver.findElement(By.id("image-id"));

        String altText =
                image.getAttribute("alt");

        System.out.println("Image alt: " + altText);

        driver.quit();
    }
}
