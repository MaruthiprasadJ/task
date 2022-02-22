package com.task.DTO;

import java.io.Serializable;

import lombok.Data;
@Data
public class AdressDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	
	private String adressType;
	
	private String doorNo;
	
	private String street;
	
	private String district;
	
	private String state;
	
	//private DetailerDTO detailerDTO;

}
