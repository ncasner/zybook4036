package zybook4036;


	import java.util.Scanner;
	import java.lang.Math;     

	public class zybook4036 {
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double wallHeight;
	      double wallWidth;
	      double wallArea;
	      double paintNeeded;
	      double cansNeeded;
	      
	      System.out.println("Enter wall height (feet):");
	      wallHeight = scnr.nextDouble();
	      
	      System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextDouble();                      
	      
	     
	      wallArea = wallWidth * wallHeight;                        
	      System.out.println("Wall area: " + wallArea + " square feet");     
	      
	      paintNeeded = wallArea / 350;
	      System.out.println("Paint needed: " + paintNeeded + " gallons");
	      
	      cansNeeded = Math.ceil(paintNeeded);
	      System.out.println("Cans needed: " + (int)cansNeeded + " can(s)");
	      
	   }
	}

