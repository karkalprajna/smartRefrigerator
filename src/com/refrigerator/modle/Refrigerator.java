package com.refrigerator.modle;

import java.util.List;

import com.refrigerator.constant.ShelfConstant;

public class Refrigerator {
	//Volume = Length * Height * Width, or V = L * H * W.
	private Double volume;
	private List<Shelf> shelf;
	
	public Refrigerator(Double volume,List<Shelf> shelf){
		shelf.add(new Shelf(1,ShelfConstant.SHELF1,4000.0));
		shelf.add(new Shelf(2,ShelfConstant.SHELF2,4000.0));
		shelf.add(new Shelf(3,ShelfConstant.SHELF3,4000.0));
		shelf.add(new Shelf(4,ShelfConstant.SHELF4,4000.0));
		setShelf(shelf);
		setVolume(volume);
	}
	
	
	/**
	 * @return the volume
	 */
	public Double getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public List<Shelf> getShelf() {
		return shelf;
	}
	public void setShelf(List<Shelf> shelf) {
		this.shelf = shelf;
	}
}
