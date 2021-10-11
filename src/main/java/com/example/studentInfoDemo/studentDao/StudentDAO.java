package com.example.studentInfoDemo.studentDao;

import com.example.studentInfoDemo.studentModel.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<StudentModel, Integer> {

}
