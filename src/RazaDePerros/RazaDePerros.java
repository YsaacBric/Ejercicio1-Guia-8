/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RazaDePerros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RazaDePerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> RazadePerros = new ArrayList();
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        int resp;
        do {
            System.out.println("Ingrese una raza de perro: ");
            RazadePerros.add(read.next());
            System.out.println("Desea ingresar otra raza?\n"
                    + "Ingrese cualquier numero para continuar\n"
                    + "Ingrese 0 para salir");
            resp = read.nextInt();

        } while (resp != 0);

        System.out.println("Todas las razas de perros son: ");
        for (String RazadePerro : RazadePerros) {
            System.out.println(RazadePerro);
        }
    }

}
