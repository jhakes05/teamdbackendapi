package com.teamd.teamdbackendapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.teamd.teamdbackendapi.model.tCourse;

public interface tCourseRepository extends JpaRepository<tCourse, Long> {

    @Query("SELECT users.full_name, course.title, certification.dateIssued, course.CourseID, instructor.full_name " +
           "FROM Course course " +
           "LEFT JOIN course.instructor instructor " +
           "LEFT JOIN course.enrollments enrollment " +
           "LEFT JOIN enrollment.user users " +
           "LEFT JOIN course.certifications certification " +
           "WHERE certification.course = course AND certification.instructor = instructor AND certification.user = users")
    List<Object[]> yourCustomQueryMethod();
}

