package com.refrigerator.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.refrigerator.modle.Item;
import com.refrigerator.modle.Shelf;

public class ShelfImpl extends AbstractShelf implements IShelf {

	@Override
	public void getAllItems() {
		for (Map.Entry<String, List<Item>> shelveList : shelves.entrySet()) {
			System.out.println("Shelf :" + shelveList.getKey());
			for (Item item : shelveList.getValue()) {
				System.out.println("Item Id :" + item.getItemId()
						+ ", Item Name :" + item.getItemName());
			}
		}
	}

	@Override
	public Item getItem(Integer id) {
		if (shelves.size() != 0) {
			for (Map.Entry<String, List<Item>> shelveList : shelves.entrySet()) {
				Iterator<Item> itemIterator = shelveList.getValue().iterator(); // Convert
																				// arrayList
																				// to
																				// iterator
				while (itemIterator.hasNext()) {
					if (itemIterator.next().getItemId().intValue() == id) {
						Item removedItem = itemIterator.next();
						// System.out.println("Item :"+id
						// +" from shelf "+shelveList.getKey()+" is removed from refrigerator.");
						shelveList.getValue().remove(itemIterator.next());
						return removedItem;
					}
				}
			}
		}
		return null;
	}

	@Override
	public Item getItemByName(String name) {
		if (shelves.size() != 0) {
			for (Map.Entry<String, List<Item>> shelveList : shelves.entrySet()) {
				Iterator<Item> itemIterator = shelveList.getValue().iterator(); // Convert
																				// arrayList
																				// to
																				// iterator
				while (itemIterator.hasNext()) {
					if (itemIterator.next().getItemName()
							.compareToIgnoreCase(name) == 0) {
						Item removedItem = itemIterator.next();
						shelveList.getValue().remove(itemIterator.next());
						return removedItem;
					}
				}
			}
		}
		return null;
	}

	@Override
	public void addItem(Item item, Shelf shelfNumber) {
		try {
			if (shelves.size() <= 4) {
				if (!validateShelfSize(shelfNumber)) {
					// get the empty shelf number
					shelfNumber = getVacantShelfNumber();
				}
				if (shelfNumber != null) {
					addItemToShelf(item, shelfNumber);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
	}

	private void addItemToShelf(Item item, String shelfNumber) {
		if (shelves.containsKey(shelfNumber)
				&& shelves.get(shelfNumber).size() < 4) {
			// check the number of items
			List<Item> shelfItems = shelves.get(shelfNumber);
			shelfItems.add(item);
		} else {
			// add items at shelf
			List<Item> itemList = new ArrayList<>();
			itemList.add(item);
			shelves.put(shelfNumber, itemList);
		}
	}

	private String getVacantShelfNumber() {
		// find the empty space and add the item
		// if the refrigerator is full -> display the appropriate message
		if (shelves.size() <= 4) {
			if (shelves.get(SHELF1) == null	|| (shelves.get(SHELF1) != null 
					&& shelves.get(SHELF1).size() < 4)) {
				return SHELF1;
			}
			if (shelves.get(SHELF2) == null || shelves.get(SHELF2) != null
					&& shelves.get(SHELF2).size() < 4) {
				return SHELF2;
			}
			if (shelves.get(SHELF3) == null || shelves.get(SHELF3) != null
					&& shelves.get(SHELF3).size() < 4) {
				return SHELF3;
			}
			if (shelves.get(SHELF4) == null || shelves.get(SHELF4) != null
					&& shelves.get(SHELF4).size() < 4) {
				return SHELF4;
			}
			System.out.println("Refrigerator is full.");
		}
		return null;
	}

	private boolean validateShelfSize(String shelfNumber) {
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
	}

	@Override
	public List<Shelf> createShelf() {
		Shelf Shelf1 = new Shelf(1,SHELF1,20.0);
		shelfList.add(Shelf1);
		return shelfList;
	}

}
