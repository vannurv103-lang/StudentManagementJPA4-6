package com.nit.repositry;

import org.springframework.data.repository.CrudRepository;

import com.nit.beans.Student;

public interface Irepoistry extends CrudRepository<Student, Integer > {

}
