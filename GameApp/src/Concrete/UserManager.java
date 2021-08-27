package Concrete;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	
	UserCheckService userCheckService;
	
	public  UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) throws NumberFormatException, RemoteException  {
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirsName()+" Kay�t edildi.");
			
		}else {
			System.out.println("Bir hatadan kaynakl� kay�t ger�ekle�medi.");
		}
		
	}

	@Override
	public void delete(User user) throws NumberFormatException, RemoteException  {
		System.out.println(user.getFirsName()+"�simli ki�i silindi.");
		
	}

	@Override
	public void update(User user) throws NumberFormatException, RemoteException  {
		System.out.println(user.getFirsName()+"�simli ki�i g�ncellendi.");
		
	}

}
