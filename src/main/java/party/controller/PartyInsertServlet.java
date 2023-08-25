package party.controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.sql.Date;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import party.model.service.PartyService;
import party.model.vo.Party;

/**
 * Servlet implementation class partyMakeServlet
 */
@WebServlet("/partyi")
public class PartyInsertServlet extends HttpServlet {
	
	private static final long serialVersionUID = -1011000182097991224L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public PartyInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Party party = new Party(
				Integer.parseInt(request.getParameter("pa_num"))
				,1
				,Date.valueOf(request.getParameter("pa_time"))
				,Integer.parseInt(request.getParameter("pa_total_amount")) 
				,Integer.parseInt(request.getParameter("pa_deposit"))
				,Integer.parseInt(request.getParameter("pa_per_amount"))
				
				,request.getParameter("pa_title")
				,request.getParameter("pa_con")
				,Date.valueOf(request.getParameter("pa_enroll"))
				,null//request.getParameter("pa_mod_date")
				,null//request.getParameter("pa_del_date")
				,request.getParameter("pa_act")
				,Integer.parseInt(request.getParameter("pa_views"))
				,Integer.parseInt(request.getParameter("pa_like"))
				,Integer.parseInt(request.getParameter("pa_com_count"))
				
				,request.getParameter("pa_gender_set")
				,request.getParameter("pa_location")
				,Integer.parseInt(request.getParameter("pa_total_num"))
				,request.getParameter("pa_gender_limit")
				,Integer.parseInt(request.getParameter("ph_num"))
				,Integer.parseInt(request.getParameter("cat_num"))
			);
			
		int result = new PartyService().insertParty(party);
		System.out.println("result : " + result);
		
		RequestDispatcher view = null;
		
		if(result > 0) {
			//파티 생성된 페이지 -> party_click.html
			view = request.getRequestDispatcher("views/party/party_click.jsp");
			request.setAttribute("party", party);
		}else {
			//회원가입 실패 시 error.jsp로 에러 메세지를 보냄
			view = request.getRequestDispatcher("views/common/error.jsp");//상대경로만 사용가능
			
			//지정한 뷰로 내보낼 정보나 객체가 있으면 request에 기록 저장함
			request.setAttribute("message", "파티 생성 실패");
		}
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
