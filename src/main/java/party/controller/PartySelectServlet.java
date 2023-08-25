package party.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;
import party.model.service.PartyService;
import party.model.vo.Party;

/**
 * Servlet implementation class PartySelectAllServlet
 */
@WebServlet("/partysel")
public class PartySelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PartySelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String panum = request.getParameter("panum");
		String act = request.getParameter("act");//활성화 비활성화 여부
		
		System.out.println("panum : " + panum);
		Party party = new PartyService().selectParty(Integer.parseInt(panum));
		System.out.println("party : " + party);
		Member member = new MemberService().selectMember(party.getMeNum());
		RequestDispatcher view = null;
		System.out.println("member : " + member);
		if(act != null) {
			if(act.equals("y")) 
				view = request.getRequestDispatcher("views/party/party_view_click.jsp");
			else 
				view = request.getRequestDispatcher("views/party/party_closed_click.jsp");
			request.setAttribute("party", party);
			request.setAttribute("member", member);
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "파티 리스트 불러오기 실패");
		}
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
