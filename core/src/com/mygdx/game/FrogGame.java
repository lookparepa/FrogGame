package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FrogGame extends Game {
	public SpriteBatch batch;
	public static int HEIGHT = 450;
	public static int WIDTH = 900;
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new GameScreen(this));
	}
	 @Override
	public void render () {
	    super.render();
	}
	 
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
