package chap11_abstraction.board;

public class NoticeBoard extends Board {

	boolean isAdmin = false ;


	public NoticeBoard(long id, String title, String content, String writer, String creDate) {
		super(id, title, content, writer, creDate);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void post()
	{
		if( this.isAdmin )
		{
			System.out.println( "관리자가 공지사항을 등록합니다." );
		}
		else
		{
			System.out.println( "공지 사항은 관리자만 등록" );
		}
		
		
	}
	
	public void modify()
	{
		if( this.isAdmin )
		{
			System.out.println( "관리자가 공지사항을 수정합니다." );
		}
		else
		{
			System.out.println( "공지 사항은 관리자만 등록" );
		}
		
	}


	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if( this.isAdmin )
		{
			System.out.println( "관리자가 공지사항을 삭제합니다." );
		}
		else
		{
			System.out.println( "공지 사항은 관리자만 등록" );
		}
		
	}
	

}
