package com.task.service;


import com.task.DTO.AdressDTO;

public interface AdressService {
	
	public AdressDTO saveAdress(AdressDTO adressDTO);
	
	public AdressDTO getAdressById(long id);
	
	public AdressDTO updateAdress(AdressDTO adressDTO);
	
	public String deteleById(long id); 

}
