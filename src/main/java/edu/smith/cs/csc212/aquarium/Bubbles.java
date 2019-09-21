package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;


public class Bubbles {
	int x;
	int y;
	int radius;
	int wiggle;
	Random rand = new Random();
	
	public Bubbles() {
		this.x = rand.nextInt(100) + 40;
		this.y = rand.nextInt(450) + 20;
		this.radius = rand.nextInt(10) + 5;
		this.wiggle = 0;
		}
		public void draw (Graphics2D win) {
			win.setColor(Color.white);
			win.drawOval(this.x + this.wiggle, this.y, radius, radius);
			animate();
			}
		
		public void animate() {
		this.y -= 3;
		if (this.y < -500) {
			this.y = 450;
			this.x = rand.nextInt(100) + 40;
			}
		this.wiggle = (int) (30.0 * Math.cos(this.y / 60.0));
		}
}