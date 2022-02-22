package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.task.DTO.DetailerDTO;
import com.task.model.Detailer;
import com.task.service.DetailerService;

@RestController
@RequestMapping("/detailer")
public class DetailerController {
	
	@Autowired
	private DetailerService detailerService;
	
	@PostMapping("/save")
	private DetailerDTO saveDetailer(@RequestBody DetailerDTO detailerDTO) {
		return detailerService.addDetailer(detailerDTO);	
	}
	
	@GetMapping("/get")
	private List<Detailer> getAllDetailer(){
		return detailerService.getAllDetailer();
	}
	
	@GetMapping("/get/{id}")
	private DetailerDTO getDetailerById(@PathVariable long id){
		return detailerService.getDetailerById(id);
	}
	
	@PutMapping("/update/{id}")
	private DetailerDTO updateDetailer(@RequestBody DetailerDTO detailerDTO) {
		return detailerService.updateDetailer(detailerDTO);
	}
	@DeleteMapping("/delete/{id}")
	private String deleteDetailerById(@PathVariable long id) {
		return detailerService.deleteDetailerById(id);
	}
	
	@PutMapping("/updatestatus")
	private String updateDetailerStatudById(@RequestParam String status,@RequestParam long id) {
		return detailerService.updateDetailerStatudById(id, status);
	}
	
}
