/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-25 10:37:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import notice.model.vo.Notice;

public final class notice_005fupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("notice.model.vo.Notice");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	Notice notice = (Notice)request.getAttribute("notice");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/comi/resources/css/lib/jquery-ui.min.css\"/>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"/comi/resources/css/main.css\"/>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"/comi/resources/css/review.css\"/>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"/comi/resources/css/question.css\"/>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"/comi/resources/js/lib/jquery.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"/comi/resources/js/common.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"/comi/resources/js/question.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Header Section Begin -->\r\n");
      out.write("    <header id=\"header_view\">    \r\n");
      out.write("    </header>\r\n");
      out.write("<main class=\"main_wrapper\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"no-title\">\r\n");
      out.write("				<br><br><span style=\"font-size: 20px;\">공지사항 수정</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<!--상단-->\r\n");
      out.write("			<div class=\"search-container\">\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"search-box question\" style=\"text-align: center; margin: auto;\">\r\n");
      out.write("					<button class=\"search-btn\">\r\n");
      out.write("						<img src=\"/comi/resources/images/search_btn.png\" class=\"search-image\">\r\n");
      out.write("					</button>\r\n");
      out.write("					<input type=\"text\" placeholder=\"제목을 입력해보세요.\" class=\"search-box-text\" value=\"\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!--상단end-->\r\n");
      out.write("			<h1>공지사항 쓰는곳</h1>\r\n");
      out.write("			<!--공지사항 출력-->\r\n");
      out.write("			<div style=\"width: 500px; border: 1px solid #ffed76; margin: 0 auto; text-align: center; background-color: #ffed76;\">\r\n");
      out.write("				<form action=\"/comi/noticeup\" method=\"post\">\r\n");
      out.write("					<input type=\"hidden\" name=\"nonum\" value=\"");
      out.print( notice.getNoNum());
      out.write("\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>제 목</th>\r\n");
      out.write("                        <td><input type=\"text\" name=\"title\" size=\"50\" value=\"");
      out.print( notice.getNoTitle() );
      out.write("\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>작성자</th>\r\n");
      out.write("                        <td><input type=\"text\" name=\"writer\" readonly value=\"");
      out.print( notice.getMeNum());
      out.write("\" size=\"50\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>내 용</th>\r\n");
      out.write("                        <td><textarea rows=\"5\" cols=\"50\" name=\"content\">");
      out.print(notice.getNoCon());
      out.write("</textarea></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th colspan=\"2\">\r\n");
      out.write("                            <input type=\"submit\" value=\"수정하기\">\r\n");
      out.write("                            <input type=\"reset\" value=\"수정취소\">\r\n");
      out.write("                            <input type=\"button\" value=\"목록\"\r\n");
      out.write("                            onclick=\"javascript:location.href='/comi/views/noitce/notice_view.jsp'; return false;\"> \r\n");
      out.write("                            <!-- 목록 지금 404 에러 -->\r\n");
      out.write("                            \r\n");
      out.write("                        </th>\r\n");
      out.write("\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                </form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr>\r\n");
      out.write("			<!--공지사항 end-->\r\n");
      out.write("\r\n");
      out.write("			<!--버튼박스-->\r\n");
      out.write("			<div class=\"no-container\">\r\n");
      out.write("				<div class=\"no-btnbox\">\r\n");
      out.write("					<button class=\"no-write-btn\" id=\"write_btn\"></button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"no-navbox\">\r\n");
      out.write("					<button class=\"no-nav-btn prevnext-btn\" id=\"no_nav_btn_prev\">\r\n");
      out.write("						<img src=\"/comi/resources/images/prevBtn.png\">\r\n");
      out.write("					</button>\r\n");
      out.write("					<div class=\"no-navbox-btnbox\">\r\n");
      out.write("						<button class=\"no-nav-btn active\" id=\"no_nav_btn_1\">1</button>\r\n");
      out.write("						<button class=\"no-nav-btn\" id=\"no_nav_btn_2\">2</button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<button class=\"no-nav-btn prevnext-btn\" id=\"no_nav_btn_next\">\r\n");
      out.write("						<img src=\"/comi/resources/images/nextBtn.png\">\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!--버튼박스end-->\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("	</main>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	<!-- Footer Section Begin -->\r\n");
      out.write("	<footer id=\"footer_view\">	\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!-- Footer Section End -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
