package com.sandwhichshop.akspot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandwhichshop.akspot.dto.SandwichDTO;
import com.sandwhichshop.akspot.exception.SandwichException;
import com.sandwhichshop.akspot.service.SandwichService;


@Validated
@RestController
@RequestMapping(value = "sandwichAPI") 
public class SandwichAPI {
	
	@Autowired
	private SandwichService sandwichService;
	
	@GetMapping(value="sandwich/{sandwichName}")
	public ResponseEntity<SandwichDTO>findBySanwichName(@PathVariable String sandwichName)throws SandwichException {
		SandwichDTO sandwichDTO = sandwichService.findBySanwichName(sandwichName);
		
		return new ResponseEntity<SandwichDTO>(sandwichDTO, HttpStatus.OK);
		
	}
	
	@GetMapping(value = "meat/{meatType}")
	public ResponseEntity<SandwichDTO> findByMeatType(@PathVariable String meatType) throws SandwichException {
		SandwichDTO sandwichDTO = sandwichService.findByMeatType(meatType);
		
		return new ResponseEntity<SandwichDTO>(sandwichDTO,HttpStatus.OK);
	}
	@GetMapping(value = "sauce/{sauceType}")
	public ResponseEntity<List<SandwichDTO>> findBySauceType (@PathVariable String sauceType) throws SandwichException {
		List<SandwichDTO> dtoList = sandwichService.findBySauceType(sauceType);
		
		return new ResponseEntity<List<SandwichDTO>>(dtoList,HttpStatus.OK);
	}
	
	@GetMapping(value = "id/{sandwichId}")
	public ResponseEntity<SandwichDTO> findById(@PathVariable Integer sandwichId) throws SandwichException{
		SandwichDTO sandwichDTO = sandwichService.findBySandwichId(sandwichId);
		
		return new ResponseEntity<SandwichDTO>(sandwichDTO, HttpStatus.OK);
		
	}
	@GetMapping(value = "getAll")
	public ResponseEntity<List<SandwichDTO>> getAllSandwich()throws SandwichException{
		List<SandwichDTO> sandwichDTO = sandwichService.getAllSandwich();
		return new ResponseEntity<List<SandwichDTO>>(sandwichDTO,HttpStatus.OK);
		
	}

}
