package com.refrigerator.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.refrigerator.constant.ShelfConstant;
import com.refrigerator.modle.Item;
import com.refrigerator.modle.Shelf;

public class AbstractShelf extends ShelfConstant{
	//Declare shelves here
	Map<String,List<Item>> shelves = new HashMap<>();
	
	List<Shelf> shelfList = new ArrayList<>();
	

	/*shelfList.add(new Shelf(2,ShelfConstant.SHELF2,20.0));
	shelfList.add(new Shelf(3,ShelfConstant.SHELF3,20.0));
	shelfList.add(new Shelf(4,ShelfConstant.SHELF4,20.0));*/
	
	
	
}
