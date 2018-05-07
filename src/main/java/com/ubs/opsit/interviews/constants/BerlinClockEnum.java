package com.ubs.opsit.interviews.constants;

public enum BerlinClockEnum {

	RED("R"), YELLOW("Y"), ORANGE("O"),
	TOP("TOP"), FIRST_ROW("ONE"), SECOND_ROW("TWO"), 
	THIRD_ROW("THREE"), FOURTH_ROW("FOUR");

	private String light;

	BerlinClockEnum(String light) {
		this.light = light;
	}

	public String value() {
		return light;
	}
}
