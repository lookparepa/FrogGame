package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class Car {
	
	
	public static Vector2 position;
	public void car(){
		
	}
	
	public Car(int x, int y){
		position = new Vector2(x,y);
	}
	
	public Vector2 getPosition(){
		return position;
	}
}
