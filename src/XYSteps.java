import java.util.Scanner;

public class XYSteps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(steps(x,y));
    }
    public static int steps(int x, int y) {
    	int s = 0;
    	if(x ==1 && y ==1) {
    		return 2;
    	}
    	else if(x==1 && y>1) {
    		return (steps(1,y-1)+1);
    	}
    	else if(x>1 && y==1) {
    		return (steps(x-1,1)+1);
    	}
    	else {
    		s = steps(x,y-1)+steps(x-1,y);
    	}
    	return s;
    }
}
