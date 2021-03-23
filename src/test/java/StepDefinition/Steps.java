package StepDefinition;

import Tools.BrowserActions;
import PageObjects.MagentaHomepagePO;
import io.cucumber.java.en.And;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BrowserActions {

    WebDriver driver = returnDriver();

    @Given("Open Magenta Homepage")
    public void openMagentaHomepage() {
        driver.get(MagentaHomepagePO.magentaHomepage);
    }

    @And("Maximize browser window")
    public void maximizeBrowserWindow() {
        BrowserActions.maximizeScreen(driver);
    }

    @When("Accept pop-up informing about cookies")
    public void acceptPopUpInformingAboutCookies() {
        MagentaHomepagePO.cookieAcceptanceButton(driver).click();
    }

    @When("Reject pop-up informing about cookies")
    public void rejectPopUpInformingAboutCookies() {
        MagentaHomepagePO.cookieRejectionButton(driver).click();
    }

    @Then("Magenta Homepage is opened")
    public void magentaHomepageIsOpened() {
        Assert.assertEquals("MAGENTA GAMING", MagentaHomepagePO.navBarTitle(driver).getAttribute("textContent"));
    }

    @Then("Magenta Homepage is not opened")
    public void magentaHomepageIsNotOpened() {
        Assert.assertEquals(" Verwalte deine Cookie-Einstellungen ", MagentaHomepagePO.cookiesDeniedInfo(driver).getAttribute("textContent"));
    }
}
