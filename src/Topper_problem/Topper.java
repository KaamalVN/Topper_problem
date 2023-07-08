package Topper_problem;

import java.util.Scanner;

public class Topper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int register_number=scanner.nextInt();
		String reg_str = String.valueOf(register_number);
		int even_sum=0;
		int odd_sum=0;
		for(int i=0;i<reg_str.length();i++) {
			if((i+1)%2==0) {
				even_sum+=Integer.parseInt(String.valueOf(reg_str.charAt(i)));
			}
			else {
				odd_sum+=Integer.parseInt(String.valueOf(reg_str.charAt(i)));
			}
		}
		if(even_sum==odd_sum) {
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}

	}

}
