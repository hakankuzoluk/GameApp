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
			System.out.println(user.getFirsName()+" Kayýt edildi.");
			
		}else {
			System.out.println("Bir hatadan kaynaklý kayýt gerçekleþmedi.");
		}
		
	}

	@Override
	public void delete(User user) throws NumberFormatException, RemoteException  {
		System.out.println(user.getFirsName()+"Ýsimli kiþi silindi.");
		
	}

	@Override
	public void update(User user) throws NumberFormatException, RemoteException  {
		System.out.println(user.getFirsName()+"Ýsimli kiþi güncellendi.");
		
	}

}
