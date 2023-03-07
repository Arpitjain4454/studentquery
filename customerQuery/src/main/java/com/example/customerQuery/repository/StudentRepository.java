package com.example.customerQuery.repository;


import com.example.customerQuery.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT * FROM students WHERE age >= :age", nativeQuery = true)
    List<Student> findByAgeGreaterThanEqual(@Param("age") Integer age);

    @Query(value = "SELECT * FROM students WHERE first_name LIKE %:firstName% AND last_name LIKE %:lastName%", nativeQuery = true)
    List<Student> findByFirstNameAndLastNameStartingWith(@Param("firstName") String firstName, @Param("lastName") String lastName);

}

