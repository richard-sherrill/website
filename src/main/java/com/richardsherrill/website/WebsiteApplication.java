package com.richardsherrill.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
			Person info = new Person();
			info.setCity("Chicago");
			info.setState("IL");
			info.setEmailAddress("richardzsherrill@gmail.com");
			info.setFirstName("Richard");
			info.setLastName("Sherrill");
			info.setPhoneNumber("6824651323");
			info.setNicknames(Arrays.asList("Rich", "Richie", "Dick", "White Chocolate"));
			//repository.save(info);

			repository.findAll().forEach(person -> {
				System.out.println(person.toString());
			});
		};
	}*/
}
