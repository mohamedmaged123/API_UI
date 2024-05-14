package swinjiUITests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.uiFramework.pages.AddCourses;
import ui.uiFramework.pages.Entities.UserData;
import ui.uiFramework.pages.Enums.CourseTeachers;
import ui.uiFramework.pages.Enums.GradeYear;
import ui.uiFramework.pages.Enums.Subjects;
import ui.uiFramework.pages.LoginPage;
import ui.uiFramework.helpers.JsonHelper;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class UITests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    AddCourses addCourses = new AddCourses();


    @Test
    public void AssertThatCourseCreatedSuccessfully() throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
           UserData userData = JsonHelper.hydrateEntity(UserData.class, "src/test/java", "userData");

           String emial = userData.getEmail();
           String password = userData.getPassword();
           String courseName = userData.getCourseName();

           loginPage.FillInCredentialsAndClickOnLogin(emial,password);
           addCourses.NavigateToAddNewCourse();
           addCourses.AddBasicInfoData(courseName,Subjects.CreativeArts, GradeYear.One, CourseTeachers.TestTeacher);
           addCourses.ClickOnCreateCourseBTN();
           String expectedCoursePageTitle = addCourses.GetTextOfPageTitle();

           Assert.assertEquals(courseName,expectedCoursePageTitle);



       }




}
