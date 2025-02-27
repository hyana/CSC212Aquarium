package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

import com.sun.javafx.scene.traversal.Algorithm;

import me.jjfoley.gfx.GFX;

/**
 * Aquarium is a graphical "application" that uses some code I built and have
 * shared with you that takes care of opening a window and communicating with
 * the user in a simple way.
 * 
 * The method draw is called 50 times per second, so we make an animation by
 * drawing our fish in one place, and moving that place slightly. The next time
 * draw gets called, our fish looks like it moved!
 * 
 * @author jfoley
 *
 */
public class Aquarium extends GFX {
	/**
	 * This is a static variable that tells us how wide the aquarium is.
	 */
	public static int WIDTH = 500;
	/**
	 * This is a static variable that tells us how tall the aquarium is.
	 */
	public static int HEIGHT = 500;

	/**
	 * Put a snail on the top of the tank.
	 */
	/**
	 * This is a constructor, code that runs when we make a new Aquarium.
	 */
	public Aquarium() {
		// Here we ask GFX to make our window of size WIDTH and HEIGHT.
		// Don't change this here, edit the variables instead.
		super(WIDTH, HEIGHT);
	}
	
	// the reason why make these variables is to -= the x coordinate of each fish so that the fish can move
	// set the x coordinate of each fish's beginning location
	// make variables to pass into draw class
	
	Bubble bub = new Bubble();
	Algae algae = new Algae();
	HungryFish hungry = new HungryFish();
	Fish nemo = new Fish(Color.yellow, 100, 200, true, false);
	Fish dory = new Fish(Color.cyan, 100, 100, false, false);
		
	public void draw(Graphics2D g) {
		algae.draw(g);
		hungry.draw(g);
		bub.draw(g);
		nemo.draw(g);
		dory.draw(g);
		}

	public static void main(String[] args) {
		// Uncomment this to make it go slower!
		// GFX.FPS = 10;
		// This is potentially helpful for debugging movement if there are too many print statements!

		// Note that we can store an Aquarium in a variable of type GFX because Aquarium
		// is a very specific GFX, much like 7 can be stored in a variable of type int!
		GFX app = new Aquarium();
		app.start();
	}

	
}
