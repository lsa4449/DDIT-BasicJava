package f_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

	// 얻기위한 메소드
	public int getHour() {
		return hour;
	}

	// 저장하기 위한 메소드
	public void setHour(int second) {

		if (second > 24) {
			this.hour = second % 24;
			second = second / 24;
		} else {
			this.hour = second;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int second) {

		if (second > 60) {
			this.minute = second % 60;
			second = second / 60;
			setHour(second);
		} else {
			this.minute = second;
		}
	}

	public int getSecond() {
		return second;
	}
 
	public void setSecond(int second) {
		if (second > 60) {
			this.second = second % 60;
			second = second / 60;
			setMinute(second);
		} else {
			this.second = second;
		}
	}
}