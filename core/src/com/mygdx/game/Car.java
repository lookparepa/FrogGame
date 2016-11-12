package com.mygdx.game;

import java.util.Random;

import com.badlogic.gdx.math.Vector2;

public class Car {
	Random random = new Random();
	int temp;
	public static Vector2 position;
	
	public Car(){
		position = new Vector2();
		temp = random.nextInt(2);
		switch (temp) {
			case 0: position.x = (float) 0; 
					position.y = (float) 3/18*FrogGame.HEIGHT;
					break;
			case 1: position.x = (float) 0; 
					position.y = (float) 8/18*FrogGame.HEIGHT;
					break;
			case 2: position.x = (float) 0; 
					position.y = (float) 13/18*FrogGame.HEIGHT;
					break;
		}
	}
	
	public Vector2 getPosition(){
		return position;
	}
}
