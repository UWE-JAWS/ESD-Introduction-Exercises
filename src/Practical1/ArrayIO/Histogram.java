/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical1.ArrayIO;

import java.util.List;

/**
 *
 * @author joshua
 */
public class Histogram {
    public Histogram(List<Integer> values) {
        this.histogram = new int[10];
        for (int v : values) {
            // validate before using
            if (100 < v || v < 1) {
                throw new IllegalArgumentException("Input values must be within range {1..100}");
            }
            // if valid, append to histogram
            this.histogram[(v - 1) / 10]++; // calculation converts value to category
        }
    }
    
    public String getVisualisation() {
        return null;
    }
    
    private int[] histogram;  // the number range categories
}
