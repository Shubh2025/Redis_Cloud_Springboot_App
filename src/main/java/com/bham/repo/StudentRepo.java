package com.bham.repo;

import org.springframework.data.repository.CrudRepository;

import com.bham.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
