package core;

import org.openqa.selenium.WebDriver;
import pom.HomePage;
import pom.LoginPage;
import pom.RegisterPage;

public class GitHub {

    private static GitHub gitHub;

    public HomePage homePage;

    public LoginPage loginPage;

    public RegisterPage registerPage;

    public GitHub(WebDriver driver){
        this.homePage = new HomePage();
        this.loginPage = loginPage;
        this.registerPage = registerPage;

    }

}
