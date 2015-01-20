package controllers;

import data.db.beans.User;

public class RegistrationController extends InjectAwareController {

	public RegistrationController() {
		super();
	}
	
	public static void index() {
        render();
    }
    
    public static void user(Long id)  {
        
        renderJSON("TODO: Implement");
    }
    
    public static void getDistricts(String zipCode) {
    	
    }
	
	

}
