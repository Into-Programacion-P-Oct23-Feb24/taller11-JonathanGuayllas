/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here}
        System.out.println("Ingrese un número del 1 al 3");
        int tipo = entrada.nextInt();
        if (tipo == 1) {
            obtenerAreaCuadrado();
        } else {
            if (tipo == 2) {
                obtenerAreaTriangulo();
            } else {
                if (tipo == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("numero incorrecto");
                }
            }

        }

    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double suma;
        double area;
        System.out.println("Ingrese el lado del cuadrado");
        suma = entrada.nextDouble();
        area = suma + suma + suma + suma;
        System.out.printf("%.2f\n", area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("%.2f\n", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base del rectangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        altura = entrada.nextDouble();
        area = (base * altura);
        System.out.printf("%.2f\n", area);
    }
}
