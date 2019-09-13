package edu.smith.cs.csc212.aquarium;

import java.awt.Color; // Java has color
import java.awt.Graphics2D;

public class Fish {
	// every has a color that is a Color
	Color color;
	// every fish has a position that are integers
	int x;
	int y;
	// isLittle/isBig = true false를 알아듣기 쉽게 만든거. and I don't have to make big.small fish
	boolean isLittle;
	boolean left;
	
	// need a constructor
	public Fish(Color color, int startX, int startY, boolean isLittle, boolean left) {
		// if I don't initialize like below, then it will return None
		this.color = color;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		this.left = left;
	}
	// method라서 void가 있는건가?
	// so that the code can be more simple just like nemo.draw();

	public void draw(Graphics2D g) {
		if (this.isLittle && this.left) {
		// Graphics2D g or g is not imported automatically, so we have to import it (line3)
			DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		} else if (this.isLittle == false && this.left){
			DrawFish.facingLeft(g, this.color, this.x, this.y);
		} else if (this.isLittle && this.left == false) {
			DrawFish.smallFacingRight(g, this.color, this.x, this.y);
		} else if (this.isLittle == false && this.left == false) {
			DrawFish.facingRight(g, this.color, this.x, this.y);
		}
		
		// so that I don't have to call swim every time when I draw the fish in the aquarium
		this.swim();

	}
	
	public void swim() {
		this.x += 1;
		this.y += 1;
	}
}
	
