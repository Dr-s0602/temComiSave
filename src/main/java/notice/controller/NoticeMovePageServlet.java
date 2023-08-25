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
 * Servlet implementation class NoticeMovePageServlet
 */
@WebServlet("/nomovepage")
public class NoticeMovePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeMovePageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		int result = 0;
		int noNum = Integer.parseInt(request.getParameter("nonum"));
		Notice notice = new NoticeService().selectNotice(noNum);

		RequestDispatcher view = null;

		if(notice != null){
			view = request.getRequestDispatcher("views/notice/notice_update.jsp");
			request.setAttribute("notice",notice);
			view.forward(request,response);
			//수정할 글 찾으면 
		}else{
			response.sendRedirect("main.html");
			//에러페이지 급구
			//수정할 글 못찾으면
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
