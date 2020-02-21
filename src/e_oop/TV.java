package e_oop;

public class TV {

	// TV와 최대한 비슷하게 TV클래스를 만들어주세요.

	boolean power; // 전원
	int volume; // 볼륨
	int channel; // 채널

	final int MAX_VOLUME = 30;
	final int MIN_VOLUME = 0;

	final int MAX_CHANNEL = 50;
	final int MIN_CHANNEL = 1;

	TV() {
		power = false;
		volume = 10;
		channel = 15;
	}

	void power() {
		power = !power;
		System.out.println("전원 : " + (power ? "ON" : "OFF"));
	}

	void volumeUp() {
		if (power && volume <= MAX_VOLUME) {
			volume++;
			System.out.println("볼륨 : " + volume);
		}
	}

	void volumeDown() {
		if (power && volume >= MIN_VOLUME) {
			volume--;
			System.out.println("볼륨 : " + volume);
		}
	}

	void channelUp() {
		if (power && channel <= MAX_CHANNEL) {
			channel++;
			System.out.println("채널 : " + channel);
		}
	}

	void channelDown() {
		if (power && channel >= MIN_CHANNEL) {
			channel--;
			System.out.println("채널 : " + channel);
		}
	}

	public static void main(String[] args) {

		TV tv = new TV();

		tv.power();
		//tv.power();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		
		System.out.println("==========");
		
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();

	}

}
