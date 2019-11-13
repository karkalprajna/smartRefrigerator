package com.refrigerator.modle;

public class Item {
	private Integer itemId;
	private String itemDescription;
	private String itemName;
	private Double itemLength;
	private Double itemHeight;
	private Double itemWidth;
	private Double itemVolume;
	
	public Item(Integer itemId, String itemName, String itemDescription, Double itemLength, 
			Double itemHeight, Double itemWidth){
		setItemId(itemId);
		setItemName(itemName);
		setItemDescription(itemDescription);
		setItemLength(itemLength);
		setItemHeight(itemHeight);
		setItemWidth(itemWidth);
		setItemVolume(itemLength*itemHeight*itemWidth);
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
	 * @return the itemLength
	 */
	public Double getItemLength() {
		return itemLength;
	}
	/**
	 * @param itemLength the itemLength to set
	 */
	public void setItemLength(Double itemLength) {
		this.itemLength = itemLength;
	}
	/**
	 * @return the itemHeight
	 */
	public Double getItemHeight() {
		return itemHeight;
	}
	/**
	 * @param itemHeight the itemHeight to set
	 */
	public void setItemHeight(Double itemHeight) {
		this.itemHeight = itemHeight;
	}
	/**
	 * @return the itemWidth
	 */
	public Double getItemWidth() {
		return itemWidth;
	}
	/**
	 * @param itemWidth the itemWidth to set
	 */
	public void setItemWidth(Double itemWidth) {
		this.itemWidth = itemWidth;
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
