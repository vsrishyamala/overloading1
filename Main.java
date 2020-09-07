package com.over1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String name,details,ower,type,tv;
		int feet,notv;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the name of the stall");
		name= scan.nextLine();
		System.out.println("Enter the details of stall");
		details = scan.nextLine();
		System.out.println("Enter the owner of the shall");
		ower = scan.nextLine();
		System.out.println("Enter the type of shall");
		type = scan.nextLine();
		System.out.println("Enter the size of the shall in squarefeet");
		feet = scan.nextInt();
		scan.nextLine();
		System.out.println("Dose the hall have TV(Y/P)");
		tv=scan.nextLine();
		System.out.println("Enter the number of tv");
		notv= scan.nextInt();
		Stall s = new Stall(name, details,ower);
		System.out.println("The cost of the shall is ");
		if(tv.equals('Y'))
			System.out.println(s.computeCost(type,feet));
		else
			System.out.println(s.computeCost(type,feet,notv));
		
			

			
		
		
		
		
		

	}

}
