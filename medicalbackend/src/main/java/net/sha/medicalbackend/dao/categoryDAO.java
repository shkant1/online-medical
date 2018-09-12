package net.sha.medicalbackend.dao;

import java.util.List;

import net.sha.medicalbackend.dto.category;


public interface categoryDAO {
	
	category get(int id);
	List<category> list();
	boolean add(category category);
	boolean update(category category);
	boolean delete(category category);

}
