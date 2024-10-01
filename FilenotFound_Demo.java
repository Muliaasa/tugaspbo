/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author DELL
 */
import java.io.File;
import java.io.FileReader;
        
public class FilenotFound_Demo {

    public static void main(String[] args) {
    File file = new File("E://file.txt");
    FileReader fr = new FileReader(file);
    
    }
    
}

//Kode ini berusaha untuk membuka file menggunakan FileReader,tetapi jika file tersebut tidak ada, program akan melempar FileNotFoundException. perlu ditangani exception ini dengan menggunakan blok try-catch
