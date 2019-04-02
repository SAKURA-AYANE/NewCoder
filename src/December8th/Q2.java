package December8th;
import java.util.*;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
        	int T = in.nextInt();
        	for(int i =0;i<T;i++) {
        		int x = in.nextInt();
        		int y = in.nextInt();
            	int k = in.nextInt();
            	System.out.println(solution(x,y,k));
            }
        }
	}
	
	public static int solution(int x, int y, int k) {
		if(k<Math.max(x, y)) {
			return -1;
		}

		int leftS = y-x;
		int leftK = k - x;
		if(leftS%2==0) {
			if(leftK%2==0) {
				return k;
			} else {
				return k - 2;
			}
		} else {
			if(leftK%2==0) {
				return k-1;
			} else {
				return k-1;
			}
		}
		
	}
}
