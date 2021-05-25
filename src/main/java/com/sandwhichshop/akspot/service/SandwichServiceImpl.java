package com.sandwhichshop.akspot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sandwhichshop.akspot.dto.SandwichDTO;
import com.sandwhichshop.akspot.entity.SandwichEntity;
import com.sandwhichshop.akspot.exception.SandwichException;
import com.sandwhichshop.akspot.repository.SandwichRepository;

@Transactional
@Service(value = "sandwichService")
public class SandwichServiceImpl implements SandwichService{
	
	@Autowired
	private SandwichRepository sandwichRepository;

	@Override
	public SandwichDTO findBySanwichName(String sandwichName) throws SandwichException {
		SandwichEntity sEntity = sandwichRepository.findBySandwichName(sandwichName);
		if(sEntity==null) {
			throw new SandwichException("Service.Sandwich_Not_Found");
		}
		return SandwichEntity.entityToDTO(sEntity);
	}

	@Override
	public SandwichDTO findByMeatType(String meatType) throws SandwichException {
		SandwichEntity sEntity = sandwichRepository.findByMeatType(meatType);
		if(sEntity==null) {
			throw new SandwichException("Service.Meat_Type_Does_Not_Exsist_Bro");
		}
		return SandwichEntity.entityToDTO(sEntity);
	}

	@Override
	public List<SandwichDTO> findBySauceType(String sauceType) throws SandwichException {
		List<SandwichEntity> sandwichList = sandwichRepository.findBySauceType(sauceType);
		if(sandwichList.isEmpty()) {
			throw new SandwichException("Service.Sauce_Type_Not_Found");
		}
		List<SandwichDTO> sDtoList = new ArrayList<SandwichDTO>();
		for(SandwichEntity sEntity:sandwichList) {
			sDtoList.add(SandwichEntity.entityToDTO(sEntity));
			
		}
		return sDtoList;
	}

	@Override
	public SandwichDTO findBySandwichId(Integer sandwichId) throws SandwichException {
		Optional<SandwichEntity> optionalS = sandwichRepository.findById(sandwichId);
		SandwichEntity sandwichEntity = optionalS.orElseThrow(()-> new SandwichException("Service.Sandwich_ID_Not_Found"));
		return SandwichEntity.entityToDTO(sandwichEntity);
	}

	@Override
	public List<SandwichDTO> getAllSandwich() throws SandwichException {
		Iterable<SandwichEntity> sandwiches = sandwichRepository.findAll();
		List<SandwichDTO> sList = new ArrayList<SandwichDTO>();
		for(SandwichEntity sl : sandwiches ) {
			sList.add(SandwichEntity.entityToDTO(sl));
		}if(sList.isEmpty())throw new SandwichException("Service.No_Sandwiches_Found_Bro"); 
		
		return sList;
	}

	
	
}
