package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

import com.sun.prism.Graphics;

import me.jjfoley.gfx.GFX;

public class Algae extends GFX{
	
	Snail algorithm = new Snail(177, Snail.HEIGHT + 1, "top");
	
	int rgbx;
	int rgby;
	int rgbz;
	
	public Algae() {
		this.rgbx = 0;
		this.rgby = 0;
		this.rgbz = 255;
		}

		public void draw(Graphics2D g) {
		if (rgby < 203) {
			rgby += 1;
		} if (rgbz > 0) {
			rgbz -= 1;
		}
		Color water = new Color (rgbx, rgby, rgbz);
		g.setColor(water);
		g.fillRect(5, 5, getHeight(), getWidth());
		algorithm.draw(g);
		
		}
//		public void clean(Graphics2D g) {
//			if(rgby >= 1) {
//			rgby -= 1;
//		} if (rgbz < 254) {
//			rgbz += 1;
//			
//		Color water = new Color (rgbx, rgby, rgbz);
//		g.setColor(water);
//		g.fillRect(5, 5, getHeight(), getWidth());
//		}
//		
//		}

	
	public static void main(String[] args) {
		Algae app = new Algae();
		app.start();
	}

}