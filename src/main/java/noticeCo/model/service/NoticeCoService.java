package noticeCo.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import noticeCo.model.dao.NoticeCoDao;
import noticeCo.model.vo.NoticeCo;

public class NoticeCoService {
	private NoticeCoDao dao = new NoticeCoDao();
	
	public NoticeCoService() {}
	
	//조회 
	public NoticeCo selectNoticeCo(int noticeCoid) {
		Connection conn = getConnection();
		NoticeCo noticeCo = dao.selectNoticeCo(conn, noticeCoid);
		close(conn);
		return noticeCo;
	}
	
	//전체 조회
	public ArrayList<NoticeCo> selectNoticeCoAll() {
		Connection conn = getConnection();
		ArrayList<NoticeCo> list = dao.selectNoticeCoAll(conn);
		close(conn);
		return list;
	}
	
	//삽입
	public int insertNoticeCo(NoticeCo noticeCo) {
		Connection conn = getConnection();
		int result = dao.insertNoticeCo(conn, noticeCo);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
	}
	
	//수정
	public int updateNoticeCo(NoticeCo noticeCo) {
		Connection conn = getConnection();
		int result = dao.updateNoticeCo(conn, noticeCo);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//삭제
	public int deleteNoticeCo(NoticeCo noticeCo) {
		Connection conn = getConnection();
		int result = dao.deleteNoticeCo(conn, noticeCo);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//첨부파일 업로드
	public int loadNoticeCo(NoticeCo noticeCo) {
		Connection conn = getConnection();
		int result = dao.loadNoticeCo(conn, noticeCo);
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//검색
	public ArrayList<NoticeCo> searchNoticeCo(String keyword){
		Connection conn = getConnection();
		ArrayList<NoticeCo> list = dao.searchNoticeCo(conn, keyword);
		close(conn);
		return list;
	}
}
