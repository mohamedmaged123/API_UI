package ui.uiFramework.pages;

import org.openqa.selenium.By;
import ui.uiFramework.base.UIActions;

public class HomePage {
    UIActions uiActions = new UIActions();
    private final By CoursesItem = By.xpath("//a[@id='btnMyCoursesList']");

    public void ClickOnCourseItem()
    {
        uiActions.clickOn(CoursesItem);

    }
}
