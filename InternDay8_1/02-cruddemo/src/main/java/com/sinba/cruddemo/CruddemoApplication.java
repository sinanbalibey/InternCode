package com.sinba.cruddemo;

import com.sinba.cruddemo.dao.StudentDAO;
import com.sinba.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);


 	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner->{
			//createStudent(studentDAO);
			createMultipleStudent(studentDAO);
		};
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Yeni 3 tane öğrenci objesi yaratılıyor ... ");

		Student tempStudent1=new Student("Ali","Balıbey","sinan.balibey@@gmail.com");
		Student tempStudent2=new Student("Hasan","Kaya","hasankay@gmail.com");
		Student tempStudent3=new Student("Kemalettin","Rıza","kemalattin23@gmail.com");

		System.out.println("Öğrenciler kaydediliyor");

		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {

		System.out.println("Yeni öğrenci objesi yaratılıyor ... ");

		Student tempStudent=new Student("Sinan","Balıbey","sinan.balibey@@gmail.com");

		System.out.println("Öğrenci kaydediliyor");

		studentDAO.save(tempStudent);

		System.out.println("Öğrenci kaydedildi. Id: "+tempStudent.getId());
	}

}
















