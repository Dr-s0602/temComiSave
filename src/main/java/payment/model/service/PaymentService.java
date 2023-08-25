package payment.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import payment.model.dao.PaymentDao;
import payment.model.vo.Payment;

public class PaymentService {
	private PaymentDao dao = new PaymentDao();
	
	public PaymentService() {}
	
	//조회 
	public Payment selectPayment(int paymentid) {
		Connection conn = getConnection();
		Payment payment = dao.selectPayment(conn, paymentid);
		close(conn);
		return payment;
	}
	
	//전체 조회
	public ArrayList<Payment> selectPaymentAll() {
		Connection conn = getConnection();
		ArrayList<Payment> list = dao.selectPaymentAll(conn);
		close(conn);
		return list;
	}
	
	//삽입
	public int insertPayment(Payment payment) {
		Connection conn = getConnection();
		int result = dao.insertPayment(conn, payment);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
	}
	
	//삭제
	public int deletePayment(Payment payment) {
		Connection conn = getConnection();
		int result = dao.deletePayment(conn, payment);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
}
