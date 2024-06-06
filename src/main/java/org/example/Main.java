package org.example;

import java.sql.*;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        connectionDB con = new connectionDB();
        CrudOperations crOp = new CrudOperations();
        Connection connectionBd = con.conectarBD("carros");

        int opcion;
        Scanner in = new Scanner(System.in);


        do {
            System.out.println("introduzca una operacion a realizar a la base de datos");
            System.out.printf("1.-Mostra BD%n2.-insertar un dato%n-1.-Salir del programa%n");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    crOp.read(connectionBd);
                    break;
                case 2:
                    crOp.insertUser(connectionBd, "silverado", 2020, "verde");
                    break;
                default:
                    String res = (opcion != -1) ? "eliga una opcion valida  %n" : "";
                    System.out.printf(res);
                    break;
            }
        } while (opcion != -1);

    }
}