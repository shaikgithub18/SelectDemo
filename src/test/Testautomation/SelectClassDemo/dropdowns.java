package Testautomation.SelectClassDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdowns {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        WebElement multiselect = driver.findElement(By.cssSelector("select[name='selenium_commands']"));
        Select select = new Select(multiselect);
        List<WebElement> elements=select.getOptions();
        System.out.println(elements.size());

        for(WebElement ele: elements){
            System.out.println(ele.getText());
        }
        driver.quit();
    }
}
