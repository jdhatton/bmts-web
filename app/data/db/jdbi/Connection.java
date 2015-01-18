package data.db.jdbi;

 
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle; 

import play.Play;

import org.skife.jdbi.v2.sqlobject.*;

public class Connection {

	private Handle h = null;
	private DBI db = null;
	
	public Connection() {
    
		 String jdbiConnStr = Play.configuration.getProperty("jdbi.connection.str");  
		 System.out.println(" Createing Connection to :  " + jdbiConnStr );
	      db = new DBI(Play.configuration.getProperty("jdbi.connection.str"));	  
	      
	}
	
	public DBI getConnection(){
		if(db == null) { db = new DBI(Play.configuration.getProperty("jdbi.connection.str")); }
		return db;
	}
	
	public Handle getHandle() {
		//
		// TODO: use some form of connection pooling or something for high load?
		//
		if(db == null) { db = new DBI(Play.configuration.getProperty("jdbi.connection.str")); }
					
		h = db.open();
		return h;		
	}
	
	
	

}
