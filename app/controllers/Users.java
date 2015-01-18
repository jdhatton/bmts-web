package controllers;

import data.db.beans.User;
import play.mvc.Controller;
import services.UserService;
import java.util.*;

public class Users extends Controller {

    public static void index() {
        render();
    }
    
    public static void user(Long id)  {
    	UserService service = new UserService();
        User user = service.getUser(id);
        render(user);
    }
    
    public static void all( )  {
    	UserService service = new UserService();
        List<User> users = service.getAllUsers();
        renderJSON(users);
    } 

}
