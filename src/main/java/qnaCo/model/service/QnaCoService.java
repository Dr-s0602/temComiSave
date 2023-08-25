package qnaCo.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import qna.model.vo.Qna;
import qnaCo.model.vo.QnaCo;
import qnaCo.model.dao.QnaCoDao;

public class QnaCoService {
	private QnaCoDao dao = new QnaCoDao();
	
	public QnaCoService() {}
	
	//조회 
	public QnaCo selectQnaCo(int qnaCoid) {
		Connection conn = getConnection();
		QnaCo qnaCo = dao.selectQnaCo(conn, qnaCoid);
		close(conn);
		return qnaCo;
	}
	
	//부모 게시판 조회 
	public Qna selectParentQna(int parentQnaid) {
		Connection conn = getConnection();
		Qna qna = dao.selectParentQna(conn, parentQnaid);
		close(conn);
		return qna;
	}
	
	//전체 조회
	public ArrayList<QnaCo> selectQnaCoAll() {
		Connection conn = getConnection();
		ArrayList<QnaCo> list = dao.selectQnaCoAll(conn);
		close(conn);
		return list;
	}
	
	//삽입
	public int insertQnaCo(QnaCo qnaCo) {
		Connection conn = getConnection();
		int result = dao.insertQnaCo(conn, qnaCo);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
	}
	
	//수정
	public int updateQnaCo(QnaCo qnaCo) {
		Connection conn = getConnection();
		int result = dao.updateQnaCo(conn, qnaCo);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//삭제
	public int deleteQnaCo(QnaCo qnaCo) {
		Connection conn = getConnection();
		int result = dao.deleteQnaCo(conn, qnaCo);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//첨부파일 업로드
	public int loadQnaCo(QnaCo qnaCo) {
		Connection conn = getConnection();
		int result = dao.loadQnaCo(conn, qnaCo);
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//검색
	public ArrayList<QnaCo> searchQnaCo(String keyword){
		Connection conn = getConnection();
		ArrayList<QnaCo> list = dao.searchQnaCo(conn, keyword);
		close(conn);
		return list;
	}
	
}
