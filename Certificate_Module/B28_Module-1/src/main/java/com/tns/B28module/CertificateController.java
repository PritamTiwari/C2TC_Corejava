package com.tns.B28module;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CertificateController {

@Autowired

private CertificateService service;

//Retrieval
@GetMapping("/certificates")

public List<Certificate> list() {
	
	return service.listAll();
}
	
	//Retrieval By Id
@GetMapping("/certificates/{id}")

	public ResponseEntity <Certificate>get(@PathVariable Integer id){
				try {
					Certificate certificate = service.get(id);
					return new ResponseEntity<Certificate>(certificate,HttpStatus.OK);
				} catch (Exception e) {
					return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
					// TODO Auto-generated catch block
					
				}
	}
//Create
@PostMapping("/certificates")
public void add(@RequestBody Certificate certificate) {
	service.save(certificate);
}

//Update
@PutMapping("/certificates/{id}")
public ResponseEntity<?> update(@RequestBody Certificate certificate,@PathVariable Integer id){
	try {
		Certificate existcertificate = service.get(id);
		service.save(certificate);
		return new ResponseEntity <> (HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		// TODO Auto-generated catch block
		
	}
	
}

//Delete
@DeleteMapping("/certificates/{id}")
public void delete(@PathVariable Integer id) {
	service.delete(id);
}












}