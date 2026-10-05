package com.nit.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.beans.Student;
import com.nit.service.StudentService;
@Component
public class RunnerClass implements CommandLineRunner {
	@Autowired
  private StudentService ss;
	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean is =true;
		while(is) {
			System.out.println("1. Register Student"
					+ "\n2. View All Students  "
					+ "\n3. Search By ID  "
					+ "\n4. Update Course     "
					+ "\n5. Delete Student     "
					+ "\n6. Count Students "
					+ "\n7. Exit"
					+ "\nEnter your Choice  ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter name ");
				String next = sc.next();
				System.out.println("Enter cname ");
				String Inext = sc.next();
				System.out.println("Enter iname ");
				String Nnext = sc.next();
				System.out.println("Enter price ");
				Double price = sc.nextDouble();
				Student stu = new Student();
				stu.setCname(next);
				stu.setIname(Inext);
				stu.setName(Nnext);
				stu.setPrice(price);
			     ss.insertStudent(stu);
				break;
			}
	        case 2:{
				Iterable<Student> stuall=ss.seeAllStudent();
				System.out.println(stuall);
				break;
			}
	        case 3:{
				System.out.println("Enter id ");
				int id =sc.nextInt();
				Student stu=ss.getStudent(id).get();
				System.out.println(stu);
				break;
			}
	        case 4:{
	        	System.out.println("Enter id ");
				int id =sc.nextInt();
				System.out.println("Enter name ");
				String Inext = sc.next();
				System.out.println(ss.updateStudent(id, Inext));
	        	break;
	        }
	        case 5:{
	        	System.out.println("Enter id ");
				int id =sc.nextInt();
                 ss.deleteDtudent(id);
	        	break;
	        }
	        case 6:{
	        	System.out.println(ss.countStudent());
	        	break;
	        }
	        case 7:{
	        	is=false;
	        	break;
	        }
	        default:{
	        	System.out.println("Invalid option");
	        }
			}
			
			
		}
		sc.close();
	}

}
