package Aploopp;

import java.util.Arrays;
import java.util.Scanner;

public class Aplooop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to get result  in array and sort//
		System.out.println("hello");
		Scanner userinput =new Scanner(System.in);
		int studentnum=userinput.nextInt();
		String[] name=new String[studentnum];
		
		for(int i=0;i<=(studentnum-1);i++) { //insert value object//
			int n=i+1;
		System.out.println ("insert"+ n + "="  );
		name[i]=userinput.next();
	}
		System.out.println("---------");//sorting//
		Arrays.sort(name);
		for(int i=0;i<=(studentnum-1);i++) {
			System.out.println(name[i]);
		}
			System.out.println("---------");
			
			
			
			for(int i=1;i<(name.length);i=i+1) {
				System.out.println(name[i]);
			}
				System.out.println("---------");
				
		for(String x:name) {
					System.out.println(x);  //brings for each value//
			}
	}
	}


		
	
	


	
		
	
		
		
	

		
		 
	


