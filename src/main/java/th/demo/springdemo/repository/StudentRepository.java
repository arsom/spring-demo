package th.demo.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import th.demo.springdemo.entity.Student;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query("select s from Student s  where s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
