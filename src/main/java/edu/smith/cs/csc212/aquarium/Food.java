package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Food {

		int x;
		int y;
		Random rand = new Random();
		
		public Food() {
			this.x = rand.nextInt(120) + 310;
			this.y = rand.nextInt(140) + 110;
			}
			public void draw (Graphics2D win) {
				win.setColor(Color.green);
				win.drawString("~~~", this.x, this.y);;
				}			
			
}
