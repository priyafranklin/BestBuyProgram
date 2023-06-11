package BestBuy;

public class BestBuyLoginPageTestCase {
	public static void main(String[] args) throws Exception {

		BestBuyHomePage homepage = new BestBuyHomePage();

		homepage.intialize();
		homepage.navigatedriver();

		BestBuyLoginPage loginpage = new BestBuyLoginPage();
		loginpage.setCountry();
		loginpage.openLoginPage();
		loginpage.signInButton();
		loginpage.previousPage();

		// loginpage.closeDriver();

	}

}
