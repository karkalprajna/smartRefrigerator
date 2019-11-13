package com.refrigerator.service;

import java.util.ArrayList;
import java.util.List;

import com.refrigerator.constant.RefrigeratorConstant;
import com.refrigerator.modle.Item;
import com.refrigerator.modle.Refrigerator;
import com.refrigerator.modle.Shelf;

public class RefrigeratorImpl implements IRefrigerator {
	// Create Refrigerator
		Refrigerator refrigerator = new Refrigerator(
				RefrigeratorConstant.LENGTH_IN_INCHES,
				RefrigeratorConstant.HEIGHT_IN_INCHES,
				RefrigeratorConstant.WIDTH_IN_INCHES);
		List<Shelf> shelfList = new ArrayList<>();
	@Override
	public void addItem(Item item) {
		//Create Shelf
		ShelfImpl shelfImpl = new ShelfImpl();
		shelfImpl.createShelf(shelfList);
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
