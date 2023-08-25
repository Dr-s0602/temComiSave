/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-21 10:57:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.party;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import party.model.vo.Party;
import java.util.ArrayList;

public final class party_005fclosed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("party.model.vo.Party");
    _jspx_imports_classes.add("java.util.ArrayList");
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
 ArrayList<Party> partyList = (ArrayList<Party>) request.getAttribute("partyList"); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>party_closed</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/comi/resources/css/lib/jquery-ui.min.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/comi/resources/css/main.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/comi/resources/css/party_view.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/comi/resources/css/party_view_click.css\"/>\n");
      out.write("    <script type=\"text/javascript\" src=\"/comi/resources/js/lib/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"/comi/resources/js/lib/axios.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"/comi/resources/js/lib/lozad.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"/comi/resources/js/common.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    	var partyData = [];\n");
      out.write("        ");
      out.print( partyList.size() );
      out.write("\n");
      out.write("    	");
 for(Party party : partyList) { 
      out.write("\n");
      out.write("    		partyData.push({\n");
      out.write("    			paid : Number(");
      out.print( "\"" + party.getPaNum() + "\"" );
      out.write(")\n");
      out.write("    			,meid : Number(");
      out.print( "\"" + party.getMeNum() + "\"" );
      out.write(")\n");
      out.write("    			,title : ");
      out.print( "\"" + party.getPaTitle() + "\"" );
      out.write("\n");
      out.write("    			,price : Number(");
      out.print( "\"" + party.getPaTotalAmount() + "\"" );
      out.write(")\n");
      out.write("    			,deposit : Number(");
      out.print( "\"" + party.getPaDeposit() + "\"" );
      out.write(")\n");
      out.write("    			,peoplePrice : Number(");
      out.print( "\"" + party.getPaPerAmount() + "\"" );
      out.write(")\n");
      out.write("    			\n");
      out.write("    			,title : ");
      out.print( "\"" + party.getPaTitle() + "\"" );
      out.write("\n");
      out.write("    			,contents : ");
      out.print( "\"" + party.getPaCon() + "\"" );
      out.write("\n");
      out.write("    			,enroll : ");
      out.print( "\"" + party.getPaEnroll() + "\"" );
      out.write("\n");
      out.write("    			,modDate : ");
      out.print( "\"" + party.getPaModDate() + "\"" );
      out.write("\n");
      out.write("    			,delDate : ");
      out.print( "\"" + party.getPaDelDate() + "\"" );
      out.write("\n");
      out.write("    			,act : ");
      out.print( "\"" + party.getPaAct() + "\"" );
      out.write("\n");
      out.write("    			,views : Number(");
      out.print( "\"" + party.getPaViews() + "\"" );
      out.write(")\n");
      out.write("    			,likes : Number(");
      out.print( "\"" + party.getPaLike() + "\"" );
      out.write(")\n");
      out.write("    			,count : Number(");
      out.print( "\"" + party.getPaComCount() + "\"" );
      out.write(")\n");
      out.write("				\n");
      out.write("    			,genderSet : ");
      out.print( "\"" + party.getPaGenderSet() + "\"" );
      out.write("\n");
      out.write("    			,location : ");
      out.print( "\"" + party.getPaLocation() + "\"" );
      out.write("\n");
      out.write("    			,totalNum : Number(");
      out.print( "\"" + party.getPaTotalNum() + "\"" );
      out.write(")\n");
      out.write("    			,genderLimit : ");
      out.print( "\"" + party.getPaGenderLimit() + "\"" );
      out.write("\n");
      out.write("    			,phNum : Number(");
      out.print( "\"" + party.getPhNum() + "\"" );
      out.write(")\n");
      out.write("				,category : ");
      out.print( "\"" + party.getCatNum() + "\"" );
      out.write("\n");
      out.write("    			)\n");
      out.write("    			\n");
      out.write("    		})\n");
      out.write("    	");
 } 
      out.write("\n");
      out.write("    	\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\" src=\"/comi/resources/js/party_view.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Header Section Begin -->\n");
      out.write("    <header id=\"header_view\">    \n");
      out.write("    </header>\n");
      out.write("    <!-- Header Section End -->\n");
      out.write("\n");
      out.write("    <!-- main -->\n");
      out.write("    <main class=\"main_wrapper\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"search-container\">\n");
      out.write("                <div class=\"search-box\">\n");
      out.write("                    <button class=\"search-btn\">\n");
      out.write("                        <img src=\"/comi/resources/images/search_btn.png\" class=\"search-image\">\n");
      out.write("                    </button>\n");
      out.write("                    <input type=\"text\" placeholder=\"예전에 진행되었던 공유 모임을 검색해보세요.\" class=\"search-box-text\" value=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search-classify\">\n");
      out.write("                    <span class=\"search-classify-title\">분류</span>\n");
      out.write("                    <select class=\"search-classify-select\" onchange=\"changeCategory(this.value);\">\n");
      out.write("                        <option value=\"all\" selected>전체</option>\n");
      out.write("                        <option value=\"meeting\">모임</option>\n");
      out.write("                        <option value=\"group\">공구</option>\n");
      out.write("                        <option value=\"rental\"> 렌탈</option>\n");
      out.write("                        <option value=\"game\">게임</option>\n");
      out.write("                        <option value=\"etc\"> 기타</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    <select class=\"search-classify-select\" onchange=\"changeSort(this.value);\">\n");
      out.write("                        <option value=\"accuracy\" selected>정확도순</option>\n");
      out.write("                        <option value=\"interest\">관심순</option>\n");
      out.write("                        <option value=\"recent\">최신순</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"main_portfolio\" id=\"portf_box\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Footer Section Begin -->\n");
      out.write("    <footer id=\"footer_view\">	\n");
      out.write("    </footer>\n");
      out.write("    <!-- Footer Section End -->\n");
      out.write("</body>\n");
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
