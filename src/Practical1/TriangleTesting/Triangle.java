/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical1.TriangleTesting;

/**
 *
 * @author joshua
 */
public class Triangle {
    // the lengths of the triangle's three edges, in dimensionless units
    protected int edge_a;
    protected int edge_b;
    protected int edge_c;
    // scalene, isosceles or equilateral? This starts out NULL and we fill it in
    protected TriangleType type;
    
    // parametrised constructor -pass in lengths of all sides
    public Triangle(int a, int b, int c) {
        // validate arguments to ensure all are non-negative
        for (int edge : new int[] {a, b, c,}) {
            if (edge < 0) {
                throw new java.lang.IllegalArgumentException("Edge lengths must be non-negative");
            }
        }
        // we now know all arguments are valid, so store them
        this.edge_a = a;
        this.edge_b = b;
        this.edge_c = c;
        // while we're at it, determine the triangle's type now to save time
        this.type = this.determineType();
    }
    
    private TriangleType determineType() {
        // TODO: Refactor this unweildable spaghetti code!
        if (this.edge_a == this.edge_b) {
            if (this.edge_b == this.edge_c) {
                return TriangleType.EQUILATERAL;
            } else {
                return TriangleType.ISOSCELES;
            }
        } else {
            if ((this.edge_a == this.edge_c) || (this.edge_b == this.edge_c)) {
                return TriangleType.ISOSCELES;
            } else {
                return TriangleType.SCALENE;
            }
        }
    }
}
