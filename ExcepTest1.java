/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author DELL
 */
public class ExcepTest1 {

    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            try{
                int b = 0;
                int c = 1/b;
            }catch(Exception e){
                System.out.println("Exception thrown:" + e);
            }
                System.out.println("Acces element three :" + a[3]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception thrown:" +e);
            }
            System.out.println("Out of the block");
        }
    }

//Blok catch(ArrayIndexOutOfBoundsException e) seharusnya menangkap exception dari seluruh blok try. Saat ini, ArrayIndexOutOfBoundsException tidak akan ditangkap karena keluar dari cakupan blok try-catch.
