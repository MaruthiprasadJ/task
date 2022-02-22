package com.task.util;

import com.task.DTO.DetailerDTO;
import com.task.model.Detailer;

public class DetailerUtil {
	
	public static Detailer convertDetailerDTOtoDO(DetailerDTO detailerDTO) {
		Detailer detailer = new Detailer();
		detailer.setId(detailerDTO.getId());
		detailer.setName(detailerDTO.getName());
		detailer.setSalary(detailerDTO.getSalary());
		detailer.setShifts(detailerDTO.getShifts());
		return detailer;
	}
	
	public static DetailerDTO convertDetailerDOtoDTO(Detailer detailer) {
		DetailerDTO detailerDTO = new DetailerDTO();
		detailerDTO.setId(detailer.getId());
		detailerDTO.setName(detailer.getName());
		detailerDTO.setSalary(detailer.getSalary());
		detailerDTO.setShifts(detailer.getShifts());
		return detailerDTO;
	}
	

}
