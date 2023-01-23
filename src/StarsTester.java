/*
 * Author: Emily Tumacder
 * Date: 02/06/2020
 * Notes: Tests stars methods
 */

import java.util.Scanner;

public class StarsTester {

		static Scanner kboard = new Scanner(System.in);
		static int numberOfStars;
		static Stars pattern = new Stars();
		static int choice;
		
		public static void main(String[] args) 
		{

			do
			{
				System.out.println("");
				System.out.println("Choose a menu option:");
				System.out.println("1. square ");
				System.out.println("2. triangle ");
				System.out.println("3. inverted triangle");
				System.out.println("4. pyramid");
				System.out.println("5. diamond");
				System.out.println("7. quit ");
				
				choice = kboard.nextInt();
				
				System.out.println("");
				
				switch(choice) //R&D: Using Switch vs IF ELSE
				{
				case 1: //Calls "printStarSquare" method
					System.out.print("Enter number of stars: ");
					numberOfStars = kboard.nextInt();
					System.out.print("\n");
					pattern.printStarSquare(numberOfStars);
					System.out.print("\n");
					break;
				
				case 2:
					System.out.print("Enter number of stars: ");
					numberOfStars = kboard.nextInt();
					System.out.print("\n");
					pattern.printStarTriangle(numberOfStars);
					System.out.print("\n");
					break;
				
				case 3:
					System.out.print("Enter number of stars: ");
					numberOfStars = kboard.nextInt();
					System.out.print("\n");
					pattern.printStarInvertedTriangle(numberOfStars);
					System.out.print("\n");
					break;
			
				case 4:
					System.out.print("Enter number of stars: ");
					numberOfStars = kboard.nextInt();
					System.out.print("\n");
					pattern.printStarDiamond(numberOfStars);
					System.out.print("\n");
					break;

				}
				
			}while (choice != 5);
		
		kboard.close();
			
				
		}
	}

