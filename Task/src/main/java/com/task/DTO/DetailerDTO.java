
package com.task.DTO;

import java.io.Serializable;

import java.util.List;

import lombok.Data;
@Data
public class DetailerDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	
	private String name;
	
	private double salary;
	
	private String shifts;
	
	private List<AdressDTO> adressDTO;
	
	

}
