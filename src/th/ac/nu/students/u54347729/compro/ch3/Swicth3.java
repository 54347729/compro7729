/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.students.u54347729.compro.ch3;
import java.util.Scanner;
public class Swicth3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char grade = in.next().charAt(0);
        switch(grade) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("Passes");
                break;
            case 'D':
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
