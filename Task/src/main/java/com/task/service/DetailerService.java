package com.task.service;


import java.util.List;

import com.task.DTO.DetailerDTO;
import com.task.model.Detailer;

public interface DetailerService {
	
	public DetailerDTO addDetailer(DetailerDTO detailerDTO);
	
	public List<Detailer> getAllDetailer();
	
	public DetailerDTO updateDetailer(DetailerDTO detailerDTO);
	
	public String deleteDetailerById(long id);
	
	public DetailerDTO getDetailerById(long id);
	
	public String updateDetailerStatudById(long id , String status); 

}
