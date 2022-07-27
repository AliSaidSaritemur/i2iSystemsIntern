package com.projeloggingInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LoggingInfo {

public void	login() {
	
	Logger logger =(Logger) LogManager.getLogger();

	logger.info("first log");
	
}
}
