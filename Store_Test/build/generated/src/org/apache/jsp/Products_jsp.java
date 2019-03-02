package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.ControlUser;

public final class Products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"CSS/Products.css\">\r\n");
      out.write("        <title>Products</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            String doc = request.getParameter("inp_id_login");
            ControlUser control = ControlUser.getInstance();
            int items = 0;
            if(control.getUsers().get(doc).getProducts() != null){
                items = control.getUsers().get(doc).getProducts().size();
            }
            
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <header>\r\n");
      out.write("            <section>\r\n");
      out.write("                <h1>Welcome to Didacticos CSJ Store</h1>\r\n");
      out.write("                <h3>The store that will revolutionize the book market</h3>\r\n");
      out.write("            </section>\r\n");
      out.write("            <img src=\"Assets/didacticos_CSJ_Fixed.png\" />\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"suggested\">\r\n");
      out.write("            <section>\r\n");
      out.write("                <h1>Suggested Books</h1>\r\n");
      out.write("                <i class=\"cart arrow down icon\"><span id=\"suggested-items\">");
      out.print( items);
      out.write(" items</span></i>\r\n");
      out.write("                <button>Pagar</button>\r\n");
      out.write("            </section>\r\n");
      out.write("            <form>\r\n");
      out.write("                <section>\r\n");
      out.write("                    <img src=\"Assets/Products/Suggested/diario_del_fin_del_mundo-Mario_Mendoza.PNG\"/>\r\n");
      out.write("                    <h2>Diario del fin del Mundo</h2>\r\n");
      out.write("                    <section class=\"info\">\r\n");
      out.write("                        <section class=\"info-author\">\r\n");
      out.write("                            <h3>Mario Mendoza</h3>\r\n");
      out.write("                            <h4>U$5.00</h4>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section class=\"info--add\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"5.00\" name=\"value_book\">\r\n");
      out.write("                            <button>Add to car</button>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section>\r\n");
      out.write("                    <img src=\"Assets/Products/Suggested/el_nobel-Vicky_Davila.PNG\"/>\r\n");
      out.write("                    <h2>El Nobel</h2>\r\n");
      out.write("                    <section class=\"info\">\r\n");
      out.write("                        <section class=\"info-author\">\r\n");
      out.write("                            <h3>Vicky Davila</h3>\r\n");
      out.write("                            <h4>U$5.00</h4>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section class=\"info--add\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"5.00\" name=\"value_book\">\r\n");
      out.write("                            <button>Add to car</button>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section>\r\n");
      out.write("                    <img src=\"Assets/Products/Suggested/hoy_es_siempre_todavia-Alejandro_Gaviria.PNG\"/>\r\n");
      out.write("                    <h2>Hoy es Siempre Todavia</h2>\r\n");
      out.write("                    <section class=\"info\">\r\n");
      out.write("                        <section class=\"info-author\">\r\n");
      out.write("                            <h3>Alejandro Gaviria</h3>\r\n");
      out.write("                            <h4>U$5.00</h4>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section class=\"info--add\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"5.00\" name=\"value_book\">\r\n");
      out.write("                            <button>Add to car</button>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section>\r\n");
      out.write("                    <img src=\"Assets/Products/Suggested/ideas_millonarias-Juan_diego_gomez.PNG\"/>\r\n");
      out.write("                    <h2>Ideas Millonarias</h2>\r\n");
      out.write("                    <section class=\"info\">\r\n");
      out.write("                        <section class=\"info-author\">\r\n");
      out.write("                            <h3>Juan Diego Gomez</h3>\r\n");
      out.write("                            <h4>U$5.00</h4>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section class=\"info--add\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"5.00\" name=\"value_book\">\r\n");
      out.write("                            <button>Add to car</button>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section>\r\n");
      out.write("                    <img src=\"Assets/Products/Suggested/las_palabras_mas_bellas-Juan_Gosain.PNG\"/>\r\n");
      out.write("                    <h2>Las palabras más bellas</h2>\r\n");
      out.write("                    <section class=\"info\">\r\n");
      out.write("                        <section class=\"info-author\">\r\n");
      out.write("                            <h3>Juan Gosain</h3>\r\n");
      out.write("                            <h4>U$5.00</h4>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section class=\"info--add\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"5.00\" name=\"value_book\">\r\n");
      out.write("                            <button>Add to car</button>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section>\r\n");
      out.write("                    <img src=\"Assets/Products/Suggested/los_divinos-Laura_Restrepo.PNG\"/>\r\n");
      out.write("                    <h2>Los divinos</h2>\r\n");
      out.write("                    <section class=\"info\">\r\n");
      out.write("                        <section class=\"info-author\">\r\n");
      out.write("                            <h3>Laura Restrepo</h3>\r\n");
      out.write("                            <h4>U$5.00</h4>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section class=\"info--add\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"5.00\" name=\"value_book\">\r\n");
      out.write("                            <button>Add to car</button>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section>\r\n");
      out.write("                    <img src=\"Assets/Products/Suggested/ninas_rebeldes_2.PNG\"/>\r\n");
      out.write("                    <h2>Ni&nacute;as rebeldes 2</h2>\r\n");
      out.write("                    <section class=\"info\">\r\n");
      out.write("                        <section class=\"info-author\">\r\n");
      out.write("                            <h3> Elena Favilli</h3>\r\n");
      out.write("                            <h4>U$5.00</h4>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section class=\"info--add\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"5.00\" name=\"value_book\">\r\n");
      out.write("                            <button>Add to car</button>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section>\r\n");
      out.write("                    <img src=\"Assets/Products/Suggested/todos_somos_poderosos-Luisa_Fernanda_W.PNG\"/>\r\n");
      out.write("                    <h2>Todos somos poderosos</h2>\r\n");
      out.write("                    <section class=\"info\">\r\n");
      out.write("                        <section class=\"info-author\">\r\n");
      out.write("                            <h3>Luisa Fernanda W</h3>\r\n");
      out.write("                            <h4>U$5.00</h4>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section class=\"info--add\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"5.00\" name=\"value_book\">\r\n");
      out.write("                            <button>Add to car</button>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"footer\">\r\n");
      out.write("            <footer>\r\n");
      out.write("                <section class=\"start-mark\">\r\n");
      out.write("                    <div class=\"body\"><h3>Social Media</h3></div>\r\n");
      out.write("                    <div class=\"triangle\"></div>\r\n");
      out.write("                </section>\r\n");
      out.write("\r\n");
      out.write("                <section class=\"end-mark\">\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <img src=\"Assets/Logos/instagram.png\" alt=\"Logo Instagram\">\r\n");
      out.write("                        Instagram\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"end-mark\">\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <img src=\"Assets/Logos/facebook.png\" alt=\"Logo Facebook\">\r\n");
      out.write("                        Facebook\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"end-mark\">\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <img src=\"Assets/Logos/logo_twitter.png\" alt=\"Logo Twitter\">\r\n");
      out.write("                        Twitter\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("            </footer>\r\n");
      out.write("            <section>\r\n");
      out.write("                <h2>Developed by Didacticos CSJ</h2>\r\n");
      out.write("            </section>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
