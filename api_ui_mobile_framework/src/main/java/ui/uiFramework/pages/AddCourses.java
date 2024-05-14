package ui.uiFramework.pages;

import org.openqa.selenium.By;
import ui.uiFramework.base.UIActions;
import ui.uiFramework.helpers.EnumHelper;
import ui.uiFramework.pages.Enums.CourseTeachers;
import ui.uiFramework.pages.Enums.GradeYear;
import ui.uiFramework.pages.Enums.Subjects;

public class AddCourses {
    UIActions uiActions = new UIActions();
    HomePage homePage = new HomePage();
    CoursesPage coursesPage = new CoursesPage();
    private final By CourseNameTXTField = By.xpath("//input[@placeholder=' Course Name']");
    private final By SubjectDD = By.id("courseSubject");
    private final By CourseGradDD = By.id("courseGrade");
    private final By CourseTeacherDD = By.xpath("//span[@class='ui-select-placeholder text-muted' and contains(normalize-space(),'Course Teacher')]");
    private final By CreateCourseBTN = By.id("btnSaveAsDraftCourse");

    private final By CourseTitle = By.xpath("//h2[@id='courseNameView']");



    public void FillInCourseName(String courseName)
    {
        uiActions.writeIn(CourseNameTXTField,courseName);
    }
    public void SelectSubject(Subjects subject)
    {
        uiActions.clickOn(SubjectDD);
        String subjectDescription = EnumHelper.getDescription(subject);
        uiActions.DynamicXpathWithOptionAndClick(subjectDescription);
    }

    public void SelectCourseGrade(GradeYear gradeYear)
    {
        uiActions.clickOn(CourseGradDD);
        String courseGradeDescription = EnumHelper.getDescription(gradeYear);
        uiActions.DynamicXpathWithOptionAndClick(courseGradeDescription);
    }
    public void SelectCourseTeacher(CourseTeachers courseTeacher)
    {
        uiActions.clickOn(CourseTeacherDD);
        String courseGradeDescription = EnumHelper.getDescription(courseTeacher);
        uiActions.DynamicXpathWithSpantextAndClick(courseGradeDescription);
    }

    public void AddBasicInfoData(String courseName,Subjects subject,GradeYear gradeYear,CourseTeachers courseTeacher)
    {
        FillInCourseName(courseName);
        SelectSubject(subject);
        SelectCourseGrade(gradeYear);
        SelectCourseTeacher(courseTeacher);
        uiActions.scrollToElement(CreateCourseBTN);
    }

    public void NavigateToAddNewCourse()
    {
        homePage.ClickOnCourseItem();
        coursesPage.ClickOnAddCourseBTN();

    }
    public void ClickOnCreateCourseBTN()
    {
        uiActions.clickOn(CreateCourseBTN);

    }

    public String GetTextOfPageTitle()
    {
        return uiActions.getTextOfElement(CourseTitle);

    }




}
