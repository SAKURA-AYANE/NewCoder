package Huawei;

import java.util.*;
import java.io.*;

public class Solution2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String door = in.next();
        int time = 0;
    	int passT = 1;
    	int passE = 1;
    	int enterT = 1;
    	int enterE = 1;
        while (!door.equals("x")) {
        	int doorE = Integer.valueOf(door);
        	int pPT = passT;
        	int pET = passT;
        	int ePT = enterT;
        	int eET = enterT;
        	int pPE = passE;
        	int pEE = passE;
        	int ePE = enterE;
        	int eEE = enterE;
        	
        	if (passE>0) {
        		pPT = passT + 1;
        		pPE = passE - 1;
        		ePT = enterT + 1;
        		ePE = enterE - 1;
        	} else {
        		pPT = -1;
        		ePT = -1;
        	}
        	if(enterE>0) {
	        	pET = time + 2;
	        	eET = time + 2;
	        	eEE = enterE + doorE - 2;
	        	pEE = passE + doorE - 2;
        	} else {
        		eET = -1;
        		pET = -1;
        	}
        	if(pPE>0 & ePE>0) {
        		if(pPT> ePT) {
        			passT = ePT;
        			passE = ePE;
        		} else {
        			passT = pPT;
        			passE = pPE;
        		}
        	} else if (pPE<0 & ePE<0) {
        		passT= -1;
        		passE = -1;
        	} else {
        		if (pPE > 0) {
        			passT = pPT;
        			passE = pPE;
        		} else {
        			passT = ePT;
        			passE = ePE;
        		}
        	}
        	if(pEE>0 & eEE>0) {
        		enterT = Math.min(pET, eET);
        	} else if (pEE<0 & eEE<0) {
        		enterT = -1;
        		enterE = -1;
        	} else {
        		enterT = Math.max(pET, eET);
        	}
        	door = in.next();       	
        }
        if (passT>0 & enterT<0) {
        	time = passT;
        } else if (passT<0 & enterT>0) {
        	time = enterT;
        } else if (passT<0 & enterT<0) {
        	time = -2;
        } else {
        	time = Math.min(passT, enterT);
        }
        System.out.println(time+1);
	}
}
