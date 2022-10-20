/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas2;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Notas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = " ";
        int ca = 0, cd = 0, i = 1, nota;
        
        while(!op.equals("t")){
             System.out.println("notas ["+i+"]=");
             nota = sc.nextInt();
            if (nota >= 13) {
                ca++;
            }else{
                cd++;
            }        
            i++;
            System.out.println("[t/n]: ");
            op = sc.next();
           
      }
       System.out.println("aprobados:"+ca);
       System.out.println("desaprovado:"+cd);
}   }
