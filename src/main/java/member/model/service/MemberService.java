package member.model.service;

import static common.JDBCTemplate.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import member.model.dao.MemberDao;
import member.model.vo.Member;
import static common.JDBCTemplate.close;

public class MemberService {
	
	//DI(Dependency Injection : 의존성 주입)
	private MemberDao mdao = new MemberDao();
	
	public MemberService() {}
	
	//로그인 멤버 조회
	public Member selectLogin(int userid, String userpwd) {
		Connection conn = getConnection();
		Member loginMember = mdao.selectLogin(conn, userid, userpwd);
		close(conn);
		return loginMember;
	}
	
	//조회
	public Member selectMember(int userid) {
		Connection conn = getConnection();
		Member member = mdao.selectMember(conn, userid);
		close(conn);
		return member;
	}
	
	//전체 조회
	public ArrayList<Member> selectList() {
		Connection conn = getConnection();
		ArrayList<Member> list = mdao.selectList(conn);
		close(conn);
		return list;
	}
	
	//삽입
	public int insertMember(Member member) {
		Connection conn = getConnection();
		int result = mdao.insertMember(conn, member);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}
	
	//수정
	public int updateMember(Member member) {
		Connection conn = getConnection();
		int result = mdao.updateMember(conn, member);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}
	
	//삭제
	public int deleteMember(int userid) {
		Connection conn = getConnection();
		int result = mdao.deleteMember(conn, userid);
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
	}
	
	//검색 아이디
	public ArrayList<Member> selectSearchUserid(String keyword) {
		Connection conn = getConnection();
		ArrayList<Member> list = mdao.selectSearchUserid(conn, keyword);
		close(conn);
		return list;
	}
	
	//검색 성별
	public ArrayList<Member> selectSearchGender(String keyword) {
		Connection conn = getConnection();
		ArrayList<Member> list = mdao.selectSearchGender(conn, keyword);
		close(conn);
		return list;
	}
	
	//검색 연령대
	public ArrayList<Member> selectSearchAge(int keyword) {
		Connection conn = getConnection();
		ArrayList<Member> list = mdao.selectSearchAge(conn, keyword);
		close(conn);
		return list;
	}
	
	//검색 가입날짜
	public ArrayList<Member> selectSearchEnrollDate(Date begin, Date end) {
		Connection conn = getConnection();
		ArrayList<Member> list = mdao.selectSearchEnrollDate(conn, begin, end);
		close(conn);
		return list;
	}
	
}
