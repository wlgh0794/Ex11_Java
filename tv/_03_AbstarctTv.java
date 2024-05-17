package chap11_abstraction.tv;

public class _03_AbstarctTv {

	public static void main(String[] args) {
		
		
		Tv tv = new LgTv() ;
		
		tv.powerOn();
		tv.operate(11);
		tv.channelDown();
		tv.channelUp();
		tv.powerOff();
		
		tv = new samsungTv() ;
		
		tv.powerOn();
		tv.operate(12);
		tv.channelDown();
		tv.channelUp();
		tv.powerOff();
		

	}

}
