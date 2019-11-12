package com.refrigerator.modle;

import java.util.List;

import com.refrigerator.constant.RefrigeratorConstant;

public class Shelf {
	private Integer shelfId;
	private String shelfName;
	private Double shelfVolume;//Volume = Length * Height * Width
	private Double height;
	private List<Item> items;
	
	public Shelf(Integer shelfId,String shelfName,Double height){
		setShelfId(shelfId);
		setShelfName(shelfName);
		setHeight(height);
		setShelfVolume(RefrigeratorConstant.LENGTH_IN_INCHES*getHeight()*RefrigeratorConstant.WIDTH_IN_INCHES);
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

	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}
	
	
}
