package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class Car {
	
	
	public static Vector2 position;
	
	public Car(){
		position = new Vector2();
	}
	
	public Vector2 getPosition(){
		return position;
	}
}
