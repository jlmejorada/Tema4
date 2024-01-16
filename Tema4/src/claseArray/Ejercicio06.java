package claseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num, cuanto=0;
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		
		int tabla[]= new int[1000];
		
		for (int i = 0 ; i<tabla.length; i++) {
			tabla[i]=(int)(Math.random()*100);
		}
		
		System.out.println("Dame un numero");
		num=sc.nextInt();
		
		for (int numero : tabla) {
			if (numero==num) {
				cuanto++;
				flag=true;
			}
		}
		
		if (flag) {
			System.out.println("El número existe y aparece " + cuanto);
		} else System.out.println("No existe");
		
		sc.close();
	}

}
