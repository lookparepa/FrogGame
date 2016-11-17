package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Rectangle;

public class World {
	Frog frog;
	FrogGame frogGame;
	int life = 10;
	
	static List <Car> cars = new ArrayList <Car> ();
	static List <Car2> car2s = new ArrayList <Car2> ();	
	World(FrogGame frogGame) {
		this.frogGame = frogGame;
		frog = new Frog();
		for (int i = 0 ; i < frogGame.TOTALCAR ; i++ ) {
			cars.add(new Car(i));
			car2s.add(new Car2(i));
		}
	}
	Frog getFrog(){
		return frog;
	}
	
}
