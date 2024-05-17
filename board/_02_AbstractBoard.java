package chap11_abstraction.board;

public class _02_AbstractBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ########################################
		
		Board board1 = new FreeBoard(1, "안녕하세요" , "추상화" , "고기천" , "24-05-02" ,"첨부파일");
		
		board1.post();
		board1.modify();
		board1.delete();
		
		board1 = new NoticeBoard(1, "공지사항" , "공지사항입니다" , "관리자" , "24-05-02");
		
		board1.post();
		board1.modify();
		board1.delete();
		
		// ########################################
		
		
		
		
		
		
		// ########################################
		
	}

}
