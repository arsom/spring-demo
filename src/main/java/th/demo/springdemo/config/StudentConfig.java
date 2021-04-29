package th.demo.springdemo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import th.demo.springdemo.entity.Student;
import th.demo.springdemo.repository.StudentRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student lek = new Student("Lek","arsomm@gmail.com", LocalDate.of(1991, Month.APRIL,11));
            Student sai = new Student("sai","sai@gmail.com", LocalDate.of(1991, Month.AUGUST,19));
            repository.saveAll(List.of(lek,sai));
        };
    }
}
