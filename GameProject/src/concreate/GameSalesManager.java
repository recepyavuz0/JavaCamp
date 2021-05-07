package concreate;
import abstracts.*;
import entities.*;
public class GameSalesManager implements GameSalesService{

	@Override
	public void sale(Member member, Game game) {
		System.out.println(member.getUserName()+" isimli kullanýcý "+game.getGameName()+" oyununu satýn aldý.");
		System.out.println("Oyunun Fiyatý : "+game.getGamePrice());
	}

	@Override
	public void sale(Member member, Game game, Campaign campaign) {
		float discount=game.getGamePrice();
		game.setGamePrice(game.getGamePrice()-((game.getGamePrice()*campaign.getDiscountRate())/100));
		System.out.println(member.getUserName()+" isimli kullanýcý "+campaign.getCampaignName()+" isimli kampanya ile "+game.getGameName()+" oyununu satýn aldý.");
		System.out.println("Oyunun Fiyatý : "+ discount);
		System.out.println("Kampanyalý Fiyatý : "+game.getGamePrice());
	}

}
