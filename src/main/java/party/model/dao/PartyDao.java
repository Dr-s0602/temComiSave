package party.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import party.model.vo.Party;

import static common.JDBCTemplate.*;

public class PartyDao {
	
	public PartyDao() {}
	
	//조회
	public Party selectParty(Connection conn, int partyid) {
		
		Party party = null;
		PreparedStatement ptst = null;
		ResultSet rset = null;
		
		try {
			
			String query = "select * from party where pa_num=?";
			ptst = conn.prepareStatement(query);
			ptst.setInt(1, partyid);
			
			rset = ptst.executeQuery();
			
			if(rset.next()) {
				party = new Party(
						rset.getInt("PA_NUM")
						,rset.getInt("ME_NUM")
						,rset.getDate("PA_TIME")
						,rset.getInt("PA_TOTAL_AMOUNT")
						,rset.getInt("PA_DEPOSIT")
						,rset.getInt("PA_PER_AMOUNT")
						,rset.getString("PA_TITLE")
						,rset.getString("PA_CON")
						,rset.getDate("PA_ENROLL")
						,rset.getDate("PA_MOD_DATE")
						,rset.getDate("PA_DEL_DATE")
						,rset.getString("PA_ACT")
						,rset.getInt("PA_VIEWS")
						,rset.getInt("PA_LIKE")
						,rset.getInt("PA_COM_COUNT")
						,rset.getString("PA_GENDER_SET")
						,rset.getString("PA_LOCATION")
						,rset.getInt("PA_TOTAL_NUM")
						,rset.getString("PA_GENDER_LIMIT")
						,rset.getInt("PH_NUM")
						,rset.getInt("CAT_NUM")
						);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(ptst);
			close(rset);
		}
		
		return party;
	}
	
	//전체 조회
	public ArrayList<Party> selectPartyAll(Connection conn, String type) {
		ArrayList<Party> partyList = new ArrayList<Party>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from party where pa_act=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, (type == "open") ? "y" : "n");
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Party party = new Party(
						rset.getInt("PA_NUM")
						,rset.getInt("ME_NUM")
						,rset.getDate("PA_TIME")
						,rset.getInt("PA_TOTAL_AMOUNT")
						,rset.getInt("PA_DEPOSIT")
						,rset.getInt("PA_PER_AMOUNT")
						,rset.getString("PA_TITLE")
						,rset.getString("PA_CON")
						,rset.getDate("PA_ENROLL")
						,rset.getDate("PA_MOD_DATE")
						,rset.getDate("PA_DEL_DATE")
						,rset.getString("PA_ACT")
						,rset.getInt("PA_VIEWS")
						,rset.getInt("PA_LIKE")
						,rset.getInt("PA_COM_COUNT")
						,rset.getString("PA_GENDER_SET")
						,rset.getString("PA_LOCATION")
						,rset.getInt("PA_TOTAL_NUM")
						,rset.getString("PA_GENDER_LIMIT")
						,rset.getInt("PH_NUM")
						,rset.getInt("CAT_NUM")
						);
				//System.out.println("party : " + party);
				partyList.add(party);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return partyList;
	}
	
	//삽입
	public int insertParty(Connection conn, Party party) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			String query = "insert into party values " 
			+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate, null, null, ?, 0, 0, 0, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, party.getPaNum());
			pstmt.setInt(2, party.getMeNum());
			pstmt.setDate(3, party.getPaTime());
			pstmt.setInt(4, party.getPaTotalAmount());
			pstmt.setInt(5, party.getPaDeposit());
			pstmt.setInt(6, party.getPaPerAmount());
			
			pstmt.setString(7, party.getPaTitle());
			pstmt.setString(8, party.getPaCon());
			//pstmt.setDate(9, party.getPaEnroll());
			//pstmt.setDate(10, party.getPaModDate());
			//pstmt.setDate(11, party.getPaDelDate());
			pstmt.setString(9, party.getPaAct());
			//pstmt.setInt(13, party.getPaViews());
			//pstmt.setInt(14, party.getPaLike());
			//pstmt.setInt(15, party.getPaComCount());
			pstmt.setString(10, party.getPaGenderSet());
			pstmt.setString(11, party.getPaLocation());
			pstmt.setInt(12, party.getPaTotalNum());
			pstmt.setString(13, party.getPaGenderLimit());
			pstmt.setInt(14, party.getPhNum());
			pstmt.setInt(15, party.getCatNum());
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	//수정
	public int updateParty(Connection conn, Party party) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//삭제
	public int deleteParty(Connection conn, Party party) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//첨부파일 업로드
	public int loadParty(Connection conn, Party party) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//검색
	public ArrayList<Party> searchParty(Connection conn, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//정렬 - 관심사
	public ArrayList<Party> searchPartyInterest(Connection conn, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//정렬 - 카테고리
	public ArrayList<Party> sortPartyCategory(Connection conn, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//정렬 - 날짜
	public ArrayList<Party> sortPartyCurrent(Connection conn, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
