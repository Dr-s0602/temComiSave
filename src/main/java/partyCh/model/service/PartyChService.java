package partyCh.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import partyCh.model.dao.PartyChDao;
import partyCh.model.vo.PartyCh;

public class PartyChService {
	private PartyChDao dao = new PartyChDao();
	
	public PartyChService() {}
	
	//조회 
	public PartyCh selectPartyCh(int partyid) {
		Connection conn = getConnection();
		PartyCh partyCh = dao.selectPartyCh(conn, partyid);
		close(conn);
		return partyCh;
	}
	
	//삽입
	public int insertPartyCh(PartyCh partyCh) {
		Connection conn = getConnection();
		int result = dao.insertPartyCh(conn, partyCh);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
	}
	
	//삭제
	public int deletePartyCh(PartyCh PartyCh) {
		Connection conn = getConnection();
		int result = dao.deletePartyCh(conn, PartyCh);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//첨부파일 업로드
	public int loadPartyCh(PartyCh partyCh) {
		Connection conn = getConnection();
		int result = dao.loadPartyCh(conn, partyCh);
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
}
