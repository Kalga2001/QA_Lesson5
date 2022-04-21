package core;

import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loaser.decarator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loaser.decarator.HtmlElementFactory;
public class AbstractPOM {
    private WebDriver driver;

    public AbstractPOM {
        this.driver = driver;
        PageFactory.initElements(new HtmlElementDecarator(new HtmlElementFactory(driver)), page:this);}


    }
}
