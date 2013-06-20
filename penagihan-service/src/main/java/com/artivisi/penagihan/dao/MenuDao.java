/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.penagihan.dao;

import com.artivisi.penagihan.domain.Menu;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jimmy
 */
@Repository
public class MenuDao {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @SuppressWarnings("unchecked")
	public List<Menu> cariSemua() {
		
		return entityManager.createQuery("select n from Menu n order by n.kode")
				.getResultList();
	}
    
}
