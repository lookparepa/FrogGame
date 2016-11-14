package com.mygdx.game;

import java.util.Random;

import com.badlogic.gdx.math.Vector2;

public class Car2 {
	Random random = new Random();
	int temp;
	private Vector2 position;
	
	public Car2(){
		position = new Vector2();
		temp = random.nextInt(3);
		switch (temp) {
			case 0: position.x = (float) (8.0/9*FrogGame.WIDTH); 
					position.y = (float) (5.0/18*FrogGame.HEIGHT);
					break;
			case 1: position.x = (float) (8.0/9*FrogGame.WIDTH); 
					position.y = (float) (10.0/18*FrogGame.HEIGHT);
					break;
			case 2: position.x = (float) (8.0/9*FrogGame.WIDTH); 
					position.y = (float) (15.0/18*FrogGame.HEIGHT);
					break;
		}
	}
	
	public Vector2 getPosition(){
		return position;
	}

}
