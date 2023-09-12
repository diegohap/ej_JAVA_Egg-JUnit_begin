package ej1;


import ej1.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Animal perro1 = new Perro("Stich", "Carnivoro",15, "Doverman", "Marron");
        System.out.println(perro1.alimentarse());
        Animal perro2 = new Perro("Teddy", "Croquetas",10, "Chihuahua", "Blanco");
        System.out.println(perro2.alimentarse());
        Animal gato1 = new Gato("Pelusa", "Galletas",15, "Saiamés");
        System.out.println(gato1.alimentarse());
        Animal caballo1 = new Caballo("Spark", "Pasto",25, "Fino");
        System.out.println(caballo1.alimentarse());
        Animal pez1 = new Pez("Dory", "Plancton",2, "Beta");
        System.out.println(pez1.alimentarse());

        animales.add(perro1);
        animales.add(perro2);
        animales.add(gato1);
        animales.add(caballo1);
        animales.add(pez1);

        for (Animal a : animales) {
            System.out.println(a.alimentarse());
        }

        ArrayList<MovilidadTerrestre> terrestres = new ArrayList<>();
        terrestres.add((MovilidadTerrestre) perro1);
        terrestres.add((MovilidadTerrestre) perro2);
        terrestres.add((MovilidadTerrestre) gato1);
        terrestres.add((MovilidadTerrestre) caballo1);

        for (MovilidadTerrestre a : terrestres) {
            a.caminar();
        }
    }
}
