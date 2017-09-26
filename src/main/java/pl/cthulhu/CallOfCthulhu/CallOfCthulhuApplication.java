package pl.cthulhu.CallOfCthulhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pl.cthulhu")
public class CallOfCthulhuApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallOfCthulhuApplication.class, args);
	}
}
