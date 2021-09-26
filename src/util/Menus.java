package util;

import java.util.Scanner;

public abstract class Menus {

    Scanner scanner = new Scanner(System.in);

    public int mostrarMenuLogin() {

        int opcion = 0;

        System.out.println("");
        System.out.println("----------- Red Social ------------");
        System.out.println("1. Ingresar");
        System.out.println("2. Registrarme");
        System.out.println("3. Olvide mi contraseña");
        System.out.println("4. Salir");
        System.out.println("-----------------------------------");
        System.out.print("Ingresa una opción: ");
        opcion = scanner.nextInt();
        System.out.println("-----------------------------------");
        while(opcion <= 0 || opcion >= 5) {
            System.out.println("-----------------------------------");
            System.out.println("[ERROR] La opcion que elegiste no existe, intentalo de nuevo");
            System.out.println("");
            System.out.print("Ingresa una opción: ");
            opcion = scanner.nextInt();
            System.out.println("-----------------------------------");
        }
        System.out.println("");

        return opcion;
    }

}