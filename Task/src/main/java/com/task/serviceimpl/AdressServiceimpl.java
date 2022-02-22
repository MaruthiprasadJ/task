package com.task.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.DTO.AdressDTO;
import com.task.model.Adress;
import com.task.repository.AdressRepository;
import com.task.service.AdressService;
import com.task.util.AdressUtil;
@Service
public class AdressServiceimpl extends AdressUtil implements AdressService {
	
	@Autowired
	private AdressRepository adressRepository;

	@Override
	public AdressDTO saveAdress(AdressDTO adressDTO) {
		Adress ad = adressRepository.save(AdressUtil.convertAdressDTOtoDO(adressDTO));
		return AdressUtil.convertAdressDOtoDOT(ad);
	}

	@Override
	public AdressDTO getAdressById(long id) {
		Adress add = adressRepository.getById(id);
		AdressDTO adto =convertAdressDOtoDOT(add);
		return adto;
	}

	@Override
	public AdressDTO updateAdress(AdressDTO adressDTO) {
		Adress add = adressRepository.save(AdressUtil.convertAdressDTOtoDO(adressDTO));
		return convertAdressDOtoDOT(add);
	}

	@Override
	public String deteleById(long id) {
		adressRepository.deleteById(id);
		return "detailer is detailed";
	}

}
