package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	Frog frog;
	FrogGame frogGame;
	List <Car> cars = new ArrayList <Car> ();
	
	World(FrogGame frogGame) {
		this.frogGame = frogGame;
		frog = new Frog(frogGame.WIDTH/2, 0);
		for (int i = 0 ; i < 100 ; i++ ) {
			cars.add(new Car());
		}
	}
	Frog getFrog(){
		return frog;
	}
	
}
