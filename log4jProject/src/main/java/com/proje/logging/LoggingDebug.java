package com.proje.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LoggingDebug {

	public void	login() {
		Logger logger =(Logger) LogManager.getLogger();
		logger.debug("first log");
		logger.error("first log");
		logger.info("first log");

	}

}
