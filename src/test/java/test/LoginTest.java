package test;

import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

import static io.qameta.allure.SeverityLevel.BLOCKER;
import static io.qameta.allure.SeverityLevel.CRITICAL;
import static org.testng.Assert.assertEquals;
import static util.driver.DriverHolder.getDriver;

@Epic("User Management")
@Feature("Login")
public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void loginBeforeMethod() {
        loginPage = new LoginPage(getDriver());
    }

    @Test(description = "Verify that a valid user can login to the application")
    @Severity(BLOCKER)
    @Description("Verify that a valid user can login to the application")
    @Story("As a user I should be able to login to the application")
    public void testValidLogin() {
        loginPage.login("student","Password123");
        assertEquals(getDriver().findElement(org.openqa.selenium.By.xpath("//h1[@class='post-title']")).getText(), "Logged In Successfully");
    }

    @Test(description = "Verify that an invalid user cannot login to the application")
    @Severity(CRITICAL)
    @Description("Verify that an invalid user cannot login to the application")
    @Story("As a user I should be able to login to the application")
    public void testInvalidLogin() {
        loginPage.login("incorrectUser","Password123");
        assertEquals(getDriver().findElement(org.openqa.selenium.By.xpath("//div[@id='error']")).getText(), "Your username is invalid!");
    }
}