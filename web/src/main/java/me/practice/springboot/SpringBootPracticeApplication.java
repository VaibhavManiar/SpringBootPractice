package me.practice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

/*@SpringBootApplication
@ComponentScan("me.practice.clea")*/
@ComponentScan("com.weatherreport")
public class SpringBootPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeApplication.class, args);
	}

}
