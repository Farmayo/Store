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
                        <h4>Name</h4>
                        <h4> <input placeholder="Name" name="name" id="name"/> </h4>
                    </section>       
                    <section>
                        <h4>Telephone</h4>
                        <h4> <input placeholder="Telephone" name="telephone" id="telephone"/> </h4>
                    </section>  
                    <section>
                        <h4>Address</h4>
                        <h4> <input placeholder="Address" name="address" id="address"/> </h4>
                    </section>
                    <section>
                        <h4>Country</h4>
                        <h4> <input placeholder="Country" name="country" id="country"/> </h4>
                    </section>
                    <section>
                        <h4>City</h4>
                        <h4> <input placeholder="City" name="city" id="city"/> </h4>
                    </section>
                    <section>
                        <h4>State</h4>
                        <h4> <input placeholder="State/Province/Department" name="state" id="state"/> </h4>
                    </section>
                    <section>
                        <h4>Postal Code</h4>
                        <h4> <input placeholder="Postal Code" name="postal" id="postal"/> </h4>
                    </section>

                    <button id="btnPrint">Generate Bill</button>
                </form>
            </section>
            <%--Quitar espacios entre sections y alinear uno al lado del otro--%>
            <section class="bills">
                <section>
                    <form id="bill_form">
                        <table id="bill_bg">
                            <tr>
                                <td style="text-align: left;">SALE INVOICE NO.</td>
                                <td>Info</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Date</td>
                                <td>Current_Date</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Products:</td>
                                <td>Unit Price</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Ejm LIBRO 1</td>
                                <td>5.00</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Ejm LIBRO 2</td>
                                <td>5.00</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Ejm LIBRO 3</td>
                                <td>5.00</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Ejm LIBRO 4</td>
                                <td>5.00</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Ejm LIBRO 5</td>
                                <td>5.00</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Ejm LIBRO 6</td>
                                <td>5.00</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Ejm LIBRO 7</td>
                                <td>5.00</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Ejm LIBRO 8</td>
                                <td>5.00</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Ejm LIBRO 9</td>
                                <td>5.00</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Subtotal</td>
                                <td>45.00</td>
                            </tr>
                            <tr>
                                <td style="text-align: left;">Total_Product_Items</td>
                                <td>50.00</td>
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
