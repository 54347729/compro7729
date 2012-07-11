/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.students.u54347729.compro.ch02;

/**
 *
 * @author HP
 */
public class Precedence {
    public static void main(String[] args) {
        System.out.println(1 + 2 * 3); // 7
        System.out.println((1 + 2) * 3); // 9
        System.out.println(1 + (2 * 3)); // 7
    }
}
