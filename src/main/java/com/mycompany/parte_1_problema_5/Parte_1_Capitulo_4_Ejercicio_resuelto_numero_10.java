/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_5;
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_4_Ejercicio_resuelto_numero_10 {

    public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner lector = new Scanner(System.in);
        String ni, nom;
        double pat, pagmat;
        byte est;
        
        pagmat = 50000;
        
        System.out.println("Por favor ingrese su número de inscripción: ");
        ni = lector.next();
        lector.nextLine();
        System.out.println("Por favor ingrese sus nombres: ");
        nom = lector.nextLine();
        System.out.println("Por favor ingrese el total de su patrimonio: ");
        pat = lector.nextDouble();
        System.out.println("Por favor ingrese su estrato social: ");
        est = lector.nextByte();
        
        if (pat>2000000&&est>3){
            pagmat = pagmat+0.03*pat;
        }
         System.out.println("El estudiante con número de inscripción "+ni+" y nombre "+nom+"debe pagar $"+pagmat);
    }
}
