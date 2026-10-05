package com.nit.service;

import java.util.Optional;
import com.nit.beans.Student;

public interface IStudentService {
   public void insertStudent(Student s);
   public void deleteDtudent(Integer id);
   public Iterable<Student> seeAllStudent();
   public Optional<Student> getStudent(Integer id);
   public Integer countStudent();
   public String updateStudent(Integer id,String cname );
   
}
