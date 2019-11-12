package com.refrigerator.service;

import com.refrigerator.modle.Item;

public interface IRefrigerator {
	public void addItem(Item item);
	public Item getItem(Integer id);
	public Item getItemByName(String name);
}
