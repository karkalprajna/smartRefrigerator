package com.refrigerator.service;

import java.util.ArrayList;
import java.util.List;

import com.refrigerator.constant.RefrigeratorConstant;
import com.refrigerator.constant.ShelfConstant;
import com.refrigerator.modle.Item;
import com.refrigerator.modle.Refrigerator;
import com.refrigerator.modle.Shelf;

public class RefrigeratorOperations {
	public static void main(String args[]) {
		
		
		
		
		
		//Create Objects of item
		Item item1 = new Item(1,"Apple","Fruits",4);
		Item item2 = new Item(2,"Mango","Fruits",2);
		Item item3 = new Item(3,"carot","vegetable",4);
		Item item4 = new Item(4,"banana","Fruits",4);
		
		RefrigeratorImpl refrigeratorImpl = new RefrigeratorImpl();
		refrigeratorImpl.addItem(item1);
		
		/*Item item5 = new Item(5,"Green Apple","Fruits",4);
		Item item6 = new Item(6,"pineapple","Fruits",2);
		Item item7 = new Item(7,"milk","milk",1);
		Item item8 = new Item(8,"beens","vegetable",4);*/
		
		//add Item To Shelves
		/*ShelfImpl shelves = new ShelfImpl();
		shelves.addItem(item1);
		shelves.addItem(item1,SHELF1);
		shelves.addItem(item2,SHELF1);
		shelves.addItem(item2,SHELF1);
		shelves.addItem(item3,SHELF1);
		shelves.addItem(item3,SHELF2);
		shelves.addItem(item4,SHELF3);
		shelves.addItem(item1,SHELF1);
		shelves.addItem(item1,SHELF1);
		shelves.addItem(item2,SHELF1);
		shelves.addItem(item2,SHELF1);
		shelves.addItem(item3,SHELF1);
		shelves.addItem(item3,SHELF2);
		shelves.addItem(item4,SHELF3);
		Item removedItem = shelves.getItem(1);
		System.out.println("Item :"+removedItem.getItemName() +" is removed from refrigerator.");
		shelves.getAllItems();
		removedItem = shelves.getItemByName("apple");
		System.out.println("Item :"+removedItem.getItemName() +" is removed from refrigerator.");*/
	}
}
