package ru.devbulygin.SpringTest2Bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ru.devbulygin.SpringTest2Bot.repository")
public class SpringTest2BotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTest2BotApplication.class, args);
	}

}
