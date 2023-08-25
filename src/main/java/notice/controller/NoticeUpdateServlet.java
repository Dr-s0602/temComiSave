package notice.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import notice.model.service.NoticeService;
import notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeUpdateServlet
 */
@WebServlet("/noticeup")
public class NoticeUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		Notice notice = new Notice();
	//수정가능한 항목 제목 내용 수정 날짜 데이터	
		notice.setNoNum(Integer.parseInt(request.getParameter("nonum")));
		notice.setNoTitle(request.getParameter("title"));
		notice.setNoCon(request.getParameter("content"));
		int result = new NoticeService().updateNotice(notice);

		if(result > 0){
			response.sendRedirect("/comi/noticesall");
		}else{
			RequestDispatcher view = request.getRequestDispatcher("main.html");
			//에러페이지 주세요
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
