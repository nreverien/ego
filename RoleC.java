package classes;

import java.util.ArrayList;
import java.util.List;

public class RoleC {
	private String code, description,gestionCmd,validationCmd,gestionEtatsSortie,verificationFacture,gestionAdministration;
	private int id;
	private List<ServiceC> listeServices;
	private List<ServiceC> listeServicesDeleted;
	private ServiceC serviceSelected;

	public RoleC(){
		listeServices=new ArrayList<ServiceC>();
		listeServicesDeleted=new ArrayList<ServiceC>();
	}
	
}
