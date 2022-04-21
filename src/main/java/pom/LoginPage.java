package pom;

import core.AbstractPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.awt.*;

public class LoginPage extends AbstractPOM {
    public LoginPage(WebDriver driver){

        super(driver);
    }

   @FindBy(xpath = "//input[@type='submit']")
    public Button submitBtn;

    @FindBy(name = "login")
    public WebDriver usermame;

    @FindBy(id = "password")
    public WebDriver password;

    @FindBy(partialLinkText = "Sing")
    public WebElement singInBtn;


}

