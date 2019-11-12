package com.refrigerator.modle;

public class Item {
	private Integer itemId;
	private String itemDescription;
	private String itemName;
	private Integer itemQuantity;
	
	public Item(Integer itemId, String itemName, String itemDescription, Integer itemQuantity){
		setItemId(itemId);
		setItemName(itemName);
		setItemDescription(itemDescription);
		setItemQuantity(itemQuantity);
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
	 * @return the itemQuantity
	 */
	public Integer getItemQuantity() {
		return itemQuantity;
	}
	/**
	 * @param itemQuantity the itemQuantity to set
	 */
	public void setItemQuantity(Integer itemQuantity) {
		if(itemQuantity <= 4){
			this.itemQuantity = itemQuantity;
		}else{
			System.out.println("Quantity must be less than or equal to 4");
			System.exit(0);
		}
	}
	
}
