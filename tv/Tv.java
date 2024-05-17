package chap11_abstraction.tv;

public abstract class Tv 
{
	public int lastChannel ;
	
	public Tv() // 생성자는 추상화 불가능
	{
		lastChannel = 1 ;	
	}
	
	abstract void powerOn( ) ;

	abstract void powerOff( ) ;

	abstract void operate( int channel ) ;

	abstract void moveTo(  ) ;

	abstract void channelUp( ) ;

	abstract void channelDown( ) ;

	
}
