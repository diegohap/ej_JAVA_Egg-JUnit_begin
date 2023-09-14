package ej1.main;

import java.util.regex.Pattern;

public class ChequearCaracteresEspeciales {
    public static void main(String[] args) {
        System.out.println(contieneCaracteresEspeciales("hola!"));
    }

    public static boolean contieneCaracteresEspeciales(String input) {
//        // Patrón regex para buscar caracteres especiales
//        String regex = "[^a-zA-Z0-9\\s]";
//
//        // Compilamos el patrón
//        Pattern pattern = Pattern.compile(regex);
//
//        // Creamos un objeto Matcher para encontrar el patrón en la cadena de entrada
//        Matcher matcher = pattern.matcher(input);
//
//        // Si se encuentra una coincidencia, significa que contiene caracteres especiales
//        return matcher.find();

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]");
        return pattern.matcher(input).find();
    }
}