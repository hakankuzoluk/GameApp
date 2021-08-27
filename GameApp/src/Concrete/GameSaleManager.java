package Concrete;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameSaleManager implements GameSaleService {
	
	

	@Override
	public void sell(User user, Game game, Campaign campaign) {
		
		double lastprice = game.getPrice() - (game.getPrice()*campaign.getDiscount()/100);
		System.out.println(user.getFirsName()+ user.getLastName() +" isimli oyuncuya " + game.getPrice() + " tutarındaki " + game.getGameName() + " isimli oyun " + campaign.getCampaignName() + " kampanyası ile yüzde " + 
				campaign.getDiscount() + " indirimle " + lastprice + " fiyatına satılmıştır.");
		
	}

}
