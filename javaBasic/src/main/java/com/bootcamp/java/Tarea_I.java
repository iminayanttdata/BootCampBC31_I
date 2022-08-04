package com.bootcamp.java;

import java.util.Scanner;

public class Tarea_I {

	private static Scanner entrada;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dato dato = new Dato();
		System.out.println ("Metodo Fibonacci");

        System.out.println ("Ingrese la cantidad de valores:");
         
        entrada = new Scanner (System.in);
        
  
        try {
			
        	dato.setCantidad(Integer.parseInt(entrada.nextLine()));
        	
		 System.out.println("La serie fibonacci es la siguiente: \n"
				 +Fuction.ImprimirFibonacci(dato).getSerie());
		
        } catch (Exception e) {
			
        	System.out.println( "Ingrese un numero");
        	
		}
       
         
	}

}
