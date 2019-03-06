package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.ControlUser;
import Controller.ServletRegisterData;
import Controller.SevletLogin;

public final class StartPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"CSS/StartPage.css?=1.0.1\">\r\n");
      out.write("        <title>Didacticos CSJ - Start Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");

            ControlUser data1 = ControlUser.getInstance();
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("            <section class=\"ja_ui ja_card\">\r\n");
      out.write("                <a class=\"ja_image\" href=\"#\">\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <h3>Didacticos CSJ - Store</h3>\r\n");
      out.write("                        <img src=\"Assets/didacticos_CSJ_Fixed_Resized.png\">\r\n");
      out.write("                    </section>\r\n");
      out.write("                </a>\r\n");
      out.write("                <section class=\"ja_content\">\r\n");
      out.write("                    <a class=\"header\" href=\"#\">\r\n");
      out.write("                        Se encuentra usted registrado?\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"meta\">\r\n");
      out.write("                        <a>Recuerda que estar registrado trae grandes benficios para ti</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <section class=\"ja_buttons\">\r\n");
      out.write("                        <button id=\"btn_login\">Entrar</button>\r\n");
      out.write("                        <section>\r\n");
      out.write("                            o\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <button class=\"ja_btn_greeen\" id=\"btn_no_registered\">Registrarse</button>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("            </section>\r\n");
      out.write("            <section class=\"register\">\r\n");
      out.write("                <section class=\"ja_card ui corner labeled\">\r\n");
      out.write("                    <div class=\"ui corner label\">\r\n");
      out.write("                        <i class=\"hand lizard icon\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <section class=\"content\">\r\n");
      out.write("                        <section>\r\n");
      out.write("                            <h3>Cree una nueva cuenta</h3>\r\n");
      out.write("                            <h4>Es gratis</h4>\r\n");
      out.write("                        </section>\r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        <form action=\"ServletCheckData\">\r\n");
      out.write("                            <h3>Información personal</h3>\r\n");
      out.write("\r\n");
      out.write("                            <section class=\"names\">\r\n");
      out.write("                                <section class=\"ja_input\">\r\n");
      out.write("                                    <label for=\"inp_name\">Nombres</label>\r\n");
      out.write("                                    <section class=\"ui input\">\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Nombre\" id=\"inp_name\" name=\"inp_name\">\r\n");
      out.write("                                    </section>\r\n");
      out.write("                                </section>\r\n");
      out.write("                                <section class=\"ja_input\">\r\n");
      out.write("                                    <label for=\"inp_lastname\">Apellidos</label>\r\n");
      out.write("                                    <section class=\"ui input\">\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Apellidos\" id=\"inp_lastname\" name=\"inp_lastname\">\r\n");
      out.write("                                    </section>\r\n");
      out.write("                                </section>\r\n");
      out.write("                            </section>\r\n");
      out.write("\r\n");
      out.write("                            <section class=\"names\">\r\n");
      out.write("                                <section class=\"ja_input\">\r\n");
      out.write("                                    <label for=\"inp_email\">Correo electronico</label>\r\n");
      out.write("                                    <section class=\"ui input\">\r\n");
      out.write("                                        <input type=\"email\" placeholder=\"Email\" id=\"inp_email\" name=\"inp_email\">\r\n");
      out.write("                                    </section>\r\n");
      out.write("                                </section>\r\n");
      out.write("                                <section class=\"ja_input\">\r\n");
      out.write("                                    <label for=\"inp_cellphone\">N&uacutemero de celular</label>\r\n");
      out.write("                                    <section class=\"ui input\">\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Celular\" id=\"inp_cellphone\" name=\"inp_cellphone\">\r\n");
      out.write("                                    </section>\r\n");
      out.write("                                </section>\r\n");
      out.write("                            </section>\r\n");
      out.write("\r\n");
      out.write("                            <section class=\"names\">\r\n");
      out.write("                                <section class=\"ja_input\">\r\n");
      out.write("                                    <label for=\"inp_id\">Documento de identidad</label>\r\n");
      out.write("                                    <section class=\"ui input\">\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Documento identidad\" id=\"inp_id\" name=\"inp_id\">\r\n");
      out.write("                                    </section>\r\n");
      out.write("                                </section>\r\n");
      out.write("                                <section class=\"ja_input\">\r\n");
      out.write("                                    <label for=\"inp_age\">Edad</label>\r\n");
      out.write("                                    <section class=\"ui input\">\r\n");
      out.write("                                        <input type=\"number\" placeholder=\"Edad\" id=\"inp_age\" name=\"inp_age\">\r\n");
      out.write("                                    </section>\r\n");
      out.write("                                </section>\r\n");
      out.write("                            </section>\r\n");
      out.write("\r\n");
      out.write("                            <button class=\"ja_btn_greeen\" id=\"btn_register\">Registrarse</button>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <section class=\"login\">\r\n");
      out.write("                <section class=\"ja_card_login ui corner labeled\">\r\n");
      out.write("                    <div class=\"ui corner label\">\r\n");
      out.write("                        <i class=\"hand lizard icon\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <section class=\"content\">\r\n");
      out.write("                        <section>\r\n");
      out.write("                            <h3>Inicie sesi&oacuten</h3>\r\n");
      out.write("                            <h4>Llene todos los campos</h4>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        \r\n");
      out.write("                        <form action=\"SevletLogin\">\r\n");
      out.write("                            <section class=\"ja_input\">\r\n");
      out.write("                                <label for=\"inp_name_login\">Nombre</label>\r\n");
      out.write("                                <section class=\"ui input\">\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"Nombre\" id=\"inp_name_login\" name=\"inp_name_login\"/>\r\n");
      out.write("                                </section>\r\n");
      out.write("                            </section>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <section class=\"ja_input\">\r\n");
      out.write("                                <label for=\"inp_id_login\">Documento</label>\r\n");
      out.write("                                <section class=\"ui input\">\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"Documento\" id=\"inp_name_login\" name=\"inp_id_login\"/>\r\n");
      out.write("                                </section>\r\n");
      out.write("                            </section>\r\n");
      out.write("\r\n");
      out.write("                            <section class=\"ja_swicth\">\r\n");
      out.write("                                <label class=\"switch\">\r\n");
      out.write("                                    <input type=\"checkbox\" name=\"inp_save_session\">\r\n");
      out.write("                                    <span class=\"slider round\"></span>\r\n");
      out.write("                                </label>\r\n");
      out.write("                                Mantener la sesion abierta\r\n");
      out.write("                            </section>\r\n");
      out.write("\r\n");
      out.write("                            <br>\r\n");
      out.write("\r\n");
      out.write("                            <button class=\"ja_btn_greeen\" id=\"btn_enter\">Ingresar</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                    </section>\r\n");
      out.write("\r\n");
      out.write("                </section>\r\n");
      out.write("            </section>\r\n");
      out.write("        </section>\r\n");
      out.write("        ");
 
            if (data1.isError()) {
        
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            setTimeout(function () {\r\n");
      out.write("                document.getElementById(\"snackbar\").classList.remove(\"show\");\r\n");
      out.write("            }, 3000);\r\n");
      out.write("        </script>\r\n");
      out.write("        <section class=\"show\" id=\"snackbar\">\r\n");
      out.write("            Los datos ingresados son incorrectos\r\n");
      out.write("        </section>\r\n");
      out.write("        ");

                data1.setError(false);
            }
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"JS/StartPage.js\"></script>\r\n");
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
