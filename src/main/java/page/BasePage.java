package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public void waitForElement(WebDriver driver, int timeInSecomds, WebElement locator) {

		WebDriverWait wait = new WebDriverWait(driver, timeInSecomds);
		wait.until(ExpectedConditions.visibilityOf(locator));

	}

}
