package com.example.studentmanagement.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "university_class")
public class UniversityClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    Integer year;

    @Column(nullable = false)
    Integer number;

    @OneToMany(mappedBy = "universityClass")
    List<Student> students;

    public UniversityClass(long id, Integer year, Integer number) {
        this.id = id;
        this.year = year;
        this.number = number;
    }

    public UniversityClass() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    @Override
    public String toString() {
        String str = "";
        str += "Primary ID:" + getId();
        str += "Year: " + getYear();
        str += "Number: " + getNumber();
        return str;
    }
}
