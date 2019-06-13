import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownList {
    @Test

    public void DropdownListExercise() {
        String drivePath = "C:\\Users\\user\\IdeaProjects\\kursselenium2\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", drivePath);
        WebDriver driver = new ChromeDriver();

        driver.get("https://antycaptcha.amberteam.pl:5443/exercises/exercise3?seed=a22a421d-57bc-4149-8a42-ccdf6e5e9643");

        //crete variable for list
        Select listSelect = new Select(driver.findElement(By.id("s13")));

        //chose second option
        listSelect.selectByIndex(1);

        //check the answer
        WebElement solution = driver.findElement(By.id("solution"));
        solution.click();


    }
}
