package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {


	public void add(Game game) {
		System.out.println(game.getGameName() +" Oyun eklendi.");
		
	}

	public void delete(Game game) {
		System.out.println(game.getGameName() +" Oyun silindi.");
		
	}

	public void update(Game game) {
		System.out.println(game.getGameName() +" Oyun güncellendi.");
		
	}

}
