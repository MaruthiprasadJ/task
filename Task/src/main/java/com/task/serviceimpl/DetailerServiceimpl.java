package com.task.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.DTO.AdressDTO;
import com.task.DTO.DetailerDTO;
import com.task.model.Detailer;
import com.task.repository.DetailerRepository;
import com.task.service.AdressService;
import com.task.service.DetailerService;
import com.task.util.DetailerUtil;
@Service
public class DetailerServiceimpl extends DetailerUtil implements DetailerService {
	
	@Autowired
	private DetailerRepository detailerRepository;
	
	@Autowired
	private AdressService adressService;

	@Override
	public DetailerDTO addDetailer(DetailerDTO detailerDTO) {
		Detailer det = detailerRepository.save(convertDetailerDTOtoDO(detailerDTO));
		List<AdressDTO> adressDTOs= new ArrayList<>();
		
		detailerDTO.getAdressDTO().stream().forEach(adress ->{
			AdressDTO add = new AdressDTO();
			add.setId(adress.getId());
			add.setAdressType(adress.getAdressType());
			add.setDoorNo(adress.getDoorNo());
			add.setStreet(adress.getStreet());
			add.setDistrict(adress.getDistrict());
			add.setState(adress.getState());
//			add.setDetailerDTO(convertDetailerDOtoDTO(det));
			AdressDTO saveAdressDTO = adressService.saveAdress(add);
			adressDTOs.add(saveAdressDTO);
		});
		DetailerDTO convertDetailerDOtoDTO = convertDetailerDOtoDTO(det);
		convertDetailerDOtoDTO.setAdressDTO(adressDTOs);
		return convertDetailerDOtoDTO;
//		DetailerDTO DDTO = convertDetailerDOtoDTO(det);
//		DDTO.setAdressDTO(adressDTOs);
//		return DDTO;
	}
	
	@Override
	public List<Detailer> getAllDetailer() {
		List<Detailer> findall = detailerRepository.findAll();
		return findall;
	}

	@Override
	public DetailerDTO updateDetailer(DetailerDTO detailerDTO) {
		Detailer det = detailerRepository.save(convertDetailerDTOtoDO(detailerDTO));
		
		List<AdressDTO> adressDTOs= new ArrayList<>();
		
		detailerDTO.getAdressDTO().stream().forEach(adress ->{
			AdressDTO add = new AdressDTO();
			add.setId(adress.getId());
			add.setAdressType(adress.getAdressType());
			add.setDoorNo(adress.getDoorNo());
			add.setStreet(adress.getStreet());
			add.setDistrict(adress.getDistrict());
			add.setState(adress.getState());
//     		add.setDetailerDTO(convertDetailerDOtoDTO(det));
			AdressDTO adto = adressService.updateAdress(add);
			adressDTOs.add(adto);
		});
		DetailerDTO convertDetailerDOtoDTO = convertDetailerDOtoDTO(det);
		convertDetailerDOtoDTO.setAdressDTO(adressDTOs);
		return convertDetailerDOtoDTO;
		}

	@Override
	public String deleteDetailerById(long id) {
		detailerRepository.deleteById(id);
		return "deteted the detailer by id";
	}

	@Override
	public DetailerDTO getDetailerById(long id) {
	Detailer d1=detailerRepository.getById(id);
	DetailerDTO dett =convertDetailerDOtoDTO(d1);
		return dett;
	}

	@Override
	public String updateDetailerStatudById(long id ,String status) {
		detailerRepository.updateDetailerStatusdById(id,status);
		return "employee status has been updated sucessfully";
	}
	

}
