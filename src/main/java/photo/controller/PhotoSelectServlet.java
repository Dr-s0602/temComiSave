package photo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class PhotoSelectServlet
 */
@WebServlet("/photosel")
public class PhotoSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhotoSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 전송값에 한글이 있으면 인코딩 처리함 (message, file name)
		request.setCharacterEncoding("utf-8");
		
		//2. 전송 파일의 용량 제한 설정함 : 10 Mbyte 로 정한다면
		int sizeLimit = 1024 * 1024 * 10;
		
		//3. 전송에 multipart 설정을 했는지 검사
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if(!isMultipart) {  //multipart 설정이 되어 있지 않다면
			RequestDispatcher view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("msg", "multipart 설정을 하지 않았습니다.");
			view.forward(request, response);
		}
		
		//4. 업로드되는 파일 저장 위치 지정
		String savePath = 
				request.getSession().getServletContext().getRealPath("/resources/upfiles");
		//request.getSession().getServletContext() => "/testa"  뒤에 추가 경로 달기
		
		//5. 파일명 저장 변수
		String originalFileName = null;
		
		try {
			//6. 멀티파트리퀘스트 객체 생성함 : 자동 파일 업로드 작동됨
			MultipartRequest mrequest = new MultipartRequest(request, savePath, sizeLimit,
					"utf-8", new DefaultFileRenamePolicy());
			
			originalFileName = mrequest.getFilesystemName("upfile");
			System.out.println("originalFileName : " + originalFileName);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.getWriter().append("file upload ok");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
