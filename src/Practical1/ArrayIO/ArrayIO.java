/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical1.ArrayIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Anon
 */
public class ArrayIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram h = new Histogram(generateRandomData(100));
        System.out.print(h.getVisualisation());
    }
    
    private static List<Integer> generateRandomData(int size) {
        Random prng = new Random();
        List<Integer> data = new ArrayList<>();
        for (int d : prng.ints(size, 1, 101).toArray()) {
            data.add(d);
        }
        return data;
    }
    
}
