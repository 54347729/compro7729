/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.students.u54347729.compro.ch3;
import java.util.Scanner;
public class TwoWayCondition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.next());
        double num2 = Integer.parseInt(in.next());
        if (num2 == 0){
            System.out.println("Error: divide by zero!");
            
        }else{
            System.out.println(num1/num2);
                    
        }
    }
}
