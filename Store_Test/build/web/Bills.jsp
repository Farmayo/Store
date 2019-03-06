<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="Data_Structure.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controller.ControlUser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css">
        <link type="text/css" rel="stylesheet" href="CSS/Bills.css?=1.0.3">
        <title>Bill</title>
    </head>
    <body>
        <% 
            String in = request.getParameter("inp_codes");
            String codes[] = {};

            try{
               codes = in.split(";");
            }catch(Exception e){

            }
            
            ControlUser data = ControlUser.getInstance();
            ArrayList<Product> productos = new ArrayList<Product>();
            
            double value = 0.0;
            double value_tax = 0.0;
            double discount = 0.0;
            Calendar date = new GregorianCalendar();
            
            for(String key: codes){
                productos.add(data.getProducts().get(key));
                value += Double.parseDouble(data.getProducts().get(key).getValue());
            }
            
            
            int day = date.get(Calendar.DAY_OF_WEEK);
            if(day == Calendar.MONDAY){
                discount = 0.02;
            }
            else if(day == Calendar.TUESDAY){
                discount = 0.03;
            }
            else if(day == Calendar.WEDNESDAY){
                discount = 0.04;
            }
            else if(day == Calendar.THURSDAY){
                discount = 0.05;
            }
            else if(day == Calendar.FRIDAY){
                discount = 0.08;
            }
            else if(day == Calendar.SATURDAY){
                discount = 0.09;
            }
            else{
                discount = 0.1;
            }
            
            
            
            value_tax = value * 0.19;
            double total = value + (value * discount) + value_tax;
            String aux_out = String.format("%.2f", total);
        %>
        
        <header>
            <section>
                <h1>Didacticos CSJ Store</h1>
                <h3>The store that will revolutionize the book market</h3>
            </section>
            <img src="Assets/didacticos_CSJ_Fixed.png" />
        </header>
        <section id="infoDidacticos">
            <h5>DIDACTICOS CSJ - NIT.123.456.789-0</h5>
            <h5>DIDACTICOS CSJ - STORE</h5>
            <h5>AUTHORIZATION RESOLUTION</h5>
            <h5>DIAN NO. 12345678901234 OF</h5>
            <h5>MARCH 2 OF 2019 OF NO.</h5>
            <h5>123456789012 AL 210987654321</h5>
        </section>        
        <h1 id="pageTitle">Billing</h1>
        <section id="globalSect">
            <section class="bills">
                <h1 id="pageTitle">Shipment information</h1>
                <form action="">
                    <section>
                        <h4>Name:</h4><span><%= data.getCurrentUser().getName() %></span>
                    </section>       
                    <section>
                        <h4>Lastname:</h4> <span><%= data.getCurrentUser().getLastname()%></span>
                    </section>  
                    <section>
                        <h4>Email:</h4><span><%= data.getCurrentUser().getCell_phone() %></span>
                    </section>
                    <section>
                        <h4>Discount:</h4><span><%= (discount * 100) %></span>
                    </section>
                </form>
            </section>
            <%--Quitar espacios entre sections y alinear uno al lado del otro--%>
            <section class="bills">
                <section>
                    <form id="bill_form">
                        <table id="bill_bg">
                            <tr>
                                <td style="text-align: left;">SALE INVOICE NO.</td>
                                <td><%= Math.random() + 1 %></td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Date</td>
                                <td><%= date.get(Calendar.DAY_OF_MONTH) %> /
                                    <%= date.get(Calendar.MONTH) + 1%> /
                                    <%= date.get(Calendar.YEAR) %></td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Products:</td>
                                <td>Unit Price</td>
                            </tr>
                            
                            <%for(int i = 0; i < productos.size(); i++){ %>
                            <tr>
                                <td><%= productos.get(i).getTitle_book() %></td>
                                <td><%= productos.get(i).getValue() %></td>
                            </tr>
                            <%}%>
                            <tr>
                                <td>Subtotal</td>
                                <td><%= value %></td>
                            </tr>
                            <tr>
                                <td>Total</td>
                                <td><%= total %></td>
                            </tr>
                            <tr>
                                <td colspan="2">WE ARE GREAT CONTRIBUTORS</td>
                            </tr>
                        </table>
                    </form>
                </section>

            </section>
        </section>
        <section class="footer">
            <footer>
                <section class="start-mark">
                    <div class="body"><h3>Social Media</h3></div>
                    <div class="triangle"></div>
                </section>

                <section class="end-mark">
                    <section>
                        <img src="Assets/Logos/instagram.png" alt="Logo Instagram">
                        <a href="https://www.instagram.com/didacticoscsj/">Instagram</a>
                    </section>
                </section>
                <section class="end-mark">
                    <section>
                        <img src="Assets/Logos/facebook.png" alt="Logo Facebook" >
                        <a href="https://www.facebook.com/DidacticosCSJ/">Facebook</a>
                    </section>
                </section>
                <section class="end-mark">
                    <section>
                        <img src="Assets/Logos/logo_twitter.png" alt="Logo Twitter">
                        <a href="https://twitter.com/DidacticosCSJ">Twitter</a>
                    </section>
                </section>
            </footer>
            <section>
                <h2>Developed by Didacticos CSJ</h2>
            </section>
        </section>
    </body>
</html>
