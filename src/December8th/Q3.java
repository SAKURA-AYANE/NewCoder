package December8th;
import java.util.*;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
        	int T = in.nextInt();
        	int[] array1 = new int[T];
        	int[] array2 = new int[T];
        	for(int i =0;i<T;i++) {
        		array1[i] = in.nextInt();
            }
        	for(int i =0;i<T;i++) {
        		array2[i] = in.nextInt();
            }
        	System.out.println(solution(array1,array2,0));
        }
	}
	
	public static int solution(int[] array1, int[] array2, int count) {
		while((array1.length*array2.length)!=0) {
			reOrderArray(array1, array1.length);
			reOrderArray(array2, array2.length);
			if (array1[array1.length-1]>array2[array2.length-1]) {
				count = count + array1[array1.length-1];
				int[] temp = new int[array1.length-1];
	        	for(int i =0;i<array1.length-1;i++) {
	        		temp[i] = array1[i];
	            }
	        	array1 = temp;
			} else {
				int[] temp = new int[array2.length-1];
	        	for(int i =0;i<array2.length-1;i++) {
	        		temp[i] = array2[i];
	            }
	        	array2 = temp;
			}
			
			if (array2[array2.length-1]>array1[array1.length-1]) {
				count = count - array2[array2.length-1];
				int[] temp = new int[array2.length-1];
	        	for(int i =0;i<array2.length-1;i++) {
	        		temp[i] = array2[i];
	            }
	        	array2 = temp;
			} else {
				int[] temp = new int[array1.length-1];
	        	for(int i =0;i<array1.length-1;i++) {
	        		temp[i] = array1[i];
	            }
	        	array1 = temp;
			}
		}
		if (array1.length>0) {
        	for(int i =0;i<array1.length;i++) {
        		count += array1[i];
            }
		}
		if (array2.length>0) {
        	for(int i =0;i<array2.length;i++) {
        		count -= array2[i];
            }
		}
		return count;
	}

	public static void reOrderArray(int [] a, int n){
	    int j , k;
	    int flag = n ;//flag 来记录最后交换的位置，也就是排序的尾边界

	    while (flag > 0){//排序未结束标志
	        k = flag; //k 来记录遍历的尾边界
	        flag = 0; //没发生交换则flag=0，跳出while

	        for(j=1; j<k; j++){
	            if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
	                //交换a[j-1]和a[j]
	                int temp;
	                temp = a[j-1];
	                a[j-1] = a[j];
	                a[j]=temp;

	                //表示交换过数据;
	                flag = j;//记录最新的尾边界.
	            }
	        }
	    }
	}
}
