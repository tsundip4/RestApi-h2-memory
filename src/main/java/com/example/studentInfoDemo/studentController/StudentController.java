package com.example.studentInfoDemo.studentController;

import com.example.studentInfoDemo.studentModel.StudentModel;
import com.example.studentInfoDemo.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/students")
    public List<StudentModel> getAllstudent(){
       return studentService.returnAllstudents();
    }

    @GetMapping("/students/{id}")
    public StudentModel getStudentbyId(@PathVariable int id){
        return studentService.getStudentbyId(id);
    }

    @PostMapping("/students")
    public void postStudent(@RequestBody StudentModel studentModel){
        studentService.addStudent(studentModel);
    }

    @PutMapping("/students/{id}")
    public void updateStudent(@RequestBody StudentModel studentModel, @PathVariable int id){
        studentService.updateStudent(studentModel, id);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentbyId(@PathVariable int id){
        studentService.deleteStudentbyId(id);
    }

}
