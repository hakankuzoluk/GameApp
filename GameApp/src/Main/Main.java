package Main;


import Entities.Campaign;
import Entities.Game;
import Entities.User;

import java.rmi.RemoteException;
import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.UserManager;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignName("Yaz indirimi");
		campaign1.setId(1);
		campaign1.setDiscount(50);
		campaign1.setStartDate(LocalDate.of(2019,1,1));
		campaign1.setEndDate(LocalDate.of(2019,1,29));
		
		
		Game game1 = new Game();
		game1.setCategoryName("Aksiyon/Korku");
		game1.setGameName("Outlast");
		game1.setId(1);
		game1.setPrice(29.99);
		
		User user1 = new User();
		user1.setDateOfBirth(2001);
		user1.setFirsName("Hakan");
		user1.setId(1);
		user1.setLastName("Kuzoluk");
		user1.setNationalityId("19072765434");
		
		
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user1);
		
		
		

	}

}
