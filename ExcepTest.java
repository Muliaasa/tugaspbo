/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author DELL
 */
public class ExcepTest {

    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            try{
                int b = 0;
                int c = 1/b;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception thrown:" + e);
            }
      
      System.out.println("Acces element three :" + a[3]);
            }
            catch(Exception e){
                System.out.println("Exception thrown:" +e);
            }
            System.out.println("Out of the block");
        }
    }

//Program akan melempar ArithmeticException yang tidak tertangani oleh blok catch yang salah di dalam.
//ArrayIndexOutOfBoundsException akan tertangkap oleh blok catch luar, yang akhirnya mencetak pesan exception dan melanjutkan eksekusi hingga mencetak "Out of the block".
