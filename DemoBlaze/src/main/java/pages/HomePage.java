package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(linkText = "Home") private WebElement homeLink;

    public HomePage navigateToHomePage() {
        homeLink.click();
        return this;

    }
}


