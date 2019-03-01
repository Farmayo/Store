
<%@page import="DataTypes.Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css">
        <link rel="stylesheet" href="CSS/StartPage.css">
        <title>Didacticos CSJ - Start Page</title>
    </head>
    <body>

        <%
            Data data1 = Data.getInstance();
            if (data1.getActive() != null) {
                if (data1.getActive().getKey()) {
                    response.sendRedirect("Simulator.jsp");
                }
            }

        %>

        <section>
            <section class="ui card">
                <a class="image" href="#">
                    <section>
                        <h3>Didacticos CSJ - Store</h3>
                        <img src="Assets/didacticos_CSJ_Fixed_Resized.png">
                    </section>
                </a>
                <section class="content">
                    <a class="header" href="#">
                        Se encuentra usted registrado?
                    </a>
                    <div class="meta">
                        <a>Recuerda que estar registrado trae grandes benficios para ti</a>
                    </div>

                    <section class="ja_buttons">
                        <button id="btn_login">Entrar</button>
                        <section>
                            o
                        </section>
                        <button class="ja_btn_greeen" id="btn_no_registered">Registrarse</button>
                    </section>
                </section>
            </section>
            <section class="register">
                <section class="ja_card ui corner labeled">
                    <div class="ui corner label">
                        <i class="hand lizard icon"></i>
                    </div>
                    <section class="content">
                        <section>
                            <h3>Cree una nueva cuenta</h3>
                            <h4>Es gratis</h4>
                        </section>

                        <%@page import="Controller.ServletRegisterData" %>
                        <form action="ServletCheckData">
                            <h3>Información personal</h3>

                            <section class="names">
                                <section class="ja_input">
                                    <label for="inp_name">Nombres</label>
                                    <section class="ui input">
                                        <input type="text" placeholder="Nombre" id="inp_name" name="inp_name">
                                    </section>
                                </section>
                                <section class="ja_input">
                                    <label for="inp_lastname">Apellidos</label>
                                    <section class="ui input">
                                        <input type="text" placeholder="Apellidos" id="inp_lastname" name="inp_lastname">
                                    </section>
                                </section>
                            </section>

                            <section class="names">
                                <section class="ja_input">
                                    <label for="inp_email">Correo electronico</label>
                                    <section class="ui input">
                                        <input type="email" placeholder="Email" id="inp_email" name="inp_email">
                                    </section>
                                </section>
                                <section class="ja_input">
                                    <label for="inp_cellphone">N&uacutemero de celular</label>
                                    <section class="ui input">
                                        <input type="text" placeholder="Celular" id="inp_cellphone" name="inp_cellphone">
                                    </section>
                                </section>
                            </section>

                            <section class="names">
                                <section class="ja_input">
                                    <label for="inp_id">Documento de identidad</label>
                                    <section class="ui input">
                                        <input type="text" placeholder="Documento identidad" id="inp_id" name="inp_id">
                                    </section>
                                </section>
                                <section class="ja_input">
                                    <label for="inp_age">Edad</label>
                                    <section class="ui input">
                                        <input type="number" placeholder="Edad" id="inp_age" name="inp_age">
                                    </section>
                                </section>
                            </section>

                            <button class="ja_btn_greeen" id="btn_register">Registrarse</button>

                        </form>

                    </section>
                </section>
            </section>

            <section class="login">
                <section class="ja_card_login ui corner labeled">
                    <div class="ui corner label">
                        <i class="hand lizard icon"></i>
                    </div>

                    <section class="content">
                        <section>
                            <h3>Inicie sesi&oacuten</h3>
                            <h4>Llene todos los campos</h4>
                        </section>
                        <%@page import="Controller.SevletLogin" %>
                        <form action="SevletLogin">
                            <section class="ja_input">
                                <label for="inp_name_login">Nombre</label>
                                <section class="ui input">
                                    <input type="text" placeholder="Nombre" id="inp_name_login" name="inp_name_login"/>
                                </section>
                            </section>
                            <br>
                            <section class="ja_input">
                                <label for="inp_id_login">Documento</label>
                                <section class="ui input">
                                    <input type="text" placeholder="Documento" id="inp_name_login" name="inp_id_login"/>
                                </section>
                            </section>

                            <section class="ja_swicth">
                                <label class="switch">
                                    <input type="checkbox" name="inp_save_session">
                                    <span class="slider round"></span>
                                </label>
                                Mantener la sesion abierta
                            </section>

                            <br>

                            <button class="ja_btn_greeen" id="btn_enter">Ingresar</button>
                        </form>

                    </section>

                </section>
            </section>
        </section>

        <%            Data data = Data.getInstance();
            if (data.isError_data()) {
        %>
        <script type="text/javascript">
            setTimeout(function () {
                document.getElementById("snackbar").classList.remove("show");
            }, 3000);
        </script>
        <section class="show" id="snackbar">
            Los datos ingresados son incorrectos
        </section>
        <%
                data.setError_data(false);
            }%>

        <script type="text/javascript" src="JS/StartPage.js"></script>
    </body>
</html>
