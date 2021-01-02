
package utils;

import static org.testng.AssertJUnit.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base.BaseClass;
import base.HomepageObject;

@Test
public class Homepagetest {
	BaseClass baseclassobject;
	HomepageObject Homepageobj;

	public Homepagetest() {
		baseclassobject = new BaseClass();
		Homepageobj = new HomepageObject();

	}

	public void verified_search_Content() throws InterruptedException {

		String product_Microfiber_actual = "RestAssurre Ultra Soft All Season Microfiber Reversible Comforter for Single Bed (Aqua Blue and Navy Blue) 60x90";

		Thread.sleep(8000);
		Homepageobj.getsearch_bar_content().sendKeys(
				"RestAssurre Ultra Soft All Season Microfiber Reversible Comforter for Single Bed (Aqua Blue and Navy Blue) 60x90");
		Thread.sleep(5000);
		Homepageobj.getHomepage_search_content().click();
		Thread.sleep(5000);
		String microfiber_Expected_Name = Homepageobj.getmicrofiber_product().getText();
		Thread.sleep(5000);
		// System.out.println(microfiber_Expected_Name);
		if (product_Microfiber_actual.equalsIgnoreCase(microfiber_Expected_Name)) {
			System.out.println("Microfiber product successfully verified" + microfiber_Expected_Name);
		} else {

			System.out.println("Microfiber product not sucessfully verified" + product_Microfiber_actual);

			Assert.fail();
		}

	}

	@Test
	public void verified_product() throws InterruptedException {
		try {
			Thread.sleep(5000);
			String temp = "RestAssurre Ultra Soft All Season Microfiber Reversible Comforter for Single Bed (Aqua Blue and Navy Blue) 60x90";
			// Actions ac = new Actions(BaseClass.driver);
			// WebDriver wait=new WebDriver (20,driver);
			// wait.untill(ExpectedConditions.elementToBeClickable(Homepageobj.getMicrofiber_productlist());
			List<WebElement> actualproductlist1 = Homepageobj.getMicrofiber_productlist();
			ArrayList<String> list = new ArrayList<String>();
			Thread.sleep(5000);
			for (int i = 0; i<actualproductlist1.size(); i++) {
				
				list.add(actualproductlist1.get(i).getText());
						
			   if(actualproductlist1.get(i).getText()==temp) {

				   actualproductlist1.get(i).click();		
				}
			
				Thread.sleep(5000);
			System.out.println(list);
			}

			/*
			 * Thread.sleep(5000); System.out.println("deva");
			 * 
			 * ArrayList<String> expectedproductlist = new ArrayList<String>();
			 * Thread.sleep(5000); expectedproductlist.addAll(list);
			 * System.out.println(expectedproductlist);
			 */
			// Assert.assertEquals(list, expectedproductlist);

		} catch (Exception e) {
			// TODO: handle exceptione
			System.out.println(e.getMessage());
		} finally {
			System.out.println("it is not execution");
		}
	}

	@AfterTest
	public void browser_close() {
		BaseClass.driver.close();
	}

}
