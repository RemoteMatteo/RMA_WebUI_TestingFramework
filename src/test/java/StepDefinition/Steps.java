package StepDefinition;

import PageObjects.BrowserActions;
import PageObjects.HomePagePO;
import io.cucumber.java.en.And;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BrowserActions{

    WebDriver driver = returnDriver();

    @Given("Open Magenta Homepage")
    public void openMagentaHomepage() {
        driver.get(HomePagePO.magentaHomepage);
    }

    @And("Maximize browser window")
    public void maximizeBrowserWindow() {
        BrowserActions.maximizeScreen(driver);
    }

    @When("Accept pop-up informing about cookies")
    public void acceptPopUpInformingAboutCookies() {
        HomePagePO.cookieAcceptanceButton(driver).click();
    }

    @When("Reject pop-up informing about cookies")
    public void rejectPopUpInformingAboutCookies() {
        HomePagePO.cookieRejectionButton(driver).click();
    }

    @Then("Magenta Homepage is opened")
    public void magentaHomepageIsOpened() {
        Assert.assertEquals("MAGENTA GAMING", HomePagePO.navBarTitle(driver).getAttribute("textContent"));
    }

    @Then("Magenta Homepage is not opened")
    public void magentaHomepageIsNotOpened() {
        Assert.assertEquals(" Verwalte deine Cookie-Einstellungen ", HomePagePO.cookiesDeniedInfo(driver).getAttribute("textContent"));
    }
}
