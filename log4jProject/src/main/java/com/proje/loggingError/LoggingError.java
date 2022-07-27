package com.proje.loggingError;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LoggingError {
	public void	login() {
		
		Logger logger =(Logger) LogManager.getLogger();

		logger.error("first log");
		
	}
}
