package banesco;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class archivos {

    int z, x;

    Stack pila = new Stack();
    Stack pilados = new Stack();
    Stack pilaatendidos = new Stack();

    public void leertexto(String direccion) {

        String texto = "";
        Stack pila = new Stack();

        try {
            FileReader fr = new FileReader(direccion);
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            String cont;
            cont = "";
            while ((cadena = br.readLine()) != null) {
                cont = cadena;
                if (cadena != null) {
                    pila.push(cont);
                }
            }
            while (pila.empty() == false) {

                pilados.push(pila.pop());

            }

        } catch (Exception e) {
            System.err.println("No se encontraron datos");
        }
    }

    public void taquilla() {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;

        int co, opcion;

        co = 0;
        z = 0;

        System.out.println("inicia el proceso de taquilla");

        while ((pilados.empty() == false)) {

            if (x < 450) {

                pilaatendidos.push(pilados.pop());

                while(!salir) {

                    if (co>4){
                       System.out.println("llegó al maximo de operaciones por persona");
                       salir=true;
                    }else{
                    try {

                        System.out.println("-----------------------------------------------------");

                        System.out.println("Elija una opción valida");

                        System.out.println("");

                        System.out.println("Para realizar un retiro presione 1");
                        System.out.println("Para realizar un depósito presione 2");
                        System.out.println("Para realizar un consulta presione 3");
                        System.out.println("Para realizar una actualizacion de libreta presione 4");
                        System.out.println("Para realizar pagos de servicios presione 5");
                        System.out.println("Para salir presione 0");

                        System.out.println("");
                        System.out.println("-----------------------------------------------------");
                        opcion = sn.nextInt();

                        switch (opcion) {

                            case 1:
                                System.out.println("");

                                co = co + 1;
                                z = z + 150;
                                x = z;
                                System.out.println("van " + z + "  " + x + " minutos  " + "   " + co + "   " + pilaatendidos.peek());
                                break;

                            case 2:

                                break;

                            case 3:

                                break;

                            case 4:

                                break;

                            case 5:

                                break;

                            case 0:

                                salir = true;
                                System.out.println("salio del sistema");

                                break;

                            default:
                                System.out.println("las opciones van de 0 a 5");

                        }

                    } catch (InputMismatchException e) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Debe colocar un numero entero entre las opciones dadas");
                        System.out.println("-----------------------------------------------------");
                        sn.next();
                    }break;

                }

            }
            }
        }
         System.out.println(pilaatendidos);

    }
}
