package com.Qspiders.BagBall;

import java.util.Scanner;

public class UserInterface 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Bag b = new Bag();
		boolean flag = false;
		while(!flag)
		{
			System.out.println("***********User Interface**********");
			System.out.println("1.Add ball");
			System.out.println("2.Remove ball");
			System.out.println("3.Check bag is empty???");
			System.out.println("4.Show game!");
			System.out.println("5.Exit");
			System.out.println("***********************************");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("1.BasketBall");
					System.out.println("2.Tennis");
					int ball_choice = sc.nextInt();
					if(ball_choice==1)
					{
						System.out.println("Enter radius");
						double radius = sc.nextDouble();
						b.addBall(new BasketBall(radius));
					}
					else if(ball_choice==2)
					{
						System.out.println("Enter radius");
						double radius = sc.nextDouble();
						b.addBall(new Tennis(radius));
					}
					else
					{
						System.out.println("Invalid choice");
					}
					
				}break;
				
				case 2:
				{
					b.removeBall();
				}break;
				
				case 3:
				{
					System.out.println(b.isBagEmpty());
				}break;
				
				case 4:
				{
					b.showGame();
				}break;
				
				case 5:
				{
					flag = true;
				}break;
				
				default:
				{
					System.out.println("Invalid input");
				}
			}
		}
		
	}

}
