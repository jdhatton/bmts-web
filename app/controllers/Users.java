package controllers;

import data.db.beans.User;
import play.mvc.Controller;
import services.UserServiceImpl;

import java.util.*;

import com.google.inject.Inject;

public class Users extends InjectAwareController {

	public Users( ) {
		super();
	}

	public static void index() {
        render();
    }
    
    public static void user(Long id)  {
        User user = userService.getUser(id);
        renderJSON(user);
    }
    
    public static void all( )  {
        List<User> users = userService.getAllUsers();
        renderJSON(users);
    } 
    
    public static void userCookie(){
    	
    }
    
    public static void authenticate() {
    	
    }
    
    public static void testSearch( String zipCode) {
    	String response = searchWrapper.searchForDistricts(zipCode);
    	render(response);
    }
}
