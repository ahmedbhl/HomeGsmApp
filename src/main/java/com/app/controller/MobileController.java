package com.app.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Mobile;
import com.app.repositories.IMobileRepository;

@RestController
@RequestMapping(value = "/v1/mobile")
public class MobileController {

	@Autowired
	IMobileRepository IMobileRepository;

	// @RequestMapping(value="/create",method=RequestMethod.POST)
	@PostMapping(value = "/create")
	public Mobile CreateMobile(@RequestBody Mobile mobile) {
		return IMobileRepository.save(mobile);
	}

	@PutMapping(value = "/update/{id}")
	public Mobile UpdateMobile(@PathVariable(value = "id") Long id, @RequestBody Mobile mobile) {
		if (id != null) {
			Mobile mob = IMobileRepository.findOne(id);
			if (mob != null) {
				mobile.setIdMobile(id);
				mobile = IMobileRepository.save(mobile);
				return mobile;

			}
		}
		return null;
		
	}

	@DeleteMapping(value = "/delete/{id}")
	public void DeletMobile(@PathVariable(value = "id") Long id) {
		if (id != null) {
			Mobile mob = IMobileRepository.findOne(id);
			if (mob != null) {
				IMobileRepository.delete(id);
			}
		}
	}

	@GetMapping(value = "/all")
	public List<Mobile> GetAllMobile() {
		return IMobileRepository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Mobile getById(@PathVariable(value = "id") Long id) {

		return IMobileRepository.findOne(id);

	}

	@GetMapping(value = "/name/{nameClient}")
	public List<Mobile> getByNameClient(@PathVariable(value = "nameClient") String name) {

		return IMobileRepository.getBynameClient(name);

	}

	@GetMapping(value = "/imei/{imei}")
	public List<Mobile> getByimei(@PathVariable(value = "imei") String imei) {

		return IMobileRepository.getByimei(imei);

	}

	@GetMapping(value = "/model/{model}")
	public List<Mobile> getByModel(@PathVariable(value = "model") String model) {

		return IMobileRepository.getByModel(model);

	}

	@GetMapping(value = "/date/{date}")
	public List<Mobile> getByDate(@PathVariable(value = "date") Date date) {

		return IMobileRepository.getByDate(date);

	}

	@GetMapping(value = "/panne/{panne}")
	public List<Mobile> getByPanne(@PathVariable(value = "panne") String panne) {

		return IMobileRepository.getByPanne(panne);

	}

}
