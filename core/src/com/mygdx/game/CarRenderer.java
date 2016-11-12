package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CarRenderer {
	
	Texture carImg;
	SpriteBatch batch;
	
	public CarRenderer(SpriteBatch batch){
		this.batch = batch;
		carImg = new Texture("car.png");
	}
}


