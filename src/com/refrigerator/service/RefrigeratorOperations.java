package com.refrigerator.service;

import com.refrigerator.modle.Item;

public class RefrigeratorOperations {
	public static void main(String args[]) {
		
		//Create Objects of item
		Item item1 = new Item(1,"Apple","Fruits",4000.0);
		Item item2 = new Item(2,"Mango","Fruits",3000.0);
		Item item3 = new Item(3,"carot","vegetable",2000.0);
		Item item4 = new Item(4,"banana","Fruits",1000.0);
		Item item5 = new Item(5,"Green Apple","Fruits",4000.0);
		Item item6 = new Item(6,"pineapple","Fruits",2000.0);
		Item item7 = new Item(7,"milk","milk",1000.0);
		Item item8 = new Item(8,"beens","vegetable",4000.0);
		
		RefrigeratorImpl refrigeratorImpl = new RefrigeratorImpl();
		refrigeratorImpl.addItem(item1);
		refrigeratorImpl.addItem(item2);
		refrigeratorImpl.addItem(item3);
		refrigeratorImpl.addItem(item4);
		refrigeratorImpl.addItem(item5);
		refrigeratorImpl.addItem(item6);
		refrigeratorImpl.addItem(item7);
		refrigeratorImpl.addItem(item8);
		refrigeratorImpl.addItem(item1);
		refrigeratorImpl.addItem(item2);
		refrigeratorImpl.addItem(item3);
		refrigeratorImpl.addItem(item4);
		refrigeratorImpl.addItem(item5);
		refrigeratorImpl.getAllItems();
		Item removedItem = refrigeratorImpl.getItem(8);
		System.out.println("Item :"+removedItem.getItemName() +" is removed from refrigerator.");
		System.out.println("----------------------------------------");
		refrigeratorImpl.getAllItems();
		removedItem = refrigeratorImpl.getItemByName("Mango");
		System.out.println("Item :"+removedItem.getItemName() +" is removed from refrigerator.");
		System.out.println("----------------------------------------");
		refrigeratorImpl.getAllItems();
		
	}
}
