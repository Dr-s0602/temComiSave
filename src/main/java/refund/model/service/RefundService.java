package refund.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import refund.model.dao.RefundDao;
import refund.model.vo.Refund;

public class RefundService {
	private RefundDao dao = new RefundDao();
	
	public RefundService() {}
	
	//조회 
	public Refund selectRefund(int refundid) {
		Connection conn = getConnection();
		Refund refund = dao.selectRefund(conn, refundid);
		close(conn);
		return refund;
	}
	
	//전체 조회
	public ArrayList<Refund> selectRefundAll() {
		Connection conn = getConnection();
		ArrayList<Refund> list = dao.selectRefundAll(conn);
		close(conn);
		return list;
	}
	
	//삽입
	public int insertRefund(Refund refund) {
		Connection conn = getConnection();
		int result = dao.insertRefund(conn, refund);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
	}
	
	//삭제
	public int deleteRefund(Refund refund) {
		Connection conn = getConnection();
		int result = dao.deleteRefund(conn, refund);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
}
