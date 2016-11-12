package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class CarRenderer {
	
	Texture carImg;
	TextureRegion carImgRegion;
	
	Texture car2Img;
	TextureRegion car2ImgRegion;
	
	SpriteBatch batch;
	Vector2 pos;
	World world;
	
	public CarRenderer(SpriteBatch batch , World world){
		this.world = world;
		this.batch = batch;
		carImg = new Texture("car.png");
		carImgRegion = new TextureRegion(carImg);
		
		car2Img = new Texture("car2.png");
		car2ImgRegion = new TextureRegion(car2Img);
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
        
        batch.draw(car2ImgRegion,
        		800,110,
        		0,0,
        		car2Img.getWidth(),car2Img.getHeight(),
        		(float)0.4,(float)0.4,
        		0);
        batch.end();
        
    }
}


