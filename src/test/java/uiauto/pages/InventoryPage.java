package uiauto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uiauto.utilities.DriverManager;

public class InventoryPage extends BasePage {

    @FindBy(className = "title")
    private WebElement pageTitle;

    public InventoryPage() {
        super(DriverManager.getDriver());
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return getElementText(pageTitle);
    }
}