package PAGEACTION;

import org.openqa.selenium.WebElement;

public class Pageact {

	// click

	public static void CliconEkement(WebElement ele) {

		ele.click();

	}

	// sendkeys

	public static void EnterText(WebElement ele, String Searchtext) {

		ele.sendKeys(Searchtext);

	}

}
