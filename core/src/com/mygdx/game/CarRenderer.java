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
	List <Car2> car2s;
	
	public CarRenderer(SpriteBatch batch , List <Car> cars, List <Car2> car2s){
		this.batch = batch;
		this.cars = cars;
		this.car2s = car2s;
		carImg = new Texture("car.png");
		carImgRegion = new TextureRegion(carImg);
		
		car2Img = new Texture("car2.png");
		car2ImgRegion = new TextureRegion(car2Img);
	}
	
public void render(float delta) {
	
        for (Car car : this.cars) {
        	//System.out.println(car.getPosition().x + " " + car.getPosition().y);
        		batch.draw(carImgRegion,
        				car.getPosition().x,car.getPosition().y,
        				0,0,
        				carImg.getWidth(),carImg.getHeight(),
        				(float)0.4,(float)0.4,
        				0);
        }
        
       for (Car2 car2 : this.car2s) {
        	
				batch.draw(car2ImgRegion,
        				car2.getPosition().x,car2.getPosition().y,
        				0,0,
        				car2Img.getWidth(),car2Img.getHeight(),
        				(float)0.4,(float)0.4,
        				0);
        } 
        
        
        
    }
}


