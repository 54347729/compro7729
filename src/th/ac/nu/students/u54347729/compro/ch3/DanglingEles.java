/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.students.u54347729.compro.ch3;

/**
 *
 * @author HP
 */
public class DanglingEles {
    public static void main(String[]args){
        int x=5;
        if (x<5){
            if(x>5){
                System.out.println("b");
            }else{
                System.out.println("a");
            }
        }
    }
}
