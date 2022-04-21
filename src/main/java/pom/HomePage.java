package pom;

import core.AbstractPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;

import java.awt.*;

public class HomePage  extends AbstractPOM {

    public HomePage(WebDriver driver){
        super(driver);
    }
    @FindBy(partialLinkText = "Sing up");
    public Button singUpButton;
}
