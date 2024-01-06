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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int condicion;
        String nombre;
        String cedula;
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su número de cédula");
        cedula = entrada.nextLine();
        System.out.println("Si desea obtener su planilla de luz digite 1 si "
                + "desea valor de su predio digite 2");
        condicion = entrada.nextInt();
        if (condicion == 1) {
            calcularValorLuz(nombre, cedula);
        } else {
            if (condicion == 2) {
                calcularPredio(nombre, cedula);
            }
        }
    }

    public static void calcularValorLuz(String nom, String ced) {
        Scanner entrada = new Scanner(System.in);
        double kilowatio;
        double consumo;
        System.out.println("Ingrese el valor del kilowatio");
        kilowatio = entrada.nextDouble();
        System.out.println("Ingrese el valor de kilowatios consumidos");
        consumo = entrada.nextDouble();
        double valort;
        valort = (kilowatio * consumo);
        System.out.printf("Cliente: %s con cedula: %s debe cancelar el"
                + " valor de: $%.2f\n", nom, ced, valort);

    }

    public static void calcularPredio(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double resultado;
        double inmueble;
        System.out.println("Ingrese el valor del inmueble");
        inmueble = entrada.nextDouble();
        resultado = inmueble - (inmueble * 0.2);
        System.out.printf("Cliente: %s con cédula: %s tiene un inmueble "
                + "valorado en: $%.2f y tiene que pagar un predio de: $%.2f\n",
                nombre, cedula, inmueble, resultado);
    }
}
