package December8th;
import java.util.*;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            int k = in.nextInt();
            solution( n, k, 1, 1,0, "");
        }
	}
	
	public static void solution(int n, int k, int input, int layer,int sum, String s) {
		layer = layer+1;
		int left = 2*input;
		int right = 2*input+1;
		solution(n,k,left,layer,sum+left, s + 2*input + " +/n");
		solution(n,k,left,layer, sum-left, s + 2*input + " -/n");
		solution(n,k,right,layer,sum+2*right, s + (2*input+1) + " +/n");
		solution(n,k,right,layer,sum-right, s + (2*input+1) + " -/n");
		
		if (layer==k) {
			if(sum==n) {
				System.out.println(s);
				return;
			}
		}
	}

}
