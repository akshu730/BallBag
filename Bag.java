package com.Qspiders.BagBall;

public class Bag 
{
	Ball b;
	
	public void addBall(Ball b)
	{
		if(this.b==null)
		{
			this.b = b;
			System.out.println("Ball added successfully of radius "+this.b.getRadius());
		}
		else
			System.out.println("Bag is full!!!");
	}
	
	public void removeBall()
	{
		if(b!=null)
		{
			System.out.println("Ball removed successfully of radius "+this.b.getRadius());
			this.b = null;
		}
		else
			System.out.println("Bag is empty");
	}
	
	public boolean isBagEmpty()
	{
		return this.b==null;
	}
	
	public void showGame()
	{
		if(this.b instanceof BasketBall)
		{
			
			BasketBall bb = (BasketBall)b;
			System.out.println("Game you can play is "+bb.game);
		}
		else if(this.b instanceof Tennis)
		{
			Tennis tb = (Tennis)b;
			System.out.println("Game you can play is "+tb.game);	
		}
		else
		{
			System.out.println("OOPs!! Bag is empty!!!");
		}
	}
	
}
