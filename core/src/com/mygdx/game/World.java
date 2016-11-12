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
	
//	I have a pen, I have an apple.
//	Uh! Apple Pen
//	I have a pen, I have pineapple.
//	Uh! Pineapple Pen
//	Apple pen...
//	Pineapple pen... uh!
//
//	Pen Pineapple Apple Pen!
//
//	Pen Pineapple Apple Pen!

	Frog getFrog(){
		return frog;
	}
}
