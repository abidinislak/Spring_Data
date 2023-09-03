package com.all_in_one_springdata.springdata.repository;

import com.all_in_one_springdata.springdata.entity.manytomany.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Course,Integer> {
}
