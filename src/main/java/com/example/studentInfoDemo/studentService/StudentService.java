package com.example.studentInfoDemo.studentService;

import com.example.studentInfoDemo.exception.StudentNotFoundException;
import com.example.studentInfoDemo.studentDao.StudentDAO;
import com.example.studentInfoDemo.studentModel.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;



    public List<StudentModel> returnAllstudents(){
        List<StudentModel> list = new ArrayList<>();
         studentDAO.findAll().forEach(list::add);
        return list;
    }

    public StudentModel getStudentbyId(int id) {
       // return list.stream().filter(t->t.getId()==id).findFirst().get();
        if(studentDAO.findById(id).isEmpty()==true){
            throw new StudentNotFoundException("Student with " + id + " is not found in our database");
        }
        else
            return studentDAO.findById(id).get();


    }

    public void addStudent(StudentModel studentModel) {
        //list.add(studentModel);
        studentDAO.save(studentModel);
    }

    public void updateStudent(StudentModel studentModel, int id) {
       // StudentModel studentModel1 = list.stream().filter(t -> t.getId() == id).findFirst().get();
       // int index = list.indexOf(studentModel1);
       // list.set(index, studentModel);

        studentDAO.save(studentModel);
    }


    public void deleteStudentbyId(int id) {
      //  StudentModel studentModel = list.stream().filter(t -> t.getId() == id).findFirst().get();
       // list.remove(studentModel);

        studentDAO.deleteById(id);
    }
}
