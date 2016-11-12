package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class CarRenderer {
	
	Texture carImg;
	TextureRegion carImgRegion;
	SpriteBatch batch;
	Vector2 pos;
	World world;
	
	public CarRenderer(SpriteBatch batch , World world){
		this.world = world;
		this.batch = batch;
		carImg = new Texture("car.png");
		carImgRegion = new TextureRegion(carImg);
	}
	
	
public void render(float delta) {
		
        batch.begin();
        pos = world.getCar().getPosition();
        batch.draw(carImgRegion,
        		0,55,
        		0,0,
        		carImg.getWidth(),carImg.getHeight(),
        		(float)0.4,(float)0.4,
        		0);
        batch.end();
        
    }
}


