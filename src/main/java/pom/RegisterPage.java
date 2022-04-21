package pom;



import core.AbstractPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.ru.yandex.qatools.htmlelements.element.TextInput;

import java.awt.*;

public class RegisterPage  extends AbstractPOM {
    WebDriver webDriver;

    public RegisterPage(WebDriver webDriver){

        super(WebDriver);
    }



    @FindBy(id = "email");
    public  TextInput emailField;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
     public Button continueEmailButton;

     @FindBy(xpath = "//button[contains(@data-continue-to,'username-container')]")
    public Button ContinuePasswordButton;

     @FindBy(xpath = "//button[contains(@data-continue-to,'opt-in-container')]")
     public Button ContinueUsernameButton;

     @FindBy(xpath = "//button[contains(@data-continue-to,'captcha-and-submit-container')]")
    public  Button ContinueProductButton;

     @FindBy(xpath = "//input[@type='password']")
    public TextInput passwordField;

     @FindBy(xpath ="//input[@name='user[login]']" )
    public TextInput usernameField;

     @FindBy(xpath = "//input[@id='opt_in']")
    public TextInput receiveProductField;

     @FindBy(xpath = "//button[@id='hom_children_button']")
    public Button puzzleButton;
}

