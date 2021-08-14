package Arrays;

import java.util.Scanner;

public class Geek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no.of elements you want to enter: ");
		int n = sc.nextInt();
		
		int []arr = new int[5];
		
		//entering the values of the array
		for(int i=0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		//accessing the entered values by user using for loop
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("elemenst at the index "+i+" : "+arr[i]);
		}

	}

}
