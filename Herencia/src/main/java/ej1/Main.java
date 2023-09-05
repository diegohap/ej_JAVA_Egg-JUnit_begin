package ej1;


import ej1.model.Animal;
import ej1.model.Caballo;
import ej1.model.Gato;
import ej1.model.Perro;

public class Main {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carnivoro",15, "Doverman");
        System.out.println(perro1.alimentarse());
        Animal perro2 = new Perro("Teddy", "Croquetas",10, "Chihuahua");
        System.out.println(perro2.alimentarse());
        Animal gato1 = new Gato("Pelusa", "Galletas",15, "Saiamés");
        System.out.println(gato1.alimentarse());
        Animal caballo1 = new Caballo("Spark", "Pasto",25, "Fino");
        System.out.println(caballo1.alimentarse());
    }
}
