


import aop.InjectorModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

import data.db.dao.UserDaoImpl;
import play.jobs.*;
import play.*;
import services.UserServiceImpl;



@OnApplicationStart(async=true)
public class StartUpJob extends Job {

	public void doJob() { 	
	      System.out.println("==>>  StartUpJob - STARTING <== ");
	      
	      //
	      // - Load the configurations here on startup
	      //
	       
	      
	      String jdbiConnStr = Play.configuration.getProperty("jdbi.connection.str");
	      
	      System.out.println("  jdbiConnStr  =  "+jdbiConnStr);
	      
	      
	      
	      //
	      // - Wire up guice injection
	      //
	      Injector injector = Guice.createInjector(new InjectorModule());
//	      UserServiceImpl userService = injector.getInstance(UserServiceImpl.class);
//	      UserDaoImpl userDao = injector.getInstance(UserDaoImpl.class);
	      
	      //
	      //
	      //
	}    
	

}
