package com.pk.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Details")
public class Student implements Serializable {
	
	private Integer id;
	private String sName;
	private String addrs;
	private long mobNum;

}
