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

    public int mostrarMenuPrincipal(String nombre) {
        int opcion = 0;

        System.out.println("");
        System.out.println("----------- Hola" + nombre + "------------");
        System.out.println("");
        System.out.println("PUBLICACIONES");
        System.out.println("");
        System.out.println("1. Ver todas las publicaciones");
        System.out.println("2. Crear una publicación");
        System.out.println("3. Eliminar una publicación");
        System.out.println("4. Eliminar todas las publicaciones de mi cuenta");
        System.out.println("5. Actualizar una publicación");
        System.out.println("");
        System.out.println("PERFIL");
        System.out.println("");
        System.out.println("6. Cambiar nombre");
        System.out.println("7. Cambiar apellido");
        System.out.println("8. Cambiar correo");
        System.out.println("9. Cambiar fecha de nacimiento");
        System.out.println("10. Cambiar genero");
        System.out.println("11. Cambiar contraseña");
        System.out.println("12. Eliminar cuenta");
        System.out.println("-----------------------------------");
        opcion = scanner.nextInt();
        System.out.println("-----------------------------------");
        while(opcion <= 0 || opcion >= 13) {
            System.out.println("-----------------------------------");
            System.out.println("[ERROR] La opcion que elegiste no existe, intentalo de nuevo");
            System.out.println("");
            System.out.print("Ingresa una opción: ");
            opcion = scanner.nextInt();
            System.out.println("--------------------------------------");
        }
        System.out.println("");

        return opcion;
    }

}