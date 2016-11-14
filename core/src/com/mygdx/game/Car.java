package com.mygdx.game;

import java.util.Random;

import com.badlogic.gdx.math.Vector2;

public class Car {
	Random random = new Random();
	int temp;
	private Vector2 position;
	
	public Car(){
		position = new Vector2();
		temp = random.nextInt(3);
		switch (temp) {
			case 0: position.x = (float) 0; 
					position.y = (float) (3.0/18*FrogGame.HEIGHT);
					position.x += 5;
					break;
			case 1: position.x = (float) 0; 
					position.y = (float) (8.0/18*FrogGame.HEIGHT);
					position.x += 5;
					break;
			case 2: position.x = (float) 0; 
					position.y = (float) (13.0/18*FrogGame.HEIGHT);
					position.x += 5;
					break;
		}
		
   		System.out.println(position.x+ "   " + position.y);
	}
	
	public Vector2 getPosition(){
		return position;
	}
}
