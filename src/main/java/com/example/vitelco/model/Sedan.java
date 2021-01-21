package com.example.vitelco.model;

import com.example.vitelco.enums.CarType;

/**
 * @author Ilyas Ziyaoglu
 * @date 2021-01-20
 */

public class Sedan implements Car {

	private final CarType type = CarType.SEDAN;

	@Override
	public CarType getType() {
		return type;
	}
}