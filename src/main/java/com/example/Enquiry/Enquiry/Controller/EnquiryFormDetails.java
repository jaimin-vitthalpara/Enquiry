package com.example.Enquiry.Enquiry.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Enquiry.Enquiry.Model.EnquiryForm;
import com.example.Enquiry.Enquiry.Service.EnquiryService;

@RestController
@RequestMapping("/enquiry")
public class EnquiryFormDetails {

	@Autowired
	EnquiryService enquiryservice;
	
	@GetMapping("/enquiryformdetails")
	public ResponseEntity<List<EnquiryForm>> getFormDetails() {
		List<EnquiryForm> getallformdetails = enquiryservice.getFormDetails();
		return new ResponseEntity<List<EnquiryForm>>(getallformdetails,HttpStatus.OK);
	}
	
	@GetMapping("/enquiryformdetails/{id}")
	public Optional<EnquiryForm> getFormDetailsById(@PathVariable int id) {
		return enquiryservice.getFormDetailsById(id);
	}
	
	@PostMapping("/adddetails")
	public void addDetails(@RequestBody EnquiryForm ef) {
		enquiryservice.saveOrUpdate(ef);
	}
	
	@PutMapping("/enquiryformdetails/{id}")
	public void updateDetails(@PathVariable int id , @RequestBody EnquiryForm ef) {
		enquiryservice.updateDetails(id, ef);
	}
	
	@DeleteMapping("/enquiryformdetails/{id}")
	public void deleteByID(@PathVariable("id") int id) {
		enquiryservice.deleteByID(id);
	}
	
	@PostMapping("/findbyname")
	public List<EnquiryForm> findbyname(@RequestBody EnquiryForm ef) {
		return enquiryservice.findByName(ef);
		
	}
}
