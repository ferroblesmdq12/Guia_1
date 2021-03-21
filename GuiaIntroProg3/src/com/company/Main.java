package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;
import sun.security.mscapi.CPublicKey;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    private static PrintStream salida = System.out;
    private static Scanner scanner = new Scanner(System.in);

///********************************** Menu **************************************************************************///

    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);
        int ejercisio = 1;

        while (ejercisio != 0) {
            salida.println("\nIngrese el numero del ejercisio a resolver o 0 para salir: ");
            ejercisio = menuScanner.nextInt();

            switch (ejercisio) {

                case 0:
                    salida.println("\n Proceso Terminado");

                    break;

                case 1:
                    salida.println("\n Ejercisio 1...");
                    Ejercisio1();
                    break;

                case 2:
                    salida.println("\n Ejercisio 2...");
                    Ejercisio2();
                    break;


            }
        }
    }

///******************************************************************************************************************///
/// FUNCIONES ///

    /// Ejercisio 1 ///
    private static void Ejercisio1() {
        int N = 3;
        double D = 8.77;
        char C = 'f';

        salida.println("\n Valores de cada variable: ");
        salida.println(String.format("N: %s D: %s C: %s", N, D, C));
        salida.println("\n Suma de N + D");
        salida.println(String.format("N+D: %s", N + D));
        salida.println("\n Resta de D - N");
        salida.println(String.format("D-N: %s", D - N));
        salida.println("\n Valor numerico que corresponde al caracter C: ");
        salida.println(String.format("C: %s", Integer.valueOf(C)));

    }

    ///  Ejercisio 2 ///
    private static void Ejercisio2()
    {
        int X = 22;
        int Y = 12;
        double M = 3.14;
        double N = 2.33;

        salida.println("\n Valores de cada variable: ");
        salida.println(String.format("X: %s Y: %s M: %s N: %s", X, Y, M, N));
        salida.println("\n X*Y ");
        salida.println(String.format("X*Y: %s", X * Y));
        salida.println("\n Suma entre ellos");
        salida.println(String.format("X+Y+M+N: %s", X + Y + M + N));

    }