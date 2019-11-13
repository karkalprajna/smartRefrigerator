package com.refrigerator.service;

import java.util.List;

import com.refrigerator.modle.Item;
import com.refrigerator.modle.Shelf;

public interface IShelf {	 
	List<Shelf> addItem(Item item,List<Shelf> shelf);
	void getAllItems(List<Shelf> listShelf);
	Item getItem(Integer id, List<Shelf> shelfList);
	Item getItemByName(String name, List<Shelf> shelfList);
}
