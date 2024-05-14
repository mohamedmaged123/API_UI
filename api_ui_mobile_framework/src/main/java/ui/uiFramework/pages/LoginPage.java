package ui.uiFramework.pages;

import org.openqa.selenium.By;
import ui.uiFramework.base.UIActions;

public class LoginPage {
    UIActions uiActions = new UIActions();
    private final By emailTXTField = By.xpath("//input[@placeholder=' E-mail Address']");
    private final By passwordTXTField = By.xpath("//input[@placeholder=' Password']");
    private final By loginBTN = By.xpath("//input[@value=' Log in']");


    public void FillInUserCredentials(String email, String password)
    {
        uiActions.writeIn(emailTXTField,email);
        uiActions.writeIn(passwordTXTField,password);

    }

    public void ClickOnLoginBTN() {
        uiActions.clickOn(loginBTN);
    }

    public void FillInCredentialsAndClickOnLogin(String email, String password)
    {
        FillInUserCredentials(email,password);
        ClickOnLoginBTN();
    }
}
