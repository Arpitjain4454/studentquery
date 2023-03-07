package com.example.customerQuery.service;

import com.example.customerQuery.model.Student;
import com.example.customerQuery.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Student not found with id: " + id));
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        Student existingStudent = getStudentById(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setAge(student.getAge());
        existingStudent.setActive(student.getActive());
        existingStudent.setAdmissionDate(student.getAdmissionDate());
        return studentRepository.save(existingStudent);
    }
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Student> findStudentsByAge(Integer age) {
        return studentRepository.findByAgeGreaterThanEqual(age);
    }

    public List<Student> findStudentsByFirstNameAndLastNameStartingWith(String firstName, String lastName) {
        return studentRepository.findByFirstNameAndLastNameStartingWith(firstName, lastName);
    }
}


