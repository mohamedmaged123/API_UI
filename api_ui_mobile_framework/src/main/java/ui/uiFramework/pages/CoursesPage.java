package ui.uiFramework.pages;

import org.openqa.selenium.By;
import ui.uiFramework.base.UIActions;

public class CoursesPage {

    UIActions uiActions = new UIActions();
    private final By AddCourseBTN = By.xpath("//button[@id='btnListAddCourse']");

    public void ClickOnAddCourseBTN()
    {
        uiActions.clickOn(AddCourseBTN);
    }


}
