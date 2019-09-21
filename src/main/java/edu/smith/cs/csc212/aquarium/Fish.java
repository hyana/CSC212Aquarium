package edu.smith.cs.csc212.aquarium;

import java.awt.Color; // Java has color
import java.awt.Graphics2D;
import java.util.Random;

public class Fish {
	// every has a color that is a Color
	Color color;
	// every fish has a position that are integers
	int x;
	int y;
	// isLittle/isBig = true false를 알아듣기 쉽게 만든거. and I don't have to make big.small fish
	boolean isLittle;
	boolean facingLeft;
	// every fish has a destination
	Random rand = new Random();
	int destX;
	int destY;
	int speedX;
	int speedY;
	int hungry;
	Color a;
	

	// need a constructor
	public Fish(Color color, int startX, int startY, boolean isLittle, boolean left) {
		// if I don't initialize like below, then it will return None
		this.color = color;
		a = color;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		this.facingLeft = left;
		// the fish have free will not aquarium. so destination should be decided in fish class
		this.destX = rand.nextInt(400);
		this.destY = rand.nextInt(500);
		this.hungry = 0;
		
	}
	// method라서 void가 있는건가?
	// so that the code can be more simple just like nemo.draw();

	// Graphics2D g or g is not imported automatically, so we have to import it (line3)
	public void draw(Graphics2D g) {
		if ((this.destX - this.x) > 0) {
			this.facingLeft = false;
		} else if ((this.x - this.destX) > 0) {
			this.facingLeft = true;
		}
		
		if (this.isLittle && this.facingLeft) {
			DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		} else if (this.isLittle == false && this.facingLeft){
			DrawFish.facingLeft(g, this.color, this.x, this.y);
		} else if (this.isLittle && this.facingLeft == false) {
			DrawFish.smallFacingRight(g, this.color, this.x, this.y);
		} else if (this.isLittle == false && this.facingLeft == false) {
			DrawFish.facingRight(g, this.color, this.x, this.y);
		}
		
		// so that I don't have to call swim every time when I draw the fish in the aquarium
		this.swim();
	}
	
	public void swim() {
		// fish destination system fits here

		this.speedX = 1;
		this.speedY = 1;
		
		if (this.x == this.destX && this.y == this.destY) {
			flip();
		} 

		if (this.x  < this.destX) {
			this.x += this.speedX;
			this.facingLeft = true;
		} else if (this.x  > this.destX) {
			this.x -= this.speedX;
			this.facingLeft = false;
		} 
		
		if (this.y  < this.destY) {
			this.y += this.speedY;
		} else if (this.y > this.destY) {
			this.y -= this.speedY;
		} 


		if (this.hungry > 300) {
			this.destX = rand.nextInt(120) + 310;
			this.destY = rand.nextInt(140) + 110;
			color = Color.red; 
			}
		
		if(this.hungry < 300) {
			color = a;
		}
		
		if (this.x >= 310 && this.x <= 450 && this.y <= 260 
				&& this.y >= 110 && this.hungry >= 0) {
			this.hungry -= 5;
		} if (this.x < 310 || this.x > 450 || this.y > 260 
				|| this.y < 110 || this.hungry < 300) {
			this.hungry += 1;
		
		}
		
	}
		
	public void flip() {
		this.destX = rand.nextInt(400);
		this.destY = rand.nextInt(500);
	}
}