package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {
	
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException {
		
		boolean result = client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getFirsName().toUpperCase(),user.getLastName().toUpperCase(),user.getDateOfBirth());
		if(result == true) {
		     System.out.println("Baþarýlý");
		     return true;
		}else {
			System.out.println("Baþarýsýz");
			return false;
		}
		
	}

}
