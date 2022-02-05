package org.howard.edu.lsp.assignment2;

import java.util.ArrayList;
import java.util.Scanner;


public class Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("String?");
			ArrayList<String> ar = new ArrayList<String>();  // empty array list to hold tokens
			Boolean flag= false;
			Scanner myScanner= new Scanner(System.in);
			String str= myScanner.nextLine();
			for(String i:str.split(" ")){
				   ar.add(i);   //making an array list of all tokens and splitting with " " character
				}
			if (ar.get(0).equals("Goodbye")) { // terminate program when arraylist starts with goodbye
				myScanner.close();
				break;

			}
			else {
				int total=0;
				int prod=1;
				System.out.println("Tokens:");
				for (int i =0; i<ar.size(); i++) {
					if (ar.get(i).equals("Goodbye")) {
						myScanner.close();
						flag= true;
						break;
					}
					System.out.println(ar.get(i));
					total+= Integer.parseInt(ar.get(i));
					prod*= Integer.parseInt(ar.get(i));
				}
				if (flag.equals(true)) {
					break;
				}
				System.out.println("Sum:"+ total);
				System.out.println("Product:"+ prod);
			}
		}
	}

}
 