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
        double area;
        System.out.println("Ingrese 1 para el area de un cuadrado, ingrese 2"
                + " para el area de un triángulo, ingrese 3 para el area de un"
                + "rectangulo");
        int tipo = entrada.nextInt();
        if (tipo == 1) {
            area = obtenerAreaCuadrado();
        } else {
            if (tipo == 2) {
                area = obtenerAreaTriangulo();
            } else {
                if (tipo == 3) {
                    area = obtenerAreaRectangulo();
                } else {
                    System.out.println("opción incorrecta");
                }
            }

        }

    }
    public static double obtenerAreaCuadrado(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        double suma;
        suma = entrada.nextDouble();
        suma = suma + suma + suma + suma;
        return suma;
    } 
    public static double obtenerAreaTriangulo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo");
        double base;
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        double altura;
        altura = entrada.nextDouble();
        double operacion;
        operacion = (base * altura) / 2;
        return operacion;
    }
    public static double obtenerAreaRectangulo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        double base;
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double altura;
        altura = entrada.nextDouble();
        double operacion;
        operacion = (base * altura);
        return operacion;
    }
}