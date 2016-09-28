// Day 5
// Use loops to help us do some simple math
//
// @author Chinasa T. Okolo

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + (N*i));  
        } 
    }
}
