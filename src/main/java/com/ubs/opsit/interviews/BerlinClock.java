package com.ubs.opsit.interviews;

import java.util.HashMap;
import java.util.Map;

import com.ubs.opsit.interviews.constants.BerlinClockEnum;

public class BerlinClock {

	private static Map<String, Integer> rowLightCount = new HashMap<>();

	static {
		rowLightCount.put(BerlinClockEnum.FIRST_ROW.value(), 4);
		rowLightCount.put(BerlinClockEnum.SECOND_ROW.value(), 4);
		rowLightCount.put(BerlinClockEnum.THIRD_ROW.value(), 11);
		rowLightCount.put(BerlinClockEnum.FOURTH_ROW.value(), 4);
	}

	private int getRowLightingNumber(int hoursOrMinutes, String row) {
		return ("ONE".equals(row) || "THREE".equals(row)) ? hoursOrMinutes / 5 : hoursOrMinutes % 5;

	}

	public String rowLight(int hoursMinsSecs, String row) {
		if (BerlinClockEnum.TOP.value().equals(row)) {
			return (hoursMinsSecs % 2 == 0) ? BerlinClockEnum.YELLOW.value() : BerlinClockEnum.ORANGE.value();
		}
		int n = rowLightCount.get(row);
		int rowLighting = getRowLightingNumber(hoursMinsSecs, row);
		StringBuilder berlinClockRow = new StringBuilder();

		String light = (BerlinClockEnum.FOURTH_ROW.value().equals(row)) ? BerlinClockEnum.YELLOW.value()
				: BerlinClockEnum.RED.value();

		for (int i = 0; i < n; i++) {
			if (!BerlinClockEnum.THIRD_ROW.value().equals(row)) {
				berlinClockRow.append((i < rowLighting) ? light : BerlinClockEnum.ORANGE.value());
			} else {
				if (i < rowLighting) {
					berlinClockRow
							.append(((i + 1) % 3 == 0) ? BerlinClockEnum.RED.value() : BerlinClockEnum.YELLOW.value());
				} else {
					berlinClockRow.append(BerlinClockEnum.ORANGE.value());
				}

			}

		}
		return berlinClockRow.toString();
	}

}
