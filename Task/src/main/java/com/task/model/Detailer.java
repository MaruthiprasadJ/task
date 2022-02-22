package com.task.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="detailer")
public class Detailer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",insertable = false,updatable = false)
	private long id;
	
	@Column(name="DetailerName")
	private String name;
	
	@Column(name="DetailerSalary")
	private double salary;
	
	@Column(name="DetailerShifts")
	private String shifts;
	
	@Column(name="active")
	private String active;
	
	@OneToMany(mappedBy = "detailer",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Adress> adress;

}
