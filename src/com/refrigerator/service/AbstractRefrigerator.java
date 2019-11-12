package com.refrigerator.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.refrigerator.constant.RefrigeratorConstant;
import com.refrigerator.modle.Item;
import com.refrigerator.modle.Refrigerator;

public class AbstractRefrigerator extends RefrigeratorConstant {
	// Declare shelves here
	Map<String, List<Item>> shelves = new HashMap<>();
	
	// Create Refrigerator
	Refrigerator refrigerator = new Refrigerator(
			RefrigeratorConstant.LENGTH_IN_INCHES,
			RefrigeratorConstant.HEIGHT_IN_INCHES,
			RefrigeratorConstant.WIDTH_IN_INCHES);

}
