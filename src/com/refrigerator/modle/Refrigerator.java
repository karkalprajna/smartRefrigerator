package com.refrigerator.modle;

import java.util.List;

public class Refrigerator {
	//Volume = Length * Height * Width, or V = L * H * W.
	private Double length;
	private Double height;
	private Double width;
	private Double volume;
	private List<Shelf> shelf;
	
	public Refrigerator(Double length,Double height,Double width){
		setLength(length);
		setHeight(height);
		setWidth(width);
		setVolume(length*height*width);
	}
	
	/**
	 * @return the length
	 */
	public Double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(Double length) {
		this.length = length;
	}
	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}
	/**
	 * @return the width
	 */
	public Double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(Double width) {
		this.width = width;
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
