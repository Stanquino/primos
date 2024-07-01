package com.example.p1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/primos")
public class Primos extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter st = response.getWriter();
        //declaro mis variables en mi clase de text a entero
        String n1 = request.getParameter("primernumero");
        String n2 = request.getParameter("ultimonumero");

        int primern = Integer.parseInt(n1);
        int ultimon = Integer.parseInt(n2);


        st.println("sus numeros primos entre " + primern + " y " + ultimon + " son:");

        for (int i = primern; i <= ultimon; i++) {

            if (primo(i)) {
                st.println("  * " + i + "");
            }

        }
    }


        public static boolean primo(int p) {
        // si p que es mi numero que va a mi clase es menor  igual a 1
        if(p<=1){
            return false;
        }

//si mi numero es divisible para dos y re resultado me da 0
        // Math.sqrt es aque que me da el resultado de la raiz
        //modulo/reciduo = p
        for (int i = 2; i <= Math.sqrt(p) ; i++) {
            //si mi numero no es divisible para 2  y re resultado me da 0
            // no es primo
            if (p % i == 0) {
                return false;
            }
        }

        return true;


    }}



