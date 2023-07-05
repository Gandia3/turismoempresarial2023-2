package org.example;

import org.example.modelos.Usuario;

public class Main {
    public static void main(String[] args) {
      Integer edad=18;
      //los objetos son variables solo que son variables especiales
        Universidad objetoUniversidad=new Universidad("Juan Jose");
        Usuario objetoUsuario=new Usuario(25,"andres","123",4 ,"abdy@gnail.com");

        //creo un objeto para acceder o modificar los atributos o metodos de ese elemento
        System.out.println(objetoUniversidad);
        System.out.println(objetoUsuario);

    }
}