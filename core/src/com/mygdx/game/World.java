package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	Frog frog;
	FrogGame frogGame;
	
	World(FrogGame frogGame){
		this.frogGame = frogGame;
		
		frog = new Frog(frogGame.WIDTH/2, 0);
	}
	
	Frog getFrog(){
		return frog;
	}
	
}
