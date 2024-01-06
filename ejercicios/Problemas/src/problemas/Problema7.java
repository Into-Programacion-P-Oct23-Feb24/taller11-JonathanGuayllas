/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.*;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] mensaje;
        mensaje = obtenerMensaje();
        System.out.println("Valores");
        for (int i = 0; i < mensaje.length; i++) {
            System.out.println(mensaje[i]);

        }
        System.out.println("Valores que tengan 4 o 5 caracteres");
        obtenerValores(mensaje);
    }

    public static String[] obtenerMensaje() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero;
        System.out.println("Ingrese el numero de datos");
        numero = entrada.nextInt();
        String[] mensaje = new String[numero];
        entrada.nextLine();
        for (int i = 0; i < mensaje.length; i++) {
            System.out.println("Ingrese la ciudad de Ecuador");
            mensaje[i] = entrada.nextLine();
        }
        return mensaje;
    }

    public static void obtenerValores(String[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i].length() == 4 || valores[i].length() == 5) {
                System.out.println(valores[i]);

            }

        }

    }
}