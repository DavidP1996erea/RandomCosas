package principal;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) {
	// write your code here

        RandomAccessFile raf = null;


        try{
            raf=new RandomAccessFile("eldocumento.txt", "rw");

            raf.writeInt(15);
            raf.writeInt(78);
            raf.writeInt(1);

            raf.writeInt(3);
            raf.writeLong(4785);

            raf.writeLong(54954);
            raf.writeLong(96595);
            long puntero=raf.getFilePointer();
            raf.writeLong(65441);


            System.out.println(raf.length());
            raf.seek(puntero);
            System.out.println(raf.readLong());

        }catch (Exception f){

            System.out.println("Falló todo");

        }finally {

            try{
                raf.close();
            }catch (IOException todoMal){
                System.out.println("");
            }

        }


    }
}
