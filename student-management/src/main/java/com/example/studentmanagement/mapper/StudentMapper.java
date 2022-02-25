package com.example.studentmanagement.mapper;

import com.example.studentmanagement.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface StudentMapper {

    // SELECT * FROM student where name LIKE %T%;
    @Select("SELECT * FROM student where name LIKE #{name}")
    List<Student> getStudentsContainsStrInName(String name);

    // SELECT * from student where university_class_id IN
    // (SELECT id FROM university_class where year = 2021 AND number = 1);

    @Select("SELECT * FROM student where university_class_id IN " +
            "(SELECT id FROM university_class where year = #{year} AND number = #{number});")
    List<Student> getStudentsInClass(@Param("year") int year, @Param("number") int number);
}
