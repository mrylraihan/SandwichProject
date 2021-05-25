package com.sandwhichshop.akspot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sandwhichshop.akspot.dto.SandwichDTO;

@Entity
@Table(name = "sandwich")
public class SandwichEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sandwichId;
	private String sandwichName;
	private String breadType;
	private String cheeseType;
	private String meatType;
	private String veggieType;
	private String sauceType;
	private Double sandwichPrice;
	
	
	public Integer getSandwichId() {
		return sandwichId;
	}
	public void setSandwichId(Integer sandwichId) {
		this.sandwichId = sandwichId;
	}
	public String getSandwichName() {
		return sandwichName;
	}
	public void setSandwichName(String sandwichName) {
		this.sandwichName = sandwichName;
	}
	public String getBreadType() {
		return breadType;
	}
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}
	public String getCheeseType() {
		return cheeseType;
	}
	public void setCheeseType(String cheeseType) {
		this.cheeseType = cheeseType;
	}
	public String getMeatType() {
		return meatType;
	}
	public void setMeatType(String meatType) {
		this.meatType = meatType;
	}
	public String getVeggieType() {
		return veggieType;
	}
	public void setVeggieType(String veggieType) {
		this.veggieType = veggieType;
	}
	public String getSauceType() {
		return sauceType;
	}
	public void setSauceType(String sauceType) {
		this.sauceType = sauceType;
	}
	public Double getSandwichPrice() {
		return sandwichPrice;
	}
	public void setSandwichPrice(Double sandwichPrice) {
		this.sandwichPrice = sandwichPrice;
	}
	
	public static SandwichDTO entityToDTO(SandwichEntity sandwichEntity) {
		
		SandwichDTO sDTO = new SandwichDTO();
		
		sDTO.setSandwichId(sandwichEntity.getSandwichId());
		sDTO.setSandwichName(sandwichEntity.getSandwichName());
		sDTO.setBreadType(sandwichEntity.getBreadType());
		sDTO.setCheeseType(sandwichEntity.getCheeseType());
		sDTO.setMeatType(sandwichEntity.getMeatType());
		sDTO.setVeggieType(sandwichEntity.getVeggieType());
		sDTO.setSauceType(sandwichEntity.getSauceType());
		sDTO.setSandwichPrice(sandwichEntity.getSandwichPrice());
		
		return sDTO;
		
	}
	
	
	
}
