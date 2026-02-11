package com.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

@Entity
public class StudentEntity {

    @Id
    int studId;

    String name;

    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "stud_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    Set<Course> courses;

    public StudentEntity() {
        super();
    }

    public StudentEntity(int studId, String name, Set<Course> courses) {
        super();
        this.studId = studId;
        this.name = name;
        this.courses = courses;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentEntity [studId=" + studId + ", name=" + name + "]";
    }
}
