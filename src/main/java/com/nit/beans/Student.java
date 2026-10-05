package com.nit.beans;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="stu22")
public class Student {
	@SequenceGenerator(name="seq11",allocationSize = 1000,initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="seq11")
	@Id
    int id;
	@Column(length=20)
	String name;
	@Column(length=20)
	String cname;
	@Column(length=20)
	String iname;
	double price;
}
