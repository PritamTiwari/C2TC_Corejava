package com.tns.B28module;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;


import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class B28Module1ApplicationTests {

	@Autowired
	CertificateRepository cRepository;
	
	@Test
	@Order(1)
	public void testCreate () {
		Certificate c = new Certificate(); 
			c.setId(1);
			c.setYear(2022);
			c.setCollege("PMC Tech");
			cRepository.save(c);
			assertNotNull(cRepository.findById(1).get());
		
		
	}
	@Test
	@Order(2)
	public void testReadAll () {
		List<Certificate> list = cRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	@Order(3)
	public void testSingleProduct () {
		Certificate certificate = cRepository.findById(5).get();
		assertEquals(2019,certificate.getYear());
	}
	
	@Test
	@Order(4)
	public void testUpdate() {
		Certificate c = cRepository.findById(12).get();
		c.setCollege("Adhiyaman");
		cRepository.save(c);
		assertNotEquals("ACS College of Engineering",cRepository.findById(1).get().getCollege());
		
		}
	
	@Test
	@Order(5)
	public void testDelete () {
		cRepository.deleteById(14);
		assertThat(cRepository.existsById(14)).isFalse();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
