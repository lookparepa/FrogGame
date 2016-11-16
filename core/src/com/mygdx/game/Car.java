package com.mygdx.game;

import java.util.Random;

import com.badlogic.gdx.math.Vector2;

public class Car {
	static Random random = new Random();
	int temp;
	private Vector2 position;
	public static int [] speed = new int[FrogGame.TOTALCAR];
	
	public Car(int carNumber){
		position = new Vector2();
		temp = random.nextInt(3);
		switch (temp) {
			case 0: position.x = (float) (random.nextInt(100)*500*0.4-10000); 
					position.y = (float) (3.0/18*FrogGame.HEIGHT);
					speed[carNumber] = 10;
					//System.out.println(8);
					break;
			case 1: position.x = (float) (random.nextInt(100)*500*0.4-10000); 
					position.y = (float) (8.0/18*FrogGame.HEIGHT);
					speed[carNumber] = 12;
					//System.out.println(5);
					break;
			case 2: position.x = (float) (random.nextInt(100)*500*0.4-10000); 
					position.y = (float) (13.0/18*FrogGame.HEIGHT);
					speed[carNumber] = 14;
					//System.out.println(6);
					break;
		}
		
	}

	public Vector2 getPosition(){
		return position;
	}
	
	

    public float move(int i) { 
    	if(position.x >= FrogGame.WIDTH+300){
    		position.x -= 10000;
    	}
        position.x += speed[i]; 
        return position.x;
    }
}
