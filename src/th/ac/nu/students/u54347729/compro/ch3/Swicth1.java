/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.students.u54347729.compro.ch3;
import java.util.Scanner;
public class Swicth1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char grade = in.next().charAt(0);
        switch(grade) {
            case 'A':
                System.out.println("Excellent");
            case 'B':
                System.out.println("good");
            case 'C':
                System.out.println("So so");
            case 'D':
                System.out.println("Faills");
            case 'F':
                System.out.println("Get lost");
            default:
                System.out.println("Invalid");
    }
    }
    
}
