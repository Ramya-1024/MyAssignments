package week2.day4;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] Num={2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(Num);
		System.out.println("Duplicate numbers are:");
		for(int i = 0; i<Num.length-1; i++) {
			if(Num[i]==Num[i+1]) {
				System.out.println(Num[i]);
			}
			
		}
	}
	}
