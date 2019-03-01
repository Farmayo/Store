package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DataTypes.Data;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/StartPage.css\">\n");
      out.write("        <title>Didacticos CSJ</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            Data data1 = Data.getInstance();
            if (data1.getActive() != null) {
                if (data1.getActive().getKey()) {
                    response.sendRedirect("Simulator.jsp");
                }
            }

        
      out.write("\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <section class=\"ui card\">\n");
      out.write("                <a class=\"image\" href=\"#\">\n");
      out.write("                    <section>\n");
      out.write("                        <h3>Didacticos CSJ - Store</h3>\n");
      out.write("                        <img src=\"Assets/didacticos_CSJ_Fixed_Resized.png\">\n");
      out.write("                    </section>\n");
      out.write("                </a>\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    <a class=\"header\" href=\"#\">\n");
      out.write("                        Se encuentra usted registrado?\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"meta\">\n");
      out.write("                        <a>Recuerda que estar registrado trae grandes benficios para ti</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <section class=\"ja_buttons\">\n");
      out.write("                        <button id=\"btn_login\">Entrar</button>\n");
      out.write("                        <section>\n");
      out.write("                            o\n");
      out.write("                        </section>\n");
      out.write("                        <button class=\"ja_btn_greeen\" id=\"btn_no_registered\">Registrarse</button>\n");
      out.write("                    </section>\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"register\">\n");
      out.write("                <section class=\"ja_card ui corner labeled\">\n");
      out.write("                    <div class=\"ui corner label\">\n");
      out.write("                        <i class=\"hand lizard icon\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <section class=\"content\">\n");
      out.write("                        <section>\n");
      out.write("                            <h3>Cree una nueva cuenta</h3>\n");
      out.write("                            <h4>Es gratis</h4>\n");
      out.write("                        </section>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <form action=\"ServletCheckData\">\n");
      out.write("                            <h3>Información personal</h3>\n");
      out.write("\n");
      out.write("                            <section class=\"names\">\n");
      out.write("                                <section class=\"ja_input\">\n");
      out.write("                                    <label for=\"inp_name\">Nombres</label>\n");
      out.write("                                    <section class=\"ui input\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Nombre\" id=\"inp_name\" name=\"inp_name\">\n");
      out.write("                                    </section>\n");
      out.write("                                </section>\n");
      out.write("                                <section class=\"ja_input\">\n");
      out.write("                                    <label for=\"inp_lastname\">Apellidos</label>\n");
      out.write("                                    <section class=\"ui input\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Apellidos\" id=\"inp_lastname\" name=\"inp_lastname\">\n");
      out.write("                                    </section>\n");
      out.write("                                </section>\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <section class=\"names\">\n");
      out.write("                                <section class=\"ja_input\">\n");
      out.write("                                    <label for=\"inp_email\">Correo electronico</label>\n");
      out.write("                                    <section class=\"ui input\">\n");
      out.write("                                        <input type=\"email\" placeholder=\"Email\" id=\"inp_email\" name=\"inp_email\">\n");
      out.write("                                    </section>\n");
      out.write("                                </section>\n");
      out.write("                                <section class=\"ja_input\">\n");
      out.write("                                    <label for=\"inp_cellphone\">N&uacutemero de celular</label>\n");
      out.write("                                    <section class=\"ui input\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Celular\" id=\"inp_cellphone\" name=\"inp_cellphone\">\n");
      out.write("                                    </section>\n");
      out.write("                                </section>\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <section class=\"names\">\n");
      out.write("                                <section class=\"ja_input\">\n");
      out.write("                                    <label for=\"inp_id\">Documento de identidad</label>\n");
      out.write("                                    <section class=\"ui input\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Documento identidad\" id=\"inp_id\" name=\"inp_id\">\n");
      out.write("                                    </section>\n");
      out.write("                                </section>\n");
      out.write("                                <section class=\"ja_input\">\n");
      out.write("                                    <label for=\"inp_age\">Edad</label>\n");
      out.write("                                    <section class=\"ui input\">\n");
      out.write("                                        <input type=\"number\" placeholder=\"Edad\" id=\"inp_age\" name=\"inp_age\">\n");
      out.write("                                    </section>\n");
      out.write("                                </section>\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <h3>Informaci&oacuten laboral</h3>\n");
      out.write("                            <section class=\"names\">\n");
      out.write("                                <section class=\"ja_input\">\n");
      out.write("                                    <label for=\"inp_company\">Empresa en la que trabaja</label>\n");
      out.write("                                    <section class=\"ui input\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Empresa\" id=\"inp_company\" name=\"inp_company\">\n");
      out.write("                                    </section>\n");
      out.write("                                </section>\n");
      out.write("                                <section class=\"ja_input\">\n");
      out.write("                                    <label for=\"inp_salary\">Salario</label>\n");
      out.write("                                    <section class=\"ui input\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Salario\" id=\"inp_salary\" name=\"inp_salary\">\n");
      out.write("                                    </section>\n");
      out.write("                                </section>\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <button class=\"ja_btn_greeen\" id=\"btn_register\">Registrarse</button>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </section>\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section class=\"login\">\n");
      out.write("                <section class=\"ja_card_login ui corner labeled\">\n");
      out.write("                    <div class=\"ui corner label\">\n");
      out.write("                        <i class=\"hand lizard icon\"></i>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <section class=\"content\">\n");
      out.write("                        <section>\n");
      out.write("                            <h3>Inicie sesi&oacuten</h3>\n");
      out.write("                            <h4>Llene todos los campos</h4>\n");
      out.write("                        </section>\n");
      out.write("                        \n");
      out.write("                        <form action=\"SevletLogin\">\n");
      out.write("                            <section class=\"ja_input\">\n");
      out.write("                                <label for=\"inp_name_login\">Nombre</label>\n");
      out.write("                                <section class=\"ui input\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Nombre\" id=\"inp_name_login\" name=\"inp_name_login\"/>\n");
      out.write("                                </section>\n");
      out.write("                            </section>\n");
      out.write("                            <br>\n");
      out.write("                            <section class=\"ja_input\">\n");
      out.write("                                <label for=\"inp_id_login\">Documento</label>\n");
      out.write("                                <section class=\"ui input\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Documento\" id=\"inp_name_login\" name=\"inp_id_login\"/>\n");
      out.write("                                </section>\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <section class=\"ja_swicth\">\n");
      out.write("                                <label class=\"switch\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"inp_save_session\">\n");
      out.write("                                    <span class=\"slider round\"></span>\n");
      out.write("                                </label>\n");
      out.write("                                Mantener la sesion abierta\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <button class=\"ja_btn_greeen\" id=\"btn_enter\">Ingresar</button>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </section>\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        ");
            Data data = Data.getInstance();
            if (data.isError_data()) {
        
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            setTimeout(function () {\n");
      out.write("                document.getElementById(\"snackbar\").classList.remove(\"show\");\n");
      out.write("            }, 3000);\n");
      out.write("        </script>\n");
      out.write("        <section class=\"show\" id=\"snackbar\">\n");
      out.write("            Los datos ingresados son incorrectos\n");
      out.write("        </section>\n");
      out.write("        ");

                data.setError_data(false);
            }
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"JS/StartPage.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
