package com.refrigerator.service;

import java.util.ArrayList;
import java.util.List;

import com.refrigerator.constant.ShelfConstant;
import com.refrigerator.modle.Item;
import com.refrigerator.modle.Shelf;

public class RefrigeratorImpl extends AbstractRefrigerator implements IRefrigerator {

	@Override
	public void addItem(Item item) {
		//Create Shelf
		ShelfImpl shelfImpl = new ShelfImpl();
		refrigerator.setShelf(shelfImpl.createShelf());
		
		Shelf shelf = new Shelf(1,ShelfConstant.SHELF1,20.0);
		
		
		shelfImpl.addItem(item, shelf);
		
	}

	@Override
	public Item getItem(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItemByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
