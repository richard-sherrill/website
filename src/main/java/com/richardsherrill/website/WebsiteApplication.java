package com.richardsherrill.website;

import com.richardsherrill.website.model.PersonalInfo;
import com.richardsherrill.website.repository.MainRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class WebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return args -> {
			System.out.println("Inspecting Spring Boot Beans:");
			String[] beanNames = context.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}*/

	/*@Bean
	public CommandLineRunner commandLineRunner(MainRepository repository) {
		return args -> {
			PersonalInfo info = new PersonalInfo();
			info.setCity("Chicago");
			info.setState("IL");
			info.setEmailAddress("richardzsherrill@gmail.com");
			info.setFirstName("Richard");
			info.setLastName("Sherrill");
			info.setPhoneNumber("6824651323");
			info.setNicknames(Arrays.asList("Rich", "Richie", "Dick", "White Chocolate"));
			//repository.save(info);

			repository.findAll().forEach(personalInfo -> {
				System.out.println(personalInfo.toString());
			});
		};
	}*/
}
