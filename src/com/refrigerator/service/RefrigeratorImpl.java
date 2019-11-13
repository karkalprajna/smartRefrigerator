package com.refrigerator.service;

import java.util.ArrayList;
import java.util.List;

import com.refrigerator.constant.RefrigeratorConstant;
import com.refrigerator.modle.Item;
import com.refrigerator.modle.Refrigerator;
import com.refrigerator.modle.Shelf;

public class RefrigeratorImpl implements IRefrigerator {
	// Create Refrigerator
		List<Shelf> shelfList = new ArrayList<>();
		
		Refrigerator refrigerator = new Refrigerator(
				RefrigeratorConstant.VOLUME_IN_INCHES,
				shelfList);
		
	@Override
	public void addItem(Item item) {
		//Create Shelf
		ShelfImpl shelfImpl = new ShelfImpl();		
		shelfImpl.addItem(item, shelfList);
		refrigerator.setShelf(shelfList);
	}

	@Override
	public Item getItem(Integer id) {
		ShelfImpl shelfImpl = new ShelfImpl();
		return shelfImpl.getItem(id,shelfList);
	}

	@Override
	public Item getItemByName(String name) {
		ShelfImpl shelfImpl = new ShelfImpl();
		return shelfImpl.getItemByName(name,shelfList);
	}

	@Override
	public void getAllItems() {
		ShelfImpl shelfImpl = new ShelfImpl();
		shelfImpl.getAllItems(refrigerator.getShelf());
	}

}
