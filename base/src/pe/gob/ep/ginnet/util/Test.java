package pe.gob.ep.ginnet.util;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	static class Persona {

        public String nombre;
        public int edad, altura;
        // Constructor de la clase
        public Persona(String nombre, int edad, int altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }

    }
	
	// M�todo para imprimir el array de Personas
    static void imprimeArrayPersonas(Persona[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i].nombre + " - Altura: " + array[i].altura + " - Edad: " + array[i].edad);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Persona[] arrayPersonas = new Persona[5];
        arrayPersonas[0] = new Persona("Mario", 22, 187);
        arrayPersonas[1] = new Persona("Pepe", 52, 173);
        arrayPersonas[2] = new Persona("Manuel", 27, 158);
        arrayPersonas[3] = new Persona("David", 25, 164);
        arrayPersonas[4] = new Persona("Alberto", 80, 184);

        System.out.println("Array sin ordenar por altura");
        imprimeArrayPersonas(arrayPersonas);
		
	}

}
