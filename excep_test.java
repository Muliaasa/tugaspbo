/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author DELL
 */
public class excep_test {
    
    public static void main(String[] args) {
        System.out.println(testFinallyBlock());
    }
    private static int testFinallyBlock(){
        int a[] = new int[2];
        try{
            return 1;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :" +e);
        }finally{
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
        return 0;
    }
}

//Kode Java tersebut mendemonstrasikan penggunaan blok try-catch-finally
//Di dalam metode testFinallyBlock, sebuah array a dengan ukuran 2 dideklarasikan.
//Blok try mencoba mengembalikan nilai 1 dengan perintah return 1;.
//Tidak ada pengecualian (exception) yang dilemparkan di dalam blok try, jadi blok catch tidak akan dijalankan.
//Blok finally selalu dieksekusi, terlepas dari apakah pengecualian terjadi atau tidak. Di sini, nilai dari elemen pertama array a diubah menjadi 6, kemudian dua pesan akan dicetak ke konsol