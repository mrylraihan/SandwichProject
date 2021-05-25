package com.sandwhichshop.akspot.dto;

import com.sandwhichshop.akspot.entity.SandwichEntity;

public class SandwichDTO {
	
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
	
	public SandwichEntity dtoToEntity() {
		
		 SandwichEntity sEntity = new SandwichEntity();
		 
		 sEntity.setSandwichId(this.getSandwichId());
		 sEntity.setSandwichName(this.getSandwichName());
		 sEntity.setBreadType(this.getBreadType());
		 sEntity.setCheeseType(this.getCheeseType());
		 sEntity.setMeatType(this.getMeatType());
		 sEntity.setVeggieType(this.getVeggieType());
		 sEntity.setSauceType(this.getSauceType());
		 sEntity.setSandwichPrice(this.getSandwichPrice());
		 
		 
		 
		return sEntity;
		
	}
	
	
}
