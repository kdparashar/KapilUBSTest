package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.constants.BerlinClockEnum;

public class TimeConverterImpl implements TimeConverter {

	private static final String DELIMETER = "\n";

	@Override
	public String convertTime(String aTime) {

		String timeArr[] = aTime.split(":");
		int hours = Integer.valueOf(timeArr[0]);
		int minutes = Integer.valueOf(timeArr[1]);
		int seconds = Integer.valueOf(timeArr[2]);
		
		

		StringBuilder berlinTime = new StringBuilder();
		BerlinClock clock = new BerlinClock();

		return berlinTime
				  .append(clock.rowLight(seconds, BerlinClockEnum.TOP.value())).append(DELIMETER)/*.append("[")*/
				  .append(clock.rowLight(hours, BerlinClockEnum.FIRST_ROW.value())).append(DELIMETER)
				  .append(clock.rowLight(hours, BerlinClockEnum.SECOND_ROW.value())).append(DELIMETER)
				  .append(clock.rowLight(minutes, BerlinClockEnum.THIRD_ROW.value())).append(DELIMETER)/*.append("]")*/
				  .append(clock.rowLight(minutes, BerlinClockEnum.FOURTH_ROW.value())).toString();

	}
	
	public static void main(String[] args) 	{
		TimeConverterImpl t = new TimeConverterImpl();
		
		System.out.println(t.convertTime("23:59:59"));
		
		
	}

}
