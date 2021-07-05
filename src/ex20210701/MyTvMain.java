package ex20210701;

public class MyTvMain {

	public static void main(String[] args) {
		
		MyTv tv1 = new MyTv();
		
		tv1.setPowerOn(true);
		tv1.setChannel(5);
		tv1.setVolume(8);
		
		System.out.println("전원 : " + tv1.isPowerOn());
		System.out.println("채널 : " + tv1.getChannel());
		System.out.println("볼륨 : " + tv1.getVolume());
		
	}

}

class MyTv {
	
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
