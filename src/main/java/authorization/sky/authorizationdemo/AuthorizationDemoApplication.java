package authorization.sky.authorizationdemo;

import example.WrongLoginException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationDemoApplication.class, args);
	}

	String login = "java_skypro_go";
}
