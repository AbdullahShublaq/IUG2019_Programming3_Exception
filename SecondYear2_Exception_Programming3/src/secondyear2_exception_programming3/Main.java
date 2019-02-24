/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondyear2_exception_programming3;

import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah Shublaq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1.a :");
        try {
            throw new ExceptionB("ExceptionB");
        } catch (ExceptionA ex) {
            System.out.println(ex.getMessage());
        }

        try {
            throw new ExceptionC("ExceptionC");
        } catch (ExceptionA ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("--------\n1.b :");
        try {
            throw new ExceptionA("ExceptionA");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            throw new ExceptionB("ExceptionB");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            throw new NullPointerException("NullPointerException");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            throw new InputMismatchException("InputMismatchException");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("--------\n2 :");
        try {
            someMethod();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void someMethod() throws Exception {
        someMethod2();
    }

    public static void someMethod2() throws Exception {
        throw new Exception("Error");
    }
}
