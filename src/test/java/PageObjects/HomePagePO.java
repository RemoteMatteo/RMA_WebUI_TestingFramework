package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePO extends BrowserActions {

  // Strings
  public static String magentaHomepage = "https://magentagaming.com/de/";


  //  WebElements
  public static WebElement cookieAcceptanceButton(WebDriver driver){
    WebElement cookieAcceptanceButton = driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div:nth-child(1) > div > div.Dialogstyle__StyledDialog-mhxqto-0.gwuqKe.CookieConsentDialogstyle__StyledCookieConsentDialog-sc-1diuf4i-0.dEdQtk.cookie-consent-dialog > div > div.dialog-footer > div > button.Buttonstyle__StyledButton-y3gxd8-0.eqqOiX.accept-all-cookies-button"));
    return cookieAcceptanceButton;
  }

  public static WebElement cookieRejectionButton(WebDriver driver){
    WebElement cookieRejectionButton = driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div:nth-child(1) > div > div.Dialogstyle__StyledDialog-mhxqto-0.gwuqKe.CookieConsentDialogstyle__StyledCookieConsentDialog-sc-1diuf4i-0.dEdQtk.cookie-consent-dialog > div > div.dialog-footer > div > button.Buttonstyle__StyledButton-y3gxd8-0.eqqOiX.change-settings-button"));
    return cookieRejectionButton;
  }

  public static WebElement navBarTitle(WebDriver driver){
    WebElement navBarTitleElement = driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div:nth-child(1) > div > header > main.Containerstyle__StyledContainer-sc-1djxyrn-0.bseSgc.nav-bar.desktop > div > span.links > div > p > span"));
    return navBarTitleElement;
  }

  public static WebElement cookiesDeniedInfo(WebDriver driver){
    WebElement cookiesDeniedInfo = driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div:nth-child(1) > div > div.Dialogstyle__StyledDialog-mhxqto-0.gwuqKe.CookieSettingsDialogstyle__StyledCookieSettingsDialog-qm8i0-0.cwyYFI.cookie-consent-dialog > div > h3"));
    return cookiesDeniedInfo;
  }

}
