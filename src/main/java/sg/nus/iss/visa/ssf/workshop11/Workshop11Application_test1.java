// package sg.nus.iss.visa.ssf.workshop11;

// import java.util.Collection;
// import java.util.Collections;
// import java.util.List;

// import org.slf4j.LoggerFactory;
// import org.springframework.boot.DefaultApplicationArguments;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// import ch.qos.logback.classic.Logger;

// @SpringBootApplication
// public class Workshop11Application {
// 	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Workshop11Application.class);

// 	private static final String DEFAULT_PORT = "3000";

	

// 	public static void main(String[] args) {
// 		logger.info("main method started ........... ");


// 		SpringApplication app = new SpringApplication(Workshop11Application.class);

// 		DefaultApplicationArguments appArgs = new DefaultApplicationArguments(args);

// 		List opsValues = appArgs.getOptionValues("port");

// 		// SpringApplication.run(Workshop11Application.class, args);
// 		String portNumber = null;
// 		portNumber = System.getenv("PORT");

		

// 		if (portNumber == null || opsValues.get(0) == null) {
// 			portNumber = DEFAULT_PORT;
// 		}else{
// 			portNumber = (String) opsValues.get(0);
// 		}
// 		if (portNumber != null){
// 			app.setDefaultProperties(Collections.singletonMap("server.port", portNumber));
// 		}

// 		SpringApplication.run(Workshop11Application.class, args);
// 		System.out.println("\n\n\nServer is running on port: " + portNumber + "\n\n");
// 		app.run(args);



// 	}

// }
