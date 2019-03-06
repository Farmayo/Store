<%@page import="Data_Structure.Product"%>
<%@page import="Controller.ControlUser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css">
        <link type="text/css" rel="stylesheet" href="CSS/Products.css?
              =1.01">
        <title>Products</title>
    </head>
    <body>
        <%
            String doc = request.getParameter("inp_id_login");
            ControlUser control = ControlUser.getInstance();
            int items = 0;
            if (control.getUsers().containsKey(doc)) {
                if (control.getUsers().get(doc).getProducts() != null) {
                    items = control.getUsers().get(doc).getProducts().size();
                }
            }
        %>

        <header>
            <section>
                <h1>Welcome to Didacticos CSJ Store</h1>
                <h3>The store that will revolutionize the book market</h3>
            </section>
            <img src="Assets/didacticos_CSJ_Fixed.png" />
        </header>

        <section class="suggested">
            <section>
                <h1>Suggested Books</h1>
                <i class="cart arrow down icon"><span id="suggested-items">0 Items</span></i>
                <form action="Bills.jsp" id="form-bill">
                    <input type="hidden" name="inp_codes" id="inp_codes" value="">
                    <button id="btn-send">Pagar</button>
                </form>
            </section>
            <form id="form-aux">
                <section>
                    <img src="Assets/Products/Suggested/diario_del_fin_del_mundo-Mario_Mendoza.PNG"/>
                    <h2>Diario del fin del Mundo</h2>
                    <section class="info">
                        <section class="info-author">
                            <h3>Mario Mendoza</h3>
                            <h4>U$5.00</h4>
                        </section>
                        <section class="info--add">
                            <input type="hidden" value="5.00" name="value_book">
                            <button type="button" onclick="addProduct(1)">Add to car</button>
                        </section>
                    </section>
                </section>
                <section>
                    <img src="Assets/Products/Suggested/el_nobel-Vicky_Davila.PNG"/>
                    <h2>El Nobel</h2>
                    <section class="info">
                        <section class="info-author">
                            <h3>Vicky Davila</h3>
                            <h4>U$5.00</h4>
                        </section>
                        <section class="info--add">
                            <input type="hidden" value="5.00" name="value_book">
                            <button type="button" onclick="addProduct(2)">Add to car</button>
                        </section>
                    </section>
                </section>
                <section>
                    <img src="Assets/Products/Suggested/hoy_es_siempre_todavia-Alejandro_Gaviria.PNG"/>
                    <h2>Hoy es Siempre Todavia</h2>
                    <section class="info">
                        <section class="info-author">
                            <h3>Alejandro Gaviria</h3>
                            <h4>U$5.00</h4>
                        </section>
                        <section class="info--add">
                            <input type="hidden" value="5.00" name="value_book">
                            <button type="button" onclick="addProduct(3)">Add to car</button>
                        </section>
                    </section>
                </section>
                <section>
                    <img src="Assets/Products/Suggested/ideas_millonarias-Juan_diego_gomez.PNG"/>
                    <h2>Ideas Millonarias</h2>
                    <section class="info">
                        <section class="info-author">
                            <h3>Juan Diego Gomez</h3>
                            <h4>U$5.00</h4>
                        </section>
                        <section class="info--add">
                            <input type="hidden" value="5.00" name="value_book">
                            <button type="button" onclick="addProduct(4)">Add to car</button>
                        </section>
                    </section>
                </section>
                <section>
                    <img src="Assets/Products/Suggested/las_palabras_mas_bellas-Juan_Gosain.PNG"/>
                    <h2>Las palabras más bellas</h2>
                    <section class="info">
                        <section class="info-author">
                            <h3>Juan Gosain</h3>
                            <h4>U$5.00</h4>
                        </section>
                        <section class="info--add">
                            <input type="hidden" value="5.00" name="value_book">
                            <button type="button" onclick="addProduct(5)">Add to car</button>
                        </section>
                    </section>
                </section>
                <section>
                    <img src="Assets/Products/Suggested/los_divinos-Laura_Restrepo.PNG"/>
                    <h2>Los divinos</h2>
                    <section class="info">
                        <section class="info-author">
                            <h3>Laura Restrepo</h3>
                            <h4>U$5.00</h4>
                        </section>
                        <section class="info--add">
                            <input type="hidden" value="5.00" name="value_book">
                            <button type="button" onclick="addProduct(6)">Add to car</button>
                        </section>
                    </section>
                </section>
                <section>
                    <img src="Assets/Products/Suggested/ninas_rebeldes_2.PNG"/>
                    <h2>Ni&nacute;as rebeldes 2</h2>
                    <section class="info">
                        <section class="info-author">
                            <h3> Elena Favilli</h3>
                            <h4>U$5.00</h4>
                        </section>
                        <section class="info--add">
                            <input type="hidden" value="5.00" name="value_book">
                            <button type="button" onclick="addProduct(7)">Add to car</button>
                        </section>
                    </section>
                </section>
                <section>
                    <img src="Assets/Products/Suggested/todos_somos_poderosos-Luisa_Fernanda_W.PNG"/>
                    <h2>Todos somos poderosos</h2>
                    <section class="info">
                        <section class="info-author">
                            <h3>Luisa Fernanda W</h3>
                            <h4>U$5.00</h4>
                        </section>
                        <section class="info--add">
                            <input type="hidden" value="5.00" name="value_book">
                            <button type="button" onclick="addProduct(8)">Add to car</button>
                        </section>
                    </section>
                </section>
            </form>

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
        <script>
            var control_products = (function (){
                var counter = 0;
                function change(val){
                    counter += val;
                }
                return{
                    increment: function (){
                        change(1);
                    },
                    getValue: function (){
                        return counter;
                    }
                }
            })();
            
            function addProduct(inp_codes){
                var val = document.getElementById("inp_codes").value;
                if(val === ''){
                    document.getElementById("inp_codes").value = inp_codes; 
                }
                else{
                    document.getElementById("inp_codes").value += ";" + inp_codes; 
                }
                control_products.increment();
                document.getElementById("suggested-items").innerHTML = control_products.getValue() + " Items";
            }
            
            document.getElementById("btn-send").addEventListener("click", function (){
                document.getElementById("form-bill").submit();
            });
        </script>
    </body>
</html>
