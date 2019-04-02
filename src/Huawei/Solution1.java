package Huawei;

import java.util.*;
import java.io.*;

public class Solution1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); 
        int [] a = new int [t];
        for (int i = 0; i<t; i++) {
        	a[i] = in.nextInt();
        }
        int largestD = 0;
        for (int i = 0; i < t; i++) {
        	for (int j = i + 1; j<t; j++) {
        		int distance = (j-i)*Math.abs(a[j]-a[i]);
        		if (distance > largestD) {
        			largestD = distance;
        		}
        	}
        }
        System.out.println(largestD);
	}

}
