package com.nit.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nit.beans.Student;
import com.nit.repositry.Irepoistry;

@Service
public class StudentService implements IStudentService {
	@Autowired
    private  Irepoistry ir;

	@Override
	public void insertStudent(Student s) {
		ir.save(s);
		System.out.println("Inserted successfuly");
	}

	@Override
	public void deleteDtudent(Integer id) {
		ir.deleteById(id);
		System.out.println("Deleted success");
	}

	@Override
	public Iterable<Student> seeAllStudent() {
		Iterable<Student> s=ir.findAll();
		return s;
	}

	@Override
	public Optional<Student> getStudent(Integer id) {
		Optional<Student> byId = ir.findById(id);
		if(byId.isPresent()) {
			return byId;
		}else {
		return Optional.empty();
		}
	}

	@Override
	public Integer countStudent() {
		int count = (int) ir.count();
		return count;
	}

	@Override
	public String updateStudent(Integer id, String cname) {
		    Optional<Student> byId = ir.findById(id);
		       if(byId.isPresent()) {
		    	   Student std = byId.get();
		    	   std.setCname(cname);
		    	   ir.save(std);
		    	   return "Student updated";
		       }else {
			   return "not available";
		       }
		
	}
	
	
	
	
}
