package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import me.jjfoley.gfx.GFX;

public class Bubble extends GFX {
	
	Bubbles bubbly = new Bubbles();
	// right now it is empty array
	Bubbles[] moreBubbles = new Bubbles[10];
	
	public Bubble() {
	for (int i = 0; i < moreBubbles.length; i++) {
		moreBubbles[i] = new Bubbles();
	}
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.YELLOW);
		g.fillRect(40, 450, 100, 50);
		bubbly.draw(g);
		g.setColor(Color.DARK_GRAY);
		g.fillArc(40, 420, 100, 50, 0, 180);
		
		for (Bubbles b : this.moreBubbles) {
			b.draw(g);
		}
	}
	
	public static void main(String[] args) {
		Bubble app = new Bubble();
		app.start();
	}
}