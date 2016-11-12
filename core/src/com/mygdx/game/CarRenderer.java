package com.mygdx.game;

import java.util.List;

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
	List <Car> cars;
	
	public CarRenderer(SpriteBatch batch , List <Car> cars){
		this.batch = batch;
		this.cars = cars;
		carImg = new Texture("car.png");
		carImgRegion = new TextureRegion(carImg);
		
		car2Img = new Texture("car2.png");
		car2ImgRegion = new TextureRegion(car2Img);
	}
	
	
@SuppressWarnings("static-access")
public void render(float delta) {
        for (Car car : this.cars) {
        	batch.draw(carImgRegion,
        		car.position.x,car.position.y,
        		0,0,
        		carImg.getWidth(),carImg.getHeight(),
        		(float)0.4,(float)0.4,
        		0);
        }
        
        
        
    }
}


