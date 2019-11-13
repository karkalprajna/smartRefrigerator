package com.refrigerator.modle;

public class Item {
	private Integer itemId;
	private String itemDescription;
	private String itemName;	
	private Double itemVolume;
	
	public Item(Integer itemId, String itemName, String itemDescription, Double itemVolume){
		setItemId(itemId);
		setItemName(itemName);
		setItemDescription(itemDescription);
		setItemVolume(itemVolume);
	}
	/**
	 * @return the itemId
	 */
	public Integer getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the itemDescription
	 */
	public String getItemDescription() {
		return itemDescription;
	}
	/**
	 * @param itemDescription the itemDescription to set
	 */
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	/**
	 * @return the itemVolume
	 */
	public Double getItemVolume() {
		return itemVolume;
	}
	/**
	 * @param itemVolume the itemVolume to set
	 */
	public void setItemVolume(Double itemVolume) {
		this.itemVolume = itemVolume;
	}
	
}
