package principal;


import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Ejercicio2 {

    public  static ArrayList<Perro> listaPerros;
    public static void main(String[] args) {


        Perro perro1 = new Perro(2,"El sopas", true, "rojo",25, Raza.Angel );
        Perro perro2 = new Perro(5, "El sopant", false, "amarillo", 4, Raza.Alex);
        Perro perro3 = new Perro(9, "Picaxu", true,"negro", 58, Raza.Ruben);


        listaPerros.add(perro1);
        listaPerros.add(perro2);
        listaPerros.add(perro3);

        RandomAccessFile documentoPerros=null;

        try {

            documentoPerros = new RandomAccessFile("LosPerros", "rw");

            documentoPerros.write(perro1);


        }catch (Exception e){

            System.out.println("Error");

        }


    }
}
