package com.refrigerator.modle;

import java.util.List;

public class Shelf {
	private Integer shelfId;
	private String shelfName;
	private Double shelfVolume;//Volume = Length * Height * Width
	
	private List<Item> items;
	
	public Shelf(Integer shelfId,String shelfName,Double shelfVolume){
		setShelfId(shelfId);
		setShelfName(shelfName);
		setShelfVolume(shelfVolume);
	}
	
	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/**
	 * @return the shelfId
	 */
	public Integer getShelfId() {
		return shelfId;
	}
	/**
	 * @param shelfId the shelfId to set
	 */
	public void setShelfId(Integer shelfId) {
		this.shelfId = shelfId;
	}
	/**
	 * @return the shelfName
	 */
	public String getShelfName() {
		return shelfName;
	}
	/**
	 * @param shelfName the shelfName to set
	 */
	public void setShelfName(String shelfName) {
		this.shelfName = shelfName;
	}
	/**
	 * @return the shelfVolume
	 */
	public Double getShelfVolume() {
		return shelfVolume;
	}
	/**
	 * @param shelfVolume the shelfVolume to set
	 */
	public void setShelfVolume(Double shelfVolume) {
		this.shelfVolume = shelfVolume;
	}
}
