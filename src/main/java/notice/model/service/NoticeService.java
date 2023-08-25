package notice.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import notice.model.dao.NoticeDao;
import notice.model.vo.Notice;

public class NoticeService {
	private NoticeDao dao = new NoticeDao();
	
	public NoticeService() {}
	
	//조회 
	public Notice selectNotice(int noticeid) {
		Connection conn = getConnection();
		Notice notice = dao.selectNotice(conn, noticeid);
		close(conn);
		return notice;
	}
	
	//전체 조회
	public ArrayList<Notice> selectNoticeAll() {
		Connection conn = getConnection();
		ArrayList<Notice> list = dao.selectNoticeAll(conn);
		close(conn);
		return list;
	}
	
	//삽입
	public int insertNotice(Notice notice) {
		Connection conn = getConnection();
		int result = dao.insertNotice(conn, notice);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
	}
	
	//수정
	public int updateNotice(Notice notice) {
		Connection conn = getConnection();
		int result = dao.updateNotice(conn, notice);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//삭제
	public int deleteNotice(Notice notice) {
		Connection conn = getConnection();
		int result = dao.deleteNotice(conn, notice);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//첨부파일 업로드
	public int loadNotice(Notice notice) {
		Connection conn = getConnection();
		int result = dao.loadNotice(conn, notice);
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//검색
	public ArrayList<Notice> searchNotice(String keyword){
		Connection conn = getConnection();
		ArrayList<Notice> list = dao.searchNotice(conn, keyword);
		close(conn);
		return list;
	}
}
