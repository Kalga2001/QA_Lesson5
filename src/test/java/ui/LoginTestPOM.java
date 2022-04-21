package ui;

import entities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pom.LoginPage;

public class LoginTestPOM extends BaseClass {
    WebDriver driver;
    @AfterClass
    void teardown(){driver.quit();}

    @Test
    public void testGithubLoginSuccess()throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);

        //Open github page
        driver.get("https://github.com");
        driver.manage().window().maximize();

        driver.findElement(loginPage.singIn).click();
        loginPage.login(USERNAME,PWD)

        Thread.sleep(millis:1000);

 //  WebElement otp = driver.findElement(By.xpath("//input{@ name='otp']"));
 //  Assert.assertEquals(otp.getAttribute("placeholder"),"6-digit code");
    }
}
