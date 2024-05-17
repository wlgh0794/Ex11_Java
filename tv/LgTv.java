package chap11_abstraction.tv;

public class LgTv extends Tv {

	@Override
	void powerOn() {
		
		System.out.println( " LG TV  : 전원 ON" );
		
	}

	@Override
	void powerOff() {
		
		System.out.println( " LG TV  : 전원 OFF" );
		
	}

	@Override
	public void operate( int channel  ) {
		
		this.lastChannel = channel;
		System.out.println( "LG TV : " + this.lastChannel + "로 이동합니다." );
	}

	@Override
	void moveTo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void channelUp() {
		// TODO Auto-generated method stub
		
		System.out.println( "LG TV : " + ++this.lastChannel + "로 이동합니다." );
		
	}

	@Override
	void channelDown() {
		// TODO Auto-generated method stub
		System.out.println( "LG TV : " + --this.lastChannel + "로 이동합니다." );
		
	}


	

	
	
	
	
	
	
}
