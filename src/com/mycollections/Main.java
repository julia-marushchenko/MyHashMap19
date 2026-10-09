/**
 *  Java program to create and update, remap HashMap instance.
 */

package com.mycollections;

import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Map<String, String> myMap = new HashMap<>();

        // Add.
        myMap.put("Name", "Julia");
        myMap.put("School", "Helsinki");

        // Read.
        for (Map.Entry entry : myMap.entrySet()) {
            System.out.println(entry);
        }

        // Update and remap.
        myMap.compute("Name", (key,val) -> val.concat(" Marushchenko"));
        myMap.compute("School", (key, val) -> val.concat(" University"));

        // Print.
        System.out.println(myMap);

        // Clear all values with keys.
        myMap.clear();

    }
}