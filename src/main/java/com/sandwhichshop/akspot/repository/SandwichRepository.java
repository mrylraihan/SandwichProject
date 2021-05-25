package com.sandwhichshop.akspot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sandwhichshop.akspot.entity.SandwichEntity;

@Repository
public interface SandwichRepository extends CrudRepository<SandwichEntity, Integer>{
	
	public SandwichEntity findBySandwichName(String sandwichName);
	
	public SandwichEntity findByMeatType(String meatType);
	
	public List<SandwichEntity> findBySauceType (String sauceType);
	
	

}
