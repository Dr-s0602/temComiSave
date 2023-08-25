package party.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import party.model.dao.PartyDao;
import party.model.vo.Party;

import static common.JDBCTemplate.*;

public class PartyService {
	
	private PartyDao dao = new PartyDao();
	
	public PartyService() {}
	
	//조회 
	public Party selectParty(int partyid) {
		Connection conn = getConnection();
		Party party = dao.selectParty(conn, partyid);
		close(conn);
		return party;
	}
	
	//전체 조회
	public ArrayList<Party> selectPartyAll(String type) {
		Connection conn = getConnection();
		ArrayList<Party> list = dao.selectPartyAll(conn, type);
		close(conn);
		return list;
	}
	
	//삽입
	public int insertParty(Party party) {
		Connection conn = getConnection();
		int result = dao.insertParty(conn, party);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
	}
	
	//수정
	public int updateParty(Party party) {
		Connection conn = getConnection();
		int result = dao.updateParty(conn, party);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//삭제
	public int deleteParty(Party party) {
		Connection conn = getConnection();
		int result = dao.deleteParty(conn, party);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//첨부파일 업로드
	public int loadParty(Party party) {
		Connection conn = getConnection();
		int result = dao.loadParty(conn, party);
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//검색
	public ArrayList<Party> searchParty(String keyword){
		Connection conn = getConnection();
		ArrayList<Party> list = dao.searchParty(conn, keyword);
		close(conn);
		return list;
	}
	
	//정렬 - 관심사
	public ArrayList<Party> sortPartyInterest(String keyword){
		Connection conn = getConnection();
		ArrayList<Party> list = dao.searchPartyInterest(conn, keyword);
		close(conn);
		return list;
	}
	
	//정렬 - 카테고리
	public ArrayList<Party> sortPartyCategory(String keyword){
		Connection conn = getConnection();
		ArrayList<Party> list = dao.sortPartyCategory(conn, keyword);
		close(conn);
		return list;
	}
	
	//정렬 - 날짜
	public ArrayList<Party> sortPartyCurrent(String keyword){
		Connection conn = getConnection();
		ArrayList<Party> list = dao.sortPartyCurrent(conn, keyword);
		close(conn);
		return list;
	}
	
}
