package com.example.studentmanagement.service;

import com.example.studentmanagement.dao.StudentDao;
import com.example.studentmanagement.dao.UniversityClassDao;
import com.example.studentmanagement.exceptions.InvalidUniversityClassException;
import com.example.studentmanagement.exceptions.StudentEmptyNameException;
import com.example.studentmanagement.exceptions.StudentNonExistException;
import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.model.UniversityClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentDao studentDao;
    private UniversityClassDao universityClassDao;

    @Autowired
    public StudentService(StudentDao studentDao, UniversityClassDao universityClassDao) {
        this.universityClassDao = universityClassDao;
        this.studentDao = studentDao;
    }

    public Student addStudent(Student student) {
        if (student.getName().isEmpty()) {
            throw new StudentEmptyNameException("Student name cannot be empty");
        }
        return studentDao.save(student);
    }

    public Student updateStudent(Student student) {
        if (!studentDao.existsById(student.getId())) {
            throw new StudentNonExistException("Cannot find student Id");
        }

        return studentDao.save(student);
    }


    public Student assignClass(Long studentId, Long classId) {
        if (!studentDao.existsById(studentId)) {
            throw new StudentEmptyNameException("Cannot find student Id." + classId);
        }
        if (!universityClassDao.existsById(classId)) {
            throw new InvalidUniversityClassException("Cannot find class Id. " + classId);
        }
        Student student = getStudentById(studentId).get();
        UniversityClass universityClass = universityClassDao.findById(classId).get();

        student.setUniversityClass(universityClass);
        return studentDao.save(student);
    }

    public Optional<Student> getStudentById(Long id) {
        return studentDao.findById(id);
    }


    public List<Student> getAllStudents() {
        return (List<Student>) studentDao.findAll();

    }
}
