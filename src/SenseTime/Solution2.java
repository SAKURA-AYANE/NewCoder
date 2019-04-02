package SenseTime;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alpha=0;
        int beta=0;
        int r1,r2,r3,c1,c2,c3,n1,n2,n3;
        alpha = in.nextInt();
        beta = in.nextInt();
       	r1 = in.nextInt();
       	c1 = in.nextInt();
       	n1 = in.nextInt();
        int[][] square1 = new int [r1][c1];
       	for (int i=0;i<n1;i++) {
        	square1[in.nextInt()][in.nextInt()]=in.nextInt();
       	}
       	r2 = in.nextInt();
       	c2 = in.nextInt();
       	n2 = in.nextInt();
        int[][] square2 = new int [r1][c1];
       	for (int i=0;i<n2;i++) {
       		square2[in.nextInt()][in.nextInt()]=in.nextInt();
       	}
       	r3 = in.nextInt();
       	c3 = in.nextInt();
        n3 = in.nextInt();
        int[][] square3 = new int [r1][c1];
       	for (int i=0;i<n3;i++) {
       		square3[in.nextInt()][in.nextInt()]=in.nextInt();
       	}

       	int[][] COO = new int[c1][r2];
       	for(int i=0;i<c1;i++) {
       		for(int j=0;j<r2;j++) {
       			int temp = 0;
       			for (int k=0;k<c1;k++) {
     				temp = temp + square1[i][k]*square2[k][j];
       			}
       			COO[i][j] = alpha*temp+beta*square3[i][j];
       		}
       	}
       	int count = 0;
       	for(int i=0;i<r1;i++) {
       		for(int j=0;j<c1;j++) {
       			if (COO[i][j]!=0)
       			count++;
       		}
       	}
       	System.out.println("" + r1 + " " + c2 + " " + count);
       	for(int i=0;i<r1;i++) {
       		for(int j=0;j<c1;j++) {
       			if (COO[i][j]!=0)
       	       	System.out.println("" + i + " " + j + " " + COO[i][j]);
       		}
       	}      	
       	
    }
}
