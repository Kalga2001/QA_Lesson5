package ui;
import entities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.RegisterPage;
import utils.RegistrUtils;

import static org.testng.Assert.assertTrue;
import static utils.RegisterUtils.*;

public class RegisterTestPom  extends BaseClass{
    WebDriver driver;

    RegisterPage registerPage;

    HomePage homePage;

    @BeforeClass
    void setupTest(){driver = new ChromeDriver();}

    @AfterClass
    void teardown(){driver.quit();}

    @Test
    public void testGitHubRegisterSuccess(long millis) throws InterruptedException{

        //Open the page
        driver.get("https://github.com/");
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        //Click on Sing up locator
        homePage.singUpButton.click();
        Thread.sleep(millis::3000);

        //registerPage.register(EMAIL,PASSWORD,RegisterUtils.USERNAME,DO_NOT_RECEIVE_PRODUCT);

        registerPsge.emailField.clear();
        registerPsge.emailField.sendKeys(EMAIL);
         Thread.sleep(millis:2000);
        registerPsge.continueEmailButton.click();
        Thread.sleep(millis:1000);

        registerPsger.passwordField.clear();
        registerPsge.passwordField.sendKeys(PASSWORD)
        Thread.sleep(millis:1000);
        registerPsge.continuePasswordButton.click()
         Thread.sleep(millis:1000);

        registerPsger.usernameField.clear();
        registerPsge.usernameField.sendKeys(USERNAME)
        Thread.sleep(millis:1500);
        registerPsge.continueUsernamedButton.click()
        Thread.sleep(millis:1500);

        registerPsger.recerveProductField.clear();
        registerPsge.recerveProductField.sendKeys(DO_NOT_RECEIVE_PRODUCT);
        Thread.sleep(millis:1000);
        registerPsge.continuePRODUCTButton.click()
        Thread.sleep(millis:1000);

        registerPsge.puzzleButton.click();
        Thread.sleep(millis:3000);

        //Verify
        WebDriver repos = driver.findElement(By.xpath("//h2[contains(text(),'Respositories')]"));
            assertTrue(repos.isDisplayed());


    }
}
