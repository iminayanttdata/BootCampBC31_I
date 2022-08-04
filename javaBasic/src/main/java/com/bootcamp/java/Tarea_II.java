package com.bootcamp.java;

import java.util.Date;
import java.util.Scanner;

public class Tarea_II {

	private static Scanner anio,nombres;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dato dato = new Dato();
		System.out.println ("Metodo calcular edad actual");

        System.out.println ("Ingrese nombres:");
         
        nombres = new Scanner (System.in);
    	dato.setNombres(nombres.nextLine());
        System.out.println ("Ingrese año de nacimiento:");
  
        anio = new Scanner (System.in);
        dato.setAnio(Integer.parseInt(anio.nextLine()));
        try {
			
    
			
        	
        	
		 System.out.println(Fuction.vaidarEdad(dato).getResultado());
		
        } catch (Exception e) {
			
        	
        	System.out.println( "Ingrese un numero"+e.getMessage());
        	
		}
       
         
	}

}
