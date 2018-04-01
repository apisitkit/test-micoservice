package configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
public class SpringbootConfiguration {
	 public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringbootConfiguration.class, args);
    }
}
