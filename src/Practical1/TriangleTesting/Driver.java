/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical1.TriangleTesting;

import java.util.Scanner;

/**
 *
 * @author joshua
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // read in triangle dimensions all on one line to save time
        System.out.print("Enter triangle side lengths all on one line ('a' 'b' 'c'):");
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle(input.nextInt(), input.nextInt(), input.nextInt());
        // display the identified triangle type
        System.out.println(triangle.getType());
    }
    
}
