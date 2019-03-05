package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bills_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"CSS/Bills.css?=1.0.3\">\r\n");
      out.write("        <title>Bill</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <section>\r\n");
      out.write("                <h1>Didacticos CSJ Store</h1>\r\n");
      out.write("                <h3>The store that will revolutionize the book market</h3>\r\n");
      out.write("            </section>\r\n");
      out.write("            <img src=\"Assets/didacticos_CSJ_Fixed.png\" />\r\n");
      out.write("        </header>\r\n");
      out.write("        <section id=\"infoDidacticos\">\r\n");
      out.write("            <h5>DIDACTICOS CSJ - NIT.123.456.789-0</h5>\r\n");
      out.write("            <h5>DIDACTICOS CSJ - STORE</h5>\r\n");
      out.write("            <h5>AUTHORIZATION RESOLUTION</h5>\r\n");
      out.write("            <h5>DIAN NO. 12345678901234 OF</h5>\r\n");
      out.write("            <h5>MARCH 2 OF 2019 OF NO.</h5>\r\n");
      out.write("            <h5>123456789012 AL 210987654321</h5>\r\n");
      out.write("        </section>        \r\n");
      out.write("        <h1 id=\"pageTitle\">Billing</h1>\r\n");
      out.write("        <section id=\"globalSect\">\r\n");
      out.write("            <section class=\"bills\">\r\n");
      out.write("                <h1 id=\"pageTitle\">Shipment information</h1>\r\n");
      out.write("                <form action=\"\">\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <h4>Name</h4>\r\n");
      out.write("                        <h4> <input placeholder=\"Name\" name=\"name\" id=\"name\"/> </h4>\r\n");
      out.write("                    </section>       \r\n");
      out.write("                    <section>\r\n");
      out.write("                        <h4>Telephone</h4>\r\n");
      out.write("                        <h4> <input placeholder=\"Telephone\" name=\"telephone\" id=\"telephone\"/> </h4>\r\n");
      out.write("                    </section>  \r\n");
      out.write("                    <section>\r\n");
      out.write("                        <h4>Address</h4>\r\n");
      out.write("                        <h4> <input placeholder=\"Address\" name=\"address\" id=\"address\"/> </h4>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <h4>Country</h4>\r\n");
      out.write("                        <h4> <input placeholder=\"Country\" name=\"country\" id=\"country\"/> </h4>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <h4>City</h4>\r\n");
      out.write("                        <h4> <input placeholder=\"City\" name=\"city\" id=\"city\"/> </h4>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <h4>State</h4>\r\n");
      out.write("                        <h4> <input placeholder=\"State/Province/Department\" name=\"state\" id=\"state\"/> </h4>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <h4>Postal Code</h4>\r\n");
      out.write("                        <h4> <input placeholder=\"Postal Code\" name=\"postal\" id=\"postal\"/> </h4>\r\n");
      out.write("                    </section>\r\n");
      out.write("\r\n");
      out.write("                    <button id=\"btnPrint\">Generate Bill</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </section>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <section class=\"bills\">\r\n");
      out.write("                <section>\r\n");
      out.write("                    <form>\r\n");
      out.write("                        <table id=\"bill_bg\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">SALE INVOICE NO.</td>\r\n");
      out.write("                                <td>Info</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Date</td>\r\n");
      out.write("                                <td>Current_Date</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Products:</td>\r\n");
      out.write("                                <td>Unit Price</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Ejm LIBRO 1</td>\r\n");
      out.write("                                <td>5.00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Ejm LIBRO 2</td>\r\n");
      out.write("                                <td>5.00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Ejm LIBRO 3</td>\r\n");
      out.write("                                <td>5.00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Ejm LIBRO 4</td>\r\n");
      out.write("                                <td>5.00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Ejm LIBRO 5</td>\r\n");
      out.write("                                <td>5.00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Ejm LIBRO 6</td>\r\n");
      out.write("                                <td>5.00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Ejm LIBRO 7</td>\r\n");
      out.write("                                <td>5.00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Ejm LIBRO 8</td>\r\n");
      out.write("                                <td>5.00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Ejm LIBRO 9</td>\r\n");
      out.write("                                <td>5.00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Subtotal</td>\r\n");
      out.write("                                <td>45.00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td style=\"text-align: left;\">Total_Product_Items</td>\r\n");
      out.write("                                <td>50.00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"2\">WE ARE GREAT CONTRIBUTORS</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </section>\r\n");
      out.write("\r\n");
      out.write("            </section>\r\n");
      out.write("        </section>\r\n");
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
      out.write("                        <a href=\"https://www.instagram.com/didacticoscsj/\">Instagram</a>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"end-mark\">\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <img src=\"Assets/Logos/facebook.png\" alt=\"Logo Facebook\" >\r\n");
      out.write("                        <a href=\"https://www.facebook.com/DidacticosCSJ/\">Facebook</a>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"end-mark\">\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <img src=\"Assets/Logos/logo_twitter.png\" alt=\"Logo Twitter\">\r\n");
      out.write("                        <a href=\"https://twitter.com/DidacticosCSJ\">Twitter</a>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </section>\r\n");
      out.write("            </footer>\r\n");
      out.write("            <section>\r\n");
      out.write("                <h2>Developed by Didacticos CSJ</h2>\r\n");
      out.write("            </section>\r\n");
      out.write("        </section>\r\n");
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
