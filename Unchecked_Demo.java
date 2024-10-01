/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author DELL
 */
public class Unchecked_Demo {

   public static void main(String[] args) {
        int num[] = {1, 2, 3, 4};
       
            System.out.println(num[5]);
        }
    }

//Indeks di luar batas array: Array num hanya memiliki 4 elemen, yang dapat diakses dengan indeks 0, 1, 2, dan 3. Mengakses num[5] akan menyebabkan ArrayIndexOutOfBoundsException karena indeks 5 tidak ada dalam array tersebut.
