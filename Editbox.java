import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Editbox {
    @Test


    public void EditboxExercise() {
        String drivePath = "C:\\Users\\user\\IdeaProjects\\kursselenium2\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", drivePath);
        WebDriver driver = new ChromeDriver();

        //open browser with task
        driver.get("https://antycaptcha.amberteam.pl:5443/exercises/exercise2?seed=a22a421d-57bc-4149-8a42-ccdf6e5e9643");

        //create variable for Editbox
        WebElement editboxInput = driver.findElement(By.name("t14"));
        //input text
        editboxInput.clear();
        editboxInput.sendKeys("Wait.");

        // create variable for B1
        WebElement buttonB1 = driver.findElement(By.name("btnButton1"));
        //press button B1
        buttonB1.click();

        //create variable for button: Check solution
        WebElement checkSoluttionButton = driver.findElement(By.name("end"));
        checkSoluttionButton.click();




    }
}
