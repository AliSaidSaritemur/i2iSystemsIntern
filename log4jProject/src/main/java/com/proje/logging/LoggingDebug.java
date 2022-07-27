package com.proje.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.proje.loggingError.LoggingError;
import com.projeloggingInfo.LoggingInfo;

public class LoggingDebug {

	public void login() {
		Logger logger =(Logger) LogManager.getLogger();
		logger.debug("first log");	
	}

}
