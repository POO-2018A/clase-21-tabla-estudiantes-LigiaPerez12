/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

/**
 *
 * @author Erick
 */
public class Estudiantes {
       
 private String nombre;
 private String apellido;
 private double nota1;
 private double nota2;
 private double nota3;
 public static int contador = 0;

    public Estudiantes(String nombre, String apellido, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.contador++;
        PromedioNotas.lblEstIng.setText("Número de estudiantes ingresados: "+String.valueOf(this.contador));
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNotas() {
        return nota1;
    }

    public void setNotas(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

     public static int getContador() {
        return contador;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }
    @Override
    public String toString() {
        String estudiante = this.nombre +"\t"+ this.apellido+"\t"+this.nota1+"\t"+this.nota2+"\t"+this.nota3;
        //double prom=0;
        
        return estudiante;
    }
    
}
