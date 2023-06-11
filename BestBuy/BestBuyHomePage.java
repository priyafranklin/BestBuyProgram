package BestBuy;

//import org.testng.Assert;
//import org.testng.annotations.Test;

public class BestBuyHomePage extends BaseClass {

	String url = "https://www.bestbuy.com/";

//	@Test
//	public void validateUrl() {
//		Assert.assertTrue(linkExists(url));
//	}

	public void navigatedriver() throws Exception {

		if (linkExists(url)) {
			driver.get(url);
		} else {
			throw new Exception("Page not found");
		}

	}

}
