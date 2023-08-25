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
 * Servlet implementation class NoticeSelectServlet
 */
@WebServlet("/noticesel")
public class NoticeSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int noNum = Integer.parseInt(request.getParameter("nonum"));
		int currentPage = Integer.parseInt(request.getParameter("page"));

		Notice notice = new NoticeService().selectNotice(noNum);

		RequestDispatcher view = null;

		if(notice != null){
			view = request.getRequestDispatcher("views/notice/notice_detail.jsp");
			request.setAttribute("notice",notice);
			request.setAttribute("currentPage",currentPage);

		}else{
			view = request.getRequestDispatcher("main.html");
			// 에러페이지 급구!!!
		}
		view.forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
