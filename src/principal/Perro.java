package principal;

import java.util.ArrayList;

enum Raza{
    Ruben, Angel, Alex, David
}

public class Perro {
    private int id;
    private String nombre;
    private boolean conChapa;
    private String color;
    private int edad;
    private Raza raza;



    public Perro(int id, String nombre, boolean conChapa, String color, int edad, Raza raza){
        this.id=id;
        this.nombre=nombre;
        this.raza=raza;
        this.conChapa=conChapa;
        this.color=color;
        this.edad=edad;
    }





}
