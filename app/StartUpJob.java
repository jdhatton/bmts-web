
import play.jobs.*;
import play.*;



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
	      //
	      //
	      
	      //
	      //
	      //
	}    
	

}
