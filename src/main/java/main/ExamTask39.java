package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamTask39 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		int c= 0;
		if(a>b) {
			c=a+b;
			System.out.println("1 statement : "+c);
		}else {
			c=b-a;
			System.out.println("2 statement : "+c);
			if (b>c) {
				System.out.println("3 case : "+c);
			}else {
				while (b>0) {
					c--;
					System.out.println("4 case : "+c);
					b--;
				}
			}
		}
		
		
//		
//		try 
//		{
//			Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the first int :");
//		int num1= sc.nextInt();
//		
//		System.out.println("Enter the second int :");
//		int num2= sc.nextInt();
//		
//		int result = num1/num2;
//		System.out.println("The result is :" +result);
//		}
//		catch (InputMismatchException e) {
//			System.out.println(e.getMessage());
//		}catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		catch (Exception e) {
//			System.out.println("An exception occured "+e.getMessage());
//		}
	}

}
