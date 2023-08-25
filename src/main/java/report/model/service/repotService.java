package report.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import report.model.vo.Report;
import report.model.dao.ReportDao;

public class repotService {
	
	private ReportDao dao = new ReportDao();
	
	public repotService() {}
	
	//조회 
	public Report selectReport(int reportid) {
		Connection conn = getConnection();
		Report qnaCo = dao.selectReport(conn, reportid);
		close(conn);
		return qnaCo;
	}
	
	//전체 조회
	public ArrayList<Report> selectReportAll() {
		Connection conn = getConnection();
		ArrayList<Report> list = dao.selectReportAll(conn);
		close(conn);
		return list;
	}
	
	//삽입
	public int insertQnaCo(Report report) {
		Connection conn = getConnection();
		int result = dao.insertReport(conn, report);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
	}
	
	//수정
	public int updateReport(Report report) {
		Connection conn = getConnection();
		int result = dao.updateReport(conn, report);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
	//삭제
	public int deleteQnaCo(Report report) {
		Connection conn = getConnection();
		int result = dao.deleteReport(conn, report);
		
		if(result > 0) commit(conn);
		else rollback(conn);
			
		close(conn);
		return result;
	}
	
}
