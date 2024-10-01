/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author DELL
 */
public class excep_test2 {

    public class ExcepTest {

public static void main(String args[]) {

    int a[] = new int[2];
    try {
       System.out.println("Access element three:" + a[3]); 
    }catch (ArithmeticException e) {
       System.out.println("Exception thrown:" + e);
    }finally {
       a[0] = 6;
       System.out.println("First element value: " + a[0]);
       System.out.println("The finally statement is executed");
    }
}
}
}

//dalam kode tersebut mencoba mengakses elemen ke-3 dari array a yang hanya memiliki dua elemen (indeks 0 dan 1), ini akan melemparkan ArrayIndexOutOfBoundsException, tetapi kamu menangkap ArithmeticException, yang merupakan pengecualian berbeda. Seharusnya kamu menangkap ArrayIndexOutOfBoundsException.