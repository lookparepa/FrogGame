package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class Frog {
	public static Vector2 position;
	
	public Frog(int x, int y){
		position = new Vector2(x,y);
	}
	
	public Vector2 getPosition(){
		return position;
	}
	private static final int[][] DIR_OFFSETS = new int[][]{
		{0,0},
		{0,1},
		{1,0},
		{0,-1},
		{-1,0}	
	};
	public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_LEFT = 4;
    public static final int DIRECTION_STILL = 0;
    
    public static final float SPEED = (float) 3;

    public void move(int dir) { 
        position.x += SPEED * DIR_OFFSETS[dir][0];
        position.y += SPEED * DIR_OFFSETS[dir][1];   
    }
}

