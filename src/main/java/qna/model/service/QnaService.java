package qna.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import qna.model.dao.QnaDao;
import qna.model.vo.Qna;

public class QnaService {
	private QnaDao dao = new QnaDao();
	
	public QnaService() {}
	
	//조회 
	public Qna selectQna(int qnaid) {
		Connection conn = getConnection();
		Qna qna = dao.selectQna(conn, qnaid);
		close(conn);
		return qna;
	}
	
	//전체 조회
	public ArrayList<Qna> selectQnaAll() {
		Connection conn = getConnection();
		ArrayList<Qna> list = dao.selectQnaAll(conn);
		close(conn);
		return list;
	}
	
	//삽입
	public int insertQna(Qna qna) {
		Connection conn = getConnection();
		int result = dao.insertQna(conn, qna);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
	}
	
	//수정
	public int updateQna(Qna qna) {
		Connection conn = getConnection();
		int result = dao.updateQna(conn, qna);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//삭제
	public int deleteQna(Qna qna) {
		Connection conn = getConnection();
		int result = dao.deleteQna(conn, qna);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//첨부파일 업로드
	public int loadQna(Qna qna) {
		Connection conn = getConnection();
		int result = dao.loadQna(conn, qna);
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//검색
	public ArrayList<Qna> searchQna(String keyword){
		Connection conn = getConnection();
		ArrayList<Qna> list = dao.searchQna(conn, keyword);
		close(conn);
		return list;
	}
	
	
}
