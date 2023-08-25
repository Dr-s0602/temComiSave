package party.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import party.model.service.PartyService;
import party.model.vo.Party;

/**
 * Servlet implementation class MenuLinkServlet
 */
@WebServlet("/partysall")
public class PartySelectAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PartySelectAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		
		PartyService pservice = new PartyService();
		ArrayList<Party> list = null;
		System.out.println("type : " + type);
		
		if(type.equals("findParty")) list = pservice.selectPartyAll("open");//활성화
		else if(type.equals("findReview")) list = pservice.selectPartyAll("close");//비활성화
		
		System.out.println("list : " + list);
		RequestDispatcher view = null;
		
		if(list != null && list.size() > 0) {
			if(type.equals("findParty")) 
				view = request.getRequestDispatcher("views/party/party_view.jsp");
			else //if(type.equals("findReview"))
				view = request.getRequestDispatcher("views/party/party_closed.jsp");
			request.setAttribute("partyList", list);
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
