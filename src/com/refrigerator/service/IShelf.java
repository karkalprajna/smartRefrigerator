package com.refrigerator.service;

import java.util.List;

import com.refrigerator.modle.Item;
import com.refrigerator.modle.Shelf;

public interface IShelf {
	public void getAllItems(); 
	public Item getItem(Integer id);
	public Item getItemByName(String name);
	public void addItem(Item item,Shelf shelf);
    public List<Shelf> createShelf();
	
}
