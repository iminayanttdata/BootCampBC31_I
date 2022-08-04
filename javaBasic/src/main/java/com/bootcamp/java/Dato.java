package com.bootcamp.java;

public class Dato {
   private String serie ;
   private Integer cantidad;
   
   private String nombres ;
   private Integer anio;
   private Integer edad;
   private String resultado;
   private Boolean  validar;
   
   // Getter
   public String getSerie() {
     return serie;
   }

   // Setter
   public void setSerie(String serie) {
     this.serie = serie;
   }  
   
   // Getter
   public Integer getCantidad() {
     return cantidad;
   }

   // Setter
   public void setCantidad(Integer cantidad) {
     this.cantidad = cantidad;
   }  
   
   // Getter
   public Integer getAnio() {
     return anio;
   }

   // Setter
   public void setAnio(Integer anio) {
     this.anio = anio;
   }  
   
   // Getter
   public String getNombres() {
     return nombres;
   }

   // Setter
   public void setNombres(String nombres) {
     this.nombres = nombres;
   }
   
   // Getter
   public Boolean getValidar() {
     return validar;
   }

   // Setter
   public void setValidar(Boolean validar) {
     this.validar = validar;
   }
   
   
   // Getter
   public Integer getEdad() {
     return edad;
   }

   // Setter
   public void setEdad(Integer edad) {
     this.edad = edad;
   }

public String getResultado() {
	return resultado;
}

public void setResultado(String resultado) {
	this.resultado = resultado;
}
}
