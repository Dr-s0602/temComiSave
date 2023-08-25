package party.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import party.model.service.PartyService;
import party.model.vo.Party;

/**
 * Servlet implementation class partyControllerServlet
 */
@WebServlet("/partysearch")
public class PartySearchServlet extends HttpServlet {
	
	private static final long serialVersionUID = 5916636881975620123L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public PartySearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//int userid = Integer.parseInt(request.getParameter("userid"));
		int partyid = Integer.parseInt(request.getParameter("partyid"));
		//Member member = new MemberService().selectMember(userid);
		Party party = new PartyService().selectParty(partyid);
		
		//볼수는 있지만 참여는 안되게
		if(party != null) {
			
		} else {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		doGet(request, response);
	}

}
