package com.task.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="detailer_adress")
public class Adress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",insertable = false,updatable = false)
	private long id;
	
	@Column(name="adress_type")
	private String adressType;
	
	@Column(name="door_no")
	private String doorNo;
	
	@Column(name="street")
	private String street;
	
	@Column(name="district")
	private String district;
	
	@Column(name="state")
	private String state;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Detailer detailer;

}
