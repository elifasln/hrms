package kodlamaiocamp.hrms.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.entities.concretes.Candidates;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MerniceServiceAdapter implements MerniceCandidatesCheckService {

	@Override
	public Boolean CheckIfRealPerson(Candidates candidates)   {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=true;
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(candidates.getIdentityNumber()),
					candidates.getFirstName().toUpperCase(new Locale("tr")), 
					candidates.getLastName().toUpperCase(new Locale("tr")), 
					candidates.getBirthYear());
		
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
				
		
		return  result;
	}

}
