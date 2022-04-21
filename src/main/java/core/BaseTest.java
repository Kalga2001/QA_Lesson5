package core;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;


public class BaseTest {


      protected WebDriver driver;

    @BeforeTest
    static void setupClass(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
    }


    @AfterClass
    void teardown(){driver.quit();}

}
