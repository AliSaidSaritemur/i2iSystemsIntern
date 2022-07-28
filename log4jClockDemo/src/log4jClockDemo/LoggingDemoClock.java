package log4jClockDemo;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.*;


public class LoggingDemoClock {
	
	

	private static Logger logger =LogManager.getLogger(LoggingDemoClock.class.getName());										
	public static void main(String[] args) throws InterruptedException {
		
	
		 
		// TODO Auto-generated method stub
		logger.getLevel();
while (true) {
	
	if(logger.getLevel().toString()=="ERROR") {
		
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now)+":00:00");  
		logger.error(dtf.format(now)+":00:00");
		Thread.sleep(3600000);
	}
	else if(logger.getLevel().toString()=="INFO") {
	
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now)+":00"); 
		   logger.info(dtf.format(now)+":00");
			Thread.sleep(6000);
		
	}
else if(logger.getLevel().toString()=="DEBUG") {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm.ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now)); 
	   logger.debug(dtf.format(now));
	   Thread.sleep(1000);
	   
		
	}
	

}
	}

}
