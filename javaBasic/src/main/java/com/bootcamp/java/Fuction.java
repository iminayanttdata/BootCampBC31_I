package com.bootcamp.java;

import java.util.Calendar;
import java.util.Date;

public class Fuction {
	public static int fibonacci(int n) {
		 
        if (n == 0) {
            return 0; 
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
 
  }
	public static Dato  ImprimirFibonacci(Dato dato){

	 String Result="";
	 if(dato.getCantidad()>=0) {
		   for (int i = 0; i < dato.getCantidad(); i++) {

		    	Result=Result+fibonacci(i)+",";
		    } 
		 
		   Result = Result.substring(0, Result.length()-1);
		   dato.setSerie(Result);
	 }
	 
    return dato;
	}
	
	

	public static Dato vaidarEdad(Dato dato){
		Calendar dt = Calendar.getInstance();
		int result =0;
		result=dt.get(Calendar.YEAR)-dato.getAnio();
		dato.setEdad(result);
		if(result>18) {
			
			dato.setResultado(dato.getNombres()+ " usted es mayor de edad, tiene "+
					dato.getEdad() +" años");
		}
		
		else {
			
			dato.setResultado(dato.getNombres()+ " usted es menor de edad, tiene "+
					dato.getEdad() +" años");
		}
		   return dato;
		
	}
	
}
