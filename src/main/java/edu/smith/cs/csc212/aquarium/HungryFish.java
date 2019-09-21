package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import me.jjfoley.gfx.GFX;

public class HungryFish extends GFX{
	
	Food seaweed = new Food();
	Food[] moreSeaweeds = new Food[15];

	public HungryFish() {
		for (int i = 0; i < moreSeaweeds.length; i++) {
			moreSeaweeds[i] = new Food(); 
			}
	}
	public void draw(Graphics2D g) {
		g.setColor(Color.white);
		g.drawRect(300, 100, 150, 150);
		seaweed.draw(g);
		
		for (Food s : this.moreSeaweeds) {
			s.draw(g);
		}
	}
	
	public static void main(String[] args) {
		HungryFish app = new HungryFish();
		app.start();
	}
}