package com.refrigerator.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import com.refrigerator.modle.Item;
import com.refrigerator.modle.Shelf;

public class ShelfImpl implements IShelf {

	@Override
	public void getAllItems(List<Shelf> listShelf) {
		if (listShelf != null) {
			for (Shelf shelf : listShelf) {
				System.out.println("Shelf :" + shelf.getShelfName());
				if (shelf.getItems() != null) {
					for (Item item : shelf.getItems()) {
						System.out.println("Item Id :" + item.getItemId()
								+ ", Item Name :" + item.getItemName());
					}
				}
			}
		}
	}

	@Override
	public Item getItem(Integer id, List<Shelf> shelfList) {
		try {
			if (shelfList != null) {
				for (Shelf shelf : shelfList) {
					List<Item> items = shelf.getItems();
					if (items != null) {
						Iterator<Item> itemIterator = items.iterator();
						while (itemIterator.hasNext()) {
							Item removedItem = itemIterator.next();
							if (removedItem.getItemId().intValue() == id) {
								Shelf shelfRemove = shelfList.get(shelfList.indexOf(shelf));
								shelfRemove.getItems().remove(removedItem);
								return removedItem;
							}
						}
					}
				}
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public Item getItemByName(String name, List<Shelf> shelfList) {
		try {
			if (shelfList != null) {
				for (Shelf shelf : shelfList) {
					List<Item> items = shelf.getItems();
					if (items != null) {
						Iterator<Item> itemIterator = items.iterator();
						while (itemIterator.hasNext()) {
							Item removedItem = itemIterator.next();
							if (removedItem.getItemName().compareToIgnoreCase(name) == 0) {
								Shelf shelfRemove = shelfList.get(shelfList.indexOf(shelf));
								shelfRemove.getItems().remove(removedItem);
								return removedItem;
							}
						}
					}
				}
			}			
		}catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Shelf> addItem(Item item, List<Shelf> shelfList) {
		try {
			if (!shelfList.isEmpty()) {
				//get the shelf name where the item needs to be placed 
				Shelf shelfName = getVacantShelf(shelfList,item.getItemVolume());
				
				if (shelfName != null) {
					addItemToShelf(item, shelfList.get(shelfList.indexOf(shelfName)));
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getCause());
		}
		return shelfList;
	}

	private void addItemToShelf(Item item, Shelf shelfName) {
		if(shelfName != null){
			//space left in shelf in volume
			List<Item> itemList = shelfName.getItems();
			if(itemList != null){
				itemList.add(item);
			}else{
				itemList = new ArrayList<>();
				itemList.add(item);
				shelfName.setItems(itemList);
			}
		}
	}

	private Shelf getVacantShelf(List<Shelf> shelfList, Double itemVolume) {
		// find the empty space and add the item
		// if the refrigerator is full -> display the appropriate message
		
		if (!shelfList.isEmpty()) {
			for (Shelf shelf : shelfList) {
				Double volumeOfItems = 0.0;
				List<Item> itemList = shelf.getItems();
				if (itemList != null) {
					for (Item item : itemList) {
						volumeOfItems = volumeOfItems + item.getItemVolume();
					}
					//TODO get the volume of the item and check whether the vacant space in the shelf is enough  
					if (volumeOfItems < shelf.getShelfVolume()) {
						Double spaceLeft = shelf.getShelfVolume() - volumeOfItems;
						if(itemVolume<spaceLeft){
							return shelf;
						}
					}
				}else{
					return shelf;
				}
			}
			System.out.println("Refrigerator is full.");
		}
		return null;
	}

	/*private boolean validateShelfSize(String shelfNumber) {
		if (shelves.get(shelfNumber) != null) {
			Integer shelfElements = shelves.get(shelfNumber).size();
			// number of element in the shelf
			if (shelfElements < 4) {
				return true;
			} else if (shelfElements == 4) {
				System.out.println(shelfNumber + " is full.");
				return false;
			}
		}
		return true;
	}*/

	

}
