package qnaCo.model.dao;

import java.sql.Connection;
import java.util.ArrayList;

import qna.model.vo.Qna;
import qnaCo.model.vo.QnaCo;

public class QnaCoDao {

	public QnaCo selectQnaCo(Connection conn, int qnaCoid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Qna selectParentQna(Connection conn, int parentQnaid) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<QnaCo> selectQnaCoAll(Connection conn) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertQnaCo(Connection conn, QnaCo qnaCo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateQnaCo(Connection conn, QnaCo qnaCo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteQnaCo(Connection conn, QnaCo qnaCo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int loadQnaCo(Connection conn, QnaCo qnaCo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<QnaCo> searchQnaCo(Connection conn, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
