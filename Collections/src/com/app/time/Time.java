package com.app.time;

public class Time {
	private int hour;
	private int miniute;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMiniute() {
		return miniute;
	}
	public void setMiniute(int miniute) {
		this.miniute = miniute;
	}
	 private boolean isValid(int hour,int minute)
     //returns true if given hour & minute values are of range
     {
        if((hour >= 0 && hour <= 23) && (minute >= 0 && minute <=11))
        {
            return true;
        }
        else
        {
            return false;
        }
     }

}
