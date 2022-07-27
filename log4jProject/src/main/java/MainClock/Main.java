package MainClock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.proje.logging.LoggingDebug;
import com.proje.loggingError.LoggingError;
import com.projeloggingInfo.LoggingInfo;

public class Main {

	public static void main(String[] args) throws InterruptedException {
	LoggingDebug debug =new LoggingDebug();
		LoggingInfo info = new LoggingInfo();
		LoggingError error = new LoggingError();
while(true) {
	Thread.sleep(1000);
		error.login();
}
	}

}
