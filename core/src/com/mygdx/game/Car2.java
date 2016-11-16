package com.mygdx.game;

import java.util.Random;

import com.badlogic.gdx.math.Vector2;

public class Car2 {
	static Random random = new Random();
	int temp;
	private Vector2 position;
	public static int [] speed = new int[FrogGame.TOTALCAR];
	
	public Car2(int carNumber){
		position = new Vector2();
		temp = random.nextInt(3);
		switch (temp) {
			case 0: position.x = (float) (random.nextInt(100)*500*0.4-10000); 
					position.y = (float) (5.0/18*FrogGame.HEIGHT);
					speed[carNumber] = 12;
					break;
			case 1: position.x = (float) (random.nextInt(100)*500*0.4-10000); 
					position.y = (float) (10.0/18*FrogGame.HEIGHT);
					speed[carNumber] = 10;
					break;
			case 2: position.x = (float) (random.nextInt(100)*500*0.4-10000); 
					position.y = (float) (15.0/18*FrogGame.HEIGHT);
					speed[carNumber] = 8;
					break;
		}
	}
	
	public Vector2 getPosition(){
		return position;
	}
	

    public float move(int i) { 
    	if(position.x <= -300){
    		position.x += 10000;
    	}
        position.x -= speed[i];
        return position.x;
    }

}
