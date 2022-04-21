package ui;
import entities.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.params.ParametersWithSalt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import  org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import  org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    private static final CharSequence USERNAME = ;
    private static final CharSequence PWD = ;
    WebDriver driver;


    @BeforeTest
    static void  setupClass(){WebDriverManager.chromedriver().setup();}

    @BeforeClass
    void setupTest(){driver = new ChromeDriver();}

    @AfterClass
    void  teardown(){driver.quit();}

    @Test
    public void  testGithubLoginSuccess() throws InterruptedException{
        //Open github page
        driver.get("https://github.com");
        driver.manage().window().maximize();

        //Click on Sing In, Locator = by partial link name
        driver.findElement(By.partialLinkText("Sing")).click();

        //Enter Username,Locator = by ID
        driver.findElement(By.id("login_field")).click();
        driver.findElement(By.id("login_field")).sendKeys(USERNAME);
        
        //Enter Password, Locator = by Name 
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys(PWD);

        //Click Sublit, Locator = xpath
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        WebElement otp =driver.findElement(By.xpath("//input[@name= 'otp']"));
        Assert.assertEquals(otp.getAttribute(name:"placeholder"),s1:"6-digit code");
    }
}
