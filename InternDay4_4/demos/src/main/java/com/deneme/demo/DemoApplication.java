package com.deneme.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
	 int a=applicationContext.getBeanDefinitionCount();
		System.out.println("Bean sayısı : "+a);

		String[]  beanDefinition=applicationContext.getBeanDefinitionNames();

		/*for (String beanDefin:beanDefinition){
			System.out.println(beanDefin);
		}*/
	}
}
