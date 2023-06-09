package sg.nus.iss.visa.ssf.workshop11;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Workshop11Application {
	private static final Logger logger = LoggerFactory.getLogger(Workshop11Application.class);

	//default port-number
	private static final String DEFAULT_PORT = "3000";

	public static void main(String[] args) {
	 logger.info("main method started ...... ");

	 //initialize the spring app
	 SpringApplication app = new SpringApplication(Workshop11Application.class);

	 //read args array and check for "port" parameter

	 DefaultApplicationArguments appArgs = new DefaultApplicationArguments(args);

	 List opsValues = appArgs.getOptionValues("port");

	 String portNumber = null;

		// if port numebr is not in argument
		if(opsValues == null || opsValues.get(0) == null){

			//read port number fromm env variables
			portNumber = System.getenv("PORT");

			if(portNumber == null){
				portNumber = DEFAULT_PORT;
			}

		} else{
		//passing port number from CLI
		portNumber = (String) opsValues.get(0);
		}

		if(portNumber != null){
			//setting port number in the spring-boot config
			app.setDefaultProperties(Collections.singletonMap("server.port", portNumber));
		}

		logger.info("Port number is : " +portNumber);	




        System.out.println("\n\n\nServer is running on port: " + portNumber + "\n\n\n");

	//launch spring boot app	
	app.run(args);
	}

}