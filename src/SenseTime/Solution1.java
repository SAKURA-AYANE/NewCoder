package SenseTime;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        int m=0;
        int[][] square = new int [n][m];
        while (in.hasNextInt()) {
            n = in.nextInt();
            m = in.nextInt();
            for (int i = 0; i < n; i++) {
            	for (int j =0;j<m;j++) {
            		square[i][j]=in.nextInt();
            	}
            }
        }
    }
    
    public static int leastStep(int[][] sq, int n, int m) {
    	int minStep = 999;
    	for(int i =0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			int step =0;
    			while(i!=n || j!=m) {
    				if(i<n) {
    					int step1 = step + sq[i+1][j];
    				}
    				if(j<m) {
    					int step2 = step + sq[i][j+1];
    				}
    				if(i>0) {
    					int step3 = step + sq[i-1][j];
    				}
    				if(j>0) {
    					int step4 = step + sq[i][j-1];
    				}
    			}
    		}
    	}
    	return minStep;
    }
	
}
