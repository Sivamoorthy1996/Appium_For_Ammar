package appiumpractice;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class DefaultServiceServerStartFromTestScript {
	
	
	public void defaultServiceServerStartFromTestScript() {
		//Starting server through test script(default services)
				AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService();
				service.start();
				service.stop();
				
				
	     //Starting server through test script(cusomize services)	
				AppiumDriverLocalService server=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
						.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
						.usingPort(4723)
						.withLogFile(new File("‪C:\\Users\\Dinesh.M\\OneDrive\\Desktop\\adb\\logs.txt")));
		    server.start();
		    server.stop();
	
	}

}
