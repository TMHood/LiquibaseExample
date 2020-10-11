package sparrows.ucd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sparrows.ucd.services.TestService;

@SpringBootApplication
public class LiquibaseExample {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LiquibaseExample.class, args);

		TestService service = context.getBean(TestService.class);
		service.Insert();

		SpringApplication.exit(context, () -> 0);
	}

}
