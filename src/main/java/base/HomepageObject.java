package base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomepageObject extends BaseClass {
	@FindBy(xpath = "//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']")
	private WebElement search_bar_content;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement Homepage_search_click_content;
	@FindBy(xpath = "//span[text()='RestAssurre Ultra Soft All Season Microfiber Reversible Comforter for Single Bed (Aqua Blue and Navy Blue) 60x90']")
	private WebElement microfiber_product;
	@FindBys(@FindBy(xpath = "//div[@class='a-section a-spacing-none']"))
	private List<WebElement> Microfiber_productlist;

	public HomepageObject() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getsearch_bar_content() {
		return search_bar_content;
	}

	public WebElement getHomepage_search_content() {

		return Homepage_search_click_content;
	}

	public WebElement getmicrofiber_product() {
		return microfiber_product;
	}
	public List<WebElement> getMicrofiber_productlist() throws InterruptedException {
		 return  Microfiber_productlist;
/*		Thread.sleep(5000);
		ArrayList<String> list = new ArrayList<String>();
		Thread.sleep(5000);
		for(WebElement element:Microfiber_productlist)
		{
			Thread.sleep(5000);
			list.add(element.getText());
		}*/
		//return list;

	}
}
