package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Ingresar número: ");
		 int n = sc.nextInt();
		 
		 System.out.println("===============");
		 System.out.println("TABLA DEL" + n);
		 System.out.println("===============");
		 
		 for  (int i = 1; i <= 15; i++)
			 System.out.println(n + "x" + i + " = " + (n * i));

	}

}
