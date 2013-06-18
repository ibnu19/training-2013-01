package com.artivisi.penagihan.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.artivisi.penagihan.domain.Nasabah;
import com.artivisi.penagihan.domain.PenagihanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:com/artivisi/**/applicationContext.xml")
public class NasabahDaoTest {
	
	@Autowired
	private PenagihanService penagihanService;
	
	@Test
	public void testInsertNasabah(){
		System.out.println("Tes Konfigurasi Spring Hibernate");
		
		Nasabah n = new Nasabah();
		n.setNama("Endy Muhardin");
		penagihanService.simpan(n);
	}
}
