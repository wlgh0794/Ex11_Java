package chap11_abstraction.board;

// Baorad 클래스를 추상화
// post 메소드 추상메소드로 변경
// modify 메소드와 delete 메소드를 추상메소드로 선언하고 FreeBoard 와 NoticeBoard에서 각 각 구현


abstract public class Board 
{
	long id ;
	String title;
	String content ;
	String writer ;
	String creDate;
	
	public Board()
	{
		
	}
	
	public Board(  long id , String title , String content , String writer , String creDate )
	{
		this.id = id ;
		this.title = title ;
		this.content = content ;
		this.writer = writer ;
		this.creDate = creDate ; 
	}
	
	abstract public void post() ;

	abstract public void modify() ;

	abstract public void delete() ;
	
	
	
}
