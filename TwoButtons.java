import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TwoButtons {
    @Test
    public void TwoButtonsTest() {
        String drivePath = "C:\\Users\\user\\IdeaProjects\\kursselenium2\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", drivePath);
        WebDriver driver = new ChromeDriver();

        //open browser with task
        driver.get("https://antycaptcha.amberteam.pl:5443/exercises/exercise1?seed=adc6fdc2-eb6c-4460-b2a4-0f8031037944");

        //create variable for button B1
        WebElement buttonB1 = driver.findElement(By.id("btnButton1"));

        //click twice button B1
        buttonB1.click();
        buttonB1.click();

        //create variable for button B2
        WebElement buttonB2 = driver.findElement(By.id("btnButton2"));

        //click button B2
        buttonB2.click();

        //create variable for button Check solution
        WebElement solution = driver.findElement(By.id("solution"));

        //click button Check solution
        solution.click();
    }
}
