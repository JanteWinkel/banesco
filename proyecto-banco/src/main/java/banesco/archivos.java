package banesco;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class archivos {

    int z, x;
    String b;

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

    @SuppressWarnings("empty-statement")
    public void taquilla() {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;

        int co, opcion;
        

        co = 0;
        z = 0;
        b = "";
        
  
           System.out.println("----------------------------------------------------------------------");
           System.out.println("inicia el proceso de taquilla");
           System.out.println("----------------------------------------------------------------------");
           System.out.println("");
           
           
           while (!salir && co<5){

            try {

                System.out.println("----------------------------------------------------------------------");

                System.out.println("Elija una opción valida para declarar las solicitudes de los clientes");

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

                        co ++;
                        b = b +" realizó un retiro, ";
                        x=x+4;
                        

                        break;

                    case 2:
                        
                        co ++;
                        b = b +" realizó un depósito, ";
                        x=x+3;

                        break;

                    case 3:
                        
                        co ++;
                        b = b +" realizó una consulta, ";
                        x=x+1;

                        break;

                    case 4:
                        
                        co ++;
                        b = b +" realizó una actualización de libreta, ";
                        x=x+5;

                        break;

                    case 5:
                        
                        co ++;
                        b = b +" realizó un pago de servicios";
                        x=x+2;

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
            }

        }
        while (pilados.empty()==false){
         pilaatendidos.push(pilados.pop()+b);}
    }
    
    
    

    public void imprimirpilas() {

        System.out.println(pila);
        System.out.println(pilados);
        System.out.println(pilaatendidos+"\\n");
        System.out.println(b);

    }
    }

        
