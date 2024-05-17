package chap11_abstraction.tv;

public class samsungTv extends Tv {

	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		
		System.out.println( " 삼성 TV  : 전원 ON" );
		
	}

	@Override
	void powerOff() {
		// TODO Auto-generated method stub
		
		System.out.println( " 삼성 TV  : 전원 OFF" );
			
	}

	@Override
	void moveTo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void channelUp() {
		// TODO Auto-generated method stub
		
		
		System.out.println( "삼성TV : " + ++this.lastChannel + "로 이동합니다." );
		
		
	}

	@Override
	void channelDown() {
		// TODO Auto-generated method stub
		
		System.out.println( "삼성 TV : " + --this.lastChannel + "로 이동합니다." );
		
	}

	@Override
	void operate( int channel ) {
		// TODO Auto-generated method stub
		
		this.lastChannel = channel;
		System.out.println( "삼성 TV : " + this.lastChannel + "로 이동합니다." );
		
		
	}
	

	
}
