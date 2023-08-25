package party.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
		
		JSONArray jarr = new JSONArray();
		
		for(Party party : list) {
			JSONObject json = new JSONObject();
			json.put("paid", party.getPaNum());
			json.put("meid", party.getMeNum());
			json.put("time", String.valueOf(party.getPaTime()));
			json.put("price", party.getPaTotalAmount());
			json.put("deposit", party.getPaDeposit());
			json.put("peoplePrice", party.getPaPerAmount());
			
			json.put("title", URLEncoder.encode(party.getPaTitle(), "UTF-8"));
			json.put("contents", URLEncoder.encode(party.getPaCon(), "UTF-8"));
			json.put("enroll", String.valueOf(party.getPaEnroll()));
			json.put("modDate", String.valueOf(party.getPaModDate()));
			json.put("delDate", String.valueOf(party.getPaDelDate()));
			json.put("act", party.getPaAct());
			json.put("views", party.getPaViews());
			json.put("likes", party.getPaLike());
			json.put("count", party.getPaComCount());
			
			json.put("genderSet", party.getPaGenderSet());
			json.put("location", party.getPaLocation());
			json.put("totalNum", party.getPaTotalNum());
			json.put("genderLimit", party.getPaGenderLimit());
			json.put("phNum", party.getPhNum());
			json.put("category", party.getCatNum());
			
			jarr.add(json);
		}
		
		JSONObject sendJson = new JSONObject();
		sendJson.put("list", jarr);
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(sendJson);
		out.flush();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
