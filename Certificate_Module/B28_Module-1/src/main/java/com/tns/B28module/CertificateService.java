package com.tns.B28module;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class CertificateService {
	
	
	@Autowired
	private CertificateRepository repository;
	
	public List<Certificate> listAll(){
		return repository.findAll() ;
		
	}
	
	public Certificate get(Integer id) {
		return repository.findById(id).get();
		
	}
	
	public void save(Certificate certificate) {
		repository.save(certificate);
		
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}












