package partyCo.model.dao;

import java.sql.Connection;
import java.util.ArrayList;

import partyCo.model.vo.PartyCo;

public class PartyCoDao {

	public PartyCo selectPartyCo(Connection conn, int partyid) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PartyCo> selectPartyCoAll(Connection conn) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertPartyCo(Connection conn, PartyCo partyCo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updatePartyCo(Connection conn, PartyCo partyCo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deletePartyCo(Connection conn, PartyCo partyCo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int loadPartyCo(Connection conn, PartyCo partyCo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<PartyCo> searchPartyCo(Connection conn, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PartyCo> searchPartyCoInterest(Connection conn, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PartyCo> sortPartyCoCategory(Connection conn, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PartyCo> sortPartyCoCurrent(Connection conn, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
