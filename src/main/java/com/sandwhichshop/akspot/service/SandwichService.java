package com.sandwhichshop.akspot.service;

import java.util.List;

import com.sandwhichshop.akspot.dto.SandwichDTO;
import com.sandwhichshop.akspot.exception.SandwichException;

public interface SandwichService {
	
	

	public SandwichDTO findBySanwichName(String sandwichName) throws SandwichException;
	
	public SandwichDTO findByMeatType(String meatType) throws SandwichException;
	
	public List<SandwichDTO> findBySauceType (String sauceType) throws SandwichException;
	
	public SandwichDTO findBySandwichId (Integer sandwichId) throws SandwichException;
	
	public List<SandwichDTO>getAllSandwich()throws SandwichException;
	
}
