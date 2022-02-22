package com.task.util;

import com.task.DTO.AdressDTO;
import com.task.model.Adress;

public class AdressUtil {

	public static Adress convertAdressDTOtoDO(AdressDTO adressDTO) {
		Adress adress = new Adress();
		adress.setId(adressDTO.getId());
		adress.setAdressType(adressDTO.getAdressType());
		adress.setDoorNo(adressDTO.getDoorNo());
		adress.setStreet(adressDTO.getStreet());
		adress.setDistrict(adressDTO.getDistrict());
		adress.setState(adressDTO.getState());
//		adress.setDetailer(DetailerUtil.convertDetailerDTOtoDO(adressDTO.getDetailerDTO()));
		return adress;
	}

	public static AdressDTO convertAdressDOtoDOT(Adress adress) {
		AdressDTO adressDTO = new AdressDTO();
		adressDTO.setId(adress.getId());
		adressDTO.setAdressType(adress.getAdressType());
		adressDTO.setDoorNo(adress.getDoorNo());
		adressDTO.setDistrict(adress.getDistrict());
		adressDTO.setState(adress.getState());
//		adressDTO.setDetailerDTO(DetailerUtil.convertDetailerDOtoDTO(adress.getDetailer()));
		return adressDTO;
	}


}
