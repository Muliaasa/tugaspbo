/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

/**
 *
 * @author DELL
 */
public class Excep_test3 {

public static void main(String args[]) {
    int a = 3;
    int b = 0;
    try {
      System.out.println("result:" + divide(a,b));
    } catch (Exception e) {
      System.out.println("Exception: " + e);
}
}

private static int divide(int a, int b) throws Exception { 
    if(b == 0) { 
        throw new Exception("second argument cannot be zero.");
    }
    return a/b;
}
}


