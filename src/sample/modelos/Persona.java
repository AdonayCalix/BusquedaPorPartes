package sample.modelos;

import java.lang.reflect.Executable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    public String nombre;
    public String apellido;
    public int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static Persona[] personas = {
            new Persona("David", "Delcid", 20),
            new Persona("Armando", "Menocal", 20),
            new Persona("Lester", "Fernandez", 24),
            new Persona("Andoni", "Armijo", 20),
            new Persona("Oliver", "Ramos", 23),
            new Persona("Victor", "Archaga", 21),
            new Persona("Angelo", "Lagusso", 25),
            new Persona("Oliver", "Enriquez", 22),
            new Persona("Oliver", "Giroud", 29),
            new Persona("Jonan", "Cedillo", 22)
    };

    public static boolean buscarPorParte(String palabraBuscar, int campoBuscar) {
        boolean resultado = false;
        if (campoBuscar == 0) {
            for (int i = 0; i < personas.length; i++) {
                if (personas[i].nombre.startsWith(palabraBuscar)) {
                    System.out.println("----------------------------------------------");
                    System.out.println(personas[i].nombre + " " + personas[i].apellido + " , " + personas[i].edad);
                    System.out.println("-----------------------------------------------");
                    resultado = true;
                }
            }
        } else {
            for (int i = 0; i < personas.length; i++) {
                if (personas[i].apellido.startsWith(palabraBuscar)) {
                    System.out.println("----------------------------------------------");
                    System.out.println(personas[i].nombre + " " + personas[i].apellido + " , " + personas[i].edad);
                    System.out.println("-----------------------------------------------");
                    resultado = true;
                }
            }
        }


        return resultado;
    }

    public static boolean buscarPorPartes(String palabraBuscar) {
        boolean estado = false;
        String nombreCompletos = "";

        for (int i = 0; i < personas.length; i++) {

            nombreCompletos += personas[i].nombre + " " + personas[i].apellido + " , " + personas[i].edad;
            Pattern pattern = Pattern.compile("(?i)" + palabraBuscar);
            Matcher matcher = pattern.matcher(nombreCompletos);

            if (matcher.find()) {
                System.out.println("-----------------------------------------------");
                System.out.println(nombreCompletos);
                System.out.println("-----------------------------------------------");
                estado = true;
            }
            nombreCompletos = "";
        }
        return estado;
    }

}
