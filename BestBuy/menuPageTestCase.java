package BestBuy;

public class menuPageTestCase {

	public static void main(String[] args) throws Exception {

		BestBuyHomePage homepage = new BestBuyHomePage();

		homepage.intialize();
		homepage.navigatedriver();

		BestBuyLoginPage loginpage = new BestBuyLoginPage();
		loginpage.setCountry();
		menuPage.TopDeals();
		menuPage.DealoftheDay();
		menuPage.TotaltechMembership();
		menuPage.CreditCards();
		menuPage.Giftcards();
		menuPage.GiftIdeas();
		menuPage.HealthWellness();
		menuPage.BestBuyOutlet();
		menuPage.selectitem();
		menuPage.contactInformation();

		loginpage.closeDriver();

	}

}
